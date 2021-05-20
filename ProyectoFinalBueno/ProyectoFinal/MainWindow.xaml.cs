using ProyectoFinal.Clases.Archivos;
using ProyectoFinal.Clases.Conexiones;
using System;
using System.Collections.Generic;
using System.Data;
using System.Data.SqlClient;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Data;
using System.Windows.Documents;
using System.Windows.Input;
using System.Windows.Media;
using System.Windows.Media.Imaging;
using System.Windows.Navigation;
using System.Windows.Shapes;

namespace ProyectoFinal
{
    /// <summary>
    /// Lógica de interacción para MainWindow.xaml
    /// </summary>
    public partial class MainWindow : Window
    {
        private int contador = 0;
        private bool conexionSql = false;
        private bool conexionMySql = false;
        private DataTable dt = new DataTable();

       


        /// <summary>
        /// SECCIÓN DE FUNCIONES Y MÉTODOS
        /// </summary>
        public MainWindow()
        {
            InitializeComponent();
        }

        private void abrirConexionSql()
        {
            conexionSql = true;
            conexionMySql = false;
        }

        private void abrirConexionMySql()
        {
            conexionSql = false;
            conexionMySql = true;
        }
        private void elegirObjeto(String sql)
        {
            if (conexionSql)
            {
                ClsConexionSqlServer cn = new ClsConexionSqlServer();
                cn.EjecutaSQLDirecto(sql);
            }
            else if (conexionMySql)
            {
                ClsConexionMySql cn2 = new ClsConexionMySql();
                cn2.EjecutaSQLDirecto(sql);
            }
            else
            {
                MessageBox.Show("No existe conexión");
            }
        }

        private void cargarArchivoExterno()
        {
            string fuente = @"C:\Users\alumno\Desktop\Libros.csv";
            ClsArchivos ar = new ClsArchivos();
            //obtner todo el archivo, linea por linea dentro de un arreglo
            string[] ArregloNotas = ar.LeerLineasArchivo(fuente);
            string sentencia_sql = "";
            int Numerolinea = 0;

            foreach (string linea in ArregloNotas)
            {
                //obtener datos
                String[] datos = linea.Split(';');
                if (Numerolinea > 0)
                {
                    sentencia_sql = sentencia_sql + $"insert into tb_libros (Nombre,Autor,NúmeroPáginas,Precio,Categoría,FechaPublicación) values('{datos[1]}','{datos[2]}',{datos[3]},{datos[4]},'{datos[5]}','{datos[6]}');\n ";
                }
                Numerolinea++;
            }
            elegirObjeto(sentencia_sql);
        }
        
        private DataTable buscarDatos(String condicion = "1 = 1")
        {
            DataTable dt = new DataTable();
            string cuerito = $"select * from tb_libros where {condicion}";
            
            if (conexionSql)
            {
                ClsConexionSqlServer cn = new ClsConexionSqlServer();
                dt = cn.consultaTablaDirecta(cuerito);
            }
            else if (conexionMySql)
            {
                ClsConexionMySql cn2 = new ClsConexionMySql();
                dt = cn2.consultaTablaDirecta(cuerito);
            }
            else
            {
                MessageBox.Show("No existe conexión");
            }

            return dt;
        }

        private DataTable buscarLista(String columna, String min, String max)
        {
            DataTable dt = new DataTable();

            if (min == "")
            {
                min = "0";
                if (columna == "FechaPublicación")
                {
                    min = "10000101";
                }
            }

            if (max == "")
            {
                max = "9999999";
                if (columna == "FechaPublicación")
                {
                    max = "30000101";
                }
            }

            string sql = $"{columna} between '{min}' and '{max}'";
            dt = buscarDatos(sql);
            return dt;
        }

