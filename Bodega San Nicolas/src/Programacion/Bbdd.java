
package Programacion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Bbdd {
    
    Connection conexion = null;
    Statement sentencia = null;
    ResultSet resultados = null;
    String driver = "org.sqlite.JDBC";
    String nombreBD = "andes.s3db";
    String url = "jdbc:sqlite:"+nombreBD;
    
    public void mostrarDatos(){
        int cont = 0;
         try{
        Class.forName(driver);
        conexion = DriverManager.getConnection(url);
        sentencia = conexion.createStatement();
        String sql = "SELECT * FROM usuario";
        resultados = sentencia.executeQuery(sql);
        while(resultados.next()){cont++;}
        int i = 0;
        while(resultados.next()){
            
            String id = Integer.toString(resultados.getInt("id"));
            String nombre = resultados.getString("nombre");
            String apellido = resultados.getString("apellido");
            String edad = Integer.toString(resultados.getInt("edad"));
            
            System.out.println("\nID: "+id+
                    "\nNOMBRE: "+nombre+
                    "\nAPELLIDO: "+apellido+
                    "\nEDAD: "+edad);
            String matris[][]= new String[cont][4];
            matris[i][0]=id;
            matris[i][1]=nombre;
            matris[i][2]=apellido;
            matris[i][0]=edad;
            i++;
        }
        resultados.close();
        sentencia.close();
        conexion.close();
      }catch(ClassNotFoundException | SQLException e){
          System.out.println("Error: "+e.getMessage());
      }
       
    }
    
}
