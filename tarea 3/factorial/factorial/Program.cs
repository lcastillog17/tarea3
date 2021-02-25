using System;

namespace factorial
{
    class Program
    {
        static void Main(string[] args)
        {
            string val;
            int num;

            Console.Write("ingrese un numero: ");
            val = Console.ReadLine();
            num = Convert.ToInt32(val);

            Console.Write("\n" + num);

            for (int i = (num - 1); i >= 1; i--)
            {
                Console.Write($" X {i}");
            }

            for (int i = (num - 1); i >= 1; i--)
            {
                num *= i;
            }

            Console.WriteLine(" = " + num);
        }
    }
}
