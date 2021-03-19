using System;
using System.Threading;

namespace clase_6_poo_thread.sleep
{
    class Program
    {
        public static void dibuja (int Cantidad) //cantidad es el nombre de la funcion que está abajo donde se declara como tam
        {
            int colum = 22;
            int fila = 77;
            int margarriba = 2;
            int margizquierdo = 2;
            int F, C, A;

            for (A = 1; A <= Cantidad; A++)  //este for es para cada uno de los rectangulos//cantidad es igual a 1 y menor a nueve, por lo cual se repetirá 8 veces 
            {
                for (F = margizquierdo; F <= fila; F++)// este for es para las filas //F vale 2 y va llegar hasta 77 que es la cant de signos que habrán en la fila
                {
                    Console.SetCursorPosition(F, colum); Console.Write("l"); //filas de la parte de abajo del rectangulo
                    Console.SetCursorPosition(F, margarriba); Console.Write("?"); //filas de la parte de arriba del rectangulo
                }
                for (C = margarriba; C <= colum; C++) // este for es para las columnas
                {
                    Console.SetCursorPosition(margizquierdo, C); Console.Write("c"); //columnas lado izquierdo
                    Console.SetCursorPosition(fila, C); Console.Write("X"); //columnas lado derecho
                }
                margarriba = margarriba + 1;
                colum = colum - 1;
                margizquierdo = margizquierdo + 1;
                fila = fila - 1;
            }//for principal
         

        }
static void Main(string[] args)
        {
            for (int tam = 1; tam<9; tam++)
            {
                dibuja(tam);
                Thread.Sleep(1000);
            }
            Console.SetCursorPosition(25, 24);
            Console.Write("Pulse una tecla ");
        }
    }//end class
}
