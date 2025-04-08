/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject2;

import java.util.Scanner;

/**
 *
 * @author aleja
 */
public class Mavenproject2 {

    public static int factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static int potencia(int base, int exponente) {
        if (exponente == 0) {
            return 1;
        }
        return base * potencia(base, exponente - 1);
    }

    public static int multiplicar(int numFactorial, int base, int exponente) {
        int a = factorial(numFactorial);
        int b = potencia(base, exponente);
        return a * b;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el numero para el factorial: ");
        int num = entrada.nextInt();

        System.out.print("Ingrese la base para la potencia: ");
        int base = entrada.nextInt();

        System.out.print("Ingrese el exponente: ");
        int exponente = entrada.nextInt();

        int resultado = multiplicar(num, base, exponente);
        System.out.println("Resultado: " + resultado);
    }
}
