// greatest of 2 nums.

import java.util.Scanner;

class Great2Nums
{
    public static void main(String [] args)
    {
        int a = readNums(), b = readNums();
        findGreatest(a, b);
    }

    public static int readNums()
    {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
    
    public static void findGreatest(int a, int b)
    {
        if(a >= b)
            if(a > b)
                System.out.println(a+" is greater");
            else
                System.out.println(a+" is equal to "+b);
        else
            System.out.println(b+" is greater");
    }
}