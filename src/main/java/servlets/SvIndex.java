/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servlets;

import data.Conexion;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;

/**
 *
 * @author Usuario
 */
@WebServlet("/indexsv")
public class SvIndex extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
         System.out.println("deberia hacer conexion");
         
        
        Conexion conexion = new Conexion();
      
        HttpSession sesion = req.getSession();
        sesion.setMaxInactiveInterval(3200);
        sesion.setAttribute("conexion", conexion.obtenerConexion());
        
        conexion.obtenerConexion(); 
        resp.sendRedirect("login.jsp");
    }
    
    
}
