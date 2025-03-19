package Tema_1;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Introduce un numero");
        int numero1 = scanner.nextInt();
        int count = 1;
        int result = 1;
        while (count <= 10)
        {
            result = count * numero1;
            System.out.println(count + " x " + numero1 + " = " + result);
            count++;
        }
        scanner.close();;
    }
}
