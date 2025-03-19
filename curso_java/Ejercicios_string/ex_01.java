package Ejercicios_string;

import java.util.Scanner;

public class ex_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce una palabra o frase");
        String str = scanner.nextLine();
        int len = str.length();
        int count = 0;
        int count_vocal = 0;
        while (len > count) {
            char character = str.charAt(count);
            if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u')
                count_vocal++;
            count++;
        }
        System.out.println("Contiene " + count_vocal + " vocales");
        scanner.close();
    }
}
