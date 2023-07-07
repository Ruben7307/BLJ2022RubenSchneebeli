package ch.noseryoung;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JTextField;

public class InputController extends KeyAdapter {

  private Console console;

  private QuizManager manager;
  private List<String> inputHistory = new ArrayList<>();
  private int inputHistoryIndex = 0;
  private Boolean isQuizRunning = false;
  private Timer timer;


  public InputController(Console console) {
    this.console = console;
    this.manager = new QuizManager(console);
    this.timer = new Timer(manager);
  }

  @Override
  public void keyPressed(KeyEvent keyEvent) {
    JTextField textField = ((JTextField) keyEvent.getSource());

    switch (keyEvent.getKeyCode()) {
    case KeyEvent.VK_ENTER:
      if (textField.getText().equals("start")&& !isQuizRunning){
        manager.handleTextInput(textField.getText(),isQuizRunning);
        isQuizRunning = true;
        textField.setText("");
        manager.playQuiz();
        timer.start();
        return;
      }
      if (isQuizRunning) {
        timer.interrupt();
        manager.setQuestionAnswered(true);
        manager.handleTextInput(textField.getText(),isQuizRunning);
        manager.checkAnswer(textField.getText());
        boolean finished = manager.increaseQuestionCount();
        if (finished){
          isQuizRunning = false;
        }else {
          manager.playQuiz();
        }
        manager.setQuestionAnswered(false);
      }else {
        manager.handleTextInput(textField.getText(),isQuizRunning);
      }
      inputHistory.add(textField.getText());
      inputHistoryIndex = inputHistory.size();
      console.getTextArea().setCaretPosition(console.getTextArea().getDocument().getLength());
      textField.setText("");
      break;

    case KeyEvent.VK_UP:
      if (!inputHistory.isEmpty()) {
        inputHistoryIndex = Math.max(0, inputHistoryIndex - 1);
        textField.setText(inputHistory.get(inputHistoryIndex));
      }
      break;

    case KeyEvent.VK_DOWN:
      if (!inputHistory.isEmpty()) {
        inputHistoryIndex = Math.min(inputHistory.size(), inputHistoryIndex + 1);
        textField.setText(inputHistoryIndex != inputHistory.size() ? inputHistory.get(inputHistoryIndex) : "");
      }
      break;

    case KeyEvent.VK_ESCAPE:
      inputHistoryIndex = inputHistory.size();
      textField.setText("");
      break;
    }
  }
}
