using System;
using System.Collections.Generic;
using System.Data;
using System.Data.SqlClient;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ProyectoFinal.Clases.Conexiones
{
    class ClsConexionSqlServer
    {
        private SqlConnection conexion;
        private string cadenaConexion { get; }

        public ClsConexionSqlServer()
        {
            cadenaConexion = "Data Source = UMG-VM\\SQLEXPRESS; Initial Catalog = dbProyectoFinal; Integrated Security = True";
        }

        public void AbrirConexion()
        {
            conexion = new SqlConnection(cadenaConexion);
            conexion.Open();
        }

        public void CerrarConexion()
        {
            conexion.Close();
        }

        public DataTable consultaTablaDirecta(String sqll)
        {
            AbrirConexion();
            SqlDataReader dr;
            SqlCommand comm = new SqlCommand(sqll, conexion);
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
                SqlCommand comm = new SqlCommand(sqll, conexion);
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
