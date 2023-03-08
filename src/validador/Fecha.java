/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package validador;

import java.time.LocalDateTime;

/**
 *
 * @author MARGARITA
 */
public class Fecha {

    /**
     * variable de clase que irá incrementando en uno por cada instancia creada
     */
    private static int identificador;
    private final int dia;
    private final int mes;
    private final int año;

    public Fecha() {
        LocalDateTime fechaActual = LocalDateTime.now();
        dia = fechaActual.getDayOfMonth();
        mes = fechaActual.getMonthValue();
        año = fechaActual.getYear();
        identificador++;
    }

    @Override
    public String toString() {
        return dia + "-" + mes + "-" + año + "-" + identificador;
    }
}
