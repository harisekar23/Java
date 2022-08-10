//pgm to find prime number

import java.util.Scanner;

class PrimeFunction
{
    public static void main(String [] args){
        System.out.println("enter the number:");
        int num = readNum();
        if(num == 1 | num == 0)
            System.out.println("not a valid number");
        else
        {
            if(isPrime(num))
                System.out.println(num+" is prime");
            else
                System.out.println(num+" not prime");
        }
    }

    public static int readNum()
    {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public static boolean isPrime(int num)
    {
        int count = 0;
        for(int i = 1; i <= num; i++)
            if(num % i == 0)
                count++;
        /*return count == 2 ? true : false;*/
        return count == 2 ;
    }
}