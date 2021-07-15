package com.company;


public class ThreeSum
{
    public static int count(int[] a)
    {
        int N = a.length;
        int count = 0;
// Check each triple of indices (i, j, k)
// We can restrict to i < j < k: re-ordering gives the same sum
        for (int i = 0; i < N; i++)
            for (int j = i+1; j < N; j++)
                for (int k = j+1; k < N; k++)
// Ignore possible overflow for simplicity
                    if (a[i] + a[j] + a[k] == 0)
                        count++;
    }
return count;
}
