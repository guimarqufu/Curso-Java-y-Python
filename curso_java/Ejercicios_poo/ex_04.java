package Ejercicios_poo;

class Contador {
    public static int cuenta = 0;

    public static void incrementar() {
        cuenta++;
    }

    public static void incrementar10() {
        cuenta += 10;
    }
}

public class ex_04 {
    public static void main(String[] args) {
        Contador.incrementar();
        System.out.println("Cuenta: " + Contador.cuenta);
        Contador.incrementar10();
        System.out.println("Cuenta: " + Contador.cuenta);
    }
}
