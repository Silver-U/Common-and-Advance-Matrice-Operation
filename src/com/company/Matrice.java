package com.company;

public class Matrice
{
    private int rows;
    private int cols;
    private double[][] matrice;
    private String nom;

    public Matrice(int rows, int cols)
    {
        this.rows = rows;
        this.cols = cols;
        matrice = new double[rows][cols];
        nom = "";
    }

    public int getCols()
    {
        return cols;
    }

    public int getRows()
    {
        return rows;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getElement(int i, int j)
    {
        return matrice[i][j];
    }

    public void setElement(int i, int j, double value)
    {
        matrice[i][j] = value;
    }

    public double[][] getMatrice()
    {
        return matrice;
    }
}
