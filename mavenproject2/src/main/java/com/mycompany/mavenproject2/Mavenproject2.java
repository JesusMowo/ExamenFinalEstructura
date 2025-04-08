/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject2;

/**
 *
 * @author aleja
 */
public class Mavenproject2 {

    public static void main(String[] args) {
        Pila pila = new Pila();
        pila.apilar("Pila Valor 1");
        pila.apilar("Pila Valor 2");
        pila.apilar("Pila Valor 3");
        pila.apilar("Pila Valor 4");

        Pila.imprimirInvertido(pila);
    }
}
