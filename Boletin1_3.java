/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin1_3;

import java.util.*;

/**
 *
 * @author aalvarezbretana
 */
public class Boletin1_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        teclado.useLocale(Locale.US);
        System.out.println("Cuántos euros quieres pasar a dollares?");
        double euros = teclado.nextDouble();
        System.out.println("Cuál es el cambio?");
        double cambio = teclado.nextDouble();
        double dollares = euros * cambio;
        System.out.println(euros + " euros son " + dollares + " dollares");

    }

}
