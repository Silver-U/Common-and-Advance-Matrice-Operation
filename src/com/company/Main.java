package com.company;

public class Main
{

    public static void main(String[] args)
    {
        Matrice dsa = new Matrice(4,4);
        double[][] matrice ={
                {1, 2, 3, 3},
                {0, 1, 2, 6},
                {-1, -4, -1, 9},
                {10, 11, 12, 13}
        };

        dsa.setMatrice(matrice);

        System.out.println(ProprieteMatricielle.determinantMatrice(dsa));
    }
}
