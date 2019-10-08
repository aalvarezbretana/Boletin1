/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin1_4;

import java.util.*;

/**
 *
 * @author aalvarezbretana
 */
public class Boletin1_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        teclado.useLocale(Locale.US);
        System.out.println("Con que numeros quieres hacer las operaciones");
        double a = teclado.nextDouble();
        double b = teclado.nextDouble();
        double suma = a + b;
        double resta = a - b;
        double producto = a * b;
        double cociente = a / b;
        System.out.println("La suma es " + suma
                + " la resta es " + resta + " el producto es "
                + producto + " el cociente es " + cociente);
    }

}
