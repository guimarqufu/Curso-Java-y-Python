package Tema_1;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Introduce un numero");
        int numero = scanner.nextInt();
        if (numero % 2 == 0)
            System.out.println("El numero es par");
        else if (numero % 2 != 0)
            System.out.println("El numero es impar");
        scanner.close();;
    }
}

