using ejemplos_case8__arreglos.clases;
using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace ejemplos_case8__arreglos
{
    public partial class Form1 : Form
    {

        private string[] ArregloNotas;
        public Form1()
        {
            InitializeComponent();
        }

        private void buttonArreglo_Click(object sender, EventArgs e)
        {
            int[] arreglo = new int[5]; //creando el arreglo
            arreglo[0] = 10;//asignando valor a la posicion 0 del arreglo
            arreglo[1] = 8;
            arreglo[2] = 16;
            arreglo[3] = 36;
            arreglo[4] = 1;

            ClsArreglos ObjArreglo = new ClsArreglos(arreglo);
            int[] resultado = ObjArreglo.MetodoBurbuja();

            for(int indice=0;indice<resultado.Length; indice++)//esta diciendo que vaya de 0 hasta la ultima posicion del arreglo o vector
            {
                //  listBoxResultado.Items.Add(arreglo[indice]);
                listBoxResultado.Items.Add($"valor= {resultado[indice]} posicion={indice} ");

 }

            //podemos usar un for o un foreach y es lo mismo

           // foreach(int r in arreglo)//estamos diciendo que interactue r en arreglo que es el nombre del vector y el int es porque el vector es tipo int
            //{
             //   listBoxResultado.Items.Add(arreglo[indice]);
            //}

                    }

        private void buttonCargar_Click(object sender, EventArgs e)
        {
            ClsArchivos ar = new ClsArchivos();
            OpenFileDialog ofd = new OpenFileDialog();
            ofd.Title = "Selecciona tu archivo plano ";
            ofd.InitialDirectory = @"C:\Users\linda\Desktop\umg linda daniela\semestre 3\progra 1\clase 8 arreglos\archivoplanos.csv";
            ofd.Filter = "archivoplanos(*.csv)|*.csv";

            if (ofd.ShowDialog()== DialogResult.OK)
            {
                var archivo = ofd.FileName; //devuelve el nombre y el lugar del archivo
                string resultado = ar.LeerTodoArchivo(archivo);

               ArregloNotas = ar.LeerArchivo(archivo); //retorna arreglo

                textBoxContenido.Text = resultado;
            }

        }

        private void buttonNombres_Click(object sender, EventArgs e)
        {
            int contador = 0;
            string[] nombres= new string[ArregloNotas.Length - 1];
            foreach (string linea in ArregloNotas)
            {
                if (contador != 0)
                {
                    string[] datos = linea.Split(';'); //devuelve una posicion arreglo por cada punto y cma que divida los nombres
                    nombres[contador - 1] = datos[1];
                }       
            
                contador++;
        }
            ClsArreglos arreglonombres = new ClsArreglos(nombres);
            string[] resultados = arreglonombres.MetodoBurbujaNombres();
            for (int indice = 0; indice < resultados.Length; indice++)//esta diciendo que vaya de 0 hasta la ultima posicion del arreglo o vector
            {
                listBoxNombres.Items.Add(resultados[indice]); //devuelve la posicion uno del arreglo datos que es el nombre
            }
        }

        private void listBox1_SelectedIndexChanged(object sender, EventArgs e)
        {

        }

        private void Form1_Load(object sender, EventArgs e)
        {

        }

        private void Promparcial1_Click(object sender, EventArgs e)
        {
            int contador = 0,suma=0;
            Decimal  promedio1;
            string[] notas1 = new string[ArregloNotas.Length - 1];
            foreach (string linea in ArregloNotas)
            {
                if (contador != 0)
                {
                    string[] datos = linea.Split(';'); //devuelve una posicion arreglo por cada punto y cma que divida los nombres
                    //al empezar el for agarra la segunda fila 
                    notas1[contador - 1] = datos[2];
                    suma = Convert.ToInt32(notas1[contador-1])+suma;

                }
                contador++;
            }
            promedio1 = suma / Convert.ToDecimal(notas1.Length);
            labelParcial1.Text = Convert.ToString(Math.Round(promedio1,2));

        }

        private void Promparcial2_Click(object sender, EventArgs e)
        {
            int contador = 0, suma = 0;
            Decimal promedio2;
            string[] notas2 = new string[ArregloNotas.Length - 1];
            foreach (string linea in ArregloNotas)
            {
                if (contador != 0)
                {
                    string[] datos = linea.Split(';'); //devuelve una posicion arreglo por cada punto y cma que divida los nombres
                    //al empezar el for agarra la segunda fila 
                    notas2[contador - 1] = datos[3];
                    suma = Convert.ToInt32(notas2[contador - 1]) + suma;

                }
                contador++;
            }
            promedio2 = suma / Convert.ToDecimal(notas2.Length);
            labelParcial2.Text = Convert.ToString(Math.Round(promedio2,2));

        

    }

        private void Promparcial3_Click(object sender, EventArgs e)
        {
            int contador = 0, suma = 0;
            Decimal promedio3;
            string[] notas3 = new string[ArregloNotas.Length - 1];
            foreach (string linea in ArregloNotas)
            {
                if (contador != 0)
                {
                    string[] datos = linea.Split(';'); //devuelve una posicion arreglo por cada punto y cma que divida los nombres
                    //al empezar el for agarra la segunda fila 
                    notas3[contador - 1] = datos[4];
                    suma = Convert.ToInt32(notas3[contador - 1]) + suma;

                }
                contador++;
            }
            promedio3 = suma / Convert.ToDecimal(notas3.Length);
            labelParcial3.Text = Convert.ToString(Math.Round(promedio3,2));

        
    }

        private void PromAlumno_Click(object sender, EventArgs e)
        {
            int contador = 0;
            string nombre;
            decimal promediogen, suma = 0;
            string[] notas1 = new string[ArregloNotas.Length - 1];
            string[] notas2 = new string[ArregloNotas.Length - 1];
            string[] notas3 = new string[ArregloNotas.Length - 1];
            foreach (string linea in ArregloNotas)
            {
                if (contador != 0)
                {
                    string[] datos = linea.Split(';'); //devuelve una posicion arreglo por cada punto y cma que divida los nombres
                    notas1[contador - 1] = datos[2];
                    notas2[contador - 1] = datos[3];
                    notas3[contador - 1] = datos[4];
                    suma = (Convert.ToDecimal(notas1[contador - 1])) + (Convert.ToDecimal(notas2[contador - 1])) + (Convert.ToDecimal(notas3[contador - 1]));
                    promediogen = suma / 3;
                    listBoxProm.Items.Add(Math.Round(promediogen,2));
                }

                contador++;
            }
            
            

        }

        private void listBoxProm_SelectedIndexChanged(object sender, EventArgs e)
        {

        }

        private void MayorNota_Click(object sender, EventArgs e)
        {
            int contador = 0;
            string nombre="";
            string[] nom= new string[ArregloNotas.Length - 1];
            Decimal suma=0, contenedor=0, mayor=0;
            Decimal[] notas = new decimal[ArregloNotas.Length - 1]; ;
            string[] notas1 = new string[ArregloNotas.Length - 1];
            string[] notas2 = new string[ArregloNotas.Length - 1];
            string[] notas3 = new string[ArregloNotas.Length - 1];
            foreach (string linea in ArregloNotas)
            {
                if (contador != 0)
                {
                    string[] datos = linea.Split(';'); //devuelve una posicion arreglo por cada punto y cma que divida los nombres
                    nom[contador - 1] = datos[1];
                    notas1[contador - 1] = datos[2];
                    notas2[contador - 1] = datos[3];
                    notas3[contador - 1] = datos[4];
                    suma = (Convert.ToDecimal(notas1[contador - 1])) + (Convert.ToDecimal(notas2[contador - 1])) + (Convert.ToDecimal(notas3[contador - 1]));
                    
                    notas[contador - 1] = suma;
                    if (notas[contador-1]>contenedor)
                    {
                        mayor = notas[contador - 1];
                        nombre=nom[contador - 1];
                        contenedor = notas[contador - 1];
                    }
                    
                }
              contador++;
            }
            labelNotaMayor.Text = Convert.ToString(mayor);
            labelNomMayor.Text = nombre;
        }

        private void MenorNota_Click(object sender, EventArgs e)
        {
            int contador = 0;
            string nombre = "";
            string[] nom = new string[ArregloNotas.Length - 1];
            Decimal suma = 0, contenedor = 1000000, menor = 0;
            Decimal[] notas = new decimal[ArregloNotas.Length - 1]; ;
            string[] notas1 = new string[ArregloNotas.Length - 1];
            string[] notas2 = new string[ArregloNotas.Length - 1];
            string[] notas3 = new string[ArregloNotas.Length - 1];
            foreach (string linea in ArregloNotas)
            {
                if (contador != 0)
                {
                    string[] datos = linea.Split(';'); //devuelve una posicion arreglo por cada punto y cma que divida los nombres
                    nom[contador - 1] = datos[1];
                    notas1[contador - 1] = datos[2];
                    notas2[contador - 1] = datos[3];
                    notas3[contador - 1] = datos[4];
                    suma = (Convert.ToDecimal(notas1[contador - 1])) + (Convert.ToDecimal(notas2[contador - 1])) + (Convert.ToDecimal(notas3[contador - 1]));

                    notas[contador - 1] = suma;
                    if (notas[contador - 1] < contenedor)
                    {
                        menor = notas[contador - 1];
                        nombre = nom[contador - 1];
                        contenedor = notas[contador - 1];
                    }

                }
                contador++;
            }
            labelNotaMenor.Text = Convert.ToString(menor);
            labelNomMenor.Text = nombre;
        }
    }
    }

