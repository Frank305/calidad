package Control;
import Modelo.Conexion;
import Modelo.SqlUsuario;
import static Vista.Login.txtIp;
import static Vista.Login.txtIu;
import Vista.Menu;
import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class Iniciar extends Conexion{
     public boolean iniciarLogin(SqlUsuario usr) {
        PreparedStatement ps = null;
        ResultSet rs=null;
        Connection con=getConexion();
        String sql = "SELECT nombre, password FROM usuario where nombre=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, usr.getNombre());
            //ps.setString(2, usr.getContraseña());
            rs=ps.executeQuery();
            if (rs.next()) {
                if (usr.getContraseña().equals(rs.getString(2))) {
                    usr.setNombre(rs.getString(1));
                    return true;
                }else{
                    return false;
                }
            }
            return false;
        } catch (SQLException ex) {
            Logger.getLogger(SqlUsuario.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex);
            return false;
        }
         }
     public boolean iniciarSession(){
     Iniciar modSql = new Iniciar();
        SqlUsuario mod = new SqlUsuario();
        String pass = new String(txtIp.getPassword());
        if (!txtIu.getText().equals("") && !pass.equals("")) {
            String nuevoPass = has.sha1(pass);
            mod.setNombre(txtIu.getText());
            mod.setContraseña(nuevoPass);
            if (modSql.iniciarLogin(mod)) {
                Menu frmMenu = new Menu();
                frmMenu.setVisible(true);
                return true;
            } else if(!txtIu.getText().equals("") && !pass.equals("")){
            mod.setNombre(txtIu.getText());
            mod.setContraseña(pass);
            if (modSql.iniciarLogin(mod)) {
                Menu frmMenu = new Menu();
                frmMenu.setVisible(true);
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Datos incorrectos");
                return false;
            }
        }
            return true;
     }else {
            JOptionPane.showMessageDialog(null, "Debe ingresar sus datos");
            return false;
        }
     }
}