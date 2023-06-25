/*
<<<<<<< HEAD
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;
import javafx.stage.Window;
import javafx.stage.WindowEvent;
import javax.swing.JOptionPane;
import model.UserDAO;
=======
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
>>>>>>> 784fac24a592d01b6076271bbec793076948bbca

/**
 * FXML Controller class
 *
<<<<<<< HEAD
 * @author dayan
 */
public class ViewLoginController implements Initializable {

    private UserDAO model = new UserDAO();
    
    @FXML
    private TextField txtEmail;
    
    @FXML
    private TextField txtPassword;
    
    @FXML
    private Button btnLogin;
    
    @FXML
    private void eventKey(KeyEvent event){
        
        Object evt = event.getSource();
        
        if(evt.equals(txtEmail)){
            
            if(event.getCharacter().equals(" ")){
                event.consume();
            }
        
        }else if(evt.equals(txtPassword)){

            if(event.getCharacter().equals(" ")){
                event.consume();
            }            
        
        }
        
    }
    
    @FXML
    private void eventAction(ActionEvent event){
        
        Object evt = event.getSource();

        if(evt.equals(btnLogin)){
                                
            if(!txtEmail.getText().isEmpty() && !txtPassword.getText().isEmpty()){
            
                String user = txtEmail.getText();
                String pass = txtPassword.getText();
                
                int state = model.login(user, pass);
                
                if(state!=-1){

                    if(state == 1){

                        JOptionPane.showMessageDialog(null, "Datos correctos puede ingresar al sistema");
                        
                        loadStage("/view/ViewUserPage.fxml", event);

                    }else{
                        JOptionPane.showMessageDialog(null, "Error al iniciar sesión datos de acceso incorrectos", 
                                                            "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);                
                    }

                }                

            
            }else{            
                    JOptionPane.showMessageDialog(null, "Error al iniciar sesión datos de acceso incorrectos", 
                                                        "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);                                
            }
        
        }
    
    }
    
    
    
=======
 * @author Dell
 */
public class ViewLoginController implements Initializable {

>>>>>>> 784fac24a592d01b6076271bbec793076948bbca
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
<<<<<<< HEAD
    private void loadStage(String url, Event event){
            
        try {
    
            //((Node)(event.getSource())).getScene().getWindow().hide();    
            
            
            Object eventSource = event.getSource(); 
            Node sourceAsNode = (Node) eventSource ;
            Scene oldScene = sourceAsNode.getScene();
            Window window = oldScene.getWindow();
            Stage stage = (Stage) window ;
            stage.hide();
                        
            Parent root = FXMLLoader.load(getClass().getResource(url));
            Scene scene = new Scene(root);              
            Stage newStage = new Stage();
            newStage.setScene(scene);
            newStage.show();  
                                    
            newStage.setOnCloseRequest(new EventHandler<WindowEvent>() {
                @Override
                public void handle(WindowEvent event) {
                    Platform.exit();
                }
            });  

        } catch (IOException ex) {
            Logger.getLogger(ViewLoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
                
    }    
    
    
}
=======
}
>>>>>>> 784fac24a592d01b6076271bbec793076948bbca
