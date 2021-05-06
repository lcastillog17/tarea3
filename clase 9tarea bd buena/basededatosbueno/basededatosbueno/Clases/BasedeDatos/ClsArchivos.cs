using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace basededatosbueno.Clases.BasedeDatos
{
    class ClsArchivos
    {
        public string[] LeerArchivo(string archivo)
        {
            string[] lineas = File.ReadAllLines(archivo, Encoding.Default);
            return lineas;
        }
    }
}
