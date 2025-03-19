package Ejercicios_arrays;

import java.util.Scanner;

public class ex_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce una cadena de numeros separada por espacios");
        String input = scanner.nextLine();

        // Dividir la entrada en partes y filtrar cadena vacia
        String[] parts = input.trim().split("\\s+");;

        //crear un array de numeros del mismo tamaño que el array parts
        int[] num = new int[parts.length]; 

        // Convertir cada parte del string en un numero entero y guardarlo en num
        for (int x = 0; x < parts.length; x++) {
            num[x] = Integer.parseInt(parts[x]);
        }

        int len = parts.length;

        System.out.print("lista de numeros: ");
        int count = 0;
        while (len > count) {
            System.out.print(num[count]);
            System.out.print(" ");
            count++;
        }
        System.out.print('\n');
        System.out.print("lista de numeros invertida: ");
        while (len > 0) {
            System.out.print(num[len - 1]);
            System.out.print(" ");
            len--;
        }
        System.out.print('\n');


        scanner.close();
    }
}