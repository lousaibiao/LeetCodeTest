using System;

namespace Problem190CSharp
{
    class Program
    {
        static void Main (string[] args)
        {
            uint n = 43261596;
            Console.WriteLine(reverseBits(n));
            n = 4294967293;
            System.Console.WriteLine(reverseBits(n));
            // Console.WriteLine ("Hello World!");
            //3221225471
            //3221225471
        }

        public static uint reverseBits (uint n)
        {
            uint factor = 0;
            uint max = (uint) Math.Pow (2, 31);
            uint value = 0;
            while (n != 0)
            {
                factor = n % 2;
                if (factor != 0)
                {
                    value += max * factor;
                }
                n /= 2;
                max /= 2;
            }
            return value;
        }
    }
}