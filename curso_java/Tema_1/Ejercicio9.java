package Tema_1;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce V o F");
        String str = scanner.nextLine();
        char character = str.charAt(0);
        int len = str.length();
        if (len > 1)
            System.out.println("Introduce solo un caracter");
        else if (character == 'V')
            System.out.println("Es verdadero");
        else if (character == 'F')
            System.out.println("Es Falso");
        else
            System.out.println("Introduce solo V o F");
        scanner.close();
    }
}
