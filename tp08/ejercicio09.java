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
public class ejercicio09 {

    public static void main(String[] args) {

      double dinero;
      int años=0;
      System.out.println("Ingrese la cantidad a ahorrar");
      dinero = TecladoIn.readLineDouble();
      while(dinero != 1000000){
          dinero = dinero*2;
          años = años++;
      }
    }

}
