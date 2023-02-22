package com.example.morsecodefx;
import java.util.*;import java.util.Scanner;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private TextField input;

    @FXML
    private TextArea output;

    @FXML
    protected void scanner() {
            String Input = input.getText();
            Input = Input.toLowerCase();

            for (int i = 0; i < Input.length(); i++) {
                Map<Character, String> morse = new HashMap<Character, String>();

                morse.put('a', "∙- ");
                morse.put('b', "-∙∙∙ ");
                morse.put('c', "-∙- ");
                morse.put('d', "-∙∙ ");
                morse.put('e', "∙ ");
                morse.put('f', "∙∙-∙ ");
                morse.put('g', "--∙ ");
                morse.put('h', "∙∙∙∙ ");
                morse.put('i', "∙∙ ");
                morse.put('j', "∙--- ");
                morse.put('k', "-∙ ");
                morse.put('l', "∙-∙∙ ");
                morse.put('m', "-- ");
                morse.put('n', "-∙ ");
                morse.put('o', "--- ");
                morse.put('p', "∙--∙ ");
                morse.put('q', "--∙- ");
                morse.put('r', "∙-∙ ");
                morse.put('s', "∙∙∙ ");
                morse.put('t', "- ");
                morse.put('u', "∙∙- ");
                morse.put('v', "∙∙∙- ");
                morse.put('w', "∙-- ");
                morse.put('x', "-∙∙- ");
                morse.put('y', "-∙-- ");
                morse.put('z', "--∙∙ ");
                morse.put(' ', " / ");

                System.out.print(morse.get(Input.charAt(i)));
                String temp;
                temp = morse.get(Input.charAt(i));
                output.setText(temp);


            }

    }

    @FXML
    protected void text(){

    }

}