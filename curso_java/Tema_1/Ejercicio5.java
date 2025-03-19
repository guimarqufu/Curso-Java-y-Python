package Tema_1;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Introduce el primer un numero");
        int numero1 = scanner.nextInt();
        int count = 1;
        int result = 1;
        while (count <= numero1)
        {
            result = result * count;
            count++;
        }
        System.out.println("El factonial del numero " + numero1 + " es: " + result);
        scanner.close();;
    }
}
