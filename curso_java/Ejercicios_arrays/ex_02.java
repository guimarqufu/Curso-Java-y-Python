package Ejercicios_arrays;

import java.util.Scanner;

public class ex_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce una cadena de numeros para buscar el mayor y el menor");
        String input = scanner.nextLine();

        // Dividir la entrada en partes y filtrar cadena vacia
        String[] parts = input.trim().split("\\s+");;

        //crear un array de numeros del mismo tamaño que el array parts
        int[] num = new int[parts.length]; 

        // Convertir cada parte del string en un numero entero y guardarlo en num
        for (int x = 0; x < parts.length; x++) {
            num[x] = Integer.parseInt(parts[x]);
        }
        int menor = 0;
        int mayor = 0;
        for (int x = 0; x < parts.length; x++) {
           if (num[menor] > num[x]){
                menor++;
                x = 0;
           }
        }
        for (int x = 0; x < parts.length; x++) {
            if (num[mayor] < num[x]){
                mayor++;
                x = 0;
            }
         }
        System.out.println("El numero mayor es: " + num[mayor]);
        System.out.println("El numero menor es: " + num[menor]);
        scanner.close();
    }
}
