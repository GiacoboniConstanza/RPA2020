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
public class ejercicio01 {

    public static void main(String[] args) {
        int figura;
        double lado1 = 0, lado2 = 0;

        System.out.println("Ingrese que figura quiere calcular, 1: circulo, 2: rectangulo, 3: triangulo");
        figura = TecladoIn.readLineInt();

        switch (figura) {
            case 1:
                System.out.println("Ingrese el radio del circulo");
                lado1 = TecladoIn.readLineDouble();
                System.out.println("El area del circulo es: " + calcularAreaCirc(lado1));
                mostrarFormulaAreaCirc();
                break;
            case 2:
                System.out.println("Ingrese el lado 1 del recctangulo");
                lado1 = TecladoIn.readLineDouble();
                System.out.println("Ingrese el lado 2 del rectangulo");
                lado2 = TecladoIn.readLineDouble();
                System.out.println("El area del rectangulo es: " + calcularAreaRect(lado1, lado2));
                mostrarFormulaAreaRect();
                break;
            case 3:
                System.out.println("Ingrese la base del triangulo");
                lado1 = TecladoIn.readLineDouble();
                System.out.println("Ingrese la altura del triangulo");
                lado2 = TecladoIn.readLineDouble();
                System.out.println("El area del triangulo es: " + calcularAreaTrian(lado1, lado2));
                mostrarFormulaAreaTrian();
                break;
            default:
                System.out.println("Error");

        }
    }

    public static double calcularAreaCirc(double radio) {
        double area;
        area = 3.14 * Math.pow(radio, 2);
        return area;
    }

    public static void mostrarFormulaAreaCirc() {
        System.out.println("La formula de calculo del area de un circulo es:");
        System.out.println("area = pi * radio * radio");
    }

    public static double calcularAreaRect(double lado1, double lado2) {
        double area;
        area = lado1 * lado2;
        return area;
    }

    public static void mostrarFormulaAreaRect() {
        System.out.println("La formula de calculo del area de un rectangulo es:");
        System.out.println("area = lado1 * lado2");
    }

    public static double calcularAreaTrian(double base, double altura) {
        double area;
        area = (base * altura) / 2;
        return area;
    }

    public static void mostrarFormulaAreaTrian() {
        System.out.println("La formula de calculo del area de un triangulo es:");
        System.out.println("area = base * altura /2");
    }
}
