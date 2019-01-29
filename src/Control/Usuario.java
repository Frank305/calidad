 package Control;
import Modelo.Conexion;
import Modelo.SqlUsuario;
import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Usuario extends Conexion{
    public boolean anadirUsuario(SqlUsuario u){
    PreparedStatement ps=null;
    ResultSet rs=null;
    Connection con=null;
    con=getConexion();
    String Sql="INSERT INTO usuario (nombre, password) VALUES(?,?)";
        try {
            ps=con.prepareStatement(Sql);
            ps.setString(1, u.getNombre());
            ps.setString(2, u.getContraseña());
            ps.execute();
            return true;
        } catch (SQLException ex) {
            
            return false;
        }//PONI7KHCHH
    }
}
