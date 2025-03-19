package Tema_1;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Introduce el primer un numero");
        int numero1 = scanner.nextInt();
        System.out.println("Introduce el segundo numero");
        int numero2 = scanner.nextInt();
        System.out.println("Introduce el tercero numero");
        int numero3 = scanner.nextInt();
        if (numero1 > numero2 && numero1 > numero3)
            System.out.println("El primer numero es el mayor");
        else if (numero2 > numero1 && numero2 > numero3)
            System.out.println("El segundo numero es el mayor");
        else
            System.out.println("El tercer numero es el mayor");
        scanner.close();;
    }
}