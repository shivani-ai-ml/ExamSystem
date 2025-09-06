package com.examsystem.auth;

import com.examsystem.ui.UIUtils;

import javax.swing.*;

public class WrongUserName extends JFrame {
    public WrongUserName() {
        setTitle("Access Denied");
        setSize(300, 150);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel message = new JLabel("Too many failed attempts!", SwingConstants.CENTER);
        add(message);

        UIUtils.showError("You are blocked. Restart application.");
        setVisible(true);
    }
}