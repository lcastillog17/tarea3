using System;

namespace _5promedad
{
    class Program
    {
        static void Main(string[] args)
        {
            int personas,edad,cont=0;
            Double prom, menor=200, mayor=0;
            Console.WriteLine("cuantas personas ingresará? ");
            personas = Convert.ToInt16(Console.ReadLine());
            for(int i=1; i<=personas; i++)
            {
                Console.WriteLine("Ingrese la edad de la persona "+i);
                edad = Convert.ToInt16(Console.ReadLine());
                cont = edad + cont;
                if (edad > mayor)
                {
                    mayor = edad;
                }
                if (edad < menor)
                {
                    menor = edad;
                }
            }
            prom = cont / personas;
            Console.WriteLine("El promedio de las edades es: " + prom);
            Console.WriteLine("La edad mas grande es: " + mayor);
            Console.WriteLine("La edad mas pequeña es: " + menor);

        }
    }
}
