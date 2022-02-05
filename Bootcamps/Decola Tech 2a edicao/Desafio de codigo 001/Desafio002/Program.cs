using System;

class DIO
{

    static void Main(string[] args)
    {

        int n = int.Parse(Console.ReadLine());
        for (int i = 1; i <= n; i++)
        {
            int b = 0;
            if (i % 2 == 0)
            {
                b = i * i;
                Console.WriteLine($"{i}^2 = {b}");
            }
        }

    }

}