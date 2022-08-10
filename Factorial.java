// write a pgm to find factorial of a given number
import java.util.Scanner;

class Factorial
{
    public static void main(String [] args)
    {
        int a = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        /*
        for(int i = 1; i <= n; i++)
            a *= i;
        System.out.println(a);
        */
        for(int i = n; i >= 1; i--)
            a *= i;
        System.out.println(a);
        sc.close();
    }
}