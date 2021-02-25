using System;

namespace _2numelevado
{
    class Program
    {
        static void Main(string[] args)
        {
            Double num, elev,resu=1;
            Console.WriteLine("ingrese el numero que desea elevar ");
            num = Convert.ToDouble(Console.ReadLine());
            Console.WriteLine("ingrese la potencia a la que elevará el numero: ");
            elev = Convert.ToDouble(Console.ReadLine());
            for (int i=1; i<=elev; i++)
            {
                resu = resu * num;
            }
            Console.WriteLine(num + " elevado a "+ elev +" = "+resu);
        }
    }
}
