package com.mycompany.sobrecargademetodos;


import java.util.*;

public class SobreCargaDeMetodos {

    Scanner leer = new Scanner(System.in);
    int a,b;
    double c,d;
    String e,f;
    

    public static void main(String[] args) {
        SobreCargaDeMetodos op = new SobreCargaDeMetodos();
        boolean esEntero = false;
        boolean esDouble = false;
        boolean esString = false;
        
        //agregar entero 1
        do {
            try {
                System.out.print("Ingresa un número entero: ");
                op.a = Integer.parseInt(op.leer.nextLine());
                esEntero = true;
            } catch (NumberFormatException e) {
                System.out.println("Error: Debe ingresar un número entero válido.");
            }
        } while (!esEntero);
        
        
        //Muestra de que se agrego entero 1
        System.out.println("El entero agregado es: "+op.a);
        esEntero = false;
       
        //agregar entero 2
        do {
            try {
                System.out.print("Ingresa un número entero: ");
                op.b = Integer.parseInt(op.leer.nextLine());
                esEntero = true;
            } catch (NumberFormatException e) {
                System.out.println("Error: Debe ingresar un número entero válido.");
            }
        } while (!esEntero);
        // muestra entero 2
        System.out.println("El entero agregado es: "+op.b);
        // agrega double 1
        do {
            try {
                System.out.print("Ingresa un número double: ");
                op.c = Double.parseDouble(op.leer.nextLine());
                esDouble = true;
            } catch (NumberFormatException e) {
                System.out.println("Error: Debe ingresar un número entero válido.");
            }
        } while (!esDouble);
        // muestra double 1
        System.out.println("El double agregado es: "+op.c);
        esDouble = false;
        //agrega double 2
        do {
            try {
                System.out.print("Ingresa un número double: ");
                op.d = Double.parseDouble(op.leer.nextLine());
                esDouble = true;
            } catch (NumberFormatException e) {
                System.out.println("Error: Debe ingresar un número entero válido.");
            }
        } while (!esDouble);
        // muestra double 2
        System.out.println("El double agregado es: "+op.d);
        // agrega string 1 y mostrar
        System.out.print("Agregar el string 1:");
        op.e = op.leer.nextLine();
        System.out.println("El string agreado es: "+op.e);
        // agrega string 1 y mostrar
        System.out.print("Agregar el string 2: ");
        op.f = op.leer.nextLine();
        System.out.println("El string agregado es:"+op.f);
        // importante equals para strings
        if(op.a==0 && op.b==0 && op.c==0.0 && op.d==0.0 && op.e.equals("0") && op.f.equals("0")){
            System.out.println("Se acabo la ejecucion a causa de agregar puros ceros xD ");
            System.exit(0);
        }
        
    
        //metodos
        op.Imprimir(op.a, op.b, op.c, op.d, op.e, op.f);
        
        
        
        
       
        
    }
    
    
    

    public void Imprimir(int a, int b, double c, double d, String e, String f) {
        System.out.println("1) Entero "+a);
        System.out.println("2) Entero "+b);
        System.out.println("3) Double "+c);
        System.out.println("4) Double "+d);
        System.out.println("5) String "+e);
        System.out.println("6) String "+f);
    }
    public void Imprimir(String f, int a, double c, String e, int b, double d){
        System.out.println("1) String "+f);
        System.out.println("2) Int "+a);
        System.out.println("3) Double "+c);
        System.out.println("4) String "+e);
        System.out.println("5) Int "+b);
        System.out.println("6) Double "+d);
    }
    
    public void Imprimir(double c, String e, int a, String f, int b, double d){
        System.out.println("1) Double "+c);
        System.out.println("2) String "+e);
        System.out.println("3) Int "+a);
        System.out.println("4) String "+a);
        System.out.println("5) Int "+f);
        System.out.println("6) Double "+d);
    }
    public void Imprimir(int a, double c, String e, int b, double d, String f){
        System.out.println("1) Int "+a);
        System.out.println("2) Double "+c);
        System.out.println("3) String "+e);
        System.out.println("4) Int "+b);
        System.out.println("5) Double "+d);
        System.out.println("6) String "+f);
    }
    public void Imprimir(String e, double c, int a, String f, double d, int b){
        System.out.println("1) String "+e);
        System.out.println("2) Double "+c);
        System.out.println("3) Int "+a);
        System.out.println("4) String "+f);
        System.out.println("5) Double "+f);
        System.out.println("6) Int "+b);
    }
    
    
    
    
}
