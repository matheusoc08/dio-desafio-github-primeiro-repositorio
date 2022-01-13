using System;

class DIO
{

    static void Main(string[] args)
    {

        int x = int.Parse(Console.ReadLine());
        bool o = false;

        while (o == false)
        {
            x++;
            if (x % 2 == 0)
            {
                System.Console.WriteLine(x);
                o = true;
            }
        }

    }

}