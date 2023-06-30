/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author dayan
 */
public class ViewPrincipalController  {
    
    @FXML
    private Button btnRegister;
    
    @FXML
    private Button btnLogin;
    

   @FXML
    public void initialize() {
        btnRegister.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    Stage thisstage = (Stage) ((Button) event.getSource()).getScene().getWindow();
                    thisstage.close();
                    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/view/ViewRegister.fxml"));
                    Scene scene = new Scene(fxmlLoader.load());
                    Stage stage = new Stage();
                    stage.setScene(scene);
                    stage.show();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
                btnLogin.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    Stage thisstage = (Stage) ((Button) event.getSource()).getScene().getWindow();
                    thisstage.close();
                    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/view/ViewLogin.fxml"));
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
    
    /*void initSession(ActionEvent event){

        try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/ViewLogin.fxml"));
                Parent root = loader.load();
                ViewLoginController controlador = loader.getController();
                
                Scene scene = new Scene(root);
                Stage  stage = new Stage();
                
                stage.setScene(scene);
                stage.show();
                
            /*    stage.setOnCloseRequest(e -> controlador.closeWindows());
                Stage myStage = (Stage) this.btnLogin.getScene().getWindow();
                myStage.close();
              
        } catch (IOException e) {
            System.out.println(e);
        }
    
    }
    /*@FXML
     void register(ActionEvent event){

        try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/ViewRegister.fxml"));
                Parent root = loader.load();
                ViewRegisterController controlador = loader.getController();
                
                Scene scene = new Scene(root);
                Stage  stage = new Stage();
                
                stage.setScene(scene);
                stage.show();
                
                stage.setOnCloseRequest(e -> controlador.closeWindows());
                Stage myStage = (Stage) this.btnRegister.getScene().getWindow();
                myStage.close();
                
        } catch (IOException e) {
            System.out.println(e);
        }
    }*/

    }