        private string[] buscarRegistros(String dato, String columna)
        {
            dato = dato.Replace(' ', '%');
            string condicion = $"{columna} like '%{dato}%'";
            var dt = buscarDatos(condicion);
            string[] resultado = new string[7];

            if (dt.Rows.Count > 0)
            {
                resultado[0] = Convert.ToString(dt.Rows[0].Field<Int32>("Código"));
                resultado[1] = dt.Rows[0].Field<string>("Nombre");
                resultado[2] = dt.Rows[0].Field<string>("Autor");
                resultado[3] = Convert.ToString(dt.Rows[0].Field<Int32>("NúmeroPáginas"));
                resultado[4] = Convert.ToString(dt.Rows[0].Field<Int32>("Precio"));
                resultado[5] = dt.Rows[0].Field<string>("Categoría");
                resultado[6] = Convert.ToString(dt.Rows[0].Field<DateTime>("FechaPublicación"));
            }
            else
            {
                resultado[0] = "X";
            }
            return resultado;
        }

        private void llenarCeldas(String[] resultado)
        {
            txtCodigo.Text = resultado[0];
            txtnuevoNombre.Text = resultado[1];
            txtnuevoAutor.Text = resultado[2];
            txtnuevoNumPaginas.Text = resultado[3];
            txtnuevoPrecio.Text = resultado[4];
            txtnuevaCategoria.Text = resultado[5];
            txtnuevaFecha.Text = resultado[6];
        }

        private DataTable llenarDataTable(String columna, String dato)
        {
            DataTable dt = new DataTable();
            string sql = $"{columna} like '%{dato}%'";
            dt = buscarDatos(sql);
            return dt;
        }

        private void imprimirConsulta(DataTable dt)
        {
            string lineas = "";

            foreach (DataRow dr in dt.Rows)
            {
                string aux = dr["Código"].ToString() + ";" + dr["Nombre"].ToString() + ";" + dr["Autor"].ToString() + ";" + dr["NúmeroPáginas"].ToString() + ";" + dr["Precio"].ToString() + ";" + dr["Categoría"].ToString() + ";" + dr["FechaPublicación"].ToString();
                lineas += aux + "\n";
            }

            File.WriteAllText($@"C:\Users\alumno\Desktop\Consulta{contador}.csv", lineas);
        }

        


        ///SECCIÓN DE BOTONES
        private void buttonConectarSqlServer_Click(object sender, RoutedEventArgs e)
        {
            abrirConexionSql();
        }

        private void buttonConectarMySql_Click(object sender, RoutedEventArgs e)
        {
            abrirConexionMySql();
        }

        private void buttonCargarArchivo_Click(object sender, RoutedEventArgs e)
        {
            cargarArchivoExterno();
        }

        private void buttonBuscarTodo_Click(object sender, RoutedEventArgs e)
        {
            dt = buscarDatos();
            DataGridLibros.DataContext = dt;
        }

        private void buttonBuscarCodigo_Click(object sender, RoutedEventArgs e)
        {
            string codigo = txtBuscarCodigo.Text;
            string columna = "Código";
            string[] resultado = buscarRegistros(codigo, columna);

            if(resultado[0]!="X")
            {
                llenarCeldas(resultado);
            }
            else
            {
                MessageBox.Show("No se encontraron resultados");
            }
            txtBuscarCodigo.Clear();
        }

        private void buttonBuscarNombre_Click(object sender, RoutedEventArgs e)
        {
            string nombre = txtBuscarNombre.Text;
            string columna = "Nombre";
            string[] resultado = buscarRegistros(nombre, columna);

            if (resultado[0] != "X")
            {
                llenarCeldas(resultado);
            }
            else
            {
                MessageBox.Show("No se encontraron resultados");
            }
            txtBuscarNombre.Clear();
        }

        private void buttonBuscarAutor_Click(object sender, RoutedEventArgs e)
        {
            string columna = "Autor";
            dt = llenarDataTable(columna, txtBuscarAutor.Text);
            DataGridLibros.DataContext = dt;
            txtBuscarAutor.Clear();
        }

        private void buttonBuscarPaginas_Click(object sender, RoutedEventArgs e)
        {
            string columna = "NúmeroPáginas";
            dt = buscarLista(columna, txtPaginaMin.Text, txtPaginaMax.Text);
            DataGridLibros.DataContext = dt;
            txtPaginaMin.Clear(); txtPaginaMax.Clear();
        }

