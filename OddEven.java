//pgm to find odd or even

import java.util.Scanner;

class OddEven
{
    public static void main(String [] args){
        int num = readNum();

        if(isOddEven(num))
            System.out.println(num+" is even");
        else
            System.out.println(num+" is odd");
    }

    public static int readNum()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        sc.close();
        return sc.nextInt();
    }

    public static boolean isOddEven(int num)
    {
        /*if(num % 2 ==0)
            return true;
        else
            return false; */

            /*return num % 2 == 0? true:false;*/

            /*return num % 2 == 0;*/

            return (num & 1) == 0; // didnt understand this line.
    }
}