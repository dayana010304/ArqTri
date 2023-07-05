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
public class ViewQuestionsMusicController  implements Initializable {

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
            question.setText(" ¿De qué región es la salsa choke?");
            opt1.setText("Region Caribe ");
            opt2.setText("Region Pacifica");
            opt3.setText("Region Insular");
            opt4.setText("Region Andina");
        }
        if (counter == 1) { //Question 2
            question.setText("2.¿Cuál de ellos es considerado como uno de los más grandes compositores del vallenato?");
            opt1.setText("Rafael Escalona");
            opt2.setText("Maluma");
            opt3.setText("Charrito Negro");
            opt4.setText("Andres Cabas");
        }
        if (counter == 2) { //Question 3
            question.setText("3. ¿De quién es la canción 'Aguacero de Mayo'?");
            opt1.setText("Toto la Momposina");
            opt2.setText("Pacho Galan");
            opt3.setText("Lucho Vermudez");
            opt4.setText("Esther Forero");
        }
        if (counter == 3) { //Question 4
            question.setText("4. ¿En qué ciudad se originó la champeta?");
            opt1.setText("Santa Marta");
            opt2.setText("Cali");
            opt3.setText("Cartagena");
            opt4.setText("Buenaventura");
        }
        if (counter == 4) {//Question 5
            question.setText("5. ¿Quién es el pionero de la carranga?");
            opt1.setText("Jorge Velosa");
            opt2.setText("Juan Ibarra");
            opt3.setText("Galy Galeano");
            opt4.setText("Rodolfo Aicardi");
        }
        if (counter == 5) { //Question 6
            question.setText("6. ¿Qué grupo comenzó su carrera musical con el álbum 'La alegría de un pueblo'?");
            opt1.setText("Dr Krapula");
            opt2.setText("Grupo Niche");
            opt3.setText("Binomio de Oro");
            opt4.setText("Los 50 de Joselito");
        }
        if (counter == 6) { //Question 7
            question.setText("7. ¿A qué género musical pertenece 'La pollera colorá'?");
            opt1.setText("Cumbia");
            opt2.setText("Ranchera");
            opt3.setText("Salsa");
            opt4.setText("Llanera");
        }
        if (counter == 7) { //Question 8
            question.setText("8. ¿Quién es La Ronca de Oro?");
            opt1.setText("Paola Jara");
            opt2.setText("Arelys Henao");
            opt3.setText("Helenita Vargas");
            opt4.setText("Fabiola Calle");
        }
        if (counter == 8) { //Question 9
            question.setText("9. ¿cuál de estos géneros musicales pertenece a la región Andina?");
            opt1.setText("Bambuco");
            opt2.setText("Salsa");
            opt3.setText("Bunde");
            opt4.setText("Vallenato");
        }
        if (counter == 9) { //Question 10
            question.setText("10. ¿Cuándo ocurre la historia que cuenta Joe Arroyo en su canción 'La rebelión'?");
            opt1.setText("1700");
            opt2.setText("1600");
            opt3.setText("1500");
            opt4.setText("1400");
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
                FXMLLoader quiz = new FXMLLoader(getClass().getResource("/view/ViewGameOverMusic.fxml"));
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
            if (answer.equals("Region Pacifica")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 1) {
            if (answer.equals("Rafael Escalona")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 2) {
            if (answer.equals("Toto la Momposina")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 3) {
            if (answer.equals("Cartagena")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 4) {
            if (answer.equals("Jorge Velosa")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 5) {
            if (answer.equals("Los 50 de Joselito")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 6) {
            if (answer.equals("Cumbia")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 7) {
            if (answer.equals("Helenita Vargas")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 8) {
            if (answer.equals("Bambuco")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 9) {
            if (answer.equals("1600")) {
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
                FXMLLoader quiz = new FXMLLoader(getClass().getResource("/view/ViewGameOverMusic.fxml"));
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
                FXMLLoader quiz = new FXMLLoader(getClass().getResource("/view/ViewGameOverMusic.fxml"));
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
                FXMLLoader quiz = new FXMLLoader(getClass().getResource("/view/ViewGameOverMusic.fxml"));
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
