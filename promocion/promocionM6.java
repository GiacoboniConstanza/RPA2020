package promocion;


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
public class promocionM6 {
    public static void main(String[] args) {
        String patenteA, patente, continuar;
        int cantidad=0;
        System.out.println("Ingrese la patente a verificar");
        patenteA = TecladoIn.readLine();
        do{
            System.out.println("Ingrese una patente");
            patente = TecladoIn.readLine();
            if (patente.equalsIgnoreCase(patenteA)){
                cantidad++;
            }
            System.out.println("Desea continuar (si/no)?");
            continuar = TecladoIn.readLine();
            continuar = continuar.toLowerCase();
        }while(!"no".equals(continuar));
        if (cantidad>0){
        System.out.println("Cantidad de veces duplicada en la secuencia " + cantidad);
        }else{
            System.out.println("No duplico en la secuencia ingresada");
        }
    }
    
}
