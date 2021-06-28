
import com.mysql.jdbc.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class mhsDB {
    
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    Statement st;
    
    String dbURL = "jdbc:mysql://localhost/coba";
    String user = "root";
    String pass = "";
    
    public mhsDB() {
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(dbURL, user, pass);
            System.out.println("Koneksi Berhasil");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(mhsDB.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(mhsDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void insertDB(String nim, String nama, String alamat) {
        try {
            String sql = "insert into mahasiswa values (?, ?, ?)";
            pst = con.prepareStatement(sql);
            pst.setString(1, nim);
            pst.setString(2, nama);
            pst.setString(3, alamat);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(mhsDB.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error");
        }
    }
    
    public void selectDB() {
        try {
            String sql = "SELECT * FROM mahasiswa";
//            st = con.createStatement();
            rs = st.executeQuery(sql);
        } catch(SQLException ex) {
            Logger.getLogger(mhsDB.class.getName()).log(Level.SEVERE, null, ex);            
        }
//        return rs;
    }
    
    
}
