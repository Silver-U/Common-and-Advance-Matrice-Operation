package com.company;

public class OperationMatricielle
{
    public Matrice Addition (Matrice m1, Matrice m2)
    {
        Matrice m = new Matrice(m1.getRows(), m1.getCols());

        for (int i = 0; i < m1.getRows(); i++)
        {
            for (int j = 0; j < m1.getCols(); j++)
            {
                m.setElement(i, j, m1.getElement(i, j) + m2.getElement(i, j));
            }
        }
        return m;
    }

    public Matrice ProduitScalaire (Matrice m1, double scalaire)
    {
        Matrice m = new Matrice(m1.getRows(), m1.getCols());

        for (int i = 0; i < m1.getRows(); i++)
        {
            for (int j = 0; j < m1.getCols(); j++)
            {
                m.setElement(i, j, m1.getElement(i, j) * scalaire);
            }
        }
        return m;
    }

    public Matrice Multiplication (Matrice m1, Matrice m2)
    {
        Matrice m = new Matrice(m1.getRows(), m2.getCols());

        for (int i = 0; i < m1.getRows(); i++)
        {
            for (int j = 0; j < m2.getCols(); j++)
            {
                double valueElement = 0;

                for (int k = 0; k < m1.getRows(); k++)
                {
                    valueElement += m1.getElement(i, k) * m2.getElement(k, j);
                }
                m.setElement(i, j, valueElement);
            }
        }
        return m;
    }

    public String EstTreiangulaire (String supInf, boolean stricte, Matrice m)
    {
        boolean sup = true;
        boolean inf = true;
        int k = 1;
        String message = "";

        for (int i = 0; i < m.getRows(); i++)
        {
            for (int j = k; j < m.getCols(); j++)
            {
                if (m.getElement(i, j) != 0)
                {
                    sup = false;
                    break;
                }
            }
            k++;
        }

        if (sup)
        {
            message += "Votre matrice est triangulaire superieur";
        }
        else
        {
            message += "Votre matrice n'est pas triangulaire superieur";
            return message;
        }

        for (int i = 1; i < m.getRows(); i++)
        {
            for (int j = 0; j < k; j++)
            {
                if (m.getElement(i, j) != 0)
                {
                    inf = false;
                    break;
                }
            }
            k++;
        }

        if (inf)
        {
            message += "Votre matrice est triangulaire inferieure";
        }
        else
        {
            message += "Votre matrice n'est pas triangulaire inferieure";
            return message;
        }

        if (stricte)
        {
            int j = 0;

            for (int i = 0; i < m.getRows(); i++)
            {
                if (m.getElement(i, j) != 0)
                {
                    break;
                }
                j++;
            }

            if (j == (m.getRows() - 1))
            {
                return message += "stricte";
            }
            else
            {
                return message += " et n'est pas triangulaire stricte";
            }
        }
        else
        {
            return message += ", vu que vous ne voulez pas savoir si elle est stricte, on ne vous dira pas.";
        }
    }
}
