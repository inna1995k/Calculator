package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;


public class Controller {
    @FXML
    Button button0, button1,button2,button3,button4,button5,button6,button7,button8,button9,backSpace,minus,plus,division,multiplication,equally;
    @FXML
    TextField display;

    int f = 0;
    String op = "+";

    public void button0(ActionEvent actionEvent) {
        display.setText(display.getText() + "0");
    }

    public void button1(ActionEvent actionEvent) {
        display.setText(display.getText() + "1");
    }


    public void button2(ActionEvent actionEvent) {
        display.setText(display.getText() + "2");
    }

    public void button3(ActionEvent actionEvent) {
        display.setText(display.getText() + "3");
    }

    public void button4(ActionEvent actionEvent) {
        display.setText(display.getText() + "4");
    }

    public void button5(ActionEvent actionEvent) {
        display.setText(display.getText() + "5");
    }

    public void button6(ActionEvent actionEvent) {
        display.setText(display.getText() + "6");
    }

    public void button7(ActionEvent actionEvent) {
        display.setText(display.getText() + "7");
    }

    public void button8(ActionEvent actionEvent) {
        display.setText(display.getText() + "8");
    }

    public void button9(ActionEvent actionEvent) {
        display.setText(display.getText() + "9");
    }

    public void clear(ActionEvent actionEvent) {
        String clear = display.getText();
        display.setText(clear.substring(0,clear.length()-1));
    }

    public void minus(ActionEvent actionEvent) {
        f = Integer.valueOf(display.getText());
        display.setText("");
        op = "-";
    }

    public void multiplication(ActionEvent actionEvent) {
        f = Integer.valueOf(display.getText());
        display.setText("");
        op = "*";
    }

    public void division(ActionEvent actionEvent) {
        f = Integer.valueOf(display.getText());
        display.setText("");
        op = "/";
    }

    public void plus(ActionEvent actionEvent) {
        f = Integer.valueOf(display.getText());
        display.setText("");
        op = "+";
    }
    public void equally(ActionEvent actionEvent) {
        int sec = Integer.valueOf(display.getText());
        if("-".equals(op)){
            display.setText((f - sec) + "");
        }
        if("+".equals(op)){
            display.setText((f + sec) + "");
        }
        if("/".equals(op)){
            display.setText((f / sec) + "");
        }
        if("*".equals(op)){
            display.setText((f * sec) + "");
        }
    }
}
