// write a pgm to check that the given number is divisible by 3 or not.

import java.util.Scanner;

class DivideBy3
{
    public static void main(String [] args)
    {
        System.out.println("enter the number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if( n % 3 == 0)
            System.out.println("It is divisible by 3");
        else
            System.out.println("not divisible by 3");
        sc.close();
    }
}