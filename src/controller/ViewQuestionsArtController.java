/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Dell
 */
public class ViewQuestionsArtController  implements Initializable {

    @FXML
    public Label question;

    @FXML
    public Button opt1, opt2, opt3, opt4;

    static int counter = 0;
    static int correct = 0;
    static int wrong = 0;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       loadQuestions();
    }    
    
    private void loadQuestions() {

        if (counter == 0) { //Question 1
            question.setText(" ¿Que novelas fueron escritas por el premio Nobel de Literatura Gabriel García Márquez ?");
            opt1.setText("El otoño del Patriarca y El amor en los tiempos del cólera");
            opt2.setText("Doña Bárbaray antaclaro");
            opt3.setText("La muerte de Artemio Cruz y La región más transparente");
            opt4.setText("Don Quijote de la mancha y La Gitanilla");
        }
        if (counter == 1) { //Question 2
            question.setText("2. ¿Cuándo ganó la selección colombiana la Copa América de Fútbol?");
            opt1.setText("2007");
            opt2.setText("2001");
            opt3.setText("2011");
            opt4.setText("2005");
        }
        if (counter == 2) { //Question 3
            question.setText("3. In the Solar System, farthest planet from the Sun is");
            opt1.setText("Jupiter");
            opt2.setText("Saturn");
            opt3.setText("Uranus");
            opt4.setText("Neptune");
        }
        if (counter == 3) { //Question 4
            question.setText("4. Largest moon in the Solar System?");
            opt1.setText("Titan");
            opt2.setText("Ganymede");
            opt3.setText("Moon");
            opt4.setText("Europa");
        }
        if (counter == 4) {//Question 5
            question.setText("5. Which of these is 'not' a property of metal?");
            opt1.setText("Good Conduction");
            opt2.setText("Malleable");
            opt3.setText("Non Ductile");
            opt4.setText("Sonourous");
        }
        if (counter == 5) { //Question 6
            question.setText("6. Who discovered Pasteurisation?");
            opt1.setText("Alexander Fleming");
            opt2.setText("Louis Pasteur");
            opt3.setText("Simon Pasteur");
            opt4.setText("William Pasteur");
        }
        if (counter == 6) { //Question 7
            question.setText("7. Hydrochloric acid (HCl) is produced by -?");
            opt1.setText("Small Intestine");
            opt2.setText("Liver");
            opt3.setText("Oesophagus");
            opt4.setText("Stomach");
        }
        if (counter == 7) { //Question 8
            question.setText("8. The fastest animal in the world is -");
            opt1.setText("Lion");
            opt2.setText("Blackbuck");
            opt3.setText("Cheetah");
            opt4.setText("Quarter Horse");
        }
        if (counter == 8) { //Question 9
            question.setText("9. Complementary colour of Red is -");
            opt1.setText("Blue");
            opt2.setText("Green");
            opt3.setText("Yellow");
            opt4.setText("Pink");
        }
        if (counter == 9) { //Question 10
            question.setText("10. World Environment Day is on -");
            opt1.setText("5th June");
            opt2.setText("5th July");
            opt3.setText("15th June");
            opt4.setText("25th June");
        }

    }


    @FXML
    public void opt1clicked(ActionEvent event) {
        checkAnswer(opt1.getText().toString());
        if (checkAnswer(opt1.getText().toString())) {
            correct = correct + 1;
        } else {
            wrong = wrong + 1;
        }
        if (counter == 9) {
            try {
                System.out.println(correct);
                Stage thisstage = (Stage) ((Button) event.getSource()).getScene().getWindow();
                thisstage.close();
                FXMLLoader quiz = new FXMLLoader(getClass().getResource("result.fxml"));
                Scene quizscene = new Scene(quiz.load());
                Stage quizstage = new Stage();
                quizstage.setScene(quizscene);
                quizstage.show();
            } catch(IOException e) {
                e.printStackTrace();
            }
        } else {
            counter++;
            loadQuestions();
        }

    }

    boolean checkAnswer(String answer) {

        if (counter == 0) {
            if (answer.equals("El otoño del Patriarca y El amor en los tiempos del cólera")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 1) {
            if (answer.equals("Thomas Alva Edison")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 2) {
            if (answer.equals("Neptune")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 3) {
            if (answer.equals("Ganymede")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 4) {
            if (answer.equals("Non Ductile")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 5) {
            if (answer.equals("Louis Pasteur")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 6) {
            if (answer.equals("Stomach")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 7) {
            if (answer.equals("Cheetah")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 8) {
            if (answer.equals("Green")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 9) {
            if (answer.equals("5th June")) {
                return true;
            } else {
                return false;
            }
        }
        return false;


    }

    @FXML
    public void opt2clicked(ActionEvent event) {
        checkAnswer(opt2.getText().toString());
        if (checkAnswer(opt2.getText().toString())) {
            correct = correct + 1;
        } else {
            wrong = wrong + 1;
        }
        if (counter == 9) {
            try {
                System.out.println(correct);
                Stage thisstage = (Stage) ((Button) event.getSource()).getScene().getWindow();
                thisstage.close();
                FXMLLoader quiz = new FXMLLoader(getClass().getResource("result.fxml"));
                Scene quizscene = new Scene(quiz.load());
                Stage quizstage = new Stage();
                quizstage.setScene(quizscene);
                quizstage.show();
            } catch(IOException e) {
                e.printStackTrace();
            }
        } else {
            counter++;
            loadQuestions();
        }
    }

    @FXML
    public void opt3clicked(ActionEvent event) {
        checkAnswer(opt3.getText().toString());
        if (checkAnswer(opt3.getText().toString())) {
            correct = correct + 1;
        } else {
            wrong = wrong + 1;
        }
        if (counter == 9) {
            try {
                System.out.println(correct);
                Stage thisstage = (Stage) ((Button) event.getSource()).getScene().getWindow();
                thisstage.close();
                FXMLLoader quiz = new FXMLLoader(getClass().getResource("result.fxml"));
                Scene quizscene = new Scene(quiz.load());
                Stage quizstage = new Stage();
                quizstage.setScene(quizscene);
                quizstage.show();
            } catch(IOException e) {
                e.printStackTrace();
            }
        } else {
            counter++;
            loadQuestions();
        }
    }

    @FXML
    public void opt4clicked(ActionEvent event) {
        checkAnswer(opt4.getText().toString());
        if (checkAnswer(opt4.getText().toString())) {
            correct = correct + 1;
        } else {
            wrong = wrong + 1;
        }
        if (counter == 9) {
            try {
                System.out.println(correct);
                Stage thisstage = (Stage) ((Button) event.getSource()).getScene().getWindow();
                thisstage.close();
                FXMLLoader quiz = new FXMLLoader(getClass().getResource("result.fxml"));
                Scene quizscene = new Scene(quiz.load());
                Stage quizstage = new Stage();
                quizstage.setScene(quizscene);
                quizstage.show();
            } catch(IOException e) {
                e.printStackTrace();
            }
        } else {
            counter++;
            loadQuestions();
        }
    }
    
    
}
