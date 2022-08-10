//pgm to find odd or even

import java.util.Scanner;

class OddOrEven
{
    public static void main(String [] args)
    {
        float a = readNum();
        oddEven(a);
    }

    public static float readNum()
    {
        Scanner sc = new Scanner(System.in);
        return sc.nextFloat();
    }

    public static void oddEven(float a)
    {
        if( a % 2 == 0 )
            System.out.println(a+" is even");
        else
            System.out.println(a+" is odd");
    }
}