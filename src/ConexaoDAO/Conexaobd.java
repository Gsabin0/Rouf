package ConexaoDAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexaobd {
    public Connection conebd() {
        Connection conn = null;
        try {
            String url = "jdbc:mysql://localhost:3306/Rouff?user=root&password=";
            conn = DriverManager.getConnection(url);
        }catch (SQLException erro) {
            JOptionPane.showMessageDialog(null,"erro na conexaoDAO"+ erro.getMessage());
        }
            return conn;
    }
    
}
