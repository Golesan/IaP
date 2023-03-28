package com.example.ejercicio_3;

public class Main {

    public static void main(String[] args) {
        int resultado = suma(10, 30, 40 );
        System.out.println(resultado);
        coche miCoche = new coche ();
        miCoche.AñadirPuerta();
        System.out.println(miCoche.puertas);
    }

    public static int suma(int a, int b, int c) {
        return a + b + c;
    }
}
class coche {
    public static int puertas = 5;

    public void AñadirPuerta(){
        this.puertas++;
    }

}
//Este ejercicio es para comprobar la creación de objetos//
