/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controller;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressIndicator;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Dell
 */
public class ViewGameOverControllerSports  {

 @FXML
    public Label remark, marks, markstext, correcttext, wrongtext;

    @FXML
    public ProgressIndicator correct_progress, wrong_progress;

    int correct;
    int wrong;
    @FXML
    private Button btnNewGame;
    @FXML
    private void initialize() {
        correct = ViewQuestionsSportsController.correct;
        wrong = ViewQuestionsSportsController.wrong;

        correcttext.setText("Respuestas Correctas : " + correct);
        wrongtext.setText("Respuestas Incorrectas : " + String.valueOf(ViewQuestionsSportsController.wrong));

        marks.setText(correct + "/10");
        float correctf = (float) correct/10;
        correct_progress.setProgress(correctf);

        float wrongf = (float) wrong/10;
        wrong_progress.setProgress(wrongf);


        markstext.setText(correct + " Respuestas Acertadas");

        if (correct<5) {
            remark.setText("Has Tenido un Mal Puntaje, Intentalo de Nuevo!!");
        } else if (correct>5 || correct==9) {
            remark.setText("Felicitaciones !! El Puntaje es mas del Promedio .");
        } else if (correct==10) {
            remark.setText("Felicitaciones!! Acertaste todas las respuestas!!.");
        }

    btnNewGame.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    Stage thisstage = (Stage) ((Button) event.getSource()).getScene().getWindow();
                    thisstage.close();
                    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/view/ViewPrincipal.fxml"));
                    Scene scene = new Scene(fxmlLoader.load());
                    Stage stage = new Stage();
                    stage.setScene(scene);
                    stage.show();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

}
