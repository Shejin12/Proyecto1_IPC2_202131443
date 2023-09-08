/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Usuario
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Usuario {
    private int DPI;
    private String nombre;
    private int telefono;
    private String suscripcion; 
    private String direccion;
    private String password;
}

