package Tema_1;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Introduce un numero");
        int numero = scanner.nextInt();
        if (numero == 0)
            System.out.println("El numero es cero");
        else if (numero > 0)
            System.out.println("El numero es positivo");
        else if (numero < 0)
            System.out.println("El numero es negativo");
        scanner.close();;
    }
}
