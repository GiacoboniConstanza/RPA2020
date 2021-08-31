/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package promocion;

/**
 *
 * @author Coqui
 */
public class mod3 {

    public static void main(String[] args) {
        String patente1 = "AAA999", patente2 = "AAA999";
       if ((verificarIgualdad(patente1, patente2) == true)) {
            System.out.println("Las patentes son iguales");
        } else {
           if (patenteMenor1(patente1, patente2)) {
            System.out.println("La patente 1 es la menor");
        } else {
            System.out.println("La patente 2 es la menor");
        }
       }
        
    }

    public static boolean patenteMenor1(String patente1, String patente2) {
        //Este modulo verifica cual es la menor de dos patentes ingresadas
        //Tiene como parametros formales patente1 y patente2 que son 
        //ingresadas por el usuario en el algoritmo principal
        String subPatente1, subPatente2, subPatenteN1, subPatenteN2;
        boolean menorPatente1 = true;
        //Dividimos las patentes en la parte que contiene las letras y
        //las hacemos mayusculas para poder compararlas sin problemas
        subPatente1 = patente1.substring(0, 3);
        subPatente1 = subPatente1.toUpperCase();
        subPatente2 = patente2.substring(0, 3);
        subPatente2 = subPatente2.toUpperCase();
        //Tambien dividimos la patente en la parte que contiene los numeros
        subPatenteN1 = patente1.substring(3);
        subPatenteN2 = patente2.substring(3);
        //Verificamos si son iguales a traves del modulo verificarIgualdad
            if (subPatente1.compareTo(subPatente2) == 0) {
                //Verificamos los numeros para determinar cual es mayor
                if (subPatenteN1.compareTo(subPatenteN2) < 0) {
                    menorPatente1 = true;

                } else {
                    menorPatente1 = false;
                }
                //Mensajes en caso de que se pueda determinar con las letras
            } else if (subPatente1.compareTo(subPatente2) < 0) {
                menorPatente1 = true;

            } else {
                menorPatente1 = false;
            }
        
        return menorPatente1;
    }

    public static boolean verificarIgualdad(String patente1, String patente2) {
        //Este modulo determina si dos patentes son iguales
        //Tiene como parametros formales patente1 y patente2 que son
        //ingresados por el usuario en el algoritmo principal
        boolean igualdad;
        //Igualdad almacena el valor a comparar ambas patentes
        igualdad = (patente1.equalsIgnoreCase(patente2));

        return igualdad;
    }
}
