package Control;
import Modelo.Conexion;
import Modelo.SqlUsuario;
import Vista.Menu;
import static Vista.Menu.TablaAbono;
import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
public class Tablas {
    public void LLTablaAbono(){
    try{
    DefaultTableModel model =new DefaultTableModel();
    TablaAbono.setModel(model);
    PreparedStatement ps=null;
    ResultSet rs=null;
    Conexion conn=new Conexion();
    Connection con= (Connection) conn.getConexion(); //mysql
    String sql ="SELECT * FROM usuario";
    ps=con.prepareStatement(sql);// clausula catch
    rs=ps.executeQuery();
    ResultSetMetaData ct=rs.getMetaData();
    int CColumna =ct.getColumnCount();
    
    model.addColumn("ID");
    model.addColumn("NOMBRE");
    model.addColumn("");
    model.addColumn("DESCRIPCION");
    
    int [] ancho={50,50,50,50};
    for (int i=0; i < CColumna; i++){
        TablaAbono.getColumnModel().getColumn(i).setPreferredWidth(ancho[i]);
    }
    while(rs.next()){
    Object [] filas= new Object[CColumna];
    for (int i =0; i < CColumna; i++){
        filas[i]=rs.getObject(i+1);
    }
    model.addRow(filas);
    }
    
    }   catch (SQLException ex) {   
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }}
}