/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author teddyheuchling
 */
//Fibonacci Series using Recursion
class main
{
    static int fib(int n)
    {
    if (n <= 1)
       return n;
    return fib(n-1) + fib(n-2);
    }
      
    public static void main (String args[])
    {
    int n = 9;
    System.out.println(fib(n));
    }
}
/* This code is contributed by Rajat Mishra */