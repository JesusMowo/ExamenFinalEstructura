/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject2;

/**
 *
 * @author aleja
 */
public class Mavenproject2 {

    public static int sumarDesdeFinal(int[] arreglo, int indice) {
        if (indice < 0) {
            return 0;
        }
        return arreglo[indice] + sumarDesdeFinal(arreglo, indice - 1);
    }

    public static void main(String[] args) {
        int[] numeros = {5, 7, 2, 9, 5};
        int resultado = sumarDesdeFinal(numeros, numeros.length - 1);
        System.out.println("La suma es: " + resultado);
    }
}
