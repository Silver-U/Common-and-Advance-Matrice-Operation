package com.company;

public class ProprieteMatricielle
{
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

    public Matrice getTransposee(Matrice m)
    {
        Matrice transposee = new Matrice(m.getCols(), m.getRows());

        for (int i = 0; i < transposee.getRows(); i++)
        {
            for (int j = 0; i < transposee.getCols(); j++)
            {
                transposee.setElement(i, j, m.getElement(j, i));
            }
        }
        return transposee;
    }

    public static double determinantM2(Matrice m)
    {
        return (m.getElement(0, 0) * m.getElement(1, 1)) - (m.getElement(0, 1) * m.getElement(1, 0));
    }

    public static double determinantM3(Matrice m)
    {
        return (m.getElement(0, 0) * m.getElement(1, 1) * m.getElement(2, 2)) - (m.getElement(0, 0) * m.getElement(1, 2) * m.getElement(2, 1)) + (m.getElement(0, 1) * m.getElement(1, 2) * m.getElement(2, 0)) - (m.getElement(0, 1) * m.getElement(1, 0) * m.getElement(2, 2)) + (m.getElement(0, 2) * m.getElement(1, 0) * m.getElement(2, 1)) - (m.getElement(0, 2) * m.getElement(1, 1) * m.getElement(2, 0));
    }

    public static double determinantMatrice(Matrice m)
    {

        double determinant = 0;

        if (m.getRows() == 2)
        {
            return determinantM2(m);
        }
        if (m.getRows() == 3)
        {
            return determinantM3(m);
        }
        if (m.getRows() > 3)
        {
            Matrice subM = new Matrice(m.getRows() -1, m.getCols() - 1);
            for (int k = 0; k < m.getRows(); k++)
            {
                int l = 1;

                for (int i = 0; i < subM.getRows(); i++)
                {
                    int c = 0;
                    for (int j = 0; j < subM.getCols(); j++)
                    {
                        if (j < k)
                        {
                            subM.setElement(i,j, m.getElement(l,c));
                        }
                        else if(j > c)
                        {
                            subM.setElement(i,j, m.getElement(l,c));
                        }
                        if (c != k)
                        {
                            subM.setElement(i, j, m.getElement(l, c));
                        }
                        c++;
                    }
                    l++;
                    System.out.println(subM);
                    System.out.println(determinant);
                }

                determinant += m.getElement(0, k) * Math.pow(-1, k) * determinantMatrice(subM);
            }
        }
        return determinant;
    }
}
