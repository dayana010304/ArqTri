/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arqtri;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
/**
 *
 * @author dayan
 */
public class ArqTri extends Application{

    public static void main(String[] args) {
        // TODO code application logic here
        launch(args);
    }
    
    @Override
    public void start (Stage stage) throws Exception {
        
        Parent root = FXMLLoader.load(getClass().getResource("/view/ViewPrincipal.fxml"));
        Scene scene = new Scene(root);
        stage.setTitle("INICIO");
        stage.setScene(scene);
        stage.show();
        
                
    }

    
    
}
