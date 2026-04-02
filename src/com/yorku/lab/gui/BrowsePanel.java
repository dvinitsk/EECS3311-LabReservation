package com.yorku.lab.gui;

import com.yorku.lab.enums.OperationalStatus;
import com.yorku.lab.enums.PaymentMethod;
import com.yorku.lab.enums.UserType;
import com.yorku.lab.model.Equipment;
import com.yorku.lab.pattern.facade.ReservationFacade;

import javax.swing.*;
import java.awt.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

public class BrowsePanel extends JPanel {

    private final LabReservationApp app;
    private JPanel equipmentPanel;
    private JComboBox<Equipment> equipmentCombo;
    private JSpinner dateSpinner;
    private JComboBox<String> startHourCombo;
    private JSpinner durationSpinner;
    private JComboBox<PaymentMethod> paymentMethodCombo;

    private static final String[] HOUR_OPTIONS = buildHourOptions();

    private static String[] buildHourOptions() {
        String[] opts = new String[24];
        for (int h = 0; h < 24; h++) {
            String ampm = h < 12 ? "AM" : "PM";
            int display = h == 0 ? 12 : (h > 12 ? h - 12 : h);
            opts[h] = String.format("%d:00 %s", display, ampm);
        }
        return opts;
    }

    public BrowsePanel(LabReservationApp app) {
        this.app = app;
        setLayout(new BorderLayout(20, 20));
        setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JPanel top = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JButton backBtn = new JButton("Back");
        backBtn.addActionListener(e -> app.showPanel(LabReservationApp.DASHBOARD));
        top.add(backBtn);

        JPanel center = new JPanel(new BorderLayout(10, 10));
        equipmentPanel = new JPanel(new BorderLayout());
        center.add(new JScrollPane(equipmentPanel), BorderLayout.CENTER);

        JPanel reserveForm = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        equipmentCombo = new JComboBox<>();
        dateSpinner = new JSpinner(new SpinnerDateModel());
        JSpinner.DateEditor dateEditor = new JSpinner.DateEditor(dateSpinner, "yyyy-MM-dd");
        dateSpinner.setEditor(dateEditor);
        startHourCombo = new JComboBox<>(HOUR_OPTIONS);
        durationSpinner = new JSpinner(new SpinnerNumberModel(1, 1, 8, 1));

        gbc.gridy = 0;
        reserveForm.add(new JLabel("Equipment:"), gbc);
        gbc.gridx = 1;
        reserveForm.add(equipmentCombo, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        reserveForm.add(new JLabel("Date:"), gbc);
        gbc.gridx = 1;
        reserveForm.add(dateSpinner, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        reserveForm.add(new JLabel("Start Time:"), gbc);
        gbc.gridx = 1;
        reserveForm.add(startHourCombo, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        reserveForm.add(new JLabel("Duration (hours):"), gbc);
        gbc.gridx = 1;
        reserveForm.add(durationSpinner, gbc);

        paymentMethodCombo = new JComboBox<>(PaymentMethod.values());
        gbc.gridx = 0;
        gbc.gridy = 4;
        reserveForm.add(new JLabel("Payment Method:"), gbc);
        gbc.gridx = 1;
        reserveForm.add(paymentMethodCombo, gbc);

        JButton reserveBtn = new JButton("Reserve (Pay Deposit)");
        reserveBtn.addActionListener(e -> doReserve());
        gbc.gridy = 5;
        gbc.gridx = 1;
        reserveForm.add(reserveBtn, gbc);

        JPanel south = new JPanel(new BorderLayout());
        south.add(new JLabel("Make a Reservation"), BorderLayout.NORTH);
        south.add(reserveForm, BorderLayout.CENTER);

        add(top, BorderLayout.NORTH);
        add(center, BorderLayout.CENTER);
        add(south, BorderLayout.SOUTH);
    }

    public void refresh() {
        equipmentPanel.removeAll();
        LocalDateTime next = app.getFacade().getNextValidStartTime();
        startHourCombo.setSelectedIndex(next.getHour());
        dateSpinner.setValue(java.sql.Date.valueOf(next.toLocalDate()));
        List<Equipment> equipment = app.getFacade().browseEquipment();
        equipmentCombo.removeAllItems();
        DefaultListModel<String> model = new DefaultListModel<>();
        for (Equipment eq : equipment) {
            equipmentCombo.addItem(eq);
            String status = eq.getOperationalStatus() == OperationalStatus.AVAILABLE ? "Available" : eq.getOperationalStatus().name();
            model.addElement(eq.getEquipmentId() + " - " + eq.getDescription() + " (" + eq.getLabLocation() + ") [" + status + "]");
        }
        JList<String> list = new JList<>(model);
        equipmentPanel.add(new JScrollPane(list), BorderLayout.CENTER);
        equipmentPanel.revalidate();
        equipmentPanel.repaint();

        // Filter payment methods based on user type
        paymentMethodCombo.removeAllItems();
        if (app.getCurrentUser() != null) {
            UserType type = app.getCurrentUser().getType();
            paymentMethodCombo.addItem(PaymentMethod.CREDIT);
            paymentMethodCombo.addItem(PaymentMethod.DEBIT);
            if (type == UserType.STUDENT || type == UserType.FACULTY || type == UserType.RESEARCHER) {
                paymentMethodCombo.addItem(PaymentMethod.INSTITUTIONAL);
            }
            if (type == UserType.RESEARCHER) {
                paymentMethodCombo.addItem(PaymentMethod.GRANTS);
            }
        }
    }

    private void doReserve() {
        if (app.getCurrentUser() == null) {
            JOptionPane.showMessageDialog(this, "Please log in first.");
            return;
        }
        Equipment eq = (Equipment) equipmentCombo.getSelectedItem();
        if (eq == null) {
            JOptionPane.showMessageDialog(this, "Select equipment.");
            return;
        }
        java.util.Date d = (java.util.Date) dateSpinner.getValue();
        LocalDate date = new java.sql.Date(d.getTime()).toLocalDate();
        int hour = startHourCombo.getSelectedIndex();
        int duration = (Integer) durationSpinner.getValue();
        LocalDateTime start = LocalDateTime.of(date, LocalTime.of(hour, 0));
        LocalDateTime end = start.plusHours(duration);

        double deposit = app.getFacade().getDepositAmount(app.getCurrentUser());
        int pay = JOptionPane.showConfirmDialog(this,
            "Deposit: $" + String.format("%.2f", deposit) + " (1 hour fee). Proceed?",
            "Confirm", JOptionPane.YES_NO_OPTION);
        if (pay != JOptionPane.YES_OPTION) return;

        PaymentMethod selectedMethod = (PaymentMethod) paymentMethodCombo.getSelectedItem();
        var result = app.getFacade().reserveEquipment(app.getCurrentUser(), eq.getEquipmentId(), start, end, selectedMethod);
        if (result.success()) {
            JOptionPane.showMessageDialog(this, "Reservation confirmed! ID: " + result.reservation().getReservationId());
            app.showPanel(LabReservationApp.MY_RESERVATIONS);
        } else {
            JOptionPane.showMessageDialog(this, result.message());
        }
    }
}
