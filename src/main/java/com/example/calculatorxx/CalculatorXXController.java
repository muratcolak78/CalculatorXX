package com.example.calculatorxx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CalculatorXXController {

    @FXML
    private TextField textField;
    @FXML
    private String number = "";
    @FXML
    private String result = "";
    @FXML
    private String operator = "";


    @FXML
    public void onOperatorClick(ActionEvent e) {

        if(this.operator.isEmpty()) {
            this.operator = (((Button) e.getSource()).getText());
            this.result = this.number;
            this.number = "";
        }
    }

    @FXML
    public void onNumbersClick(ActionEvent e) {
        this.number = this.number + (((Button) e.getSource()).getText());
        textField.setText(this.number);
    }

    @FXML
    public void onEqualsClick(ActionEvent e) {

        if (this.operator.equals("+")) {
            this.result = String.valueOf(Float.valueOf(this.result) + Float.valueOf(this.number));
        } else if (this.operator.equals("-")) {
            this.result = String.valueOf(Float.valueOf(this.result) - Float.valueOf(this.number));
        } else if (this.operator.equals("*")) {
            this.result = String.valueOf(Float.valueOf(this.result) * Float.valueOf(this.number));
        } else if (this.operator.equals("/")) {
            if (((((Button) e.getSource()).getText()).equals("0"))){
                textField.setText("!!!");
            } else {
                this.result = String.valueOf(Float.valueOf(this.result) / Float.valueOf(this.number));
            }
        }else if(this.operator.equals("X²")){
            this.result=String.valueOf(Float.valueOf(this.result)*Float.valueOf(this.result));
        }else if(this.operator.equals("√X")){
            this.result=String.valueOf(Math.sqrt(Float.valueOf(this.result)));
        }else if(this.operator.equals("%X")){
            this.result=String.valueOf((Float.valueOf(this.result)/100)*Float.valueOf(this.number));
        }

        textField.setText(this.result);
        this.operator="";
        this.number=this.result;
        this.result="";
    }

    @FXML
    public void onCleanClick() {
        this.result = "";
        this.number = "";
        this.operator = "";
        textField.setText("0");
    }
}