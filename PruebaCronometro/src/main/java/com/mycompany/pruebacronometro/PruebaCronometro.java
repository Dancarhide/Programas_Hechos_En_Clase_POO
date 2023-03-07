/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.pruebacronometro;

/**
 *
 * @author danca
 */
public class PruebaCronometro {

    public static void main(String[] args) {
        int i, j, k;

        Cronometro t = new Cronometro();

        for (i = 1; i <= 10000; i++) {
            for (j = 1; j <= 10000; j++) {
                k = i + j;
            }
        }

        System.out.println("Fin del bucle...");

        System.out.println("Tiempo = " + t.tiempoTranscurrido() + " s");

    }
}
