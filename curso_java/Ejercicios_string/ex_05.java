package Ejercicios_string;

import java.util.Scanner;

public class ex_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce una palabra");
        String str = scanner.nextLine();
        System.out.println("Introduce una otra palabra para unirla");
        String str2 = scanner.nextLine();
        int len = str.length() + str2.length();
        StringBuilder result = new StringBuilder(str + str2);
        System.out.println("EL resultado es: " + result);
        System.out.println("El resultado mide: " + len);
        scanner.close();
    }
}
