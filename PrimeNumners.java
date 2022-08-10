// w.a.p to display all the prime numbers within 20

class PrimeNumers
{
    public static void main(String [] args)
    {
        int count = 0;
        for(int i = 1; i <= 20; i++)
        {
            for(int j = 1; j <= i; j++)
                if(i % j == 0)
                    count++;
            if(count == 2)
            {
                System.out.println(i);
                //count = 0;
            }
            count = 0;
        }
    }
}