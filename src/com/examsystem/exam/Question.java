package com.examsystem.exam;

public class Question {
    private String questionText;
    private String[] options;
    private int correctAnswer; // index of correct option

    public Question(String questionText, String[] options, int correctAnswer) {
        this.questionText = questionText;
        this.options = options;
        this.correctAnswer = correctAnswer;
    }

    public String getQuestionText() { return questionText; }
    public String[] getOptions() { return options; }
    public int getCorrectAnswer() { return correctAnswer; }
}