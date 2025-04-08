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
        ListaCircular lista = new ListaCircular();
        lista.agregar("Hola");
        lista.agregar("Profe");
        lista.agregar("Como");
        lista.agregar("esta");
        lista.agregar("Usted uwu");

        String resultado = lista.concatenar();
        System.out.println(resultado);
    }
}
