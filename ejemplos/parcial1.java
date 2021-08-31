/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos;

import Utiles.TecladoIn;

/**
 *
 * @author Coqui
 */
public class parcial1 {

    public static void main(String[] args) {
        //Este algoritmo determina si el recurso humano ingresado es apto para ser seleccionado o no

        char tipoRecursoHumano, tipoConocimiento, capacitacionTerciaria;
        double altura, añosExperiencia;

        //Ingreso de datos del recurso humano a evaluar
        System.out.println("Ingrese el tipo de recurso humano, P: peluquero A: asistente de peluquería");
        tipoRecursoHumano = TecladoIn.readLineNonwhiteChar();
        tipoRecursoHumano = Character.toUpperCase(tipoRecursoHumano);

        //Procesamiento
        switch (tipoRecursoHumano) {
            case 'P':
                System.out.println("Ingrese el tipo de conocimiento, A: alto I: intermedio B: bajo");
                tipoConocimiento = TecladoIn.readLineNonwhiteChar();
                tipoConocimiento = Character.toUpperCase(tipoConocimiento);
                System.out.println("Ingrese si tiene certificado de capacitación terciaria, S: si N: no");
                capacitacionTerciaria = TecladoIn.readLineNonwhiteChar();
                capacitacionTerciaria = Character.toUpperCase(capacitacionTerciaria);
                if ((tipoConocimiento == 'I' || tipoConocimiento == 'B') && capacitacionTerciaria == 'S') {
                    System.out.println("Puede ser seleccionado");
                } else {
                    System.out.println("No puede ser seleccionado");
                }
                break;
            case 'A':
                System.out.println("Ingrese la altura");
                altura = TecladoIn.readLineDouble();
                System.out.println("Ingrese los años de experiencia");
                añosExperiencia = TecladoIn.readLineDouble();
                if (altura > 1.60 || añosExperiencia > 3) {
                    System.out.println("Puede ser seleccionado");
                } else {
                    System.out.println("No puede ser seleccionado");
                }
                break;
            default:
                System.out.println("Error al ingresar el tipo de recurso humano");

        }

    }

}
