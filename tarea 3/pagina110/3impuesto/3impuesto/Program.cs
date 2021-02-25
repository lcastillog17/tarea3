using System;

namespace _3impuesto
{
    class Program
    {
        static void Main(string[] args)
        {
            string producto;
            Double gasto, imp;
            Console.WriteLine("ingrese el producto (si es medicina, no tiene impuesto) ");
            producto = Console.ReadLine();
            Console.WriteLine("ingrese lo que gasto: ");
            gasto = Convert.ToDouble(Console.ReadLine());
            if (producto=="medicina" || producto == "Medicina") {
                Console.WriteLine("el impuesto es 0 ");
                Console.WriteLine("debe pagar "+ gasto);
            }
            else
            {
                imp = gasto * 0.12;
                Console.WriteLine("el impuesto es de: "+ imp);
                Console.WriteLine("debe pagar " + (gasto+imp));
            }
        }
    }
}
