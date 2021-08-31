/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package promocion;

import Utiles.TecladoIn;

/**
 *
 * @author Coqui
 */
public class patentePrincipal {

    public static void main(String[] args) {
        /*Este programa permite al usuario elegir entre varias opciones
            reiteradas veces hasta que decida detenerlo      
         */
        //Variable opcion almacena la eleccion del usuario(valor devuelto por el modulo menuOpciones)
        int opcion;
        //Variables Strings que almacenan los datos necesarios para los modulos
        String patente = "", patente1 = "";
        //Usamos una repetitiva para que muestre el menu hasta que el usuario decida detenerlo
        do {
            //mostramos el menu y guardamos la eleccion
            opcion = menuOpciones();
            //segun la eleccion se invoca al modulo correspondiente
            switch (opcion) {
                case 1:
                    //Se le pide al usuario que ingrese una patente y esta es guardada
                    System.out.println("Ingrese la patente a validar");
                    patente = TecladoIn.readLine();
                    //Invocamos al modulo validacion con el parametro actual patente
                    //Si es verdadera muestra un mensaje de validez
                    if (validacion(patente)) {
                        System.out.println("La patente es valida");
                        //En caso de ser falsa, entonces muestra un mensaje de invalidez
                    } else {
                        System.out.println("La patente no es valida");
                    }
                    break;
                case 2:
                    //Se le pide al usuario que ingrese una patente
                    System.out.println("Ingrese la patente a validar");
                    patente = TecladoIn.readLine();
                    //Invocamos al modulo correspondiente
                    errorValidacion(patente);
                    break;
                case 3:
                    //Invocamos un modulo para verificar que la patente ingresada sea valida
                    System.out.println("Patente 1:");
                    patente = obtenerPatente();
                    System.out.println("Patente 2:");
                    patente1 = obtenerPatente();
                    if (patenteMenor1(patente, patente1)) {
                        System.out.println("La patente 1 es la menor");
                    } else {
                        System.out.println("La patente 2 es la menor");
                    }
                    break;
                case 4:
                    //Invocamos un modulo para verificar que la patente ingresada sea valida
                    System.out.println("Patente 1:");
                    patente = obtenerPatente();
                    System.out.println("Patente 2:");
                    patente1 = obtenerPatente();
                    if (verificarIgualdad(patente, patente1)) {
                        System.out.println("Las patentes son iguales");
                    } else {
                        System.out.println("Las patentes no son iguales");
                    }
                    break;
                case 5:
                    //invocamos el modulo que no requiere ingresar parametros
                    System.out.println("La patente menor es " + (patenteMenor2()));
                    break;
                case 6:
                    patente = obtenerPatente();
                    //Si la patente ingresada es valida se invoca al modulo correspondiente
                    patenteDuplicada(patente);
                    break;
                case 7:
                    System.out.println("Patente para calcular su consecutiva");
                    patente = obtenerPatente();
                    //Si la patente ingresada es valida se invoca al modulo correspondiente
                    System.out.println("La patente consecutiva es " + patenteConsecutiva(patente));
                    break;
                case 8:
                    patente = verificarCadenaPatentes();
                    System.out.println("La patente mayor es " + (patenteMayor(patente)));
                    break;
                case 9:
                    System.out.println("Patente a verificar si esta duplicada");
                    patente = obtenerPatente();
                    patente1 = verificarCadenaPatentes();
                    System.out.println("La cantidad de veces duplicada es: " + patenteDuplicadaIdem(patente, patente1));
                    break;
                case 10:
                    System.out.println("Gracias por haber utilizado nuestro programa");
                    break;
                default:
                    //En caso que el usuario ingrese un valor menor que 1 o mayor a 10
                    System.out.println("Opcion ingresada invalida");
                    break;
            }

        } while (opcion != 10);

    }

