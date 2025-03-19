package Ejercicios_poo;

class Perro {
    String nombre;
    int edad;
}

public class ex_01 {
    public static void imprimirPerro(Perro perro) {
        System.out.println("Nombre: " + perro.nombre);
        System.out.println("Edad: " + perro.edad);
    }

    public static void main(String[] args) {
        Perro miPerro = new Perro();
        miPerro.nombre = "Firulais";
        miPerro.edad = 7;
        Perro PerroVecino = new Perro();
        PerroVecino.nombre = "Rudolf";
        PerroVecino.edad = 5;
        imprimirPerro(miPerro);
        imprimirPerro(PerroVecino);
    }
}
