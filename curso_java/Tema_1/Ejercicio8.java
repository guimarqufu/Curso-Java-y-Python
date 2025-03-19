package Tema_1;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int numero1 = scanner.nextInt();
        int count = 2;
        if (numero1 == 1)
            System.out.println("El numero " + numero1 + " no es primo");
        else {
            while (numero1 % count != 0 && numero1 > count) {
                count++;
            }
            if (numero1 == count)
                System.out.println("El numero " + numero1 + " es primo");
            else
                System.out.println("El numero " + numero1 + " no es primo");
        }
        scanner.close();
    }
}
