
package com.mycompany.herencias;

public class ClaseDerivada2 extends ClaseBase{
    
    public ClaseDerivada2(int parametro1, String nombre){
        super( parametro1,  nombre);
    }
    
    
    public void MostrarContenido(){
        System.out.println("Cantidad: "+cantidad+" y nombre: "+nombre);
    }
}
