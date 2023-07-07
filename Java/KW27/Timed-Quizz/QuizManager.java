package ch.noseryoung;

import java.sql.Time;

public class QuizManager {

  private Console console;
  private Quiz quiz;
  private boolean questionAnswered = false;

  public QuizManager(Console console) {
    this.console = console;

    this.quiz = new Quiz();
    quiz.createQuestion("Whats my name?", new String[]{"Noah", "Ruben", "Ilija"}, 2 );
    quiz.createQuestion("Whats my age?", new String[]{"19", "20", "16"}, 3 );
    quiz.createQuestion("Whats my shoe brand?", new String[]{"Nike", "Adidas", "Reebok"}, 1 );
  }

  public void handleTextInput(String textInput, Boolean isQuizRunning) {
    console.appendLine("└> " + textInput);
  }

  public void playQuiz() {
    Question currentQuestion = quiz.getQuestions().get(quiz.getCurrentQuestionCount());
    console.appendLine(currentQuestion.question);
    console.appendLine("[1] " + currentQuestion.answers[0]);
    console.appendLine("[2] " + currentQuestion.answers[1]);
    console.appendLine("[3] " + currentQuestion.answers[2]);
  }
  public void startTimer(Timer timer){
    if (!(quiz.getCurrentQuestionCount() == 2)){
      timer.start();
    }

  }
  public void finished(){
    console.appendLine("You answered " +quiz.getCorrectAnswers()+ " out of 3");
    quiz.setCurrentQuestionCount(0);
  }
  public boolean increaseQuestionCount(){
    if (quiz.getCurrentQuestionCount() == 2){
      finished();
      return true;
    }else {
      int newQuestionCont = quiz.getCurrentQuestionCount() + 1;
      quiz.setCurrentQuestionCount(newQuestionCont);
      return false;
    }
  }

  public void checkAnswer(String userInput) {
    Question currentQuestion = quiz.getQuestions().get(quiz.getCurrentQuestionCount());
    String correctAnswer = String.valueOf(currentQuestion.correctAnswer);
    if (userInput.equals(correctAnswer)){
      quiz.setCorrectAnswers(quiz.getCorrectAnswers() + 1);
    }
  }

  public Quiz getQuiz() {
    return quiz;
  }

  public boolean isQuestionAnswered() {
    return questionAnswered;
  }

  public void setQuestionAnswered(boolean questionAnswered) {
    this.questionAnswered = questionAnswered;
  }
}
