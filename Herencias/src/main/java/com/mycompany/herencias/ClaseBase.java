/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herencias;

/**
 *
 * @author danca
 */
public class ClaseBase {
    String nombre;
    int cantidad;
    public ClaseBase() {

    }
    public ClaseBase(int parametro1, String nombre) {
        cantidad = parametro1;
        this.nombre = nombre;
    }
    public void MostrarContenido(){
        System.out.println("Nombre: "+nombre+" y Cantidad: "+cantidad);
    }
}
