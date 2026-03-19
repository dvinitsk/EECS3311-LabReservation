package com.yorku.lab.gui;

import com.yorku.lab.model.User;

import javax.swing.*;
import java.awt.*;

public class LoginPanel extends JPanel {

    private final LabReservationApp app;
    private JTextField emailField;
    private JPasswordField passwordField;

    public LoginPanel(LabReservationApp app) {
        this.app = app;
        setLayout(new BorderLayout(20, 20));
        setBorder(BorderFactory.createEmptyBorder(40, 40, 40, 40));

        JPanel center = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        JLabel title = new JLabel("YorkU Lab Equipment Reservation");
        title.setFont(title.getFont().deriveFont(20f));
        gbc.gridwidth = 2;
        gbc.gridy = 0;
        center.add(title, gbc);

        gbc.gridwidth = 1;
        gbc.gridy = 1;
        center.add(new JLabel("Email:"), gbc);
        gbc.gridx = 1;
        emailField = new JTextField(20);
        center.add(emailField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        center.add(new JLabel("Password:"), gbc);
        gbc.gridx = 1;
        passwordField = new JPasswordField(20);
        center.add(passwordField, gbc);

        JPanel buttons = new JPanel(new FlowLayout());
        JButton loginBtn = new JButton("Log In");
        JButton registerBtn = new JButton("Register");
        buttons.add(loginBtn);
        buttons.add(registerBtn);

        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        center.add(buttons, gbc);

        loginBtn.addActionListener(e -> doLogin());
        registerBtn.addActionListener(e -> app.showPanel(LabReservationApp.REGISTER));

        add(center, BorderLayout.CENTER);
    }

    public void setCredentials(String email, String password) {
        emailField.setText(email != null ? email : "");
        passwordField.setText(password != null ? password : "");
    }

    public void attemptLogin() {
        doLogin();
    }

    private void doLogin() {
        String email = emailField.getText().trim();
        String password = new String(passwordField.getPassword());
        if (email.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter email and password.");
            return;
        }
        app.getFacade().login(email, password).ifPresentOrElse(
            user -> app.onLoginSuccess(user),
            () -> JOptionPane.showMessageDialog(this, "Invalid credentials or account not active.")
        );
    }
}
