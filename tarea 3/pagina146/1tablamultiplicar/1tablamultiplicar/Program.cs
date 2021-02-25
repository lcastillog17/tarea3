using System;

namespace _1tablamultiplicar
{
    class Program
    {
        static void Main(string[] args)
        {
          int num,multi;
            Console.WriteLine("Ingrese un numero: ");
            num = Convert.ToInt16(Console.ReadLine());
            Console.WriteLine("TABLA DEL: " + num);
            for (int i=1; i<=10; i++) {
                multi = i * num;
                Console.WriteLine(i + " * " + num+" = "+multi);

            }
        }
    }
}