    public static int menuOpciones() {
        //Este modulo muestra el menu de opciones y retorna un entero
        //No tiene parametros formales. La variable opcion guarda el valor ingresado por el usuario
        int opcion;
        System.out.println(""
                + "----------------------------------------------------------------------------------------------------------------\n"
                + "MENU\n"
                + "----------------------------------------------------------------------------------------------------------------\n"
                + "1-Verificar una patente valida\n"
                + "2-Determinar porque una patente no es valida\n"
                + "3-Verificar si una patente es menor que otra\n"
                + "4-Verificar si una patente es igual a otra\n"
                + "5-Ingresar una secuencia de patentes y obtener la patente menor\n"
                + "6-Ingresar una secuencia de patentes y una patente determinada A, y hallar cantidad de ocurrencias de A.\n"
                + "7-Incrementar el numero de una patente en una unidad\n"
                + "8-Dada una secuencia de patentes (recibido por parametro en un String) obtener la patente mayor\n"
                + "9-Dada una secuencia de patentes (recibido por parametro en un String) y una patente determinada A, hallar\n"
                + "cantidad de ocurrencias de A\n"
                + "10-Terminar\n"
                + "----------------------------------------------------------------------------------------------------------------");
        System.out.println("Ingrese su elección");
        opcion = TecladoIn.readLineInt();
        //retorna la opcion ingresada
        return opcion;
    }

    public static boolean validacion(String patente) {
        //Este modulo verifica la validez de una patente y retorna un boolean
        //El parametro formal patente posee el valor a verificar
        int i = 0;
        boolean validoL = true, validoN = true, valido;
        //Verificamos el largo de la patente ingresada
        if (patente.length() == 6) {
            //Si el largo de la cadena es correcto, verificamos las letras
            do {
                //validoL va a ser true mientras el caracter en posicion sea una letra
                validoL = Character.isLetter(patente.charAt(i));
                i++;
            } while (validoL && i <= 2);
            //cambiamos el valor de la variable iteradora para verificar los numeros
            i = 3;
            do {
                //validoN va a ser true mientras el caracter en posicion sea un digito
                validoN = Character.isDigit(patente.charAt(i));
                i++;
            } while (validoN && i <= 5);
            //valido va ser verdadero si ambas variables (validoL y validoN) son verdaderas
            valido = (validoL == true && validoN == true);

        } else {
            //valido va ser falso si el largo de la patente no es correcto
            valido = false;
        }
        return valido;
    }

    public static void errorValidacion(String patente) {
        //Este modulo determina el motivo de la invalidez de una patente
        //Tiene como parametro formal patente, el texto a verificar
        int i = 0;
        boolean validoL = true, validoN = true, valido, validoM1;
        if ((validoM1 = validacion(patente) == true)) {
            System.out.println("La patente ingresada no tiene ningún error");
        } else {
            //Verificamos el largo de la patente
            if (patente.length() == 6) {
                //El largo es correcto, verificamos las letras
                do {
                    //validoL va a ser verdadera mientras que el caracter en posicion sea una letra
                    validoL = Character.isLetter(patente.charAt(i));
                    i++;
                } while (validoL && i <= 2);
                //cambiamos el valor de la variable iteradora para verificar los numeros
                i = 3;
                do {
                    //validoN va a ser true mientras el caracter en posicion sea un digito
                    validoN = Character.isDigit(patente.charAt(i));
                    i++;
                } while (validoN && i <= 5);
                //Clasificamos el error segun el valor de validoL y validoN
                if (validoL == true && validoN == false) {
                    System.out.println("Los numeros de la patente no son validos");
                } else if (validoL == false && validoN == true) {
                    System.out.println("Las letras de la patente no son validas");
                } else if (validoL == false && validoN == false) {
                    System.out.println("Las letras y los numeros no son validos");
                } else if (validoL == true && validoN == true) {
                    System.out.println("La patente es valida");
                }

            } else {
                valido = false;
                System.out.println("El largo de la patente no es valido");
            }
        }

    }

