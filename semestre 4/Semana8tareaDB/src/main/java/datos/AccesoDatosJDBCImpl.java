package datos;

import dominio.MdEmpleado;

import excepciones.*;
import java.io.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

/**
 *
 * @author Ruldin
 */
public class AccesoDatosJDBCImpl implements AccesoDatosJDBC{
    private static final String SQL_SELECT = "SELECT * FROM tb_empleados";
    private static final String SQL_INSERT = "INSERT INTO tb_empleados(nombre, enero, febrero, marzo, total, promedio) VALUES(?,?,?,?,?,?)";//se usan los signos ? como parametros
    private static final String SQL_UPDATE = "UPDATE tb_empleados SET nombre = ?, enero = ?, febrero = ?, marzo = ?, total=?, promedio=? WHERE codigo = ?";
    private static final String SQL_DELETE = "DELETE FROM tb_empleados WHERE codigo = ?";

    
  //para seleccionar informacion
    public List<MdEmpleado> listar(){
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        MdEmpleado empleado = null;
        List<MdEmpleado> empleados = new ArrayList<MdEmpleado>();
        try {
            conn = ClsConexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while(rs.next()) {
                int codigo = rs.getInt(1);
                String nombre = rs.getString(2);
                double enero = rs.getInt(3);
                double febrero = rs.getInt(4);
                double marzo = rs.getInt(5);
                empleado = new MdEmpleado(nombre,enero,febrero,marzo);
                empleado.setCodigo(codigo);
                empleados.add(empleado);
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            ClsConexion.close(rs);
            ClsConexion.close(stmt);
            ClsConexion.close(conn);
        }
        return empleados;
    }
    
    
    @Override
    public void escribir(MdEmpleado empleados) throws EscrituraDatosEx{
                Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = ClsConexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, empleados.getNombre());
            stmt.setDouble(2, empleados.getEnero());
            stmt.setDouble(3, empleados.getFebrero());
            stmt.setDouble(4, empleados.getMarzo());
            stmt.setDouble(5, empleados.getTotal());
            stmt.setDouble(6, empleados.getPromedio());
         
            
            System.out.println("ejecutando query:" + SQL_INSERT);
            rows = stmt.executeUpdate();//nos devuelve cuantas filas se alteraron
            System.out.println("Registros afectados:" + rows);
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        finally{
            ClsConexion.close(stmt);
            ClsConexion.close(conn);
        }
    }

    @Override
    public void editar(MdEmpleado empleados) throws EscrituraDatosEx {
                        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = ClsConexion.getConnection();
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setString(1, empleados.getNombre());
            stmt.setDouble(2, empleados.getEnero());
            stmt.setDouble(3, empleados.getFebrero());
            stmt.setDouble(4, empleados.getMarzo());
            stmt.setDouble(5, empleados.getTotal());
            stmt.setDouble(6, empleados.getPromedio());
            stmt.setDouble(7, empleados.getCodigo());
         
            
            System.out.println("ejecutando query:" + SQL_UPDATE);
            rows = stmt.executeUpdate();//nos devuelve cuantas filas se alteraron
            System.out.println("Registros afectados:" + rows);
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        finally{
            ClsConexion.close(stmt);
            ClsConexion.close(conn);
        }
    }

    @Override
    public void borrar(int codigo) throws AccesoDatosEx {
         Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = ClsConexion.getConnection();
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, codigo);
            
            System.out.println("ejecutando query:" + SQL_DELETE);
            rows = stmt.executeUpdate();//nos devuelve cuantas filas se alteraron
            System.out.println("Registros afectados:" + rows);
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        finally{
            ClsConexion.close(stmt);
            ClsConexion.close(conn);
        }
    }

    
    
    
   

}
