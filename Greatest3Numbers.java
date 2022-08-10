// pgm to find greatest of 3 numbers.

import java.util.Scanner;

class Greatest3Numbers
{
    public static void main(String [] args)
    {
        readNums();
    }
    
    public static void readNums()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a 3 numbers: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        System.out.println("\n");
        String s = findBiggest(n1, n2, n3);
        System.out.println(s);
        sc.close();
    }
    
    public static String findBiggest(int n1, int n2, int n3)
    {
        if( n1 > n2 )
        {
            if(n1 > n3)
                System.out.println(n1+" is greater than "+n2+", "+n3);
                //return n1+" is greater than "+n2+", "+n3;
            else
                System.out.println(n3+" is greater than "+n1+", "+n2);
                return n3+" is greater than "+n1+", "+n2;
        }
        else
        {
            if(n2 > n3)
                //System.out.println(n2+" is greater than "+n1+", "+n3);
                return n2+" is greater than "+n1+", "+n3;
            else
                //System.out.println(n3+" is greater than  "+n1+", "+n2);
                return n3+" is greater than  "+n1+", "+n2;
        }
        /*if(n1 == n2 && n2 == n3)
            //System.out.println("n1 = n2 = n3");
            return "n1 = n2 = n3";
        else if(n1 >= n2 & n1 >= n3)
        {
            if(n1 == n2)
                //System.out.println("n1 = n2, but greater than n3");
                return "n1 = n2, but greater than n3";
            else if(n1 == n3)
                //System.out.println("n1 = n3, but greater than n2");
                return "n1 = n3, but greater than n2";
            else
                //System.out.println("n1 is greater than n2 and n3");
                return "n1 is greater than n2 and n3";
        }
        else if(n2 >= n1 && n2 >= n3)
        {
            if(n2 == n1)
                //System.out.println("n1 = n2 but greater than n3");
                return "n1 = n2 but greater than n3";
            else if(n2 == n3)
                //System.out.println("n2 = n3, but greater than n1");
                return "n2 = n3, but greater than n1";
            else
                //System.out.println("n2 is greater than n1 and n3");
                return "n2 is greater than n1 and n3";
        }
        else
            //System.out.println("n3 is greater than n1 and n2");
            return "n3 is greater than n1 and n2"; */
    }
}
/* if a method returns nothing, it cannot be called by if or inside S.o.p */
