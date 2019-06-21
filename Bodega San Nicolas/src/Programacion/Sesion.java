
package Programacion;
import Interfaz.Menu;
import javax.swing.JOptionPane;

public class Sesion {
    
    public void users(String user,String pass){

        Menu MN = new Menu();
        String username="admin";
        String password="123";
        if (user.equals(username)&& pass.equals(password)) {
            JOptionPane.showMessageDialog(null,"BIENVENIDO \n" + username,"Bienvenida",JOptionPane.DEFAULT_OPTION);

          MN.setVisible(true);
        }else
            JOptionPane.showMessageDialog(null,"Error");
    }
    
}
