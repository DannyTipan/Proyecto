/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
public class Cliente extends Persona {
    private String direccion;
    
    public Cliente(String nombre, String apellido, int numeroDeCedula, int numeroDeTelefono, String direccion) {
        super(nombre, apellido, numeroDeCedula, numeroDeTelefono);
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
}
