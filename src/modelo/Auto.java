package modelo;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author stalin
 */
import java.util.ArrayList;

public class Auto {
    private String marca;
    private String color;
    private String tipo;
    private double precio;
    private ArrayList<Auto> listaAutos;

    public Auto(String marca, String color, String tipo, double precio) {
        this.marca = marca;
        this.color = color;
        this.tipo = tipo;
        this.precio = precio;
        this.listaAutos = new ArrayList<Auto>();
    }

    // Constructor vacío para crear un objeto Auto sin agregar autos a la lista
    public Auto() {
        this.marca = "";
        this.color = "";
        this.tipo = "";
        this.precio = 0.0;
        this.listaAutos = new ArrayList<Auto>();
    }

    // Métodos de acceso a los atributos
    public String getMarca() {
        return marca;
    }

    public String getColor() {
        return color;
    }

    public String getTipo() {
        return tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public ArrayList<Auto> getListaAutos() {
        return listaAutos;
    }

    // Métodos de modificación de los atributos
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void agregarAuto(Auto auto) {
        listaAutos.add(auto);
    }
}


