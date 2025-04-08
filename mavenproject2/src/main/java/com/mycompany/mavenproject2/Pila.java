/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2;

/**
 *
 * @author aleja
 */
public class Pila {
    Nodo cima;

    public Pila() {
        cima = null;
    }

    public void apilar(String valor) {
        Nodo nuevo = new Nodo(valor);
        nuevo.siguiente = cima;
        cima = nuevo;
    }

    public boolean estaVacia() {
        return cima == null;
    }

    public String desapilar() {
        if (estaVacia()) {
            return null;
        }
        String dato = cima.valor;
        cima = cima.siguiente;
        return dato;
    }
    
    public static void imprimirInvertido(Pila pila) {
        if (pila.estaVacia()) {
            return;
        }
        String dato = pila.desapilar();
        imprimirInvertido(pila);
        System.out.println(dato);
    }
}
