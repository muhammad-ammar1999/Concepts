using System;

namespace ConsoleApplicationTask
{
    class program
    {
        public static void FS(long FirstNumber, long SecondNumber, long Range, int Counter, long Sum)
        {

            if (Counter < Range)
            {
                Counter++;
                FirstNumber = SecondNumber;
                SecondNumber = Sum;

                Sum = FirstNumber + SecondNumber;
                Console.Write("{0},   ", Sum);
                FS(FirstNumber, SecondNumber, Range, Counter, Sum);
            }
            return;

        }

        public static void Main()
        {
            int Counter = 0;
            long Sum = 0, FirstNumber = 0, SecondNumber = 1;


            Console.WriteLine("inter your range for FS");
            long Range = int.Parse(Console.ReadLine());
            Console.Write("{0},   ", Sum);
            FS(FirstNumber, SecondNumber, Range, Counter, Sum);
        }
    }
}
