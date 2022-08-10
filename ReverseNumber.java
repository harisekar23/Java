//reverse a number 

import java.util.Scanner;

class ReverseNumber
{
    public static void main(String [] args)
    {
        int n = readNums();
        if(isPalindrome(n))
            System.out.println(n+" is a palindrome");
        else
            System.out.println(n+" is not a palindrome");
    }

    public static int readNums()
    {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public static boolean isPalindrome(int a)
    {
        int rem, rev = 0, temp = a;
        while(a > 0){
            rem = a % 10;
            rev = rev * 10 + rem;
            a /= 10;
        }
        return rev == temp;
    }
}