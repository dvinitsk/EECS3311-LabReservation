package com.yorku.lab.gui;

import com.yorku.lab.enums.UserType;
import com.yorku.lab.model.ApprovalRequest;
import com.yorku.lab.model.Equipment;
import com.yorku.lab.pattern.facade.ReservationFacade;
import com.yorku.lab.pattern.singleton.LabCoordinatorService;

import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.util.List;

public class AdminPanel extends JPanel {

    private final LabReservationApp app;
    private JTabbedPane tabs;
    private JPanel approvalPanel;
    private JPanel equipmentPanel;

    public AdminPanel(LabReservationApp app) {
        this.app = app;
        setLayout(new BorderLayout(20, 20));
        setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JPanel top = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JButton backBtn = new JButton("Back");
        backBtn.addActionListener(e -> app.showPanel(LabReservationApp.DASHBOARD));
        top.add(backBtn);

        tabs = new JTabbedPane();
        approvalPanel = new JPanel(new BorderLayout());
        equipmentPanel = new JPanel(new BorderLayout());

        JPanel coordinatorPanel = new JPanel(new GridBagLayout());
        coordinatorPanel.setPreferredSize(new Dimension(450, 200));
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        JLabel nameL = new JLabel("Manager Name:");
        JTextField nameF = new JTextField(15);
        JLabel emailL = new JLabel("Manager Email:");
        JTextField emailF = new JTextField(15);
        JLabel deptL = new JLabel("Department:");
        JTextField deptF = new JTextField(15);
        JButton createBtn = new JButton("Create Lab Manager Account");
        coordinatorPanel.add(nameL, gbc);
        gbc.gridx = 1;
        coordinatorPanel.add(nameF, gbc);
        gbc.gridx = 0;
        gbc.gridy = 1;
        coordinatorPanel.add(emailL, gbc);
        gbc.gridx = 1;
        coordinatorPanel.add(emailF, gbc);
        gbc.gridx = 0;
        gbc.gridy = 2;
        coordinatorPanel.add(deptL, gbc);
        gbc.gridx = 1;
        coordinatorPanel.add(deptF, gbc);
        gbc.gridx = 1;
        gbc.gridy = 3;
        createBtn.addActionListener(e -> {
            if (app.getCurrentUser() != null && app.getCurrentUser().getType() != UserType.LABCOORDINATOR) {
                JOptionPane.showMessageDialog(this, "Only Lab Coordinator can create manager accounts.");
                return;
            }
            String name = nameF.getText().trim();
            String email = emailF.getText().trim();
            String department = deptF.getText().trim();
            if (name.isEmpty() || email.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Enter name and email.");
                return;
            }
            var result = LabCoordinatorService.getInstance().generateManagerAccount(name, email, department);
            showOnboardingNotice(result);
        });
        coordinatorPanel.add(createBtn, gbc);

        tabs.addTab("Account Approvals", approvalPanel);
        tabs.addTab("Create Manager", coordinatorPanel);
        tabs.addTab("Equipment Management", equipmentPanel);

        add(top, BorderLayout.NORTH);
        add(tabs, BorderLayout.CENTER);
    }

    private void showOnboardingNotice(LabCoordinatorService.ManagerCreationResult result) {
        JTextArea textArea = new JTextArea(result.onboardingNotice(), 18, 50);
        textArea.setEditable(false);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        JScrollPane scroll = new JScrollPane(textArea);
        JButton copyBtn = new JButton("Copy to Clipboard");
        copyBtn.addActionListener(e -> {
            Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
            clipboard.setContents(new StringSelection(result.onboardingNotice()), null);
            JOptionPane.showMessageDialog(this, "Onboarding notice copied. You can paste and email it to the manager.");
        });
        JPanel panel = new JPanel(new BorderLayout(5, 5));
        panel.add(new JLabel("Manager account created. Onboarding notice (share with manager):"), BorderLayout.NORTH);
        panel.add(scroll, BorderLayout.CENTER);
        panel.add(copyBtn, BorderLayout.SOUTH);
        JOptionPane.showMessageDialog(this, panel, "Manager Created - Onboarding Notice", JOptionPane.INFORMATION_MESSAGE);
    }

