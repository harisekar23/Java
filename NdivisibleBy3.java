// write a program to print the numbers which are divisible by 3 from the range of 1 to 50

class NdivisibleBy3
{
    public static void main(String [] agrs)
    {
        for (int i = 1; i <= 50; i++)
            if(i % 3 == 0)
                System.out.println(i);
    }
}