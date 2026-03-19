package com.yorku.lab.gui;

import com.yorku.lab.enums.UserType;

import javax.swing.*;
import java.awt.*;

public class RegisterPanel extends JPanel {

    private final LabReservationApp app;
    private JTextField emailField, nameField, idField;
    private JPasswordField passwordField;
    private JComboBox<UserType> typeCombo;

    public RegisterPanel(LabReservationApp app) {
        this.app = app;
        setLayout(new BorderLayout(20, 20));
        setBorder(BorderFactory.createEmptyBorder(40, 40, 40, 40));

        JPanel center = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        JLabel title = new JLabel("Register Account");
        title.setFont(title.getFont().deriveFont(18f));
        gbc.gridwidth = 2;
        gbc.gridy = 0;
        center.add(title, gbc);

        gbc.gridwidth = 1;
        String[] labels = {"Email:", "Password:", "Full Name:", "User Type:", "ID/Certification #:"};
        emailField = new JTextField(20);
        passwordField = new JPasswordField(20);
        nameField = new JTextField(20);
        typeCombo = new JComboBox<>(new UserType[]{UserType.STUDENT, UserType.FACULTY, UserType.RESEARCHER, UserType.GUEST});
        idField = new JTextField(20);

        JComponent[] fields = {emailField, passwordField, nameField, typeCombo, idField};
        for (int i = 0; i < labels.length; i++) {
            gbc.gridy = i + 1;
            gbc.gridx = 0;
            center.add(new JLabel(labels[i]), gbc);
            gbc.gridx = 1;
            center.add(fields[i], gbc);
        }

        JLabel hint = new JLabel("Password: uppercase, lowercase, numbers, symbols (8+ chars)");
        hint.setFont(hint.getFont().deriveFont(10f));
        gbc.gridy = labels.length + 1;
        gbc.gridx = 1;
        center.add(hint, gbc);

        JPanel buttons = new JPanel(new FlowLayout());
        JButton registerBtn = new JButton("Register");
        JButton backBtn = new JButton("Back");
        buttons.add(registerBtn);
        buttons.add(backBtn);

        gbc.gridy = labels.length + 2;
        center.add(buttons, gbc);

        registerBtn.addActionListener(e -> doRegister());
        backBtn.addActionListener(e -> app.showPanel(LabReservationApp.LOGIN));

        add(center, BorderLayout.CENTER);
    }

    private void doRegister() {
        String email = emailField.getText().trim();
        String password = new String(passwordField.getPassword());
        String name = nameField.getText().trim();
        String id = idField.getText().trim();
        UserType type = (UserType) typeCombo.getSelectedItem();

        if (email.isEmpty() || password.isEmpty() || name.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill in email, password, and name.");
            return;
        }

        var result = app.getFacade().register(email, password, name, type, id.isEmpty() ? null : id);
        if (result.success()) {
            JOptionPane.showMessageDialog(this, result.message());
            if (result.user() != null) {
                app.onLoginSuccess(result.user());
            } else {
                app.showPanel(LabReservationApp.LOGIN);
            }
        } else {
            JOptionPane.showMessageDialog(this, result.message());
        }
    }
}
