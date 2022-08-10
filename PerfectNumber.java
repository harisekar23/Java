//perfect number pgm


// it is a +ve integer number whose sum of factors is equal to the number itself.
/* eg:- 6,28 */

import java.util.Scanner;


class PerfectNumber
{
    public static void main(String [] args)
    {
        int n = readNum();
        if(isPerfect(n))
            System.out.println(n+" is a perfect number");
        else
            System.out.println(n+" is not a perfect number");
    }

    public static int readNum()
    {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public static boolean isPerfect(int a)
    {
        int sum = 0;
        for(int i = 1; i < a; i++)
            if(a % i == 0)
                sum += i;
        return sum == a;
    }
}
