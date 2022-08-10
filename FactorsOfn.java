// w.a.p to find factors of a given number

import java.util.Scanner;

class FactorsOfn
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number:");
        int n = sc.nextInt();
        if(n == 0)
            System.out.println("not a valid number.");
        else
            for( int i = 1; i <= n; i++)
                if( n % i == 0 )
                    System.out.println(i+" is a factor of "+n);
        sc.close();
    }
}