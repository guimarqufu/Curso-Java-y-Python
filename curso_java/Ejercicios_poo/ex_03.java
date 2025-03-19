package Ejercicios_poo;

class Calculadora {
    public int sumar(int a, int b) {
        return (a + b);
    }
    
    private int restar(int a, int b) {
        return (a - b);
    }

    protected int multiplicar(int a, int b) {
        return (a * b);
    }
}

public class ex_03 {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        System.out.println("Suma: " + calc.sumar(5, 14));
        //System.out.println("Resta: " calc.restar(10, 5)); Error por que es privada y esta en otra clase
        System.out.println("Multiplicar: " + calc.multiplicar(5, 6));
    }
}
