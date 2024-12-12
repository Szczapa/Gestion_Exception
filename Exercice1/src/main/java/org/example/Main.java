package org.example;

import java.util.IllegalFormatConversionException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println(menu.showMenu());

            try {
                String input = scanner.nextLine();
                Integer.parseInt(input);
                System.out.println(input + " a été transformé de String en int");
                return;
            } catch (NumberFormatException e) {
                System.out.println("erreur de conversion " + e.getMessage());
            }
        } while (true);
    }
}