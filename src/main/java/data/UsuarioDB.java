/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import java.sql.Connection;
import java.sql.SQLException;
import modelo.Usuario;

/**
 *
 * @author Usuario
 */
public class UsuarioDB {
 
    private Connection conexion;

    public UsuarioDB(Connection conexion) {
        this.conexion = conexion;
    }
    
    public void insertarUsuario(Usuario usuario){
        String query = "INSERT INTO USUARIO (dpi, nombre, suscripcion, direccion, telefono, password) VALUES (?,?,?,?,?,?)";
        
        try(var preparedStatement = conexion.prepareStatement(query)){
            
            preparedStatement.setInt(1, usuario.getDPI());
            preparedStatement.setString(2, usuario.getNombre());
            preparedStatement.setString(3, usuario.getSuscripcion());
            preparedStatement.setString(4, usuario.getDireccion());
            preparedStatement.setInt(5, usuario.getTelefono());
            preparedStatement.setString(6, usuario.getPassword());
            
            preparedStatement.executeUpdate();
            
        }catch(SQLException e){
            System.out.println(e);
        }
    }
    
}
