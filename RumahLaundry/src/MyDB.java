
import com.mysql.jdbc.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MyDB {
    
    String jdbcDriver = "com.mysql.jdbc.Driver";
    String dbURL = "jdbc:mysql://localhost/akademik";
    String user = "root";
    String pass = "";

    Connection con;
    Statement stmt;
    ResultSet st;
    
    public static void main(String[] args) {
        MyDB myDB = new MyDB();
        myDB.koneksi();
    }
    
    public void koneksi() {
        try {
            Class.forName(jdbcDriver);
            System.out.println("Class sukses");
        } catch (ClassNotFoundException ex) {
            System.out.println("Classs Error");
        }
        
        try {
            con = (Connection) DriverManager.getConnection(dbURL, user, pass);
            System.out.println("Connection berhasil");
        } catch (SQLException ex) {
            System.out.println("Connection Error");
        }
        
    }
}
