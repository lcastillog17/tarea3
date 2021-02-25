using System;

namespace _4diadelasemana
{
    class Program
    {
        static void Main(string[] args)
        {
            int num;
            Console.WriteLine("ingrese un numero del 1 al 7: ");
            num = Convert.ToInt16(Console.ReadLine());
            switch (num) {
                case 1:
                    Console.WriteLine("Lunes ");
                    break;
                case 2:
                    Console.WriteLine("Martes ");
                    break;
                case 3:
                    Console.WriteLine("Miercoles ");
                    break;
                case 4:
                    Console.WriteLine("Jueves ");
                    break;
                case 5:
                    Console.WriteLine("Viernes ");
                    break;
                case 6:
                    Console.WriteLine("Sabado ");
                    break;
                case 7:
                    Console.WriteLine("Domingo ");
                    break;
            }
        }
    }
}
