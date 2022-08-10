// write a pgm to find greatest of 4 nums

import java.util.Scanner;

class Greatest4Numers
{
    public static void main(String [] args)
    {
        readNums();
    }
    public static void readNums()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 4 numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        String s = findGreatestNumbers(a,b,c,d);
        System.out.println(s);
        sc.close();
    }

    public static String findGreatestNumbers(int a, int b, int c, int d)
    {
        /*if(a == b && b == c && c == d)
            System.out.printn("a = b = c = d");
        else
        {
            if(a > b && a > c && a > d)
                System.out.println("a is greater");
        }*/

        if(a > b && a > c && a > d)
            return "a is greater";
        else if(b > a && b > c && b > d)
            return "b is greater";
        else if(c > a && c > b && c > d);
            return "c is greater";
    }
}