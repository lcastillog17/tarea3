using System;

namespace _4numprimos
{
    class Program
    {
        static void Main(string[] args)
        {
            int a=1,cont=0 ;
            for (int i = 2; i <= 1000; i++)
            {
                cont = 0;
                for (a=1; a<=i; a++) { 
                if (i%a==0)
                {
                cont++;
                }
                }
                if (cont <= 2)
                {
                    Console.WriteLine("el numero: "+i+"es primo");
                }
            }
        }
    }
}
