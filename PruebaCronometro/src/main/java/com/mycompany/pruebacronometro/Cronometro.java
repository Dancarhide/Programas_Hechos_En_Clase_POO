/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pruebacronometro;

/**
 *
 * @author danca
 */
public class Cronometro {

    private double tiempo;

    // Constructor
    public Cronometro() {
        ponerACero();
    }

    // Metodo ponerACero
    public void ponerACero() {
        tiempo = System.currentTimeMillis();
    }

    // Metodo tiempoTranscurrido: devuelve el tiempo transcurrido en segundos
    public double tiempoTranscurrido() {
        double tt;
        tt = (System.currentTimeMillis() - tiempo) / 1000;
        return tt;
    }

}
