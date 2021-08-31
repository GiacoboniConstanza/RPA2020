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
public class usarTecladoIn 
{
    public static void main ( String [ ] args)
        {
            int edad;
            double alturaPersona;
            char inicialNombre;
            boolean aproboRPA;
            String nombre;
            System.out.println("Ingrese el nombre de la persona");
            nombre = TecladoIn.readLine();
            System.out.println("Ingrese la edad de la persona");
            edad = TecladoIn.readLineInt();
            System.out.println("Ingrese la altura de la persona");
            alturaPersona = TecladoIn.readLineDouble();
            System.out.println("Ingrese la inicial del nombre de la persona");
            inicialNombre = TecladoIn.readLineNonwhiteChar();
            System.out.println("Ingrese si la persona aprobo o no la materia RPA");
            aproboRPA = TecladoIn.readLineBoolean();
            System.out.println("El nombre de la persona es:" + nombre);
            System.out.println("La edad ingresada es:" + edad);
            System.out.println("La altura ingresada es:" + alturaPersona);
            System.out.println("La inicial ingresada es:" + inicialNombre);
            System.out.println("La persona aprobo RPA:" + aproboRPA);
            
        }
}
