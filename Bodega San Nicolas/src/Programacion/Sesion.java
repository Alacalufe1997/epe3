//Copyright 2019 Nicolas Lobos Carcamo,Diego Parada
//
//Licensed under the Apache License, Version 2.0 (the "License");
//you may not use this file except in compliance with the License.
//You may obtain a copy of the License at
//
//http://www.apache.org/licenses/LICENSE-2.0
//
//Unless required by applicable law or agreed to in writing, software
//distributed under the License is distributed on an "AS IS" BASIS,
//WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
//See the License for the specific language governing permissions and
//limitations under the License.
package Programacion;
import Interfaz.Menu;
import Interfaz.Login;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Sesion {
    
    Connection conexion = null;
    Statement sentencia = null;
    ResultSet resultados = null;
    String driver = "org.sqlite.JDBC";
    String nombreBD = "LosVinedos.s3db";
    String url = "jdbc:sqlite:"+nombreBD;
    
    public void users(String user,String pass, int key){

        Menu MN = new Menu();
        Login lg = new Login();
        
         try{
        Class.forName(driver);
        conexion = DriverManager.getConnection(url);
        sentencia = conexion.createStatement();
        String sql = "SELECT * FROM usuario where user='"+user+"'and pass='"+pass+"'";
        resultados = sentencia.executeQuery(sql);
             if (resultados.next()) {
                 key=1;
                 MN.setVisible(true);
                 JOptionPane.showMessageDialog(null,"BIENVENIDO \n" + user,"Bienvenida",JOptionPane.DEFAULT_OPTION);
             }
             if (key==0) {
                 JOptionPane.showMessageDialog(null,"Usuario o Contraseña incorrecto!");
                 lg.setVisible(true);
                 
             }
        resultados.close();
        sentencia.close();
        conexion.close();
      }catch(ClassNotFoundException | SQLException e){
          System.out.println("Error: "+e.getMessage());
      }
        
        
    }
    
}
