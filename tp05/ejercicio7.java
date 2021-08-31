/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp05;

import Utiles.TecladoIn;

/**
 *
 * @author Coqui
 */
public class ejercicio7 
{
    public static void main ( String [ ] args)
            {
                int unDigito;
                int dosDigitos;
                int tresDigitos;
                int cuatroDigitos;
                
                System.out.println("Ingrese el número sorteado de 4 digitos");
                cuatroDigitos = TecladoIn.readLineInt();
                
                unDigito = cuatroDigitos % 10;
                dosDigitos = cuatroDigitos % 100;
                tresDigitos = cuatroDigitos % 1000;
                
                System.out.println("El ganador de un digito es " + unDigito);
                System.out.println("EL ganador de dos digitos es " + dosDigitos);
                System.out.println("El ganador de tres digitos es " + tresDigitos);
                System.out.println("El ganador de cuatro digitos es " + cuatroDigitos);
            }
}
