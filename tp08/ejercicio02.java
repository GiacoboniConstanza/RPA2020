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
public class ejercicio02 {
    public static void main(String[] args) {
        int varIter, cantidad;
        double lado1, lado2, acumulador = 0;
        
        System.out.println("Ingrese la cantidad de rectanguos a sumar");
        cantidad = TecladoIn.readLineInt();
        
        for (varIter=0; varIter < cantidad; varIter++ ){
            System.out.println("Ingrese el lado 1 del rectangulo");
            lado1 = TecladoIn.readLineDouble();
            System.out.println("Ingrese el lado 2 del rectangulo");
            lado2 = TecladoIn.readLineDouble();
            acumulador = acumulador + calcularAreaRect(lado1, lado2);
            System.out.println("El resultado es: " + acumulador);
            
        }
            
    }
       public static double calcularAreaRect(double lado1, double lado2) {
        double area;
        area = lado1 * lado2;
        return area;
    } 
}
