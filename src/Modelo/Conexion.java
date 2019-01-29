package Modelo;
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class Conexion {
private static String base="caja";
private static String url="jdbc:mysql://localhost:3306/"+base;
private static String usr="root";
private static String pass="";
Connection con=null;
public Connection getConexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=(Connection) DriverManager.getConnection(url, usr, pass);
            System.out.println("Conectado");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,ex);
        }
        return con;
}
void Conectar(){
getConexion();
}
    public static void main(String[] args) {
        Conexion c=new Conexion();
        c.Conectar();
    }
}