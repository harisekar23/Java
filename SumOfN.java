//sum of a given number 

import java.util.Scanner;

class SumOfN
{
    public static void main(String [] args)
    {
        int n = readNums();
        sumOfDigits(n);
    }

    public static int readNums()
    {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public static void sumOfDigits(int a)
    {
        int sum = 0;
        while(a > 0)
        {
            sum = sum + a % 10;
            a /= 10;
        }
        System.out.println(sum);
    }
}