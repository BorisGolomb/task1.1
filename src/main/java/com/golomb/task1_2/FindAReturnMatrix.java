package com.golomb.task1_2;

public class FindAReturnMatrix {
    void inversion(float [][]A, int N)
    {
        double temp;

        float [][] E = new float [N][N];


        for (int i = 0; i < N; i++)
            for (int j = 0; j < N; j++)
            {
                E[i][j] = 0f;

                if (i == j)
                    E[i][j] = 1f;
            }

        for (int k = 0; k < N; k++)
        {
            temp = A[k][k];

            for (int j = 0; j < N; j++)
            {
                A[k][j] /= temp;
                E[k][j] /= temp;
            }

            for (int i = k + 1; i < N; i++)
            {
                temp = A[i][k];

                for (int j = 0; j < N; j++)
                {
                    A[i][j] -= A[k][j] * temp;
                    E[i][j] -= E[k][j] * temp;
                }
            }
        }

        for (int k = N - 1; k > 0; k--)
        {
            for (int i = k - 1; i >= 0; i--)
            {
                temp = A[i][k];

                for (int j = 0; j < N; j++)
                {
                    A[i][j] -= A[k][j] * temp;
                    E[i][j] -= E[k][j] * temp;
                }
            }
        }

        for (int i = 0; i < N; i++)
            for (int j = 0; j < N; j++)
                A[i][j] = E[i][j];

    }
}
