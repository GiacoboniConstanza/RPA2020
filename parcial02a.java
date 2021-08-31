
import Utiles.TecladoIn;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Coqui
 */
public class parcial02a {
    public static void main(String[] args) {
        double kilos, pago, totalPagos = 0, cantHelado = 0;
        char tipoHelado;
        //Usamos do while porque al menos va a haber una compra
        do {
            System.out.println("Ingrese el tipo de helado a comprar: C para Crema, A para Agua y F para frutas");
            tipoHelado = TecladoIn.readLineNonwhiteChar();
            tipoHelado = Character.toUpperCase(tipoHelado);
            System.out.println("Ingrese la cantidad en kilos a comprar");
            kilos = TecladoIn.readLineDouble();
            //Invocamos el modulo para calcular el total de la compra
            pago = calcularPago(kilos, tipoHelado);
            //Acumulamos las ventas
            totalPagos += pago;
            cantHelado += kilos;
        } while (totalPagos < 200000);
        System.out.println("La cantidad de kilos vendidos fue " + cantHelado);
    }

    public static double calcularPago(double cant, char tipo) {

        double pago;
        switch (tipo) {
            case 'C':
                pago = cant * 230;
                break;
            case 'A':
                pago = cant * 150;
                break;
            case 'F':
                pago = cant * 320;
                break;
            default:
                System.out.println("Error");
                pago = 0;
                break;
        }
        return pago;
    }

}
