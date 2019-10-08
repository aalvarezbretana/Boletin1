/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin1_5;

import java.util.*;

/**
 *
 * @author aalvarezbretana
 */
public class Boletin1_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        teclado.useLocale(Locale.US);
        System.out.println("Cuántas millas quieres pasar a metros?");
        double millas = teclado.nextDouble();
        final double MILLA = 1852;
        double metros = millas * MILLA;
        System.out.println(millas + " millas son " + metros + " metros");
    }

}
