package com.company;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ce programme met en oeuvre la resolution des matrices.");
        System.out.println("Pour ce faire, nous vous proposons plusieus résolution de matrice," +
                "telle:/n" +
                "1.Calcul matricielle/n" +
                "2.Propriétés matricielle/n" +
                "3.Système de n équations linéaires à n inconnues");
        System.out.println("Quelle est votre choix entre 1,2 ou 3?");
        int choix = sc.nextInt();

        switch (choix)
        {
            case 1:
                System.out.println("1.Calcul matricielle");
                System.out.println("Cette partie permet de:/n" +
                        "1.Calculer l'addition de deux matrices/n" +
                        "2.Calculer le produit scalaire d'une matrice/n" +
                        "3.Calculer le produit de deux matrices/n" +
                        "4.De savoir si la matrice est triangulaire ou non ");
                System.out.println("Quelle est votre choix entre 1,2,3 ou 4?");
                int choix1 = sc.nextInt();
                switch (choix1)
                {
                    case 1:
                        System.out.println("Addition de deux matrices");
                        break;
                    case 2:
                        System.out.println("Produit scalaire d'une matrice");
                        break;
                    case 3:
                        System.out.println("Produit de deux matrices");
                        break;
                    case 4:
                        System.out.println("Matrice triangulaire");
                        break;
                }
                break;
            case 2:
                System.out.println("2.Propriétes matricielles");
                System.out.println("Cette partie permet de:/n" +
                        "1.Calculer la trace de la matrice/n" +
                        "2.Calculer le déterminant de la matrice/n" +
                        "3.Calculer la transposée de la matrice/n" +
                        "4.Calculer la comatrice de la matrice/n" +
                        "5.Calculer la matrice inverse ");
                System.out.println("Quelle est votre choix entre 1,2,3,4 ou 5?");
                int choix2 = sc.nextInt();
                switch (choix2)
                {
                    case 1:
                        System.out.println("Trace de la matrice");
                        break;
                    case 2:
                        System.out.println("Déterminant de la matrice");
                        break;
                    case 3:
                        System.out.println("Transposée de la matrice");
                        break;
                    case 4:
                        System.out.println("Comatrice de la matrice");
                        break;
                    case 5:
                        System.out.println("Inverse de la matrice");
                        break;

                }
                break;
            case 3:
                System.out.println("3.Système de n équations linéaires à n inconnues");
                System.out.println("Cette partie permet de:/n" +
                        "1.Trouver X par Cramer/n" +
                        "2.Trouver X par Inversion matricielle /n" +
                        "3.Trouver X par Jacobi/n");
                System.out.println("Quelle est votre choix entre 1,2 ou 3?");
                int choix3 = sc.nextInt();
                switch (choix3)
                {
                    case 1:
                        System.out.println("Méthode de Cramer");
                        break;
                    case 2:
                        System.out.println("Inversion matricielle");
                        break;
                    case 3:
                        System.out.println("Méthode de Jacobi");
                        break;
                }
                break;
        }

    }
}
