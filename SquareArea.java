//pgm to find the area of a square 

import java.util.Scanner;

class SquareArea
{
    public static void main(String [] args)
    {
        float a = readNums();
        areaOfSquare(a);
    }

    public static float readNums()
    {
        Scanner sc = new Scanner(System.in);
        return sc.nextFloat();
    }

    public static void areaOfSquare(float a)
    {
        if(a == 0 | a < 0)
            System.out.println("invalid lengths for a square");
        else
            System.out.println(String.format("%.2f", a * a));

    }
}