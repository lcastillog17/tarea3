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
    public partial class Form2 : Form
    {
        private string[] ArregloNotas;
       
        public Form2()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            int contador = 0;

            string[,] ArregloDosDimensiones = new string[ArregloNotas.Length - 0, 6];
             foreach (string linea in ArregloNotas)
             {
                 string[] datos = linea.Split(';');

             ArregloDosDimensiones[contador, 0] = datos[0];
             ArregloDosDimensiones[contador, 1] = datos[1];
              ArregloDosDimensiones[contador, 2] = datos[2];
             ArregloDosDimensiones[contador, 3] = datos[3];
             ArregloDosDimensiones[contador, 4] = datos[4];
              ArregloDosDimensiones[contador, 5] = datos[5];
                contador++;
            }
           ClsPromedios prome = new ClsPromedios();
            decimal promedio1 =  prome.promedios_por_parcial(ArregloDosDimensiones,2);
            labelProm1.Text = Convert.ToString(promedio1);
            decimal promedio2 = prome.promedios_por_parcial(ArregloDosDimensiones, 3);
            labelProm2.Text = Convert.ToString(promedio2);
            decimal promedio3 = prome.promedios_por_parcial(ArregloDosDimensiones, 4);
            labelProm3.Text = Convert.ToString(promedio3);
        }

        private void buttonCargar_Click_1(object sender, EventArgs e)
        {
            ClsArchivos ar = new ClsArchivos();
            OpenFileDialog ofd = new OpenFileDialog();
            ofd.Title = "Selecciona tu archivo plano ";
            ofd.InitialDirectory = @"C:\Users\linda\Desktop\umg linda daniela\semestre 3\progra 1\clase 8 arreglos\archivoplanos.csv";
            ofd.Filter = "archivoplanos(*.csv)|*.csv";

            if (ofd.ShowDialog() == DialogResult.OK)
            {
                var archivo = ofd.FileName; //devuelve el nombre y el lugar del archivo
                string resultado = ar.LeerTodoArchivo(archivo);

                ArregloNotas = ar.LeerArchivo(archivo); //retorna arreglo

                textBoxContenido.Text = resultado;
            }

        }

        private void labelProm3_Click(object sender, EventArgs e)
        {

        }

        private void labelProm1_Click(object sender, EventArgs e)
        {

        }

        private void labelProm2_Click(object sender, EventArgs e)
        {

        }

        private void buttonPromA_Click(object sender, EventArgs e)
        {
            int contador = 0;

            string[,] ArregloDosDimensiones = new string[ArregloNotas.Length - 0, 6];
            foreach (string linea in ArregloNotas)
            {
                string[] datos = linea.Split(';');

                ArregloDosDimensiones[contador, 0] = datos[0];
                ArregloDosDimensiones[contador, 1] = datos[1];
                ArregloDosDimensiones[contador, 2] = datos[2];
                ArregloDosDimensiones[contador, 3] = datos[3];
                ArregloDosDimensiones[contador, 4] = datos[4];
                ArregloDosDimensiones[contador, 5] = datos[5];
                contador++;
            }
            ClsPromedios prom = new ClsPromedios();
            decimal promedio1A = prom.promedios_por_seccion(ArregloDosDimensiones, 2, "A");
            labelProm1Seccion.Text = Convert.ToString(Math.Round(promedio1A, 2));
            decimal promedio2A = prom.promedios_por_seccion(ArregloDosDimensiones, 3, "A");
            labelProm2Seccion.Text = Convert.ToString(promedio2A);
            decimal promedio3A = prom.promedios_por_seccion(ArregloDosDimensiones, 4, "A");
            labelProm3Seccion.Text = Convert.ToString(promedio3A);
            
        }

        private void buttonPromB_Click(object sender, EventArgs e)
        {
            int contador = 0;

            string[,] ArregloDosDimensiones = new string[ArregloNotas.Length - 0, 6];
            foreach (string linea in ArregloNotas)
            {
                string[] datos = linea.Split(';');

                ArregloDosDimensiones[contador, 0] = datos[0];
                ArregloDosDimensiones[contador, 1] = datos[1];
                ArregloDosDimensiones[contador, 2] = datos[2];
                ArregloDosDimensiones[contador, 3] = datos[3];
                ArregloDosDimensiones[contador, 4] = datos[4];
                ArregloDosDimensiones[contador, 5] = datos[5];
                contador++;
            }
            ClsPromedios prom = new ClsPromedios();
            decimal promedio1A = prom.promedios_por_seccion(ArregloDosDimensiones, 2, "B");
            labelProm1Seccion.Text = Convert.ToString(Math.Round(promedio1A, 2));
            decimal promedio2A = prom.promedios_por_seccion(ArregloDosDimensiones, 3, "B");
            labelProm2Seccion.Text = Convert.ToString(Math.Round(promedio2A, 2));
            decimal promedio3A = prom.promedios_por_seccion(ArregloDosDimensiones, 4, "B");
            labelProm3Seccion.Text = Convert.ToString(Math.Round(promedio3A, 2));
        }

        private void buttonPromC_Click(object sender, EventArgs e)
        {
            int contador = 0;

            string[,] ArregloDosDimensiones = new string[ArregloNotas.Length - 0, 6];
            foreach (string linea in ArregloNotas)
            {
                string[] datos = linea.Split(';');

                ArregloDosDimensiones[contador, 0] = datos[0];
                ArregloDosDimensiones[contador, 1] = datos[1];
                ArregloDosDimensiones[contador, 2] = datos[2];
                ArregloDosDimensiones[contador, 3] = datos[3];
                ArregloDosDimensiones[contador, 4] = datos[4];
                ArregloDosDimensiones[contador, 5] = datos[5];
                contador++;
            }
            ClsPromedios prom = new ClsPromedios();
            decimal promedio1A = prom.promedios_por_seccion(ArregloDosDimensiones, 2, "C");
            labelProm1Seccion.Text = Convert.ToString(Math.Round(promedio1A, 2));
            decimal promedio2A = prom.promedios_por_seccion(ArregloDosDimensiones, 3, "C");
            labelProm2Seccion.Text = Convert.ToString(Math.Round(promedio2A, 2));
            decimal promedio3A = prom.promedios_por_seccion(ArregloDosDimensiones, 4, "C");
            labelProm3Seccion.Text = Convert.ToString(Math.Round(promedio3A, 2));
        }

        private void buttonSumaAlumnos_Click(object sender, EventArgs e)
        {
            int contador = 0;

            string[,] ArregloDosDimensiones = new string[ArregloNotas.Length - 0, 6];
            foreach (string linea in ArregloNotas)
            {
                string[] datos = linea.Split(';');

                ArregloDosDimensiones[contador, 0] = datos[0];
                ArregloDosDimensiones[contador, 1] = datos[1];
                ArregloDosDimensiones[contador, 2] = datos[2];
                ArregloDosDimensiones[contador, 3] = datos[3];
                ArregloDosDimensiones[contador, 4] = datos[4];
                ArregloDosDimensiones[contador, 5] = datos[5];
                contador++;
            }
            ClsPromedios sumas = new ClsPromedios();
            string[,] sumatoria = sumas.sumatoria_general_por_alumno(ArregloDosDimensiones);
            for(int i=0;i<ArregloNotas.Length-1;i++) {
                listBox1.Items.Add(sumatoria[i,0] + " - " + sumatoria[i, 1]);
            }
        }

        private void buttonPromSeccion_Click(object sender, EventArgs e)
        {
            int contador = 0;

            string[,] ArregloDosDimensiones = new string[ArregloNotas.Length - 0, 6];
            foreach (string linea in ArregloNotas)
            {
                string[] datos = linea.Split(';');

                ArregloDosDimensiones[contador, 0] = datos[0];
                ArregloDosDimensiones[contador, 1] = datos[1];
                ArregloDosDimensiones[contador, 2] = datos[2];
                ArregloDosDimensiones[contador, 3] = datos[3];
                ArregloDosDimensiones[contador, 4] = datos[4];
                ArregloDosDimensiones[contador, 5] = datos[5];
                contador++;
            }
            ClsPromedios promg = new ClsPromedios();
            decimal promedioA = promg.promedios_general_seccion(ArregloDosDimensiones, "A");
            labelPromSeccionA.Text = Convert.ToString(Math.Round(promedioA, 2));
            decimal promedioB = promg.promedios_general_seccion(ArregloDosDimensiones, "B");
            labelPromSeccionB.Text = Convert.ToString(Math.Round(promedioB, 2));
            decimal promedioC = promg.promedios_general_seccion(ArregloDosDimensiones, "C");
            labelPromSeccionC.Text = Convert.ToString(Math.Round(promedioC, 2));
        }

        private void Form2_Load(object sender, EventArgs e)
        {

        }

        private void buttonAlumSeccion_Click(object sender, EventArgs e)
        {
            int contador = 0;

            string[,] ArregloDosDimensiones = new string[ArregloNotas.Length - 0, 6];
            foreach (string linea in ArregloNotas)
            {
                string[] datos = linea.Split(';');

                ArregloDosDimensiones[contador, 0] = datos[0];
                ArregloDosDimensiones[contador, 1] = datos[1];
                ArregloDosDimensiones[contador, 2] = datos[2];
                ArregloDosDimensiones[contador, 3] = datos[3];
                ArregloDosDimensiones[contador, 4] = datos[4];
                ArregloDosDimensiones[contador, 5] = datos[5];
                contador++;
            }
            ClsPromedios clasificar = new ClsPromedios();
            string[,] clasificados = clasificar.Clasificar_Alumnos(ArregloDosDimensiones);
            for (int i = 0; i < (ArregloNotas.Length - 1) / 3; i++)
            {
                listBox2.Items.Add("  " + clasificados[i, 0]  + "--------------" + clasificados[i, 1]+ " -------------- " + clasificados[i, 2]);
            }
        }

        private void label11_Click(object sender, EventArgs e)
        {

        }
    }
}
