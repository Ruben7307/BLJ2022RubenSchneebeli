package ch.noseryoung;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.UIManager;

public class Console {
  private JFrame frame;
  private JScrollPane scrollPane;
  private JTextArea textArea;

  private JPanel inputPanel;
  private JTextField inputSign;
  private JTextField inputField;

  private InputController inputController;

  public Console() {
    try {
      UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
    } catch (Exception ignore) {}

    textArea = new JTextArea();
    textArea.setBackground(Color.BLACK);
    textArea.setForeground(Color.LIGHT_GRAY);
    textArea.setCaretColor(Color.LIGHT_GRAY);
    textArea.setLineWrap(true);
    textArea.setEditable(false);
    textArea.setText("NYoS [Version 0.01 Alpha]\n© 2023 Noser Young. All rights reserved.\n\n");

    scrollPane = new JScrollPane(textArea);
    scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
    scrollPane.setBorder(BorderFactory.createEmptyBorder());

    inputField = new JTextField();
    inputField.setBackground(Color.LIGHT_GRAY);
    inputField.setForeground(Color.BLACK);
    inputField.setCaretColor(Color.BLACK);
    inputField.setFont(textArea.getFont().deriveFont(12));
    inputField.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 17, new Color(240, 240, 240)));

    inputSign = new JTextField("└> ");
    inputSign.setBackground(Color.LIGHT_GRAY);
    inputSign.setForeground(Color.BLACK);
    inputSign.setCaretColor(Color.BLACK);
    inputSign.setFont(textArea.getFont().deriveFont(12));
    inputSign.setEditable(false);
    inputSign.setBorder(BorderFactory.createEmptyBorder());

    inputPanel = new JPanel();
    inputPanel.setLayout(new BorderLayout());
    inputPanel.add(inputSign, BorderLayout.WEST);
    inputPanel.add(inputField, BorderLayout.CENTER);

    frame = new JFrame("Java Command Prompt");
    frame.setResizable(true);
    frame.setSize(500, 300);
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLayout(new BorderLayout());
    frame.add(scrollPane, BorderLayout.CENTER);
    frame.add(inputPanel, BorderLayout.SOUTH);

    inputController = new InputController(this);
    inputField.addKeyListener(inputController);
  }

  public void start() {
    frame.setVisible(true);
  }

  public void stop() {
    System.exit(0);
  }

  public void append(String text) {
    textArea.append(text);
    textArea.setCaretPosition(textArea.getDocument().getLength());
  }

  public void appendLine(String text) {
    textArea.append(text + "\n");
    textArea.setCaretPosition(textArea.getDocument().getLength());
  }

  public void setText(String text) {
    textArea.setText(text);
    textArea.setCaretPosition(textArea.getDocument().getLength());
  }

  public void clear() {
    textArea.setText("");
    textArea.setCaretPosition(textArea.getDocument().getLength());
  }

  public String getText() {
    return textArea.getText();
  }

  public JTextArea getTextArea() {
    return textArea;
  }

  public InputController getInputController() {
    return inputController;
  }

  public void setInputController(InputController inputController) {
    this.inputController = inputController;
  }
}
