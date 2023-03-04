/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Validador;

/**
 *
 * @author stalin
 */
public class Validador {
    
    public static boolean esNombreCorrecto(String nombre) {

        return nombre.matches("^[A-ZAa-z]{20}$");
    }
    public static boolean esApellidoCorrecto(String apellido) {

        return apellido.matches("^[A-ZAa-z]{20}$");
    }
    
    public static boolean esNumeroCorrecto(String contacto){
        
        return contacto.matches("^([0-9]{10})$");
    }
    public static boolean esCedulaCorrecta(String cedula){
        
        return cedula.matches("^([0-9]{10})$");
    }
    public static boolean esUsuarioCorrecto(String usuario){
        
        return usuario.matches("^[A-ZAa-z0-9]+\\_\\-{6,12}$");
    }
  public static boolean esDireccionCorrecta(String direccion) {

        return direccion.matches("^[A-ZAa-z0-9]{2,20}$");
    }
}
