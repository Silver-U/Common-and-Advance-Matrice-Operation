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
}
