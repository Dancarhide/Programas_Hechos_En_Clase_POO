/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.herencias;

/**
 *
 * @author danca
 */
public class Herencias {

    public static void main(String[] args) {
        ClaseBase c1 = new ClaseBase(25,"Dancar");
        ClaseDerivada1 c2 = new ClaseDerivada1();
        ClaseDerivada2 c3 = new ClaseDerivada2(15, "Carlos");
        
        c1.MostrarContenido();
        c2.MostrarContenido();
        c3.MostrarContenido();
        
        
    }
}
