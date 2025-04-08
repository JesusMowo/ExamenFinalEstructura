/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2;

/**
 *
 * @author aleja
 */
public class ListaCircular {
    Nodo cabeza;

    public ListaCircular() {
        cabeza = null;
    }

    public void agregar(String palabra) {
        Nodo nuevo = new Nodo(palabra);
        if (cabeza == null) {
            cabeza = nuevo;
            cabeza.siguiente = cabeza;
        } else {
            Nodo temp = cabeza;
            while (temp.siguiente != cabeza) {
                temp = temp.siguiente;
            }
            temp.siguiente = nuevo;
            nuevo.siguiente = cabeza;
        }
    }

    public String concatenar() {
        if (cabeza == null) {
            return "";
        }

        String resultado = cabeza.valor;
        Nodo actual = cabeza.siguiente;

        while (actual != cabeza) {
            resultado += " " + actual.valor;
            actual = actual.siguiente;
        }

        return resultado;
    }
}
