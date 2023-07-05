/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Dell
 */
public class ViewNewGameController implements Initializable {

    @FXML
    private ComboBox<String> category;

    @FXML
    private TextField txtTitle;

    @FXML
    private Button btnNewGame;

    @FXML
    private Button btnCancel;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ObservableList<String> list = FXCollections.observableArrayList("Musica", "Cultura", "Deportes", "Geografia");
        category.setItems(list);

        btnNewGame.setOnAction(event -> handleNewGameButton(event));

        btnCancel.setOnAction(event -> handleCancelButton(event));

        category.setOnAction(event -> {
            String selectedOption = category.getSelectionModel().getSelectedItem().toString();
            switchScreen(selectedOption);
        });
    }

    private void handleNewGameButton(ActionEvent event) {
        String selectedOption = category.getSelectionModel().getSelectedItem().toString();
        switchScreen(selectedOption);
    }

    private void handleCancelButton(ActionEvent event) {
        try {
            Stage thisstage = (Stage) ((Button) event.getSource()).getScene().getWindow();
            thisstage.close();
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/view/ViewUserPage.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void switchScreen(String selectedOption) {
        switch (selectedOption) {
            case "Musica":
                handleMusicScreen();
                break;
            case "Cultura":
                handleCultureScreen();
                break;
            case "Deportes":
                handleDeportesScreen();
                break;
            case "Geografia":
                handleGeografiaScreen();
                break;
            default:
                break;
        }
    }

    private void handleMusicScreen() {
        try {
            Stage thisstage = (Stage) btnNewGame.getScene().getWindow();
            thisstage.close();
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/view/ViewQuestionMusic.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void handleCultureScreen() {
             try {
            Stage thisstage = (Stage) btnNewGame.getScene().getWindow();
            thisstage.close();
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/view/ViewQuestionCulture.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void handleDeportesScreen() {
            try {
            Stage thisstage = (Stage) btnNewGame.getScene().getWindow();
            thisstage.close();
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/view/ViewQuestionSports.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void handleGeografiaScreen() {
             try {
            Stage thisstage = (Stage) btnNewGame.getScene().getWindow();
            thisstage.close();
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/view/ViewQuestionGeography.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

