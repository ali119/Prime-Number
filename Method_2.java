package assignment_4;
 
import java.io.*;
import java.math.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Method_2 {
     
/* Iterative Function to calculate
// (a^n)%p in O(logy) */
static int power(int a,int n, int p)
{
    // Initialize result
    int res = 1;

    // Update 'a' if 'a' >= p
    a = a % p;

    while (n > 0)
    {
        // If n is odd, multiply 'a' with result
        if ((n & 1) == 1)
            res = (res * a) % p;

        // n must be even now
        n = n >> 1; // n = n/2
        a = (a * a) % p;
    }
    return res;
}

// If n is prime, then always returns true,
// If n is composite than returns false with
// high probability Higher value of k increases
// probability of correct result.
static String isPrime(int n, int k)
{
    int key = k;
    // Corner cases
    if (n <= 1 || n == 4) return "With 2nd method number of iteration  is: "+key;
    if (n <= 3) return "With 2nd method number of iteration  is: "+key;

    // Try k times
    while (k > 0)
    {
        // Pick a random number in [2..n-2]
        // Above corner cases make sure that n > 4
        int a = 2 + (int)(Math.random() % (n - 4));

        // Fermat's little theorem
        if (power(a, n - 1, n) != 1)
            return "With 2nd method number of iteration  is: "+key;
        k--;
    }
    return "With 2nd method number of iteration  is: "+key;
}
}