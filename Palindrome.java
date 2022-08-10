// palindrome pgm

import java.util.Scanner;

class Palindrome
{
    public static void main(String [] args)
    {
        String s = readStr();
        if(isPalindrome(s))
            System.out.println(s+" is a palindrome");
        else
            System.out.println(s+" is a palindrome");
    }

    public static String readStr()
    {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    public static boolean isPalindrome(String s)
    {
        String rev = "";
        for(int i = s.length()-1; i >= 0; i--)
        {
            rev = rev + s.charAt(i);
        }
        return s.equalsIgnoreCase(rev);
    }
}


// equal is a method used to compare 2 strings: s.equals(rev).
// equalsIgnoreCase is a method used to ignore case-sensitive comparison.