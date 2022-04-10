package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.text.Text;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private TextArea text_regex;

    @FXML
    private TextField pattern_regex;

    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        check_regex(pattern_regex.getText(),text_regex.getText());
    }

    private void check_regex(String pattern_regex, String text_regex){
        Pattern p = Pattern.compile(pattern_regex);
        Matcher m = p.matcher(text_regex);
        boolean result = m.find();
        if(result){
            welcomeText.setText("OK");
        }else{
            welcomeText.setText("NG");
        }

    }
}