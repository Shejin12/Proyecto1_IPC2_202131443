/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Usuario
 */
public class Conexion {
    private Connection conexion; 
    
    private final String url = "jdbc:mysql://localhost:3306/biblioteca";
    
    private final String user = "SergioRodriguez";
    private final String password = "ChejoMYSQL12*";
    
    public Connection obtenerConexion(){
    
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(url, user, password);
           
            System.out.println("conexion establecida");
            return conexion; 
        }catch(SQLException | ClassNotFoundException e){
            System.out.println("error con la conexion: " + e);
        }
        
        return null; 
    }
}
