using System;
using System.Threading;

namespace ejemplo_2_clase_6_poo
{
    class Program
    {
        
       static string Mid(string parametro, int startIndex, int length)
        {
            string result = parametro.Substring(startIndex, length); //guarda en la variable result los caracteres extraidos entre startindex y length
            return result;
        }
        static void Main(string[] args)
        {
            string nombre;
            string caracter;
            int K = 0;
            int posicion = 0;
            int ultimaletra = 0;
            int final = 0;
            Console.Write(" Ingrese su nombre ");
            nombre = Console.ReadLine();
            Console.SetCursorPosition(1, 12); // para poner el nombre ingresado en la parte del centro al lado izquierdo
            Console.Write(nombre); // escribe el nombre ingresado en la parte izquierda al centro 
            ultimaletra = nombre.Length; //agarra la ultima letra del nombre
            final  = 70; //tiene el valor de 70 para que lo lleve a la posicion de la columna donde la letra se va move al final
           nombre = nombre.ToUpper();//esta funcion toma un caracter y lo devuelve en mayusculs

            for (posicion = ultimaletra; posicion >= 1; posicion--)
            {
                caracter = Mid(nombre, posicion - 1, 1);
                for(K= ultimaletra; K<= final; K++)
                {
                    Console.SetCursorPosition(K, 12);
                    Console.Write(" " + caracter);
                    Thread.Sleep(50);
                }
                final = final - 1;
                ultimaletra = ultimaletra - 1;

            }
            Console.WriteLine();
        }
    }
}
