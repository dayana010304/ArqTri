/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arqtri;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
/**
 *
 * @author dayan
 */
public class ArqTri extends Application{    
    
    @Override
    public void start (Stage stage) throws IOException {        
        FXMLLoader fmxlLoader = new FXMLLoader (ArqTri.class.getResource("/view/ViewPrincipal.fxml"));
        Scene scene = new Scene(fmxlLoader.load());
        stage.setTitle("ArqTri");
        stage.setScene(scene);
        stage.show();
                
    }
public static void main(String[] args) {
        // TODO code application logic here
        launch(args);
    }
    
    
}