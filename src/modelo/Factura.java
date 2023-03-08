/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MARGARITA
 */
public class Factura {
    
    private String formaPago;
    private double numeroFactura;

    public Factura(String formaPago, double numeroFactura) {

        this.formaPago = formaPago;
        this.numeroFactura = numeroFactura;
    }

    public Factura() {
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public double getNumeroFactura() {
        return numeroFactura;
    }

    public void setNumeroFactura(double numeroFactura) {
        this.numeroFactura = numeroFactura;
    }
    
    
    
}
