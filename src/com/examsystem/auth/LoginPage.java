package com.examsystem.auth;

import com.examsystem.exam.Exam;
import com.examsystem.ui.UIUtils;

import javax.swing.*;
import java.awt.*;

public class LoginPage extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;
    private int attempts = 0;
    private final int MAX_ATTEMPTS = 3;

    // Dummy user (in real projects, load from DB)
    private final User validUser = new User("admin", "1234");

    public LoginPage() {
        setTitle("Login Page");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(350, 200);
        setLocationRelativeTo(null);

        // UI Elements
        JPanel panel = new JPanel(new GridLayout(3, 2, 10, 10));
        JLabel userLabel = new JLabel("Username:");
        JLabel passLabel = new JLabel("Password:");

        usernameField = new JTextField();
        passwordField = new JPasswordField();

        JButton loginButton = new JButton("Login");
        loginButton.addActionListener(e -> handleLogin());

        panel.add(userLabel);
        panel.add(usernameField);
        panel.add(passLabel);
        panel.add(passwordField);
        panel.add(new JLabel()); // filler
        panel.add(loginButton);

        add(panel);
        setVisible(true);
    }

    private void handleLogin() {
        String username = usernameField.getText();
        String password = String.valueOf(passwordField.getPassword());

        if (username.equals(validUser.getUsername()) && password.equals(validUser.getPassword())) {
            dispose();
            new Exam(username); // Start exam
        } else {
            attempts++;
            if (attempts >= MAX_ATTEMPTS) {
                new WrongUserName();
                dispose();
            } else {
                UIUtils.showError("Invalid credentials. Attempts left: " + (MAX_ATTEMPTS - attempts));
            }
        }
    }
}