    public static boolean patenteMenor1(String patente1, String patente2) {
        //Este modulo verifica cual es la menor de dos patentes ingresadas
        //Tiene como parametros formales patente1 y patente2 que son 
        //ingresadas por el usuario en el algoritmo principal
        String subPatente1, subPatente2, subPatenteN1, subPatenteN2;
        boolean menorPatente1 = false;
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
        if ((verificarIgualdad(patente1, patente2) == true)) {
            System.out.println("Las patentes son iguales");
        } else {

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

    public static String patenteMenor2() {
        //Este modulo determina la patente menor ingresada por el usuario, que puede ingresar la cantidad de pantentes que desee
        //A la variable patenteMenor le asignamos el valor mas grande posible a comparar
        String patenteMenor = "ZZZ999", patente, continuar;
        //Usamos una repetitiva que se detiene cuando el usuario quiera dejar de ingresar patentes
        do {
            patente = obtenerPatente();
            if (patente.compareTo(patenteMenor) < 0) {
                patenteMenor = patente;
            }
            System.out.println("Desea continuar (si/no)?");
            continuar = TecladoIn.readLine();
            continuar = continuar.toLowerCase();

        } while (!"no".equals(continuar));
        return patenteMenor;
    }

    public static void patenteDuplicada(String patenteVerificar) {
        //este modulo verifica la cantidad de veces que se ingresa la misma patente
        //tiene como parametro formal patenteVerificar que es la patente a verificar si se repite
        String patente, continuar;
        int cantidad = 0;
        //usamos una repetitiva que se detiene cuando el usuario quiera dejar de ingresar patentes
        do {
            patente = obtenerPatente();
            if (patente.equalsIgnoreCase(patenteVerificar)) {
                cantidad++;
            }

            System.out.println("Desea continuar (si/no)?");
            continuar = TecladoIn.readLine();
            continuar = continuar.toLowerCase();
        } while (!"no".equals(continuar));
        //mostramos la cantidad de veces que se duplico
        if (cantidad > 0) {
            System.out.println("Cantidad de veces duplicada en la secuencia " + cantidad);
        } else {
            System.out.println("No duplico en la secuencia ingresada");
        }

    }

    public static String patenteConsecutiva(String patente) {
        //Este modulo muestra la parte numerica de la patente incrementada en 1, las letras se mantienen en cualquier caso
        //tiene como parametro formal patente que es a la cual se incrementa
        String subPatenteN1, fin = "";
        int numero;
        //dividimos la patente para tener solo los numeros
        subPatenteN1 = patente.substring(3);
        //invocamos un modulo para convertir los numeros dentro de la cadena en enteros
        numero = transformarCadenaACaracter(subPatenteN1);
        //lo incrementamos
        numero++;
        //si es menor a 10, le agregamos 00, para evitar que quede AAA1
        if (numero < 10) {
            fin = (patente.substring(0, 3) + "00" + numero);
            //si es menor a 100, le agregamos 0, para evitar que quede AAA10
        } else if (numero < 99 && numero > 9) {
            fin = (patente.substring(0, 3) + "0" + numero);
        } else {
            //si es menor a 1000, lo ponemos igual
            if (numero < 1000) {
                fin = (patente.substring(0, 3) + numero);
            } else {
                //si es mayor ponemos 000, para no tener AAA1000
                fin = (patente.substring(0, 3) + "000");
            }

        }

        return fin;
    }

    public static int transformarCadenaACaracter(String patenteN) {
        //Este modulo separa la cadena en caracteres
        //tiene como parametro formal patenteN que son los numeros de la cadena patente
        char dig1, dig2, dig3;
        int d1, d2, d3;
        //guardamos cada caracter en una variable
        dig1 = patenteN.charAt(2);
        dig2 = patenteN.charAt(1);
        dig3 = patenteN.charAt(0);
        //invocamos el modulo para convertirlo en digito
        d1 = transformarCaracterEnDigito(dig1);
        d2 = transformarCaracterEnDigito(dig2);
        d3 = transformarCaracterEnDigito(dig3);
        //retorna los numeros multiplicados segun la posicion
        return (d3 * 100 + d2 * 10 + d1);
    }

    public static int transformarCaracterEnDigito(char digito) {
        //este modulo transforma un caracter en entero
        //tiene como parametro formal digito que es el caracter a convertir
        int cambio;
        //segun el digito se cambia por su numero correspondiente
        switch (digito) {
            case '0':
                cambio = 0;
                break;
            case '1':
                cambio = 1;
                break;
            case '2':
                cambio = 2;
                break;
            case '3':
                cambio = 3;
                break;
            case '4':
                cambio = 4;
                break;
            case '5':
                cambio = 5;
                break;
            case '6':
                cambio = 6;
                break;
            case '7':
                cambio = 7;
                break;
            case '8':
                cambio = 8;
                break;
            case '9':
                cambio = 9;
                break;
            default:
                cambio = 0;
                break;
        }
        return cambio;
    }

    public static String patenteMayor(String conjuntoPatentes) {
        //este modulo determina cual es la patente mayor ingresada en un conjunto
        //tiene como parametros formales conjuntoPatentes que es el conjunto de patentes ingresado por el usuario
        String patenteMayor = "AAA000", patente;
        //usamos una repetitiva para dividir las patentes del conjunto hasta que quede vacio
        do {
            patente = conjuntoPatentes.substring(0, 6);

            //sacamos la patente separada del conjunto
            conjuntoPatentes = conjuntoPatentes.replaceFirst(patente, "");

            if ((patenteMenor1(patenteMayor, patente))) {
                patenteMayor = patente;
            }
        } while (!conjuntoPatentes.equals(""));
        return patenteMayor;
    }

    public static int patenteDuplicadaIdem(String patenteVerificar, String conjuntoPatentes) {
        //este modulo determina si hay una patente duplicada en un conjunto segun una patente a verificar
        //tiene como parametros formales conjuntoPatentes que recibe el conjunto a analizar
        //patenteVerificar es la patente a ver si se duplica
        String patente;
        int cantidad = 0;

        //usamos una repetitiva para dividir las patentes del conjunto hasta que quede vacio
        do {
            patente = conjuntoPatentes.substring(0, 6);

            //verificamos si es valido
            if (patente.equalsIgnoreCase(patenteVerificar)) {
                cantidad++;
                conjuntoPatentes = conjuntoPatentes.replaceFirst(patente, "");
            } else {
                conjuntoPatentes = conjuntoPatentes.replaceFirst(patente, "");
            }

        } while (!conjuntoPatentes.equals(""));
        return cantidad;
    }

    public static String obtenerPatente() {
        /*Este módulo solicita una patente y verifica si es válida, si no
lo es indicará el motivo y se repetirá hasta que se ingrese algo
válido*/
        String patente;
        boolean validez;
        /*Se indicará ante de invocar el módulo qué tipo de patente
se deberá ingresar*/
        do {
            System.out.println("Ingrese una patente con formato LLLNNN");
            patente = TecladoIn.readLine();
            validez = validacion(patente);
            if (!validez) {
                System.out.println("El formato de una patente valida es LLLNNN");
                System.out.println("Ingresela de nuevo");
            }
        } while (!validez);
        return patente;
    }

    public static String verificarCadenaPatentes() {
        /*Este modulo verifica que todas las patentes ingresadas sean validas*/
        String conjuntoPatentes, patente, cadenaPatentes;
        boolean validez;
        do {
            System.out.println("Ingrese un conjunto de patentes con formato LLLNNN");
            conjuntoPatentes = TecladoIn.readLine();
            cadenaPatentes = conjuntoPatentes;
            do {
                if ((conjuntoPatentes.length() % 6 == 0)) {
                    patente = cadenaPatentes.substring(0, 6);
                    //verificamos si es valido
                    validez = validacion(patente);
                    if (!validez) {
                        System.out.println("El formato de una patente valida es LLLNNN");
                        System.out.println("Ingrese el conjunto de nuevo");
                        cadenaPatentes = "";
                    } else {
                        cadenaPatentes = cadenaPatentes.replaceFirst(patente, "");
                    }
                } else {
                    System.out.println("El formato de una patente valida es LLLNNN");
                    System.out.println("Ingrese el conjunto de nuevo");
                    cadenaPatentes = "";
                    validez = false;
                }

            } while (!cadenaPatentes.equals(""));

        } while ((!validez));
        return conjuntoPatentes;
    }
}
