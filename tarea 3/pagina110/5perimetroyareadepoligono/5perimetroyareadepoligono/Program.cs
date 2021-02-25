using System;

namespace _5perimetroyareadepoligono
{
    class Program
    {
        static void Main(string[] args)
        {
            Double apotema, lados,perimetro, longi, area;
            int opcion;
            Console.WriteLine("eliga una opcion: ");
            Console.WriteLine("1. perimetro de un poligono regular: ");
            Console.WriteLine("2. area de un poligono regular: ");
            opcion = Convert.ToInt16(Console.ReadLine());
            switch (opcion) {
                case 1:
                    Console.WriteLine("ingrese el numero de lados del poligono regular: ");
                    lados = Convert.ToDouble(Console.ReadLine());
                    Console.WriteLine("ingrese el tamaño de lados del poligono regular: ");
                    longi = Convert.ToDouble(Console.ReadLine());
                    perimetro = lados * longi;
                    Console.WriteLine("el perimetro es: " + perimetro);
                    break;
                case 2:
                    Console.WriteLine("ingrese la medida del apotema del poligono regular: ");
                    apotema = Convert.ToDouble(Console.ReadLine());
                    Console.WriteLine("ingrese el numero de lados del poligono regular: ");
                    lados = Convert.ToDouble(Console.ReadLine());
                    Console.WriteLine("ingrese el tamaño de lados del poligono regular: ");
                    longi = Convert.ToDouble(Console.ReadLine());
                    perimetro = lados * longi;
                    area = (perimetro * apotema) / 2;
                    Console.WriteLine("el area es: "+area);
                    break;
            }
            
        }
    }
}
