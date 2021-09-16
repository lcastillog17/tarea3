/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javafx.scene.control.Alert;

/**
 *
 * @author linda
 */
public class UsuarioJDBC {
     private static final String SQL_SELECT = "SELECT * FROM tb_usuarios";
    private static final String SQL_INSERT = "INSERT INTO tb_usuarios(username, password) VALUES(?,?)";//se usan los signos ? como parametros
    private static final String SQL_UPDATE = "UPDATE tb_usuarios SET username = ?, password = ? WHERE id_usuario = ?";
    private static final String SQL_DELETE = "DELETE FROM tb_usuarios WHERE id_usuario = ?";
    
    
    
    public List<Usuario> select (){
    Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Usuario usuario = null;
        List<Usuario> usuarios = new ArrayList<Usuario>();
        try {
            conn = ClsConexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while(rs.next()) {
                int id_usuario = rs.getInt(1);
                String username = rs.getString(2);
                String password = rs.getString(3);
                usuario = new Usuario();
                usuario.setId_usuario(id_usuario);
                usuario.setUsername(username);
                usuario.setPassword(password);
                
                usuarios.add(usuario);
            }
        } catch (SQLException ex) {
            new Alert(Alert.AlertType.ERROR, "Ha ocurrido un error").showAndWait();
           // ex.printStackTrace(System.out);
        } finally {
            ClsConexion.close(rs);
            ClsConexion.close(stmt);
            ClsConexion.close(conn);
        }
        return usuarios;
    
    }

    
 public boolean select_validacion(Usuario datos) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        boolean permiso = false;
        try {
            String condicion = SQL_SELECT + " where username='" + datos.getUsername() + "' and password ='" + datos.getPassword() + "'";
            conn = ClsConexion.getConnection();
            stmt = conn.prepareStatement(condicion);
            rs = stmt.executeQuery();
            System.out.println("condicion = " + condicion);
            while (rs.next()) {
                permiso = true;
            }
        }catch (SQLException ex) { 
            new Alert(Alert.AlertType.ERROR, "Ha ocurrido un error").showAndWait();
           // ex.printStackTrace(System.out);
        }
        return permiso;
    }
        
        public int insert(Usuario usuario){
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows=0;
        ResultSet rs = null;
        
         try {
            conn = ClsConexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, usuario.getUsername());
            stmt.setString(2, usuario.getPassword());
            
          //   System.out.println("ejecutando query:" + SQL_INSERT);
            rows = stmt.executeUpdate();//nos devuelve cuantas filas se alteraron
          //  System.out.println("Registros afectados:" + rows);
            }catch (SQLException ex) {
                new Alert(Alert.AlertType.ERROR, "Ha ocurrido un error").showAndWait();
          // ex.printStackTrace(System.out);
        } finally {

            ClsConexion.close(stmt);
            ClsConexion.close(conn);
        }
        return rows;
        }
        
        
            public void editar(Usuario usuario){
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = ClsConexion.getConnection();
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setString(1, usuario.getUsername());
            stmt.setString(2, usuario.getPassword());
            stmt.setInt(3, usuario.getId_usuario());
         
            
         //   System.out.println("ejecutando query:" + SQL_UPDATE);
            rows = stmt.executeUpdate();//nos devuelve cuantas filas se alteraron
         //   System.out.println("Registros afectados:" + rows);
        } catch (SQLException ex) {
            new Alert(Alert.AlertType.ERROR, "Ha ocurrido un error").showAndWait();
         //   ex.printStackTrace(System.out);
        }
        finally{
            ClsConexion.close(stmt);
            ClsConexion.close(conn);
        }
    }
            
       public void borrar(Usuario usuario){
         Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = ClsConexion.getConnection();
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, usuario.getId_usuario());
            
           // System.out.println("ejecutando query:" + SQL_DELETE);
            rows = stmt.executeUpdate();//nos devuelve cuantas filas se alteraron
          //  System.out.println("Registros afectados:" + rows);
        } catch (SQLException ex) {
            new Alert(Alert.AlertType.ERROR, "Ha ocurrido un error").showAndWait();
         //   ex.printStackTrace(System.out);
        }finally{
            ClsConexion.close(stmt);
            ClsConexion.close(conn);
        }
    }
}
