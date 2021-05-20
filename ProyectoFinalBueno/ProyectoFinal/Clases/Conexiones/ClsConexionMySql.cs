using MySql.Data.MySqlClient;
using System;
using System.Collections.Generic;
using System.Data;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ProyectoFinal.Clases.Conexiones
{
    class ClsConexionMySql
    {
        private MySqlConnection conexion;
        private string cadenaConexion { get; }

        public ClsConexionMySql()
        {
            cadenaConexion = "Server=localhost;Database=dbproyectofinal; Uid=root;Pwd=Umg$2019;Convert Zero Datetime=True";
        }

        public void AbrirConexion()
        {
            conexion = new MySqlConnection(cadenaConexion);
            conexion.Open();
        }

        public void CerrarConexion()
        {
            conexion.Close();
        }

        public DataTable consultaTablaDirecta(String sqll)
        {
            AbrirConexion();
            MySqlDataReader dr;
            MySqlCommand comm = new MySqlCommand(sqll, conexion);
            dr = comm.ExecuteReader();

            var dataTable = new DataTable();
            dataTable.Load(dr);
            CerrarConexion();
            return dataTable;
        }

        public void EjecutaSQLDirecto(String sqll)
        {
            AbrirConexion();
            try
            {
                MySqlCommand comm = new MySqlCommand(sqll, conexion);
                comm.ExecuteReader();
            }
            catch (Exception e)
            {
                Console.Write(e.Message);
            }
            finally
            {
                CerrarConexion();
            }
        }
    }
}
