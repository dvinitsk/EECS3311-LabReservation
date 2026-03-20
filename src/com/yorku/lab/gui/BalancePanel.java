package com.yorku.lab.gui;

import com.yorku.lab.enums.PaymentMethod;
import com.yorku.lab.model.User;
import com.yorku.lab.pattern.strategy.*;
import com.yorku.lab.service.BalanceService;

import javax.swing.*;
import java.awt.*;

public class BalancePanel extends JPanel {

	private final LabReservationApp app;
	private JLabel balanceLabel;
	private JTextField amountField;
	private JComboBox<PaymentMethod> paymentMethodDropdown;

	public BalancePanel(LabReservationApp app) {
		this.app = app;
		setLayout(new BorderLayout(20, 20));
		setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

		// Top panel with back button
		JPanel top = new JPanel(new FlowLayout(FlowLayout.LEFT));
		JButton backBtn = new JButton("Back");
		backBtn.addActionListener(e -> app.showPanel(LabReservationApp.DASHBOARD));
		top.add(backBtn);

		// Center panel with balance display and fund addition
		JPanel center = new JPanel();
		center.setLayout(new BoxLayout(center, BoxLayout.Y_AXIS));
		center.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

		// Balance section
		JLabel titleLabel = new JLabel("Account Balance");
		titleLabel.setFont(titleLabel.getFont().deriveFont(24f));
		titleLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		center.add(titleLabel);

		center.add(Box.createVerticalStrut(20));

		balanceLabel = new JLabel("Balance:$0.0");		
		balanceLabel.setFont(balanceLabel.getFont().deriveFont(18f));
		balanceLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		center.add(balanceLabel);

		center.add(Box.createVerticalStrut(40));

		// Add funds section
		JLabel addFundsLabel = new JLabel("Add Funds");
		addFundsLabel.setFont(addFundsLabel.getFont().deriveFont(16f));
		addFundsLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		center.add(addFundsLabel);

		center.add(Box.createVerticalStrut(15));

		// Amount input panel
		JPanel amountPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 0));
		JLabel amountLbl = new JLabel("Amount ($):");
		amountField = new JTextField(15);
		amountField.setText("0.00");
		amountPanel.add(amountLbl);
		amountPanel.add(amountField);
		center.add(amountPanel);

		center.add(Box.createVerticalStrut(15));

		// Payment method dropdown panel
		JPanel methodPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 0));
		JLabel methodLbl = new JLabel("Payment Method:");
		paymentMethodDropdown = new JComboBox<>(PaymentMethod.values());
		methodPanel.add(methodLbl);
		methodPanel.add(paymentMethodDropdown);
		center.add(methodPanel);

		center.add(Box.createVerticalStrut(20));

		// Add funds button
		JButton addFundsBtn = new JButton("Add Funds");
		addFundsBtn.setAlignmentX(Component.CENTER_ALIGNMENT);
		addFundsBtn.addActionListener(e -> addFunds());
		center.add(addFundsBtn);

		center.add(Box.createVerticalGlue());

		add(top, BorderLayout.NORTH);
		add(center, BorderLayout.CENTER);

		refresh();
	}

	private void addFunds() {
		try {
			String amountStr = amountField.getText().trim();
			double amount = Double.parseDouble(amountStr);

			if (amount <= 0) {
				JOptionPane.showMessageDialog(this, "Amount must be greater than 0", "Invalid Amount", JOptionPane.WARNING_MESSAGE);
				return;
			}

			PaymentMethod method = (PaymentMethod) paymentMethodDropdown.getSelectedItem();
			User currentUser = app.getCurrentUser();

			if (currentUser == null) {
				JOptionPane.showMessageDialog(this, "No user logged in", "Error", JOptionPane.ERROR_MESSAGE);
				return;
			}

			// Use strategy pattern to process payment
			PaymentStrategy strategy = getPaymentStrategy(method);
			// For now, just add the funds directly (strategy methods are empty)
			app.getFacade().addBalance(currentUser,amount);

			JOptionPane.showMessageDialog(this, "Successfully added $" + String.format("%.2f", amount) + " using " + method, "Success", JOptionPane.INFORMATION_MESSAGE);
			amountField.setText("0.00");
			
			refresh();
		} catch (NumberFormatException ex) {
			JOptionPane.showMessageDialog(this, "Invalid amount format. Please enter a valid number", "Error", JOptionPane.ERROR_MESSAGE);
		}
	}

	private PaymentStrategy getPaymentStrategy(PaymentMethod method) {
		return switch (method) {
			case CREDIT -> new CreditPaymentStrategy();
			case DEBIT -> new DebitPaymentStrategy();
			case INSTITUTIONAL -> new InstitutionalPaymentStrategy();
			case GRANTS -> new ResearchGrantPaymentStrategy();
		};
	}

	public void refresh() {
		User currentUser = app.getCurrentUser();
		if (currentUser != null) {
			balanceLabel.setText(String.format("Balance: $%.2f", currentUser.getFunds()));
		} else {
			return;
		}
		revalidate();
		repaint();
	}
	
}
