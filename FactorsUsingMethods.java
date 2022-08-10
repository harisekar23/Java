//factors of a number

import java.util.Scanner;

class FactorsUsingMethods
{
    public static void main(String [] args)
    {
        int n = readNums();
        System.out.println("\n");
        printFactors(n);
    }

    public static int readNums()
    {
        Scanner sc = new Scanner(System.in);   
        return sc.nextInt();
    }

    public static void printFactors(int a)
    {
        for(int i = 1; i <= a; i++)
            if(a % i ==0)
                System.out.println(+i);
    }
}