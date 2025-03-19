package Ejercicios_string;

import java.util.Scanner;

public class ex_03 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce una palabra o frase");
        String str = scanner.nextLine();
        int len = str.length();
        StringBuilder result = new StringBuilder();
        while (len > 0) {
            result.append(str.charAt(len - 1));
            len--;
        }
        String comparar = result.toString();
        len = str.length();
        int count = 0;
        while (len > count && comparar.charAt(count) == str.charAt(count)) {
            count++;
        }
        if (count == len)
            System.out.println("Si es un palindromo");
        else
            System.out.println("No es un palindromo");
        scanner.close();
    }
}
