using System;

class DIO
{

    static void Main(string[] args)
    {

        double c, S = 0;
        for (int i = 100; i >= 1; i--)
        {
            c = 1.0 / i;
            S += c;
        }
        var x = Math.Round(S, 2);
        Console.WriteLine(x);

    }

}