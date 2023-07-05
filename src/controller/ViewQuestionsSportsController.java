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
public class ViewQuestionsSportsController  implements Initializable {

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
            question.setText("1. ¿Cuál es el deporte qué más campeonatos mundiales le ha dado a Colombia?");
            opt1.setText("Futbol");
            opt2.setText("Tennis");
            opt3.setText("Boxeo");
            opt4.setText("Baseball");
        }
        if (counter == 1) { //Question 2
            question.setText("2. ¿Cual es el Maximo anotador de la Seleccion Colombia?");
            opt1.setText("Falcao Garcia");
            opt2.setText("Pibe Balderrama");
            opt3.setText("Faustino Asprilla");
            opt4.setText("James Rodriguez");
        }
        if (counter == 2) { //Question 3
            question.setText("3.¿En que año se Realizo La primera edición de la vuelta a Colobia?");
            opt1.setText("1965");
            opt2.setText("1890");
            opt3.setText("1980");
            opt4.setText("1951");
        }
        if (counter == 3) { //Question 4
            question.setText("4. ¿Cuántas veces ha ganado la selección colombiana de fútbol la Copa América?");
            opt1.setText("Nunca ha ganado la Copa América");
            opt2.setText("1 vez");
            opt3.setText("2 veces");
            opt4.setText(" 3 veces");
        }
        if (counter == 4) {//Question 5
            question.setText("5. ¿Cuál es el deporte más popular en Colombia?");
            opt1.setText("Tenis");
            opt2.setText("Béisbol");
            opt3.setText("Ciclismo");
            opt4.setText("Fútbol");
        }
        if (counter == 5) { //Question 6
            question.setText("6. ¿Cuál es el equipo más exitoso en la historia del fútbol colombiano? ");
            opt1.setText("Millonarios");
            opt2.setText("Atlético Nacional");
            opt3.setText("América de Cali");
            opt4.setText("Independiente Santa Fe");
        }
        if (counter == 6) { //Question 7
            question.setText("7. ¿Quién es el ciclista colombiano que ha ganado el Tour de Francia?");
            opt1.setText("Nairo Quintana");
            opt2.setText("Rigoberto Urán");
            opt3.setText("Egan Bernal");
            opt4.setText("Sergio Higuita");
        }
        if (counter == 7) { //Question 8
            question.setText("8. ¿Cuál es el boxeador colombiano que ha logrado ganar varios títulos mundiales en diferentes categorías?");
            opt1.setText(" Antonio Cervantes 'Kid Pambelé'");
            opt2.setText(" Miguel 'Happy' Lora");
            opt3.setText("Rodrigo Valdéz");
            opt4.setText("Édgar Rentería");
        }
        if (counter == 8) { //Question 9
            question.setText("9. ¿Cuál es el patinador colombiano más exitoso en la historia de los campeonatos mundiales de patinaje?");
            opt1.setText("Fabriana Arias");
            opt2.setText("Pedro Causil");
            opt3.setText("Jorge Botero");
            opt4.setText("Cecilia Baena");
        }
        if (counter == 9) { //Question 10
            question.setText("10. ¿En qué disciplina del patinaje Colombia ha tenido más éxito a nivel internacional?");
            opt1.setText("Patinaje freestyle");
            opt2.setText("Patinaje de carreras en línea");
            opt3.setText("Patinaje artístico");
            opt4.setText("Patinaje de velocidad");
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
                FXMLLoader quiz = new FXMLLoader(getClass().getResource("/view/ViewGameOverSports.fxml"));
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
            if (answer.equals("Boxeo")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 1) {
            if (answer.equals("Falcao Garcia")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 2) {
            if (answer.equals("1951")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 3) {
            if (answer.equals("1 vez")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 4) {
            if (answer.equals("Fútbol")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 5) {
            if (answer.equals("Atlético Nacional")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 6) {
            if (answer.equals("Egan Bernal")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 7) {
            if (answer.equals(" Antonio Cervantes 'Kid Pambelé'")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 8) {
            if (answer.equals("Jorge Botero")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 9) {
            if (answer.equals("Patinaje de velocidad")) {
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
                FXMLLoader quiz = new FXMLLoader(getClass().getResource("/view/ViewGameOverSports.fxml"));
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
                FXMLLoader quiz = new FXMLLoader(getClass().getResource("/view/ViewGameOverSports.fxml"));
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
                FXMLLoader quiz = new FXMLLoader(getClass().getResource("/view/ViewGameOverSports.fxml"));
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
