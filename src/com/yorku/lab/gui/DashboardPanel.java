package com.yorku.lab.gui;

import com.yorku.lab.enums.UserType;

import javax.swing.*;
import java.awt.*;

public class DashboardPanel extends JPanel {

    private final LabReservationApp app;
    private JPanel center;
    

    public DashboardPanel(LabReservationApp app) {
        this.app = app;
        setLayout(new BorderLayout(20, 20));
        setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JPanel top = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        JButton logoutBtn = new JButton("Log Out");
        logoutBtn.addActionListener(e -> app.onLogout());
        
        JButton depositBtn = new JButton("Balance");
        top.add(depositBtn);
        depositBtn.addActionListener(e -> app.showPanel(LabReservationApp.BALANCE));
        top.add(logoutBtn);

        center = new JPanel(new GridLayout(0, 1, 10, 10));
        add(top, BorderLayout.NORTH);
        add(center, BorderLayout.CENTER);
        refresh();
    }

    public void refresh() {
        center.removeAll();
        JLabel welcome = new JLabel("Welcome, " + (app.getCurrentUser() != null ? app.getCurrentUser().getFullName() : "User"));
        welcome.setFont(welcome.getFont().deriveFont(18f));
        center.add(welcome);

        JButton browseBtn = new JButton("Browse Equipment & Make Reservation");
        browseBtn.addActionListener(e -> app.showPanel(LabReservationApp.BROWSE));
        center.add(browseBtn);

        JButton myResBtn = new JButton("My Reservations");
        myResBtn.addActionListener(e -> app.showPanel(LabReservationApp.MY_RESERVATIONS));
        center.add(myResBtn);

        UserType type = app.getCurrentUser() != null ? app.getCurrentUser().getType() : null;
        if (type == UserType.LABCOORDINATOR || type == UserType.MANAGER) {
            JButton adminBtn = new JButton("Admin / Equipment Management");
            adminBtn.addActionListener(e -> app.showPanel(LabReservationApp.ADMIN));
            center.add(adminBtn);
        }
        center.revalidate();
        center.repaint();
    }
}
