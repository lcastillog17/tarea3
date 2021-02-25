using System;

namespace fibonacci
{
    class Program
    {
        static void Main(string[] args)
        {
                int num1, num2, num3, cant;
            string val;

            Console.Write("Ingrese la cantidad de números de Fibonacci que desea ver: ");
                val = Console.ReadLine();
                cant = Convert.ToInt32(val);

                num1 = 0;
                num2 = 1;

                Console.WriteLine("0");

                for (int i = 1; i < cant; i++)
                {
                    num3 = num1;
                    num1 = num2;
                    num2 = num3 + num1;
                    Console.WriteLine(num1);
                }

            }
        }
    }
               