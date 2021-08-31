/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp09;

import Utiles.TecladoIn;

/**
 *
 * @author Coqui
 */
public class ejercicio08 {

    public static void main(String[] args) {

        char equipo, equipoGanador = 0;
        int corredor, i;
        double tiempo, tiempoMin = 10000, tiempoTotal, tiempoPromedio;
        boolean continuar;
        do {
            tiempoTotal = 0;
            System.out.println("Ingrese un caracter para el nombre del equipo");
            equipo = TecladoIn.readLineNonwhiteChar();
            System.out.println("Ingrese la cantidad de corredores del equipo");
            corredor = TecladoIn.readLineInt();
            for (i = 1; i <= corredor; i++) {
                System.out.println("Ingrese el tiempo del corredor " + i);
                tiempo = TecladoIn.readLineDouble();
                tiempoTotal = tiempoTotal + tiempo;
            }
            tiempoPromedio = tiempoTotal / corredor;
            if (tiempoMin > tiempoTotal) {
                tiempoMin = tiempoTotal;
                equipoGanador = equipo;
            }
            System.out.println("El tiempo total es " + tiempoTotal + " el tiempo promedio es " + tiempoPromedio);
            System.out.println("Desea ingresar otro equipo?");
            continuar = TecladoIn.readLineBoolean();
        } while (continuar);
        System.out.println("El equipo ganador es " + equipoGanador + " con un tiempo de " + tiempoMin);
    }

}
