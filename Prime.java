//write a pgm to find tat the given number is prime number or not;
import java.util.Scanner;

class Prime
{
    public static void main(String [] args)
    {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        if( n == 0 )
            System.out.println("not a valid number");
        else
        {
            for(int i = 1; i <= n; i++)
                if(n % i == 0)
                count++;
            if(count == 2)
                System.out.println("it is a prime number");
            else
                System.out.println("not a prime number");
        }
        sc.close();
    }
}