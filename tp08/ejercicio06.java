/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp08;

import Utiles.TecladoIn;

/**
 *
 * @author Coqui
 */
public class ejercicio06 {

    public static void main(String[] args) {

        double kg, costo, totalCosto = 0;
        int cantidadEnvios = 0;

        do {
            System.out.println("Ingrese el peso del envio");
            kg = TecladoIn.readLineDouble();
            costo = costoEnvio(kg);
            if (kg == 0) {
                System.out.println("El costo del envio es: $" + (costo - 30));
                totalCosto = totalCosto + costo - 30;
            } else {
                System.out.println("El costo del envio es: $" + costo);
                totalCosto = totalCosto + costo;
            }
            cantidadEnvios = cantidadEnvios + 1;
        } while (kg != 0);
        System.out.println("El total de envios es: " + (cantidadEnvios - 1));
        System.out.println("El total del costo es: $" + totalCosto);
    }

    public static double costoEnvio(double kg) {
        double costo;
        costo = (kg * 50) + 30;
        return costo;
    }
}