    public void refresh() {
        UserType type = app.getCurrentUser() != null ? app.getCurrentUser().getType() : null;
        if (type != UserType.LABCOORDINATOR && type != UserType.MANAGER) return;

        approvalPanel.removeAll();
        List<ApprovalRequest> pending = app.getFacade().getPendingApprovals();
        JPanel list = new JPanel(new GridLayout(0, 1, 5, 5));
        for (ApprovalRequest ar : pending) {
            JPanel card = new JPanel(new FlowLayout());
            card.setBorder(BorderFactory.createEtchedBorder());
            String info = ar.getUser().getFullName() + " (" + ar.getUser().getCredentials().getEmail() + ") - " + ar.getUser().getType();
            card.add(new JLabel(info));
            JButton approveBtn = new JButton("Approve");
            JButton rejectBtn = new JButton("Reject");
            String reqId = ar.getRequestId();
            approveBtn.addActionListener(e -> {
                app.getFacade().approveAccount(reqId);
                refresh();
            });
            rejectBtn.addActionListener(e -> {
                String reason = JOptionPane.showInputDialog(this, "Rejection reason:");
                if (reason != null) {
                    app.getFacade().rejectAccount(reqId, reason);
                    refresh();
                }
            });
            card.add(approveBtn);
            card.add(rejectBtn);
            list.add(card);
        }
        approvalPanel.add(new JScrollPane(list), BorderLayout.CENTER);
        approvalPanel.revalidate();
        approvalPanel.repaint();

        equipmentPanel.removeAll();
        if (type == UserType.MANAGER || type == UserType.LABCOORDINATOR) {
            JPanel addForm = new JPanel(new FlowLayout());
            JTextField idF = new JTextField(8);
            JTextField descF = new JTextField(15);
            JTextField locF = new JTextField(10);
            JButton addBtn = new JButton("Add Equipment");
            addForm.add(new JLabel("ID:"));
            addForm.add(idF);
            addForm.add(new JLabel("Description:"));
            addForm.add(descF);
            addForm.add(new JLabel("Location:"));
            addForm.add(locF);
            addForm.add(addBtn);
            addBtn.addActionListener(e -> {
                String id = idF.getText().trim();
                String desc = descF.getText().trim();
                String loc = locF.getText().trim();
                if (id.isEmpty() || desc.isEmpty() || loc.isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Fill all fields.");
                    return;
                }
                app.getFacade().addEquipment(id, desc, loc);
                JOptionPane.showMessageDialog(this, "Equipment added.");
                refresh();
            });

            JPanel eqList = new JPanel(new GridLayout(0, 1, 5, 5));
            for (Equipment eq : app.getFacade().browseEquipment()) {
                JPanel row = new JPanel(new FlowLayout());
                row.add(new JLabel(eq.getEquipmentId() + " - " + eq.getDescription() + " [" + eq.getOperationalStatus() + "]"));
                JButton enableBtn = new JButton("Enable");
                JButton disableBtn = new JButton("Disable");
                JButton maintBtn = new JButton("Maintenance");
                String eqId = eq.getEquipmentId();
                enableBtn.addActionListener(ev -> { app.getFacade().enableEquipment(eqId); refresh(); });
                disableBtn.addActionListener(ev -> { app.getFacade().disableEquipment(eqId); refresh(); });
                maintBtn.addActionListener(ev -> { app.getFacade().markEquipmentMaintenance(eqId); refresh(); });
                row.add(enableBtn);
                row.add(disableBtn);
                row.add(maintBtn);
                eqList.add(row);
            }
            equipmentPanel.add(addForm, BorderLayout.NORTH);
            equipmentPanel.add(new JScrollPane(eqList), BorderLayout.CENTER);
        }
        equipmentPanel.revalidate();
        equipmentPanel.repaint();
    }
}
