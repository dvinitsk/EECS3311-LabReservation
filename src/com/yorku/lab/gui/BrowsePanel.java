package com.yorku.lab.gui;

import com.yorku.lab.enums.OperationalStatus;
import com.yorku.lab.enums.PaymentMethod;
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
    private JSpinner startHourSpinner;
    private JSpinner durationSpinner;

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
        startHourSpinner = new JSpinner(new SpinnerNumberModel(9, 0, 23, 1));
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
        reserveForm.add(new JLabel("Start Hour (0-23):"), gbc);
        gbc.gridx = 1;
        reserveForm.add(startHourSpinner, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        reserveForm.add(new JLabel("Duration (hours):"), gbc);
        gbc.gridx = 1;
        reserveForm.add(durationSpinner, gbc);

        JButton reserveBtn = new JButton("Reserve (Pay Deposit)");
        reserveBtn.addActionListener(e -> doReserve());
        gbc.gridy = 4;
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
        int hour = (Integer) startHourSpinner.getValue();
        int duration = (Integer) durationSpinner.getValue();
        LocalDateTime start = LocalDateTime.of(date, LocalTime.of(hour, 0));
        LocalDateTime end = start.plusHours(duration);

        double deposit = app.getFacade().getDepositAmount(app.getCurrentUser());
        int pay = JOptionPane.showConfirmDialog(this,
            "Deposit: $" + String.format("%.2f", deposit) + " (1 hour fee). Proceed?",
            "Confirm", JOptionPane.YES_NO_OPTION);
        if (pay != JOptionPane.YES_OPTION) return;

        var result = app.getFacade().reserveEquipment(app.getCurrentUser(), eq.getEquipmentId(), start, end, PaymentMethod.CREDIT);
        if (result.success()) {
            JOptionPane.showMessageDialog(this, "Reservation confirmed! ID: " + result.reservation().getReservationId());
            app.showPanel(LabReservationApp.MY_RESERVATIONS);
        } else {
            JOptionPane.showMessageDialog(this, result.message());
        }
    }
}
