package com.company;

import java.util.Arrays;

public class Matrice
{
    private int rows;
    private int cols;
    private double[][] matrice;

    public Matrice(int rows, int cols)
    {
        this.rows = rows;
        this.cols = cols;
        matrice = new double[rows][cols];
    }

    public int getCols()
    {
        return cols;
    }

    public int getRows()
    {
        return rows;
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

    public void setMatrice(double[][] matrice)
    {
        this.matrice = matrice;
    }

    @Override
    public String toString()
    {
        return "Matrice{" +
                "rows=" + rows +
                ", cols=" + cols +
                ", matrice=" + Arrays.toString(matrice) +
                '}';
    }
}
