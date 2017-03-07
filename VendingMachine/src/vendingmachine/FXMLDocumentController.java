/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vendingmachine;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author dell pc
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Label label;
    @FXML
    private RadioButton rb5;
    @FXML
    private ToggleGroup group1;
    @FXML
    private RadioButton rb10;
    @FXML
    private RadioButton rb25;

    static int[] list_of_states = {0, -40, -35, -30, -15, -25, -20, -10, -5, 0, 5, 10, 15, 20};
    static int[][] transitions = new int[14][5];
    static int curr_state = 1;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        transitions[1][0] = 2;
        transitions[1][1] = 3;
        transitions[1][2] = 4;
        transitions[2][0] = 3;
        transitions[2][1] = 5;
        transitions[2][2] = 7;
        transitions[3][0] = 5;
        transitions[3][1] = 6;
        transitions[3][2] = 8;
        transitions[4][0] = 7;
        transitions[4][1] = 8;
        transitions[4][2] = 11;
        transitions[5][0] = 6;
        transitions[5][1] = 4;
        transitions[5][2] = 9;
        transitions[6][0] = 4;
        transitions[6][1] = 7;
        transitions[6][2] = 10;
        transitions[7][0] = 8;
        transitions[7][1] = 9;
        transitions[7][2] = 12;
        transitions[8][0] = 9;
        transitions[8][1] = 10;
        transitions[8][2] = 13;
        transitions[9][0] = 0;
        transitions[9][1] = 0;
        transitions[9][2] = 0;
        transitions[10][0] = 0;
        transitions[10][1] = 0;
        transitions[10][2] = 0;
        transitions[11][0] = 0;
        transitions[11][1] = 0;
        transitions[11][2] = 0;
        transitions[12][0] = 0;
        transitions[12][1] = 0;
        transitions[12][2] = 0;
        transitions[13][0] = 0;
        transitions[13][1] = 0;
        transitions[13][2] = 0;

    }

    @FXML
    private void handleFive(ActionEvent event) {

    }

    @FXML
    private void handleTen(ActionEvent event) {
    }

    private void handletf(ActionEvent event) {

    }

    @FXML
    private void handleFiveClick(MouseEvent event) {
        System.out.print("Moved " + curr_state + "->");
        curr_state = transitions[curr_state][0];
        System.out.println("" + curr_state);
        int amt=list_of_states[curr_state];
        label.setText("You have already put in Rs" + (40 +amt ));
        if(amt>=0)
        {
            label.setText("You have added Rs"+amt+" extra"+"\n"+"Dispensing the Drink");
        }
        if(curr_state==0)
        {
            label.setText("Don't Add More Money");
        }

    }

    @FXML
    private void handleTenClick(MouseEvent event) {
        System.out.print("Moved " + curr_state + "->");
        curr_state = transitions[curr_state][1];
        System.out.println("" + curr_state);
        int amt=list_of_states[curr_state];
        label.setText("You have already put in Rs" + (40 +amt ));
        if(amt>=0)
        {
            label.setText("You have added Rs"+amt+" extra"+"\n"+"Dispensing the Drink");
        }
        if(curr_state==0)
        {
            label.setText("Don't Add More Money");
        }
    }

    @FXML
    private void handletfClick(MouseEvent event) {
        System.out.print("Moved " + curr_state + "->");
        curr_state = transitions[curr_state][2];
        System.out.println("" + curr_state);
        int amt=list_of_states[curr_state];
        label.setText("You have already put in Rs" + (40 +amt ));
        if(amt>=0)
        {
            label.setText("You have added Rs"+amt+" extra"+"\n"+"Dispensing the Drink");
        }
        if(curr_state==0)
        {
            label.setText("Don't Add More Money");
        }
    }

    @FXML
    private void reset(ActionEvent event) {
        curr_state=1;
        label.setText("Add some coins");
    }

}
