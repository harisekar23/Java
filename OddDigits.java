// w.a.p to print the odd digitis in a given number

import java.util.Scanner;

class OddDigits
{
    public static void main(String [] args)
    {
        int n = readNum();
        printOddDigitis(n);
    }

    public static int readNum()
    {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public static void printOddDigitis(int n)
    {   
        while(n > 0)
        {
            int m = n % 10;
            if(m % 2 != 0)
                System.out.println(m);
            n /= 10;
        }
    }
}