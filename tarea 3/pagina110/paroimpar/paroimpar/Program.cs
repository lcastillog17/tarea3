using System;

namespace paroimpar
{
    class Program
    {
        static void Main(string[] args)
        {
            int num;
            Console.WriteLine("ingrese un numero: ");
            num = Convert.ToInt32(Console.ReadLine());
            if (num % 2 == 0)
            {
                Console.WriteLine("es numero par ");
            }
            if (num % 2 != 0)
            {
                Console.WriteLine("es numero impar ");
            }
        }
    }
}
