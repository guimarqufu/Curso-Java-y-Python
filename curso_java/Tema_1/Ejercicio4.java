package Tema_1;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Introduce el primer un numero");
        int numero1 = scanner.nextInt();
        int count = 1;
        int result = 0;
        while (count <= numero1)
        {
            result = result + count;
            count++;
        }
        System.out.println("La suma de los numeros naturales es : " + result);
        scanner.close();;
    }
}
