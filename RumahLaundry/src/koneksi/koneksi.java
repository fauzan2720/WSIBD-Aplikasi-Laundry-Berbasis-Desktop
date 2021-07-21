package koneksi;

/**
 *
 * @author Fauzan
 */
import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class koneksi {
    
    public static Connection getConnection() {
        Connection connection = null;
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost/db_laundry";
        String user = "root";
        String password = "";
        if (connection == null) {
            try {
                Class.forName(driver);
                connection = DriverManager.getConnection(url, user, password);
//                System.out.println("Koneksi berhasil"); // cekkoneksi berhasil
            } catch (ClassNotFoundException | SQLException error) {
               System.exit(0);
            }

        }
        return connection;
    }
}
