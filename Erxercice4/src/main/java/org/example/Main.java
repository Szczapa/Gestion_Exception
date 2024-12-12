package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        while (true) {
            String name = null;
            int age = -1;

            try {
                System.out.println("Entrez le nom de l'étudiant (ou 'exit' pour terminer) :");
                name = sc.nextLine();
                if (name.equalsIgnoreCase("exit")) {
                    break;
                }

                while (true) {
                    try {
                        System.out.println("Entrez l'âge de l'étudiant :");
                        age = sc.nextInt();
                        sc.nextLine();

                        if (age < 0) {
                            throw new InvalidAgeException("Erreur : L'âge d'un étudiant ne peut pas être négatif.");
                        }


                        break;
                    } catch (InvalidAgeException e) {
                        System.out.println(e.getMessage());
                    } catch (Exception e) {
                        System.out.println("Erreur : veuillez entrer un âge valide.");
                        sc.nextLine();
                    }
                }

                students.add(new Student(name, age));
                System.out.println("Étudiant ajouté avec succès !");
            } catch (Exception e) {
                System.out.println("Une erreur inattendue s'est produite. Veuillez réessayer.");
            }
        }


        System.out.println("\nListe des étudiants :");
        for (Student student : students) {
            System.out.println(student);
        }

        sc.close();
    }
}
