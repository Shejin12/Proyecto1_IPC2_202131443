/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servlets;

import data.UsuarioDB;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.Connection;
import modelo.Usuario;

/**
 *
 * @author Usuario
 */
@WebServlet("/SvUsuario")
public class SvUsuario extends HttpServlet{
    
    private UsuarioDB usuarioDB; 

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    
        HttpSession sesion = req.getSession(); 
        Connection conexion = (Connection) sesion.getAttribute("conexion");
        
        usuarioDB = new UsuarioDB(conexion);
        //obtenemos los valores de usuario del crearusuario.jsp
        String dpi = req.getParameter("dpi");
        int numDpi = Integer.parseInt(dpi);
        String nombre = req.getParameter("nombre");
        String telefono = req.getParameter("telefono");
        int numTelefono = Integer.parseInt(telefono);
        String suscripcion = req.getParameter("suscripcion");
        String direccion = req.getParameter("direccion");
        String pass = req.getParameter("pass");
        
        Usuario usuario = new Usuario(numDpi, nombre, numTelefono, suscripcion, direccion, pass);
        //creamos un objeto usuario de los valores obtenidos
        
        usuarioDB.insertarUsuario(usuario);
        
    }
    
    
    
}
