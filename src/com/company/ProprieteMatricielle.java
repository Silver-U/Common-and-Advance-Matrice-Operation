package com.company;
import java.util.Scanner;

public class ProprieteMatricielle
{
    Scanner sc = new Scanner(System.in);

    public boolean Estcarree(Matrice m)
    {
        if(m.getCols()==m.getRows())
            return true;
        else
            return false;
    }

    public boolean EstReguliere(Matrice m)
    {
        if(m.getCols()==m.getRows())
            return true;
        else
            return false;
    }

    public void VerifiactionCarree(Matrice m)
    {
        if(!Estcarree(m))
            System.out.println("Votre matrice n'est pas carrée");
    }

    public void SaisiDeMatrice(int nombreMatrice)
    {
        for(int i=1; i<=nombreMatrice; i++)
        {
            System.out.println("Veuiller saisir les informatiion de la matrice:" + i );
            System.out.println("Veuiller saisir le nom de votre matrice:");
            String nom = sc.nextLine();
            System.out.println("Veuiller saisir le nombre de ligne de votre matrice:");
            int ligne = sc.nextInt();
            System.out.println("Veuiller saisir le nombre de colonne de votre matrice:");
            int colonne = sc.nextInt();

            Matrice m= new Matrice(ligne, colonne);
            m.setNom(nom);
        }
    }

    public Double getTrace(Matrice m)
    {
        double trace = 0;
        int j = 0;

        for (int i = 0; i < m.getRows(); i++)
        {
            trace += m.getElement(i, j);
            j++;
        }
        return trace;
    }
}
