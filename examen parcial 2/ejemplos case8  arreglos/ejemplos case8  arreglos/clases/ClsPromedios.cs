using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ejemplos_case8__arreglos.clases
{
    class ClsPromedios : InterfacePromedios
    {
        public string[,] Clasificar_Alumnos(string[,] matriz)
        {
            int totalFilas = matriz.GetLength(0);
            int contador1 = 0, contador2 = 0, contador3 = 0;

            string[,] alumnosClasificados = new string[matriz.GetLength(0), 3];

            for (int fila = 1; fila < matriz.GetLength(0); fila++)
            {
                if (matriz[fila, 5].Trim().Equals("A")) {
                    alumnosClasificados[contador1, 0] = matriz[fila, 1];
                    contador1++;
                }
                if (matriz[fila, 5].Trim().Equals("B"))
                {
                    alumnosClasificados[contador2, 1] = matriz[fila, 1];
                    contador2++;
                }
                if (matriz[fila, 5].Trim().Equals("C"))
                {
                    alumnosClasificados[contador3, 2] = matriz[fila, 1];
                    contador3++;
                }
                
            }

            return alumnosClasificados;
        }

        public decimal promedios_general_seccion(string[,] matriz, string seccion)
        {
            decimal promedio, suma = 0,suma2=0;
            int totalFilas = matriz.GetLength(0);
            int a = 0;

            for (int fila = 1; fila < matriz.GetLength(0); fila++)
            {
                if (matriz[fila, 5].Trim().Equals(seccion))
                {
                    suma = Convert.ToInt32(matriz[fila, 2]) + Convert.ToInt32(matriz[fila, 3]) + Convert.ToInt32(matriz[fila, 4]);
                    suma2 = suma + suma2;
                    a++;
                }

            }
            promedio = suma2 / a;
            return Convert.ToDecimal(promedio);

        }

        public int promedios_por_parcial(string[,] matriz, int columna_parcial)
        {
          int suma = 0;
          decimal promedio;
            int totalFilas = matriz.GetLength(0);

           for(int fila=1; fila< matriz.GetLength(0); fila++)
            {
                suma = suma + Convert.ToInt32(matriz[fila,columna_parcial]);
            }
            promedio = suma / (matriz.GetLength(0) - 1);
            return Convert.ToInt32( promedio);
        }

        public decimal promedios_por_seccion(string[,] matriz, int columna_parcial, string seccion)
        {
            {
                
                decimal promedioA, sumaA = 0;
                int totalFilas = matriz.GetLength(0);
                int a = 0;

                for (int fila = 1; fila < matriz.GetLength(0); fila++)
                {
                    if (matriz[fila, 5].Trim().Equals(seccion)) { 
                    sumaA = sumaA + Convert.ToDecimal(matriz[fila, columna_parcial]);
                        a++;
                    }

                }
                    promedioA = sumaA / a;
                    return Convert.ToDecimal(promedioA);
                
            }
        }



        public string[,] sumatoria_general_por_alumno(string[,] matriz)
        {
            decimal suma = 0;
            int totalFilas = matriz.GetLength(0);
            int contador = 0;

            string[,] sumatoriageneral = new string[matriz.GetLength(0), 2];

            for (int fila = 1; fila < matriz.GetLength(0); fila++)
            {
                
                    suma = Convert.ToInt32(matriz[fila, 2]) + Convert.ToInt32(matriz[fila, 3]) + Convert.ToInt32(matriz[fila, 4]);
                sumatoriageneral[contador, 0] = matriz[fila,1];//aqui va el nombre del estudiante
                sumatoriageneral[contador, 1] = Convert.ToString(suma);//va la suma
                contador++;
            }
           
            return sumatoriageneral;
        }
    }
}
