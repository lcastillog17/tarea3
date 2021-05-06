using basededatosbueno.Clases.BasedeDatos;
using MySql.Data.MySqlClient;
using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace basededatosbueno
{
    public partial class Form1 : Form
    {
       // private string sqll;
        //private MySqlConnection conexion;
        private string[] VectorAlumnos;

        public Form1()
        {
            InitializeComponent();
        }

        private void btnSql_Click(object sender, EventArgs e)
        {

            ClsArchivos ar = new ClsArchivos();
            OpenFileDialog ofd = new OpenFileDialog();

            ClsConexSQL cn = new ClsConexSQL();

            ofd.Title = "Seleccione el archivo plano";
            ofd.InitialDirectory = @"C:\Users\alumno\Desktop\archivoPlano.csv";
            ofd.Filter = "Archivo plano (*.csv)|*.csv";

            if (ofd.ShowDialog() == DialogResult.OK)
            {
                var archi = ofd.FileName;
                VectorAlumnos = ar.LeerArchivo(archi);
            }
            int contador = 0;
            cn.consultaTablaDirecta("delete from [tb_alumnos]");

            foreach(string linea in VectorAlumnos)
            {
                if (contador > 0)
                {
                    string[] dato = linea.Split(';');
                    string sql = $"insert into tb_alumnos(correlativo, nombre, parcial1,parcial2,parcial3) values ({dato[0]}, '{dato[1]}', {dato[2]},{dato[3]},{dato[4]})";
                    cn.insertar(sql);
                }
                contador++;
            }

           DataTable dt = cn.consultaTablaDirecta("SELECT *  FROM [tb_alumnos]");

            foreach (DataRow Datos in dt.Rows)
            {
                listBox1.Items.Add($"{Datos[0]} {Datos[1]} {Datos[2]} {Datos[3]} {Datos[4]}");

            }
        }

        private void btnMysql_Click(object sender, EventArgs e)
        {
            ClsConexMySQL cn = new ClsConexMySQL();

            ClsArchivos ar = new ClsArchivos();
            OpenFileDialog ofd = new OpenFileDialog();

            ofd.Title = "Seleccione el archivo plano";
            ofd.InitialDirectory = @"C:\Users\alumno\Desktop\archivoPlano.csv";
            ofd.Filter = "Archivo plano (*.csv)|*.csv";

            if (ofd.ShowDialog() == DialogResult.OK)
            {
                var archi = ofd.FileName;
                VectorAlumnos = ar.LeerArchivo(archi);
            }
            int contador = 0;
           cn.consultaTablaDirecta("delete from tb_alumnos");

            foreach (string linea in VectorAlumnos)
            {
                if (contador > 0)
                {
                    string[] dato = linea.Split(';');
                    string mysql = $"insert into tb_alumnos(correlativo, nombre, parcial1,parcial2,parcial3) values ({dato[0]}, '{dato[1]}', {dato[2]},{dato[3]},{dato[4]})";
                    cn.insertar2(mysql);
                }
                contador++;
            }

            DataTable dt = cn.consultaTablaDirecta("SELECT *  FROM tb_alumnos");

            foreach (DataRow Datos in dt.Rows)
            {
                listBox2.Items.Add($"{Datos[0]} {Datos[1]} {Datos[2]} {Datos[3]} {Datos[4]}");

            }

            /*try
            {
                cn.abrirConexion();
                MessageBox.Show("Conexion exitosa");
            }
            catch
            {
                MessageBox.Show("Conexion fallida");
            }*/
        }

        private void btnOracle_Click(object sender, EventArgs e)
        {
            ClsConexOracle cn = new ClsConexOracle();
            ClsArchivos ar = new ClsArchivos();
            OpenFileDialog ofd = new OpenFileDialog();

            ofd.Title = "Seleccione el archivo plano";
            ofd.InitialDirectory = @"C:\Users\alumno\Desktop\archivoPlano.csv";
            ofd.Filter = "Archivo plano (*.csv)|*.csv";

            if (ofd.ShowDialog() == DialogResult.OK)
            {
                var archi = ofd.FileName;
                VectorAlumnos = ar.LeerArchivo(archi);
            }
            int contador = 0;
            cn.consultaTablaDirecta("delete from tb_alumnos");

            foreach (string linea in VectorAlumnos)
            {
                if (contador > 0)
                {
                    string[] dato = linea.Split(';');
                    string mysql = $"insert into tb_alumnos(CORRELATIVO, NOMBRE, PARCIAL1,PARCIAL2,PARCIAL3) values ({dato[0]}, '{dato[1]}', {dato[2]},{dato[3]},{dato[4]})";
                    cn.insertar3(mysql);
                }
                contador++;
            }

            DataTable dt = cn.consultaTablaDirecta("SELECT *  FROM tb_alumnos");

            foreach (DataRow Datos in dt.Rows)
            {
                listBox3.Items.Add($"{Datos[0]} {Datos[1]} {Datos[2]} {Datos[3]} {Datos[4]}");

            }

            /*
            try
            {
                cn.abrirConexion();
                MessageBox.Show("Conexion exitosa");
            }
            catch
            {
                MessageBox.Show("Conexion fallida");
            }*/
        }
    }
}
