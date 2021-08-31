/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos;

/**
 *
 * @author Coqui
 */
public class prueba {
     public static void main(String[] args) {
         String cadena = "AAA999", subCadena = cadena.substring(0,3);
         boolean completo = true;
         int i;
         System.out.println(subCadena);
         do{
             //i=2 para recorrer desde el final al principio del substring
             i=2;
             char a;
             a=subCadena.charAt(i);
             //evaluo si a es igual a z, en ese caso tengo que hacer a='a' y q el caracter q le sigue sume 1
             if (a=='Z'){
                 a='A';
                 char b;
                 b= subCadena.charAt(i-1);
                 if (b=='Z'){
                     char c;
                     c= subCadena.charAt(i-2);
                     c++;
                     b='A';
                     cadena = changeCharInPosition((i-2), c, cadena);
                 }else{
                     b++;
                 }
                 //invoco al modulo para que cambie solo ese caracter
                     cadena = changeCharInPosition((i-1), b, cadena);
                 completo=false;
             }else{
                 a++;
                 completo=false;  
             }
             cadena = changeCharInPosition(i, a, cadena);
             System.out.println(cadena);
             i--;
         }while(completo);
     }

    public static String changeCharInPosition(int position, char ch, String str){
        //parametros formales position es la posicion del caracter a cambiar, ch es el caracter nuevo
        //str es la cadena en la que hay que cambiar
        //creo una variable llamada charArray y le asigno el string con toCharArray
        //toCharArray lo que hace es convertirlo en un array de caracteres osea ('a', 'b', 'z')
    char[] charArray = str.toCharArray();
    //en charArray cambio el caracter que esta contenido en position por ch
    charArray[position] = ch;
    return new String(charArray);
}
}
