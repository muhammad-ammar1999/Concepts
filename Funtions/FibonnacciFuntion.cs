using System;

namespace ConsoleApplicationTask
{
    class program
    {
        public static void FibonacciSeries(long FirstNumber, long SecondNumber, long Range)
        {
            long Sum = 0;
            Console.Write("{0},   ", Sum);
            for (int i = 0; i < Range; i++)
            {
                FirstNumber = SecondNumber;
                SecondNumber = Sum;

                Sum = FirstNumber + SecondNumber;
                Console.Write("{0},   ", Sum);
            }

        }

        public static void Main()
        {
            long FirstNumber = 0, SecondNumber = 1;
            Console.WriteLine("inter your range for FS");
            long Range = int.Parse(Console.ReadLine());

            FibonacciSeries(FirstNumber, SecondNumber, Range);
        }
    }
}
