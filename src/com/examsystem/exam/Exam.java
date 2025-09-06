package com.examsystem.exam;

import com.examsystem.ui.UIUtils;

import javax.swing.*;
import java.awt.*;

public class Exam extends JFrame {
    private Question[] questions;
    private int currentIndex = 0;
    private int score = 0;
    private ButtonGroup optionGroup;
    private JRadioButton[] optionButtons;
    private JLabel questionLabel;

    public Exam(String username) {
        setTitle("Exam for " + username);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 300);
        setLocationRelativeTo(null);

        // Sample Questions
        questions = new Question[] {
                new Question("What is 2 + 2?", new String[]{"3", "4", "5", "6"}, 1),
                new Question("Capital of France?", new String[]{"Berlin", "Paris", "Rome", "Madrid"}, 1),
                new Question("Which language is this project in?", new String[]{"Python", "C++", "Java", "Ruby"}, 2)
        };

        JPanel panel = new JPanel(new BorderLayout(10, 10));

        questionLabel = new JLabel("", SwingConstants.CENTER);
        panel.add(questionLabel, BorderLayout.NORTH);

        JPanel optionsPanel = new JPanel(new GridLayout(4, 1));
        optionGroup = new ButtonGroup();
        optionButtons = new JRadioButton[4];

        for (int i = 0; i < 4; i++) {
            optionButtons[i] = new JRadioButton();
            optionGroup.add(optionButtons[i]);
            optionsPanel.add(optionButtons[i]);
        }
        panel.add(optionsPanel, BorderLayout.CENTER);

        JButton nextButton = new JButton("Next");
        nextButton.addActionListener(e -> handleNext());
        panel.add(nextButton, BorderLayout.SOUTH);

        add(panel);
        loadQuestion();
        setVisible(true);
    }

    private void loadQuestion() {
        if (currentIndex < questions.length) {
            Question q = questions[currentIndex];
            questionLabel.setText("Q" + (currentIndex + 1) + ": " + q.getQuestionText());

            String[] opts = q.getOptions();
            for (int i = 0; i < opts.length; i++) {
                optionButtons[i].setText(opts[i]);
                optionButtons[i].setSelected(false);
            }
        } else {
            showResult();
        }
    }

    private void handleNext() {
        Question q = questions[currentIndex];
        for (int i = 0; i < optionButtons.length; i++) {
            if (optionButtons[i].isSelected() && i == q.getCorrectAnswer()) {
                score++;
            }
        }
        currentIndex++;
        loadQuestion();
    }

    private void showResult() {
        dispose();
        UIUtils.showInfo("Exam Finished! Your score: " + score + "/" + questions.length);
    }
}