package Ejercicios_arrays;

import java.util.Scanner;

public class ex_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce una cadena de numeros separada por espacios");
        String input = scanner.nextLine();

        System.out.println("Introduce el numero que quieres buscar");
        int input2 = Integer.parseInt(scanner.nextLine());

        // Dividir la entrada en partes y filtrar cadena vacia
        String[] parts = input.trim().split("\\s+");;

        //crear un array de numeros del mismo tamaño que el array parts
        int[] num = new int[parts.length]; 

        // Convertir cada parte del string en un numero entero y guardarlo en num
        for (int x = 0; x < parts.length; x++) {
            num[x] = Integer.parseInt(parts[x]);
        }

        int i = 0;
        for (int x = 0; x < parts.length; x++) {
            if (num[x] == input2) {
                i++;
            }
        }
        
        System.out.println("El numero " + input2 +" aparece " + i + " veces en la lista");
        scanner.close();
    }
}
