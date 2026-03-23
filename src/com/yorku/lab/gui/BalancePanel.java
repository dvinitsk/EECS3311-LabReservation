package com.yorku.lab.gui;

import com.yorku.lab.model.PaymentTransaction;
import com.yorku.lab.model.Reservation;
import com.yorku.lab.pattern.facade.ReservationFacade;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class BalancePanel extends JPanel {

    private final LabReservationApp app;
    private JPanel contentPanel;

    public BalancePanel(LabReservationApp app) {
        this.app = app;
        setLayout(new BorderLayout(20, 20));
        setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JPanel top = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JButton backBtn = new JButton("Back");
        backBtn.addActionListener(e -> app.showPanel(LabReservationApp.DASHBOARD));
        top.add(backBtn);

        contentPanel = new JPanel(new GridLayout(0, 1, 10, 10));
        add(top, BorderLayout.NORTH);
        JPanel center = new JPanel(new BorderLayout());
        center.add(new JLabel("Balance & Payment History"), BorderLayout.NORTH);
        center.add(new JScrollPane(contentPanel), BorderLayout.CENTER);
        add(center, BorderLayout.CENTER);
    }

    public void refresh() {
        contentPanel.removeAll();
        if (app.getCurrentUser() == null) return;

        ReservationFacade facade = app.getFacade();
        double total = facade.getTotalPaidByUser(app.getCurrentUser().getUserId());
        contentPanel.add(new JLabel("Total Paid: $" + String.format("%.2f", total)));
        contentPanel.add(new JSeparator());

        var reservations = facade.getUserReservations(app.getCurrentUser().getUserId());
        var resMap = reservations.stream().collect(java.util.stream.Collectors.toMap(Reservation::getReservationId, r -> r));
        for (PaymentTransaction p : facade.getPaymentsForUser(app.getCurrentUser().getUserId())) {
            Reservation r = resMap.get(p.getReservationId());
            String ctx = r != null ? r.getEquipment().getEquipmentId() + ", " + r.getStartTime().toLocalDate() : p.getReservationId();
            String line = p.getType().name().replace("_", " ") + " $" + String.format("%.2f", p.getAmount()) + " (" + ctx + ")";
            contentPanel.add(new JLabel(line));
        }
        contentPanel.revalidate();
        contentPanel.repaint();
    }
}
