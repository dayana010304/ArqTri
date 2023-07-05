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
public class ViewQuestionsGeographyController implements Initializable {

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
            question.setText("¿Cómo se llama la cumbre más alta de Colombia?");
            opt1.setText("Pico Cristóbal Colón");
            opt2.setText("Nevado del Ruiz ");
            opt3.setText("Sierra nevada de santamarta ");
            opt4.setText("Nevado del Cocuy");
        }
        if (counter == 1) { //Question 2
            question.setText("2. ¿Cuántos parques nacionales existen en Colombia?  ");
            opt1.setText("12");
            opt2.setText("59");
            opt3.setText("23");
            opt4.setText("50");
        }
        if (counter == 2) { //Question 3
            question.setText("3.  ¿Cuál es el lago más grande de Colombia?");
            opt1.setText("Laguna Negra ");
            opt2.setText("Lago de Tota");
            opt3.setText("Lago Calima");
            opt4.setText("El Embalse de Tominé");
        }
        if (counter == 3) { //Question 4
            question.setText("4.¿Cuál es el río más grande de Colombia?  ");
            opt1.setText("Rio Sogamoso ");
            opt2.setText("Rio Amazons");
            opt3.setText("El Río Magdalena");
            opt4.setText("Rio Cauca");
        }
        if (counter == 4) {//Question 5
            question.setText("5. ¿Qué departamento de Colombia limita con Venezuela y Brasil? ");
            opt1.setText("Amazonas");
            opt2.setText("Guainía");
            opt3.setText("Vichada");
            opt4.setText("Chocó");
        }
        if (counter == 5) { //Question 6
            question.setText("6.  ¿Cuántos departamentos tiene Colombia?");
            opt1.setText("32");
            opt2.setText("44");
            opt3.setText("23");
            opt4.setText("30");
        }
        if (counter == 6) { //Question 7
            question.setText("7. ¿Comó se llama el Sistema Montañoso que atraviesColombia de Norte a Sur? ");
            opt1.setText("Sierra Nevada de Santa Marta");
            opt2.setText("Cordillera de los Andes");
            opt3.setText("Himalaya");
            opt4.setText("Montañas Rocosas");
        }
        if (counter == 7) { //Question 8
            question.setText("8. ¿Qué tan larga es la muralla de Cartagena de Indias? ");
            opt1.setText("8 Km");
            opt2.setText("15 Km");
            opt3.setText("5 Km");
            opt4.setText("20 Km");
        }
        if (counter == 8) { //Question 9
            question.setText("9. ¿Cuál es el departamento menos poblado del país? ");
            opt1.setText("Amazonas");
            opt2.setText("Guainia");
            opt3.setText("Caqueta");
            opt4.setText("Vaupes");
        }
        if (counter == 9) { //Question 10
            question.setText("10. ¿Cuál es el departamento más pequeño de Colombia?");
            opt1.setText("Quindio");
            opt2.setText("Risaralda");
            opt3.setText("San Andres");
            opt4.setText("Caldas");
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
                FXMLLoader quiz = new FXMLLoader(getClass().getResource("/view/ViewGameOverGeography.fxml"));
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
            if (answer.equals("Pico Cristóbal Colón")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 1) {
            if (answer.equals("59")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 2) {
            if (answer.equals("Lago de Tota")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 3) {
            if (answer.equals("El Río Magdalena")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 4) {
            if (answer.equals("Guainía")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 5) {
            if (answer.equals("32")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 6) {
            if (answer.equals("Cordillera de los Andes")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 7) {
            if (answer.equals("8 Km")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 8) {
            if (answer.equals("Vaupes")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 9) {
            if (answer.equals("Quindio")) {
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
                FXMLLoader quiz = new FXMLLoader(getClass().getResource("/view/ViewGameOverGeography.fxml"));
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
                FXMLLoader quiz = new FXMLLoader(getClass().getResource("/view/ViewGameOverGeography.fxml"));
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
                FXMLLoader quiz = new FXMLLoader(getClass().getResource("/view/ViewGameOverGeography.fxml"));
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
