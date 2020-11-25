/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array_tridimensional;

import java.util.Scanner;

public class Array_tridimensional {

    static int[][][] tridimensional = null;
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        tridimensional = definirindices(tridimensional); // // creo el arreglo y el metodo definirtamanose encarga de obtener los numeros por teclado y guardarlos
        System.out.println("los numeros de la cara es:" + tridimensional.length);
        System.out.println("los numeros de la filas son:" + tridimensional[0].length); // imprimo la cantidad dela matriz
        System.out.println(" los numeros de la columnas son:"
                + tridimensional[0].length);
        System.out.println();//este para que me haga un salto de linea
        llenar(tridimensional); // utilizo el metodo llenar y le envio matriz
        System.out.println();
        imprimirmatriz(tridimensional);// utilizo el metodo imprimir datos y le envio al arreglo que contiene mis digitos

    }

    public static int[][][] definirindices(int[][][] d) {
        System.out.println("introdusca los dijitos de la cara&filas&columnas");
        String datosIngresados = leer.next();
        // para poder inicializar el arreglo se crea un vector
        String[] datos = datosIngresados.split("&"); // va guardar los datos que estoy recibiendo, se agrega el simbolo ampersand que es la forma que estoy separando los datos para que almacene en la filay columnas
        int cara = Integer.parseInt(datos[0]);
        int filas = Integer.parseInt(datos[1]); // se hace una inversion con interior para que sean del mismo tipo de datos
        int columnas = Integer.parseInt(datos[2]);// asigno los datos a mi variable
        d = new int[cara][filas][columnas];// inicializo mi arreglo
        return d; // retorno mi matriz
    }

    public static void llenar(int[][][] d) {
        System.out.println("ingrese los valores de la matriz");
        for (int i = 0; i < d.length; i++) {//se utiliza un bucle for para guardar los datos,y incrementarlo

            for (int j = 0; j < d[i].length; j++) {
                for (int k = 0; k < d[i][j].length; k++) {
                    System.out.print(" matriz [" + i + "[" + j + "[" + k + "]:");
                    d[i][j][k] = Integer.parseInt(leer.next());// almacena lo que el usurio ingresa desde el teclado

                }
            }
        }// se cierra el metodo de llenar valores

    }

    public static void imprimirmatriz(int[][][] d) {
        System.out.println("los numeros de la matriz son:");
        for (int i = 0; i < d.length; i++) {//se utiliza un bucle for para guardar los datos,y incrementarlo
            for (int j = 0; j < d[i].length; j++) {
                for (int k = 0; k < d[i][j].length; k++) {
                    System.out.print(d[i][j][k]);
                }
            }
            System.out.println("");
        }

    }

}
