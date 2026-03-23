package com.yorku.lab.gui;

import com.yorku.lab.enums.BookingStatus;
import com.yorku.lab.enums.PaymentMethod;
import com.yorku.lab.model.Reservation;
import com.yorku.lab.pattern.facade.ReservationFacade;

import javax.swing.*;
import java.awt.*;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class MyReservationsPanel extends JPanel {

    private final LabReservationApp app;
    private JPanel listPanel;

    public MyReservationsPanel(LabReservationApp app) {
        this.app = app;
        setLayout(new BorderLayout(20, 20));
        setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JPanel top = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JButton backBtn = new JButton("Back");
        backBtn.addActionListener(e -> app.showPanel(LabReservationApp.DASHBOARD));
        top.add(backBtn);

        listPanel = new JPanel(new GridLayout(0, 1, 5, 5));
        add(top, BorderLayout.NORTH);
        add(new JScrollPane(listPanel), BorderLayout.CENTER);
    }

    public void refresh() {
        listPanel.removeAll();
        if (app.getCurrentUser() == null) return;

        List<Reservation> reservations = app.getFacade().getUserReservations(app.getCurrentUser().getUserId());
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

        for (Reservation r : reservations) {
            JPanel card = new JPanel(new BorderLayout());
            card.setBorder(BorderFactory.createEtchedBorder());
            String text = r.getEquipment().getEquipmentId() + " | " + r.getStartTime().format(fmt) + " - " + r.getEndTime().format(fmt) + " | " + r.getStatus();
            card.add(new JLabel(text), BorderLayout.CENTER);

            JPanel actions = new JPanel(new FlowLayout());
            if (r.getStatus() == BookingStatus.CONFIRMED || r.getStatus() == BookingStatus.MODIFIED) {
                JButton cancelBtn = new JButton("Cancel");
                cancelBtn.addActionListener(e -> {
                    if (JOptionPane.showConfirmDialog(this, "Cancel this reservation?") == JOptionPane.YES_OPTION) {
                        app.getFacade().cancelReservation(r.getReservationId());
                        refresh();
                    }
                });
                actions.add(cancelBtn);
            }
            if (r.getStatus() == BookingStatus.ARRIVED || r.getStatus() == BookingStatus.ACTIVE || r.getStatus() == BookingStatus.EXTENDED) {
                JButton arriveBtn = new JButton("Mark Arrived");
                arriveBtn.addActionListener(e -> {
                    app.getFacade().markArrived(r.getReservationId());
                    refresh();
                });
                actions.add(arriveBtn);
            }
            card.add(actions, BorderLayout.SOUTH);
            listPanel.add(card);
        }
        listPanel.revalidate();
        listPanel.repaint();
    }
}
