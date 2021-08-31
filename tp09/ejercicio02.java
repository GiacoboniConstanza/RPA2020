/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp09;

import Utiles.TecladoIn;

/**
 *
 * @author Coqui
 */
public class ejercicio02 {
     public static void main(String[] args) {
         /*ALGORITMO cena () RETORNA vacio
	LOGICO continuar
	CARACTER menu
	REAL totalMenus, totalGente
	
	REPETIR 
		ESCRIBIR ("Ingrese el menu que prefiere: V) vegetariano o C) comun")
		LEER (menu)
		SEGUN (menu)
			'V': totalMenus <-- totalMenus + 150
			'C': totalMenus <-- total + 230
			otro: ESCRIBIR ("menu invalido")
		FIN SEGUN
		totalGente <-- totalGente +1
		ESCRIBIR ("Ingresar otro menu?")
		LEER continuar
	HASTA (continuar = false)
	ESCRIBIR ("Para ", totalGente, "personas, se gastara $", totalMenus)
FIN ALGORITMO cena*/
         boolean continuar;
         char menu;
         double totalMenus = 0, totalGente = 0;
         do{
             System.out.println("Ingrese el menu que prefiere: V) vegetariano o C) comun");
             menu = TecladoIn.readLineNonwhiteChar();
             totalGente = totalGente+1;
             switch(menu){
                 case 'V':
                     totalMenus = totalMenus + 150;
                     break;
                 case 'C':
                     totalMenus = totalMenus + 230;
                     break;
                 default:
                     System.out.println("Menu invalido");
             }
             System.out.println("Ingresar otro menu?");
             continuar = TecladoIn.readLineBoolean();
         }while (continuar);
         System.out.println("Para " + totalGente + " personas, se gastara $" + totalMenus);
     }
    
}
