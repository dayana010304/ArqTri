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
public class ViewQuestionsCultureController implements Initializable {

    @FXML
    public Label question,Title;
    private String title;

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
            question.setText("1. ¿Cuál es la capital de Colombia?");
            opt1.setText("Bogotá");
            opt2.setText("Cartagena");
            opt3.setText("Medellín");
            opt4.setText("Cali");
        }
        if (counter == 1) { //Question 2
            question.setText("2.¿Cuál es el plato típico colombiano que consiste en una sopa de pescado y mariscos?");
            opt1.setText("Cazuela de mariscos");
            opt2.setText("Sancocho");
            opt3.setText("Ajiaco");
            opt4.setText("Bandeja paisa");
        }
        if (counter == 2) { //Question 3
            question.setText("3.¿En qué ciudad se encuentra la famosa Ciudad Perdida, un antiguo sitio arqueológico de la civilización indígena Tayrona?");
            opt1.setText("Medellín");
            opt2.setText("Cartagena");
            opt3.setText("Bogotá");
            opt4.setText("Santa Marta");
        }
        if (counter == 3) { //Question 4
            question.setText("4. ¿Cuál es la danza tradicional de Colombia que se caracteriza por sus coloridos vestuarios y movimientos rápidos?");
            opt1.setText("Reguetón");
            opt2.setText("Salsa");
            opt3.setText("Vallenato");
            opt4.setText("Cumbia");
        }
        if (counter == 4) {//Question 5
            question.setText("5. ¿Cuál es el escritor colombiano ganador del Premio Nobel de Literatura en 1982?");
            opt1.setText("Héctor Abad Faciolince");
            opt2.setText("Laura Restrepo");
            opt3.setText("Juan Gabriel Vásquez");
            opt4.setText("Gabriel García Márquez");
        }
        if (counter == 5) { //Question 6
            question.setText("6. ¿Cuál es la festividad más importante de Colombia, que se celebra el 20 de julio?");
            opt1.setText(" Día de la Virgen de la Candelaria");
            opt2.setText("Día de los Reyes Magos");
            opt3.setText("Día de la Raza");
            opt4.setText("Día de la Independencia");
        }
        if (counter == 6) { //Question 7
            question.setText("7.¿Cuál es la ciudad colombiana conocida por su carnaval, considerado uno de los más grandes del mundo?");
            opt1.setText("Medellín");
            opt2.setText("Cartagena");
            opt3.setText("Barranquilla");
            opt4.setText("Cali");
        }
        if (counter == 7) { //Question 8
            question.setText("8.¿Cuál es el principal producto de exportación de Colombia?");
            opt1.setText("Oro");
            opt2.setText("Banano");
            opt3.setText("Café");
            opt4.setText("Petróleo");
        }
        if (counter == 8) { //Question 9
            question.setText("9. ¿Cuál es el nombre de la pintora y escultora colombiana reconocida a nivel internacional por sus obras que representan la flora y fauna de Colombia?");
            opt1.setText("Débora Arango");
            opt2.setText("Beatriz González");
            opt3.setText("Sonia Falcone");
            opt4.setText("Frida Kahlo");
        }
        if (counter == 9) { //Question 10
            question.setText("10. ¿Cuál es el parque nacional natural ubicado en la región de la Amazonía colombiana, conocido por su diversidad biológica y cultural?");
            opt1.setText("Parque Nacional Natural Amacayacu");
            opt2.setText("Parque Nacional Natural El Cocuy");
            opt3.setText("Parque Nacional Natural Tayrona");
            opt4.setText("Parque Nacional Natural Los Nevados");
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
                FXMLLoader quiz = new FXMLLoader(getClass().getResource("/view/ViewGameOverCulture.fxml"));
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
            if (answer.equals("Bogotá")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 1) {
            if (answer.equals("Cazuela de mariscos")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 2) {
            if (answer.equals("Santa Marta")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 3) {
            if (answer.equals("Cumbia")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 4) {
            if (answer.equals("Gabriel García Márquez")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 5) {
            if (answer.equals("Día de la Independencia")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 6) {
            if (answer.equals("Barranquilla")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 7) {
            if (answer.equals("Café")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 8) {
            if (answer.equals("Beatriz González")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 9) {
            if (answer.equals("Parque Nacional Natural Amacayacu")) {
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
                FXMLLoader quiz = new FXMLLoader(getClass().getResource("/view/ViewGameOverCulture.fxml"));
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
                FXMLLoader quiz = new FXMLLoader(getClass().getResource("/view/ViewGameOverCulture.fxml"));
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
                FXMLLoader quiz = new FXMLLoader(getClass().getResource("/view/ViewGameOverCulture.fxml"));
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
 
    public void setTitle(String title) {
        this.title = title;
        ShowTitle();
    }

    private void ShowTitle() {
        Title.setText(title); // Mostrar el usuario en un Label 

    }

}
