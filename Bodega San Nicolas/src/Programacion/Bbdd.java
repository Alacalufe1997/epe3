
package Programacion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class Bbdd {
    
    Connection conexion = null;
    Statement sentencia = null;
    ResultSet resultados = null;
    String driver = "org.sqlite.JDBC";
    String nombreBD = "andes.s3db";
    String url = "jdbc:sqlite:"+nombreBD;
    
    public void ingresoUsuario(String nombre, String apellido, int edad, String usuario, String pass, String rut,int sueldo,String fechanac,String admin){
        
        try{
        Class.forName(driver);
        conexion = DriverManager.getConnection(url);
        sentencia = conexion.createStatement();
        String sql = "INSERT INTO usuario ("+
                "nombre,apellido,edad,user,pass,rut,fecha_ingreso,sueldo,fecha_nac,cargo) VALUES"
                + " ('"+nombre+"','"+apellido+"',"+edad+",'"+usuario+"','"+pass+"','"+rut+"',current_timestamp,"+sueldo+",'"+fechanac+"','"+admin+"')";
        sentencia.executeUpdate(sql);
        sentencia.close();
        conexion.close();
      }catch(ClassNotFoundException | SQLException e){
          System.out.println("Error: "+e.getMessage());
      }
        JOptionPane.showMessageDialog(null,"Usuario insertado con exito!" );
   
    }
    public void ingresoUsuario2(String nombre, String apellido, int edad, String usuario, String pass, String rut,int sueldo,String fechanac,String bode){
        
        try{
        Class.forName(driver);
        conexion = DriverManager.getConnection(url);
        sentencia = conexion.createStatement();
        String sql = "INSERT INTO usuario ("+
                "nombre,apellido,edad,user,pass,rut,fecha_ingreso,sueldo,fecha_nac,cargo) VALUES"
                + " ('"+nombre+"','"+apellido+"',"+edad+",'"+usuario+"','"+pass+"','"+rut+"',current_timestamp,"+sueldo+",'"+fechanac+"','"+bode+"')";
        sentencia.executeUpdate(sql);
        sentencia.close();
        conexion.close();
      }catch(ClassNotFoundException | SQLException e){
          System.out.println("Error: "+e.getMessage());
      }
        JOptionPane.showMessageDialog(null,"Usuario insertado con exito!" );
   
    }
    public void ingresoUsuario3(String nombre, String apellido, int edad, String usuario, String pass, String rut,int sueldo,String fechanac,String ven){
        
        try{
        Class.forName(driver);
        conexion = DriverManager.getConnection(url);
        sentencia = conexion.createStatement();
        String sql = "INSERT INTO usuario ("+
                "nombre,apellido,edad,user,pass,rut,fecha_ingreso,sueldo,fecha_nac,cargo) VALUES"
                + " ('"+nombre+"','"+apellido+"',"+edad+",'"+usuario+"','"+pass+"','"+rut+"',current_timestamp,"+sueldo+",'"+fechanac+"','"+ven+"')";
        sentencia.executeUpdate(sql);
        sentencia.close();
        conexion.close();
      }catch(ClassNotFoundException | SQLException e){
          System.out.println("Error: "+e.getMessage());
      }
        JOptionPane.showMessageDialog(null,"Usuario insertado con exito!" );
   
    }
    public void mostrarDatos(int id){
        
         try{
        Class.forName(driver);
        conexion = DriverManager.getConnection(url);
        sentencia = conexion.createStatement();
        String sql = "SELECT * FROM usuario where id="+id;
        resultados = sentencia.executeQuery(sql);
        while(resultados.next()){
            int idd = resultados.getInt("id");
            String nombre = resultados.getString("nombre");
            String apellido = resultados.getString("apellido");
            int edad = resultados.getInt("edad");
            String user = resultados.getString("user");
            String pass = resultados.getString("pass");
            String rut = resultados.getString("rut");
            String fecha_ing = resultados.getString("fecha_ingreso");
            int sueldo = resultados.getInt("sueldo");
            String fechanac = resultados.getString("fecha_nac");
            String cargo = resultados.getString("cargo");
            
            JOptionPane.showMessageDialog(null,"Id: "+idd+"\nNombre: "+nombre+"\nApellido: "+apellido+"\nEdad: "+edad+
                    "\nUsuario: "+user+"\nRUT: "+rut+"\nFecha ingreso: "+fecha_ing+"\nSueldo: "+sueldo+"\nFecha nacimiento: "+fechanac+
                    "\nCargo: "+cargo);
        }
        resultados.close();
        sentencia.close();
        conexion.close();
      }catch(ClassNotFoundException | SQLException e){
          JOptionPane.showMessageDialog(null,"Error: "+e.getMessage());
      }
       
    }
    public void eliminarUsuario(int id){
        
        try{
        Class.forName(driver);
        conexion = DriverManager.getConnection(url);
        sentencia = conexion.createStatement();
        String sql = "DELETE FROM usuario WHERE id="+id;
        sentencia.executeUpdate(sql);
        sentencia.close();
        conexion.close();
      }catch(ClassNotFoundException | SQLException e){
          JOptionPane.showMessageDialog(null,"Error: "+e.getMessage());
      }
        JOptionPane.showMessageDialog(null,"Usuario Eliminado con exito!" );
   
    }
    
}
