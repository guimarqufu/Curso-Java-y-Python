package Ejercicios_string;

import java.util.Scanner;

public class ex_02 {
    
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
        System.out.println(result.toString());
        scanner.close();
    }
}
