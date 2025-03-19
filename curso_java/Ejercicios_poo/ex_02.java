package Ejercicios_poo;

class Persona {
    public String nombre;
    private int edad;
    protected String ciudad;
}

public class ex_02 {
    private static void imprimirPersona(Persona persona) {
        System.out.println("Nombre: " + persona.nombre);
        System.out.println("Ciudad: " + persona.ciudad);
    }
    public static void main(String[] args) {
        Persona p = new Persona();
        p.nombre = "Guillermo";
        // p.edad solo accesible desde la clase
        p.ciudad = "Arriate";
        Persona p2 = new Persona();
        p2.nombre = "Ricardo";
        p2.ciudad = "Jupiter";
        imprimirPersona(p);
        imprimirPersona(p2);
    }
}
