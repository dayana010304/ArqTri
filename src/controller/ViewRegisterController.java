/*
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
import model.CreateUserDAO;

/**
 * FXML Controller class
 *
 * @author dayan
 */
public class ViewRegisterController implements Initializable {

    private CreateUserDAO model = new CreateUserDAO();
    
<<<<<<< HEAD
    @FXML
    private TextField txtEmail;
    
    @FXML
    private TextField txtPassword;
    
    @FXML
    private TextField txtNameUser;
    
    @FXML
    private Button btnRegister;
    
    @FXML
    private void eventKey(KeyEvent event){
        
        Object evt = event.getSource();
        
        if(evt.equals(txtEmail)){
=======
    
        public void eventKey(KeyEvent event){
        }
        public void eventAction(ActionEvent event){
>>>>>>> 784fac24a592d01b6076271bbec793076948bbca
            
            if(event.getCharacter().equals(" ")){
                event.consume();
            }
        
        }else if(evt.equals(txtPassword)){

            if(event.getCharacter().equals(" ")){
                event.consume();
            }
            else if(evt.equals(txtNameUser)){

            if(event.getCharacter().equals(" ")){
                event.consume();
            }            
        }
        
        }
    }
    
    @FXML
    private void eventAction(ActionEvent event){
        
        Object evt = event.getSource();

        if(evt.equals(btnRegister)){
                                
            if(!txtEmail.getText().isEmpty() && !txtPassword.getText().isEmpty() && !txtNameUser.getText().isEmpty()){
            
                String user = txtEmail.getText();
                String pass = txtPassword.getText();
                String nameUser = txtNameUser.getText();
                
                int state = model.register(user, pass, nameUser);
                
                if(state!=-1){

                    if(state == 1){

                        JOptionPane.showMessageDialog(null, "Datos correctos puede ingresar al sistema");
                        
                        loadStage("/view/ViewPrincipal.fxml", event);

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
    
    
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
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