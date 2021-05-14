using clase10bueno.clases.archivos;
using clase10bueno.clases.BaseDatos;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace clase10bueno
{
    public partial class frmInicio : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {

        }

        private void cargarArchivoExterno()
        {
            string fuente = @"C:\Users\alumno\Desktop\crudDB.csv";
            ClsArchivos ar = new ClsArchivos();
            //obtner todo el archivo, linea por linea dentro de un arreglo
            string[] ArregloNotas = ar.LeerArchivo(fuente);
            string sentencia_sql = "";
            int Numerolinea = 0;

            ClsConexion cn = new ClsConexion();

            foreach (string linea in ArregloNotas)
            {
                //obtener datos
                String[] datos = linea.Split(';');
                if (Numerolinea > 0)
                {
                    sentencia_sql = sentencia_sql + $"insert into tb_alumnos values({datos[0]},'{datos[1]}',{datos[2]},{datos[3]},{datos[4]},{datos[5]},'{datos[6]}');\n ";
                }
                Numerolinea++;
            }

            cn.EjecutaSQLDirecto(sentencia_sql);
        }

        private void cargarArchivoExternoMysql()
        {
            string fuente = @"C:\Users\alumno\Desktop\crudDB.csv";
            ClsArchivos ar = new ClsArchivos();
            //obtner todo el archivo, linea por linea dentro de un arreglo
            string[] ArregloNotas = ar.LeerArchivo(fuente);
            string sentencia_mysql = "";
            int Numerolineas = 0;

            ClsConexionMySQL cnn = new ClsConexionMySQL();

            foreach (string linea in ArregloNotas)
            {
                //obtener datos
                String[] datos = linea.Split(';');
                if (Numerolineas > 0)
                {
                    sentencia_mysql = sentencia_mysql + $"insert into tb_alumnos values({datos[0]},'{datos[1]}',{datos[2]},{datos[3]},{datos[4]},{datos[5]},'{datos[6]}');\n ";
                }
                Numerolineas++;
            }
            cnn.EjecutaMySQLDirecto(sentencia_mysql);
        }

        protected void ButtonSubirInformacion_Click(object sender, EventArgs e)
        {
            cargarArchivoExterno();
        }

        protected void ButtonSubirInformacionMySQL_Click(object sender, EventArgs e)
        {
            cargarArchivoExternoMysql();
        }
    }
}