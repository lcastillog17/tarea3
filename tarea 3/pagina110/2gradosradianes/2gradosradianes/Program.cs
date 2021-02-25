using System;

namespace _2gradosradianes
{
    class Program
    {
        static void Main(string[] args)
        {
            int opcion;
            Double grados, radianes, grad, rad;
            Console.WriteLine("eliga una opción: ");
            Console.WriteLine("1. grados a radianes: ");
            Console.WriteLine("2. radianes a grados: ");
            opcion =Convert.ToInt32(Console.ReadLine());
            switch (opcion)
            {
                case 1:
                    Console.WriteLine("ingrese los grados: ");
                    grados =Convert.ToDouble(Console.ReadLine());
                    radianes = (grados * 0.0174533);
                    Console.WriteLine("los radianes equivalentes a los grados ingresados son: "+radianes);
                    break;
                case 2:
                    Console.WriteLine("ingrese los radianes: ");
                    rad = Convert.ToDouble(Console.ReadLine());
                    grad = ( rad * 57.2958);
                    Console.WriteLine("los grados equivalentes a los radianes ingresados son: " + grad);
                    break;
            }
        }
    }
}
