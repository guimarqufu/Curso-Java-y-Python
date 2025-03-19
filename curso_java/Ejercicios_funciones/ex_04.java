package Ejercicios_funciones;

public class ex_04 {
    public static void main(String[] args) {
        boolean result = esPar(54);
        if (result) {
            System.out.println("Si es par");
        }
        else {
            System.out.println("No es par");
        }
    }

    public static boolean esPar(int num) {
        if (num % 2 == 0) {
            return (true);
        }
        else {
            return (false);
        }
    }
}
