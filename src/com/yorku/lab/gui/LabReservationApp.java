package com.yorku.lab.gui;

import com.yorku.lab.model.User;
import com.yorku.lab.pattern.facade.ReservationFacade;
import com.yorku.lab.repository.DataBootstrap;

import javax.swing.*;
import java.awt.*;

/**
 * Main application frame for YorkU Lab Equipment Reservation System.
 */
public class LabReservationApp extends JFrame {

    private final ReservationFacade facade = new ReservationFacade();
    private User currentUser;
    private LoginPanel loginPanel;
    private final CardLayout cardLayout = new CardLayout();
    private final JPanel mainPanel = new JPanel(cardLayout);

    public static final String LOGIN = "login";
    public static final String REGISTER = "register";
    public static final String DASHBOARD = "dashboard";
    public static final String BROWSE = "browse";
    public static final String MY_RESERVATIONS = "my_reservations";
    public static final String BALANCE = "balance";
    public static final String ADMIN = "admin";

    public LabReservationApp() {
        DataBootstrap.runIfNeeded();
        getFacade().startArrivalMonitor();
        setTitle("YorkU Lab Equipment Reservation System");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(900, 600);
        setLocationRelativeTo(null);

        mainPanel.add(loginPanel = new LoginPanel(this), LOGIN);
        mainPanel.add(new RegisterPanel(this), REGISTER);
        mainPanel.add(new DashboardPanel(this), DASHBOARD);
        mainPanel.add(new BrowsePanel(this), BROWSE);
        mainPanel.add(new MyReservationsPanel(this), MY_RESERVATIONS);
        mainPanel.add(new BalancePanel(this), BALANCE);
        mainPanel.add(new AdminPanel(this), ADMIN);

        add(mainPanel);
        showPanel(LOGIN);
    }

    public void showPanel(String name) {
        cardLayout.show(mainPanel, name);
        try {
            if (DASHBOARD.equals(name)) {
                ((DashboardPanel) mainPanel.getComponent(2)).refresh();
            } else if (MY_RESERVATIONS.equals(name)) {
                ((MyReservationsPanel) mainPanel.getComponent(4)).refresh();
            } else if (BALANCE.equals(name)) {
                ((BalancePanel) mainPanel.getComponent(5)).refresh();
            } else if (BROWSE.equals(name)) {
                ((BrowsePanel) mainPanel.getComponent(3)).refresh();
            } else if (ADMIN.equals(name)) {
                ((AdminPanel) mainPanel.getComponent(6)).refresh();
            }
        } catch (Exception ignored) {}
    }

    public ReservationFacade getFacade() {
        return facade;
    }

    public User getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(User user) {
        this.currentUser = user;
    }

    public void onLoginSuccess(User user) {
        setCurrentUser(user);
        showPanel(DASHBOARD);
    }

    public void onLogout() {
        setCurrentUser(null);
        showPanel(LOGIN);
    }

    /** Pre-fill login and attempt login (e.g. after creating manager). */
    public void loginWithCredentials(String email, String password) {
        onLogout();
        loginPanel.setCredentials(email, password);
        showPanel(LOGIN);
        loginPanel.attemptLogin();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            try {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            } catch (Exception ignored) {}
            new LabReservationApp().setVisible(true);
        });
    }
}
