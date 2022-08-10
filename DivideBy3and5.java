// write a pgm to check that the given number is divisible by both 3 and 5
import java.util.Scanner;

class DivideBy3and5
{
    public static void main(String [] args)
    {
        System.out.println("enter the number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if( n % 3 == 0 && n % 5 ==0)
            System.out.println("it is divisible");
        else
            System.out.println("not divisible");
        sc.close();
    }
}