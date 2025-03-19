package Ejercicios_string;

import java.util.Scanner;

public class ex_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce una palabra o frase");
        String str = scanner.nextLine();
        System.out.println("Introduce una letra que quieres cambiar");
        String str2 = scanner.nextLine();
        char character = str2.charAt(0);
        System.out.println("Introduce una letra que quires poner");
        String str3 = scanner.nextLine();
        char character2 = str3.charAt(0);
        int len = str.length();
        int count = 0;
        StringBuilder result = new StringBuilder(str);
        while (len > count) {
            if (str.charAt(count) == character) {
                result.setCharAt(count, character2);
            }
            count++;
        }
        System.out.println("EL resultado del cambio es: " + result);
        scanner.close();
    }
}
