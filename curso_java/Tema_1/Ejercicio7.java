package Tema_1;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Introduce un numero");
        int numero1 = scanner.nextInt();
        int count = 1;
        int result = numero1;
        while (result / 10 > 0)
        {
            result /= 10;
            count++;
        }
        System.out.println("El numero " + numero1 + " tiene " + count + " digitos");
        scanner.close();
    }
}
