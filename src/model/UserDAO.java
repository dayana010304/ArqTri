/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author dayan
 */
public class UserDAO {
    
    public int login (String Email, String Password){
        
        Connection connection = null;
        PreparedStatement pst;
        ResultSet rs;
        int state = -1;

        try{
            
            connection = ConnectionPoolMySQL.getInstance().getConnection();
            
            if(connection!=null){
                
                String sql = "SELECT * FROM usuarios WHERE BINARY Email=? AND Password=?";
                
                pst = connection.prepareStatement(sql);
                pst.setString(1, Email);
                pst.setString(2, Password);
                
                rs = pst.executeQuery();
                
                if(rs.next()){
                    state = 1;
                }else{
                    state = 0;
                }
                
            }else{
                JOptionPane.showMessageDialog(null, "Hubo un error al conectarse con la base de datos", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
            
        }catch(HeadlessException | SQLException ex){
            JOptionPane.showMessageDialog(null, "Hubo un error de ejecución, posibles errores:\n"
                                              + ex.getMessage());
        }finally{
            
            try{
                if(connection != null){
                    ConnectionPoolMySQL.getInstance().closeConnection(connection);            
                }            
            }catch(SQLException ex){
                System.err.println(ex.getMessage());            
            }

        }
        
        
        return state;
        
    }
    
    
}
