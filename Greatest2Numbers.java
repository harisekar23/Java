// pgm to find the greatest of 2 numbers

import java.util.Scanner;

class Greatest2Numbers
{
    public static void main(String [] args)
    {
        readNums();
    }
    
    public static void readNums()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number n1: ");
        int n1 = sc.nextInt();
        System.out.println("enter a number n2: ");
        int n2 = sc.nextInt();
        findBiggest(n1, n2);
        sc.close();
    }
    
    public static void findBiggest(int n1, int n2)
    {
        if( n1 < n2 )
            System.out.println(n1+" less than "+n2);
        else if(n1 == n2)
            System.out.println(n1+" equal to "+n2);
        else
            System.out.println(n1+" greater than "+n2);
    }
}
/* if a method returns nothing, it cannot be called by if or insode S.o.p */