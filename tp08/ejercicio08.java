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
public class ejercicio08 {
    public static void main(String[] args) {

        int opcion, circulos = 0, triangulos = 0, rectangulos = 0;
        double lado1 = 0, lado2 = 0;
        double total = 0, areaCirc = 0, areaRect = 0, areaTrian = 0;
        do {
            System.out.println("Ingrese que figura quiere calcular, 1: circulo, 2: rectangulo, 3: triangulo, 4: para terminar");
            opcion = TecladoIn.readLineInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el radio del circulo");
                    lado1 = TecladoIn.readLineDouble();
                    System.out.println("El area del circulo es: " + calcularAreaCirc(lado1));
                    circulos++;
                    areaCirc = areaCirc + calcularAreaCirc(lado1);
                    break;
                case 2:
                    System.out.println("Ingrese el lado 1 del recctangulo");
                    lado1 = TecladoIn.readLineDouble();
                    System.out.println("Ingrese el lado 2 del rectangulo");
                    lado2 = TecladoIn.readLineDouble();
                    System.out.println("El area del rectangulo es: " + calcularAreaRect(lado1, lado2));
                    rectangulos++;
                    areaRect = areaRect + calcularAreaRect(lado1, lado2);
                    break;
                case 3:
                    System.out.println("Ingrese la base del triangulo");
                    lado1 = TecladoIn.readLineDouble();
                    System.out.println("Ingrese la altura del triangulo");
                    lado2 = TecladoIn.readLineDouble();
                    System.out.println("El area del triangulo es: " + calcularAreaTrian(lado1, lado2));
                    triangulos++;
                    areaTrian = areaTrian + calcularAreaTrian(lado1, lado2);
                    break;
                default:
                    System.out.println("Error");

            }
            total = areaCirc + areaRect + areaTrian;
        } while (opcion != 4);
        System.out.println("Los circulos ingresados fueron: " + circulos + " la suma de sus areas es: " + areaCirc);
        System.out.println("Los rectangulos ingresados fueron: " + rectangulos + " la suma de sus areas es: " + areaRect);
        System.out.println("Los triangulos ingresados fueron: " + triangulos + " la suma de sus areas es: " + areaTrian);
        System.out.println("El total de la suma de las areas es: " + total);

    }

    public static double calcularAreaCirc(double radio) {
        double area;
        area = 3.14 * Math.pow(radio, 2);
        return area;
    }

    public static double calcularAreaRect(double lado1, double lado2) {
        double area;
        area = lado1 * lado2;
        return area;
    }

    public static double calcularAreaTrian(double base, double altura) {
        double area;
        area = (base * altura) / 2;
        return area;
    }

}
