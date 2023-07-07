package ch.noseryoung;

public class Question {
    String question;
    String[] answers;
    int correctAnswer;
    Question(String question, String[] answers, int correctAnswer){
        this.question = question;
        this.answers = answers;
        this.correctAnswer = correctAnswer;
    }
}
