
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
import java.util.ArrayList;

public class Persona {
    private String nombre;
    private String apellido;
    private int numeroDeCedula;
    private int numeroDeTelefono;
    private ArrayList<Persona> listaDePersonas = new ArrayList<Persona>(); // nueva variable miembro
    
    public Persona(String nombre, String apellido, int numeroDeCedula, int numeroDeTelefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroDeCedula = numeroDeCedula;
        this.numeroDeTelefono = numeroDeTelefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getNumeroDeCedula() {
        return numeroDeCedula;
    }

    public void setNumeroDeCedula(int numeroDeCedula) {
        this.numeroDeCedula = numeroDeCedula;
    }

    public int getNumeroDeTelefono() {
        return numeroDeTelefono;
    }

    public void setNumeroDeTelefono(int numeroDeTelefono) {
        this.numeroDeTelefono = numeroDeTelefono;
    }
    
    public void agregarPersona(Persona persona) {
        listaDePersonas.add(persona);
    }
    
    public ArrayList<Persona> getListaDePersonas() {
        return listaDePersonas;
    }
}

