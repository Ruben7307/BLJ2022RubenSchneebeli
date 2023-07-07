package ch.noseryoung;

import java.util.ArrayList;

public class Quiz {
    private ArrayList<Question> questions = new ArrayList<>();
    private int currentQuestionCount = 0;
    private int correctAnswers = 0;


    public void createQuestion(String question, String[] answers, int correctAnswer){
        Question newQuestion = new Question(question, answers,  correctAnswer);
        questions.add(newQuestion);
    }

    public int getCurrentQuestionCount() {
        return currentQuestionCount;
    }

    public ArrayList<Question> getQuestions() {
        return questions;
    }

    public void setCurrentQuestionCount(int currentQuestionCount) {
        this.currentQuestionCount = currentQuestionCount;
    }

    public void setCorrectAnswers(int correctAnswers) {
        this.correctAnswers = correctAnswers;
    }

    public int getCorrectAnswers() {
        return correctAnswers;
    }
}