        private void buttonBuscarPrecio_Click(object sender, RoutedEventArgs e)
        {
            string columna = "Precio";
            dt = buscarLista(columna, txtPrecioMin.Text, txtPrecioMax.Text);
            DataGridLibros.DataContext = dt;
            txtPrecioMin.Clear(); txtPrecioMax.Clear();
        }

        private void buttonBuscarCategoria_Click(object sender, RoutedEventArgs e)
        {
            string columna = "Categoría";
            dt = llenarDataTable(columna, txtBuscarCategoria.Text);
            DataGridLibros.DataContext = dt;
            txtBuscarCategoria.Clear();
        }

        private void buttonBuscarFecha_Click(object sender, RoutedEventArgs e)
        {
            string columna = "FechaPublicación";
            dt = buscarLista(columna, txtFechaMin.Text, txtFechaMax.Text);
            DataGridLibros.DataContext = dt;
            txtFechaMin.Clear(); txtFechaMax.Clear();
        }

        private void buttonAgregarRegistro_Click(object sender, RoutedEventArgs e)
        {
            string sql = $"insert into tb_libros (Nombre,Autor,NúmeroPáginas,Precio,Categoría,FechaPublicación) values('{txtnuevoNombre.Text}','{txtnuevoAutor.Text}',{txtnuevoNumPaginas.Text},{txtnuevoPrecio.Text},'{txtnuevaCategoria.Text}','{txtnuevaFecha.Text}')";
            elegirObjeto(sql);
            txtCodigo.Text = "X"; txtnuevoNombre.Clear(); txtnuevoAutor.Clear(); txtnuevoNumPaginas.Clear(); txtnuevoPrecio.Clear(); txtnuevaCategoria.Clear(); txtnuevaFecha.Clear();
        }

        private void buttonModificarRegistro_Click(object sender, RoutedEventArgs e)
        {
            if (txtCodigo.Text != "X")
            {
                string sql = $"update tb_libros set Nombre = '{txtnuevoNombre.Text}', Autor = '{txtnuevoAutor.Text}', NúmeroPáginas = {txtnuevoNumPaginas.Text}, Precio = {txtnuevoPrecio.Text}, Categoría = '{txtnuevaCategoria.Text}', FechaPublicación = '{txtnuevaFecha.Text}' where Código = {txtCodigo.Text}";
                elegirObjeto(sql);
                txtCodigo.Text = "X";  txtnuevoNombre.Clear(); txtnuevoAutor.Clear(); txtnuevoNumPaginas.Clear(); txtnuevoPrecio.Clear(); txtnuevaCategoria.Clear(); txtnuevaFecha.Clear();
            }
            else
            {
                MessageBox.Show("No se ha identificado el código del registro a modificar");
                txtnuevoNombre.Clear(); txtnuevoAutor.Clear(); txtnuevoNumPaginas.Clear(); txtnuevoPrecio.Clear(); txtnuevaCategoria.Clear(); txtnuevaFecha.Clear();
            }
        }

        private void buttonBorrarRegistro_Click(object sender, RoutedEventArgs e)
        {
            if (txtCodigo.Text != "X")
            {
                string sql = $"delete from tb_libros where Código = {txtCodigo.Text}";
                elegirObjeto(sql);
                txtCodigo.Text = "X"; txtnuevoNombre.Clear(); txtnuevoAutor.Clear(); txtnuevoNumPaginas.Clear(); txtnuevoPrecio.Clear(); txtnuevaCategoria.Clear(); txtnuevaFecha.Clear();
            }
            else
            {
                MessageBox.Show("No se ha identificado el código del registro a borrar");
                txtnuevoNombre.Clear(); txtnuevoAutor.Clear(); txtnuevoNumPaginas.Clear(); txtnuevoPrecio.Clear(); txtnuevaCategoria.Clear(); txtnuevaFecha.Clear();
            }
        }

        private void buttonImprimirLista_Click(object sender, RoutedEventArgs e)
        {
            contador++;
            imprimirConsulta(dt);
        }
    }
}
