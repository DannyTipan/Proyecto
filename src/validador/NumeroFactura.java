/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package validador;

/**
 *
 * @author MARGARITA
 */
public class NumeroFactura {
    private static int numero;
    public NumeroFactura(){
        numero = 0;
        numero++;
    }

    @Override
    public String toString() {
        return "N°: " + numero;
    }
    
    
}
