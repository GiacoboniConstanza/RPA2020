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
public class promocionM5 {
    public static void main(String[] args) {
        String patenteMenor = "ZZZ999", patente, continuar;
        
        do{
            System.out.println("Ingrese una patente");
            patente = TecladoIn.readLine();
            if (patente.compareTo(patenteMenor)<0){
                patenteMenor = patente;
            }
            System.out.println("Desea continuar (si/no)?");
            continuar = TecladoIn.readLine();
            continuar = continuar.toLowerCase();
        }while(!"no".equals(continuar));
        System.out.println("La menor patente ingresada es " + patenteMenor);
    }
    
}
