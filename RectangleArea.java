// area of a rectangle

import java.util.Scanner;

class RectangleArea
{
    public static void main(String [] args)
    {
        float b = readLens(), h = readLens();
        // double h = readLens();
        areaOfRectangle(b, h);
    }

    public static float readLens()
    {
        Scanner sc = new Scanner(System.in);
        return sc.nextFloat();
    }

    public static void areaOfRectangle(float a, float b)
    {
        if(a == 0 | b == 0)
            System.out.println("invalid lengths, program terminated");
        else
            System.out.println(String.format("%.2f",0.5 * a * b ));
    }
}