package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("Veuillez entrer un nombre entier positif pour calculer sa racine carrée :");
                String input = sc.nextLine();
                int x = Integer.parseInt(input);

                if (x < 0) {
                    throw new CalculExeption("Erreur : le nombre ne peut pas être négatif.");
                }

                double result = Math.sqrt(x);
                System.out.println("La racine carrée de " + x + " est : " + result);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Erreur : veuillez entrer un nombre entier valide.");
            } catch (CalculExeption e) {
                System.out.println(e.getMessage());
            }
        }

        sc.close();
    }
}
