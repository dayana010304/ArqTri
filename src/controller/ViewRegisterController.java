/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;


/**
 * FXML Controller class
 *
 * @author dayan
 */
public class ViewRegisterController implements Initializable {
    
    @FXML
        private TextField txtUserName;
    
    @FXML
        private TextField txtEmail;
     
    @FXML
        private TextField txtPassword;
     
    @FXML
    private Button btnRegister;
    
    @FXML
        public void eventKey(KeyEvent event){
        }
    @FXML
        public void eventAction(ActionEvent event){
            
        }

    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
}
    

