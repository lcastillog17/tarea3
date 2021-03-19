using System;
using System.Threading;

namespace ejemplo3_clase_6_poo
{
    
    class Program
    {
        public static string valor(int min, int max)
        {
            Random rango = new Random(); //se crea la variable rango de tipo random
            string resul =" ";//la variable resul devolvera el caracter de tipo random
            int numero = Convert.ToInt32(rango.Next(97, 122));//se crea la varible numero para que convierta la variable rango en entero y agarre un numero entre ese rango
            if ((numero > min) & (numero < max))//si la variable numero no está entre la variable max y min no entra 
            {
                resul = Convert.ToString((char)numero); //en resul guarda la variable numero convertida a char
            }
            return resul;//retorna a resul
        }
        static void Main(string[] args)
        {
            byte cant, K;
            string num;//guarda el numero que ingrese el usuario
            Console.Write("ingrese un numero: ");
            num = Console.ReadLine();
            cant = byte.Parse(num);//convierte el numero ingresado por el usuario de tipo string a byte
            string letras = ""; //guardar los caracteres random
            for (K = 1; K <= cant; K++)//Inicio de Ciclo
            {
               letras =valor(97, 122);//guarda el caracter
                Console.WriteLine( $"las letras generadas son= {letras}"); //muerstra el caracter
            }
        }
    }
}
