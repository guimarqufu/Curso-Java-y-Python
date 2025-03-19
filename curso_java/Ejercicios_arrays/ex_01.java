package Ejercicios_arrays;

import java.util.Scanner;

public class ex_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce una cadena de numeros para sumarlos separados por espacios");
        String input = scanner.nextLine();

        // Dividir la entrada en partes y filtrar cadena vacia
        String[] parts = input.trim().split("\\s+");;

        //crear un array de numeros del mismo tamaño que el array parts
        int[] num = new int[parts.length]; 

        // Convertir cada parte del string en un numero entero y guardarlo en num
        for (int x = 0; x < parts.length; x++) {
            num[x] = Integer.parseInt(parts[x]);
        }
        int result = 0;
        for (int x = 0; x < parts.length; x++) {
            result = result + num[x];
        }
        System.out.println("EL resultado de la suma es: " + result);
        scanner.close();
    }
}
