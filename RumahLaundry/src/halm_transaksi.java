import java.awt.HeadlessException;
import koneksi.koneksi;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fauzan
 */
public class halm_transaksi extends javax.swing.JFrame {

    private Connection conn;
    private Statement st;
    private ResultSet rs;
    
    public halm_transaksi() {
        initComponents();
        setTitle("Halaman Transaksi");
        conn = koneksi.getConnection();
        id_pelanggan();
        input_otomatis();
        jns_laundry();
        tampil_tanggal_sekarang();
        hidden();
    }
    
    public void hidden() {
        ket_plain.setVisible(false);
        total_plain.setVisible(false);
        total.setVisible(false);
        
        banyak_jaket.setVisible(false);
        xjaket.setVisible(false);
        cbjaket.setVisible(false);
        rp_jaket.setVisible(false);
        harga_jaket.setVisible(false);
        
        banyak_selimut.setVisible(false);
        xselimut.setVisible(false);
        cbselimut.setVisible(false);
        rp_selimut.setVisible(false);
        harga_selimut.setVisible(false);
        
        banyak_handuk.setVisible(false);
        xhanduk.setVisible(false);
        cbhanduk.setVisible(false);
        rp_handuk.setVisible(false);
        harga_handuk.setVisible(false);

        banyak_boneka.setVisible(false);
        xboneka.setVisible(false);
        cbboneka.setVisible(false);
        rp_boneka.setVisible(false);
        harga_boneka.setVisible(false);
        
        harga_jaket.setText("0");
        harga_selimut.setText("0");
        harga_handuk.setText("0");
        harga_boneka.setText("0");
    }
    
    public void id_pelanggan() {
        try {
           String sql = "SELECT * FROM tb_member";
           st = conn.createStatement();
           rs = st.executeQuery(sql);
           while (rs.next()) {
             String jns = rs.getString("id_member");
           }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "GAGAL MENAMPILKAN DATA");
        }
    }
    
    public void total_plain() {
        try {
            int jaket, selimut, handuk, boneka;
//            int jaket = 0, selimut = 0, handuk = 0, boneka = 0;
            jaket = Integer.parseInt(harga_boneka.getText());
            selimut = Integer.parseInt(harga_selimut.getText());
            handuk = Integer.parseInt(harga_handuk.getText());
            boneka = Integer.parseInt(harga_boneka.getText());

            int total = jaket + selimut + handuk + boneka;
            total_plain.setText(Integer.toString(total));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void tampil() {
        try {
        Statement stt = conn.createStatement();
        String sql = "SELECT nama, alamat from tb_member where id_member='" +txt_id_pelanggan.getText()+"'";  
        ResultSet res = stt.executeQuery(sql);
        
        while(res.next()){
            Object[] ob = new Object[2];
            ob[0]=  res.getString(1);
            ob[1]= res.getString(2);
            
            txt_nama.setText((String) ob[0]);
            txt_alamat.setText((String) ob[1]);
        }
        res.close(); stt.close();
         
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void jns_laundry() {
        try {
           String sql = "SELECT * FROM tb_jns_laundry";
           st = conn.createStatement();
           rs = st.executeQuery(sql);
           while (rs.next()) {
             String jns = rs.getString("nama_jns_laundry");         
             jns_laundry.addItem(jns);
           }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "GAGAL MENAMPILKAN DATA");
        }
    }
    
    public void tampil_tanggal_sekarang() {
        Date ys = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        tgl_diterima.setText(sdf.format(ys));
    }

    public void input_otomatis() {
        try {
            st = conn.createStatement();
            rs = st.executeQuery("SELECT * FROM tb_laundry order by id_laundry desc");
            if (rs.next()) {
                String kode = rs.getString("id_laundry").substring(5);
                String auto_number = "" + (Integer.parseInt(kode) + 1);
                String Nol = "";

                if(auto_number.length()==1) {
                    Nol = "000";
                } else if (auto_number.length() == 2) {
                    Nol = "00";
                } else if(auto_number.length() == 3) {
                    Nol = "0";
                } else if(auto_number.length() == 4) {
                    Nol = "";
                }
                no_invoice.setText("TRAN-" + Nol + auto_number);
            } else {
                no_invoice.setText("TRAN-0001");
            }
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Hitung = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        no_invoice = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        dashboard = new javax.swing.JButton();
        pelanggan_baru = new javax.swing.JButton();
        transaksi = new javax.swing.JButton();
        data_pelanggan = new javax.swing.JButton();
        laporan_pendapatan = new javax.swing.JButton();
        Hitung1 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        banyak_jaket = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        no_invoice1 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        dashboard1 = new javax.swing.JButton();
        pelanggan_baru1 = new javax.swing.JButton();
        transaksi1 = new javax.swing.JButton();
        data_pelanggan1 = new javax.swing.JButton();
        laporan_pendapatan1 = new javax.swing.JButton();
        jaket = new javax.swing.JCheckBox();
        boneka = new javax.swing.JCheckBox();
        total = new javax.swing.JLabel();
        ket_plain = new javax.swing.JLabel();
        total_plain = new javax.swing.JLabel();
        selimut = new javax.swing.JCheckBox();
        handuk = new javax.swing.JCheckBox();
        cbselimut = new javax.swing.JComboBox<>();
        cbjaket = new javax.swing.JComboBox<>();
        cbboneka = new javax.swing.JComboBox<>();
        cbhanduk = new javax.swing.JComboBox<>();
        xboneka = new javax.swing.JLabel();
        rp_selimut = new javax.swing.JLabel();
        txt_jml_kg = new javax.swing.JTextField();
        xjaket = new javax.swing.JLabel();
        xselimut = new javax.swing.JLabel();
        xhanduk = new javax.swing.JLabel();
        banyak_boneka = new javax.swing.JTextField();
        banyak_selimut = new javax.swing.JTextField();
        banyak_handuk = new javax.swing.JTextField();
        rp_jaket = new javax.swing.JLabel();
        rp_handuk = new javax.swing.JLabel();
        rp_boneka = new javax.swing.JLabel();
        txt_total_harga = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txt_jml_potong1 = new javax.swing.JTextField();
        jns_laundry = new javax.swing.JComboBox<>();
        txt_alamat = new javax.swing.JTextField();
        txt_nama = new javax.swing.JTextField();
        txt_id_pelanggan = new javax.swing.JTextField();
        tgl_diterima = new javax.swing.JTextField();
        txt_tgl_selesai = new com.toedter.calendar.JDateChooser();
        btnCetakInvoice = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        harga_jaket = new javax.swing.JTextField();
        harga_boneka = new javax.swing.JTextField();
        harga_selimut = new javax.swing.JTextField();
        harga_handuk = new javax.swing.JTextField();
        Harga1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Hitung.setBackground(new java.awt.Color(180, 199, 231));
        Hitung.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 102, 255), null));
        Hitung.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 153));
        jLabel1.setText("ID PELANGGAN");
        Hitung.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, 143, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 153));
        jLabel6.setText("NAMA");
        Hitung.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 51, 153));
        jLabel7.setText("ALAMAT");
        Hitung.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 51, 153));
        jLabel10.setText("JUMLAH KG");
        Hitung.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 420, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 51, 153));
        jLabel11.setText("JENIS PAKAIAN LAIN");
        Hitung.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 490, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 153));
        jLabel5.setText("DITERIMA");
        Hitung.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 380, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 51, 153));
        jLabel15.setText("SELESAI TANGGAL:");
        Hitung.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 450, -1, -1));

        jPanel4.setBackground(new java.awt.Color(218, 227, 243));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setBackground(new java.awt.Color(45, 85, 151));
        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(45, 85, 151));
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rumahlaundry/transaksi.png"))); // NOI18N
        jLabel14.setText("TRANSAKSI");
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 342, -1));

        Hitung.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 1160, 60));

        no_invoice.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        no_invoice.setForeground(new java.awt.Color(45, 85, 151));
        no_invoice.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Hitung.add(no_invoice, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 340, 140, 30));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(45, 85, 151));
        jLabel13.setText("No. Invoice: ");
        Hitung.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 340, 120, 30));

        jPanel3.setBackground(new java.awt.Color(156, 194, 230));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(51, 102, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rumahlaundry/logorl.png"))); // NOI18N
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 6, -1, -1));

        jLabel3.setBackground(new java.awt.Color(45, 85, 151));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(45, 85, 151));
        jLabel3.setText("RUMAH");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 19, -1, -1));

        jLabel4.setBackground(new java.awt.Color(45, 85, 151));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(45, 85, 151));
        jLabel4.setText("LAUNDRY");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 62, -1, -1));

        dashboard.setBackground(new java.awt.Color(230, 244, 241));
        dashboard.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        dashboard.setForeground(new java.awt.Color(45, 85, 151));
        dashboard.setText("DASHBOARD");
        dashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dashboardActionPerformed(evt);
            }
        });
        jPanel3.add(dashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 124, 276, 47));

        pelanggan_baru.setBackground(new java.awt.Color(230, 244, 241));
        pelanggan_baru.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pelanggan_baru.setForeground(new java.awt.Color(45, 85, 151));
        pelanggan_baru.setText("PELANGGAN BARU");
        pelanggan_baru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pelanggan_baruActionPerformed(evt);
            }
        });
        jPanel3.add(pelanggan_baru, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 177, 276, 47));

        transaksi.setBackground(new java.awt.Color(230, 244, 241));
        transaksi.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        transaksi.setForeground(new java.awt.Color(45, 85, 151));
        transaksi.setText("TRANSAKSI");
        transaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transaksiActionPerformed(evt);
            }
        });
        jPanel3.add(transaksi, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 230, 276, 47));

        data_pelanggan.setBackground(new java.awt.Color(230, 244, 241));
        data_pelanggan.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        data_pelanggan.setForeground(new java.awt.Color(45, 85, 151));
        data_pelanggan.setText("DATA PELANGGAN");
        data_pelanggan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                data_pelangganActionPerformed(evt);
            }
        });
        jPanel3.add(data_pelanggan, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 283, 276, 47));

        laporan_pendapatan.setBackground(new java.awt.Color(230, 244, 241));
        laporan_pendapatan.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        laporan_pendapatan.setForeground(new java.awt.Color(45, 85, 151));
        laporan_pendapatan.setText("LAPORAN PENDAPATAN");
        laporan_pendapatan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                laporan_pendapatanActionPerformed(evt);
            }
        });
        jPanel3.add(laporan_pendapatan, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 336, 276, 47));

        Hitung.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 920));

        Hitung1.setBackground(new java.awt.Color(180, 199, 231));
        Hitung1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 102, 255), null));
        Hitung1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 51, 153));
        jLabel19.setText("ID PELANGGAN");
        Hitung1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, 143, 30));

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 51, 153));
        jLabel20.setText("NAMA");
        Hitung1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, -1, -1));

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 51, 153));
        jLabel21.setText("ALAMAT");
        Hitung1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, -1, -1));

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 51, 153));
        jLabel24.setText("JUMLAH KG");
        Hitung1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 420, -1, -1));

        banyak_jaket.setAutoscrolls(false);
        banyak_jaket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                banyak_jaketActionPerformed(evt);
            }
        });
        banyak_jaket.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                banyak_jaketKeyReleased(evt);
            }
        });
        Hitung1.add(banyak_jaket, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 520, 30, 20));

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(0, 51, 153));
        jLabel25.setText("JENIS PAKAIAN LAIN");
        Hitung1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 490, -1, -1));

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(0, 51, 153));
        jLabel27.setText("DITERIMA");
        Hitung1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 380, -1, -1));

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(0, 51, 153));
        jLabel28.setText("SELESAI TANGGAL:");
        Hitung1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 450, -1, -1));

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rumahlaundry/logo besar.png"))); // NOI18N
        Hitung1.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 80, 280, 250));

        jPanel5.setBackground(new java.awt.Color(218, 227, 243));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel30.setBackground(new java.awt.Color(45, 85, 151));
        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(45, 85, 151));
        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rumahlaundry/transaksi.png"))); // NOI18N
        jLabel30.setText("TRANSAKSI");
        jPanel5.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 342, -1));

        Hitung1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 1160, 60));

        no_invoice1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        no_invoice1.setForeground(new java.awt.Color(45, 85, 151));
        no_invoice1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Hitung1.add(no_invoice1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 340, 140, 30));

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(45, 85, 151));
        jLabel31.setText("No. Invoice: ");
        Hitung1.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 340, 120, 30));

        jLabel32.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(0, 51, 153));
        jLabel32.setText("JUMLAH POTONG");
        Hitung1.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 250, -1, -1));

        jLabel33.setText("Rp.");
        Hitung1.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 390, -1, -1));

        jPanel6.setBackground(new java.awt.Color(156, 194, 230));
        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel34.setBackground(new java.awt.Color(51, 102, 255));
        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rumahlaundry/logorl.png"))); // NOI18N
        jPanel6.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 6, -1, -1));

        jLabel35.setBackground(new java.awt.Color(45, 85, 151));
        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(45, 85, 151));
        jLabel35.setText("RUMAH");
        jPanel6.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 19, -1, -1));

        jLabel36.setBackground(new java.awt.Color(45, 85, 151));
        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(45, 85, 151));
        jLabel36.setText("LAUNDRY");
        jPanel6.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 62, -1, -1));

        dashboard1.setBackground(new java.awt.Color(230, 244, 241));
        dashboard1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        dashboard1.setForeground(new java.awt.Color(45, 85, 151));
        dashboard1.setText("DASHBOARD");
        dashboard1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dashboard1ActionPerformed(evt);
            }
        });
        jPanel6.add(dashboard1, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 124, 276, 47));

        pelanggan_baru1.setBackground(new java.awt.Color(230, 244, 241));
        pelanggan_baru1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pelanggan_baru1.setForeground(new java.awt.Color(45, 85, 151));
        pelanggan_baru1.setText("PELANGGAN BARU");
        pelanggan_baru1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pelanggan_baru1ActionPerformed(evt);
            }
        });
        jPanel6.add(pelanggan_baru1, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 177, 276, 47));

        transaksi1.setBackground(new java.awt.Color(230, 244, 241));
        transaksi1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        transaksi1.setForeground(new java.awt.Color(45, 85, 151));
        transaksi1.setText("TRANSAKSI");
        transaksi1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transaksi1ActionPerformed(evt);
            }
        });
        jPanel6.add(transaksi1, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 230, 276, 47));

        data_pelanggan1.setBackground(new java.awt.Color(230, 244, 241));
        data_pelanggan1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        data_pelanggan1.setForeground(new java.awt.Color(45, 85, 151));
        data_pelanggan1.setText("DATA PELANGGAN");
        data_pelanggan1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                data_pelanggan1ActionPerformed(evt);
            }
        });
        jPanel6.add(data_pelanggan1, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 283, 276, 47));

        laporan_pendapatan1.setBackground(new java.awt.Color(230, 244, 241));
        laporan_pendapatan1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        laporan_pendapatan1.setForeground(new java.awt.Color(45, 85, 151));
        laporan_pendapatan1.setText("LAPORAN PENDAPATAN");
        laporan_pendapatan1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                laporan_pendapatan1ActionPerformed(evt);
            }
        });
        jPanel6.add(laporan_pendapatan1, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 336, 276, 47));

        Hitung1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 920));

        jaket.setBackground(new java.awt.Color(180, 199, 231));
        jaket.setText("JAKET");
        jaket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jaketActionPerformed(evt);
            }
        });
        Hitung1.add(jaket, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 520, 90, -1));

        boneka.setBackground(new java.awt.Color(180, 199, 231));
        boneka.setText("BONEKA");
        boneka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bonekaActionPerformed(evt);
            }
        });
        Hitung1.add(boneka, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 560, 90, -1));

        total.setText("Total =");
        Hitung1.add(total, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 600, -1, -1));

        ket_plain.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Hitung1.add(ket_plain, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 600, 330, 20));

        total_plain.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        total_plain.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                total_plainMouseClicked(evt);
            }
        });
        Hitung1.add(total_plain, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 600, 130, 20));

        selimut.setBackground(new java.awt.Color(180, 199, 231));
        selimut.setText("SELIMUT");
        selimut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selimutActionPerformed(evt);
            }
        });
        Hitung1.add(selimut, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 560, 90, -1));

        handuk.setBackground(new java.awt.Color(180, 199, 231));
        handuk.setText("HANDUK");
        handuk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                handukActionPerformed(evt);
            }
        });
        Hitung1.add(handuk, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 520, 90, -1));

        cbselimut.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "M", "L", "XL" }));
        cbselimut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbselimutActionPerformed(evt);
            }
        });
        Hitung1.add(cbselimut, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 560, 60, -1));

        cbjaket.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "M", "L", "XL" }));
        cbjaket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbjaketActionPerformed(evt);
            }
        });
        Hitung1.add(cbjaket, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 520, 60, -1));

        cbboneka.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "M", "L", "XL" }));
        cbboneka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbonekaActionPerformed(evt);
            }
        });
        Hitung1.add(cbboneka, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 560, 60, -1));

        cbhanduk.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "M", "L", "XL" }));
        cbhanduk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbhandukActionPerformed(evt);
            }
        });
        Hitung1.add(cbhanduk, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 520, 60, -1));

        xboneka.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        xboneka.setText("x");
        Hitung1.add(xboneka, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 560, 20, -1));

        rp_selimut.setText("Rp.");
        Hitung1.add(rp_selimut, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 580, -1, -1));

        txt_jml_kg.setAutoscrolls(false);
        txt_jml_kg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_jml_kgActionPerformed(evt);
            }
        });
        txt_jml_kg.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_jml_kgKeyReleased(evt);
            }
        });
        Hitung1.add(txt_jml_kg, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 440, 500, 30));

        xjaket.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        xjaket.setText("x");
        Hitung1.add(xjaket, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 520, 20, -1));

        xselimut.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        xselimut.setText("x");
        Hitung1.add(xselimut, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 560, 20, -1));

        xhanduk.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        xhanduk.setText("x");
        Hitung1.add(xhanduk, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 520, 20, -1));

        banyak_boneka.setAutoscrolls(false);
        banyak_boneka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                banyak_bonekaActionPerformed(evt);
            }
        });
        banyak_boneka.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                banyak_bonekaKeyReleased(evt);
            }
        });
        Hitung1.add(banyak_boneka, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 560, 30, 20));

        banyak_selimut.setAutoscrolls(false);
        banyak_selimut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                banyak_selimutActionPerformed(evt);
            }
        });
        banyak_selimut.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                banyak_selimutKeyReleased(evt);
            }
        });
        Hitung1.add(banyak_selimut, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 560, 30, 20));

        banyak_handuk.setAutoscrolls(false);
        banyak_handuk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                banyak_handukActionPerformed(evt);
            }
        });
        banyak_handuk.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                banyak_handukKeyReleased(evt);
            }
        });
        Hitung1.add(banyak_handuk, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 520, 30, 20));

        rp_jaket.setText("Rp.");
        Hitung1.add(rp_jaket, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 540, -1, -1));

        rp_handuk.setText("Rp.");
        Hitung1.add(rp_handuk, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 540, -1, -1));

        rp_boneka.setText("Rp.");
        Hitung1.add(rp_boneka, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 580, -1, -1));

        txt_total_harga.setAutoscrolls(false);
        txt_total_harga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_total_hargaActionPerformed(evt);
            }
        });
        Hitung1.add(txt_total_harga, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 650, 500, 30));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 51, 153));
        jLabel12.setText("TOTAL HARGA");
        Hitung1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 630, -1, -1));

        txt_jml_potong1.setAutoscrolls(false);
        Hitung1.add(txt_jml_potong1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 280, 500, 30));

        jns_laundry.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Pilih--" }));
        jns_laundry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jns_laundryActionPerformed(evt);
            }
        });
        jns_laundry.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jns_laundryKeyReleased(evt);
            }
        });
        Hitung1.add(jns_laundry, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 350, 500, 30));

        txt_alamat.setEditable(false);
        txt_alamat.setAutoscrolls(false);
        Hitung1.add(txt_alamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, 500, 30));

        txt_nama.setEditable(false);
        txt_nama.setAutoscrolls(false);
        Hitung1.add(txt_nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, 500, 30));

        txt_id_pelanggan.setAutoscrolls(false);
        txt_id_pelanggan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_id_pelangganKeyReleased(evt);
            }
        });
        Hitung1.add(txt_id_pelanggan, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, 500, 30));

        tgl_diterima.setEditable(false);
        tgl_diterima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tgl_diterimaActionPerformed(evt);
            }
        });
        Hitung1.add(tgl_diterima, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 410, 290, 30));

        txt_tgl_selesai.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                txt_tgl_selesaiPropertyChange(evt);
            }
        });
        Hitung1.add(txt_tgl_selesai, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 470, 290, 30));

        btnCetakInvoice.setBackground(new java.awt.Color(230, 244, 241));
        btnCetakInvoice.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCetakInvoice.setForeground(new java.awt.Color(45, 85, 151));
        btnCetakInvoice.setText("CETAK INVOICE");
        btnCetakInvoice.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCetakInvoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCetakInvoiceActionPerformed(evt);
            }
        });
        Hitung1.add(btnCetakInvoice, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 520, 290, 40));

        jButton1.setText("Cek Total");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        Hitung1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 620, 100, -1));

        harga_jaket.setEditable(false);
        harga_jaket.setBackground(new java.awt.Color(180, 199, 231));
        harga_jaket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                harga_jaketActionPerformed(evt);
            }
        });
        Hitung1.add(harga_jaket, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 540, 80, 20));

        harga_boneka.setEditable(false);
        harga_boneka.setBackground(new java.awt.Color(180, 199, 231));
        Hitung1.add(harga_boneka, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 580, 80, 20));

        harga_selimut.setEditable(false);
        harga_selimut.setBackground(new java.awt.Color(180, 199, 231));
        Hitung1.add(harga_selimut, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 580, 80, 20));

        harga_handuk.setEditable(false);
        harga_handuk.setBackground(new java.awt.Color(180, 199, 231));
        Hitung1.add(harga_handuk, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 540, 80, 20));

        Harga1.setText("0");
        Harga1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Harga1KeyReleased(evt);
            }
        });
        Hitung1.add(Harga1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 390, 90, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 51, 153));
        jLabel8.setText("JENIS LAUNDRY");
        Hitung1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 330, -1, -1));

        Hitung.add(Hitung1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel37.setText("Rp.");
        Hitung.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 310, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(Hitung, javax.swing.GroupLayout.PREFERRED_SIZE, 1437, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Hitung, javax.swing.GroupLayout.PREFERRED_SIZE, 919, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jns_laundryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jns_laundryActionPerformed
        // TODO add your handling code here:
        try {
        Statement stt = conn.createStatement();
        String sql = "SELECT harga FROM tb_jns_laundry WHERE nama_jns_laundry='" +jns_laundry.getSelectedItem()+"'";  
        ResultSet res = stt.executeQuery(sql);
        
        while(res.next()){
            Object[] ob = new Object[1];
            ob[0] =  res.getString(1);
            
            Harga1.setText((String) ob[0]);
        }
        res.close(); 
        stt.close();
         
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_jns_laundryActionPerformed
          
    private void btnCetakInvoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCetakInvoiceActionPerformed
        // TODO add your handling code here:
        // masuk ke tb_laundry        
        String id_laundry = no_invoice.getText();
        String jenis_laundry = jns_laundry.getSelectedItem().toString();
        String jumlah_potong = txt_jml_potong1.getText();
        String jumlahKG = txt_jml_kg.getText();
        String jenis_pakaian_lain = ket_plain.getText();
        String total_harga = txt_total_harga.getText();       
            
        try {
            String sql = "INSERT INTO tb_laundry (id_laundry, nama_jns_laundry, jml_potong, jml_kg,"
                    + " nama_jns_plain, total_harga) VALUES (?,?,?,?,?,?)";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, id_laundry);
            pst.setString(2, jenis_laundry);
            pst.setString(3, jumlah_potong);
            pst.setString(4, jumlahKG);
            pst.setString(5, jenis_pakaian_lain);
            pst.setString(6, total_harga);
            pst.execute();
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
            
        
        // masuk ke tb_transaksi
        String id_member = txt_id_pelanggan.getText().toString();
        String diterima = tgl_diterima.getText();
        
        SimpleDateFormat ubahFormat = new SimpleDateFormat("yyyy-MM-dd");
        String date = String.valueOf(ubahFormat.format(txt_tgl_selesai.getDate()));
        
        try {
            String sql = "INSERT INTO tb_transaksi (id_member, tgl_terima, tgl_selesai, id_laundry) VALUES (?,?,?,?)";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, id_member);
            pst.setString(2, diterima);
            pst.setString(3, date);
            pst.setString(4, id_laundry);
            pst.execute();
            JOptionPane.showMessageDialog(this, "Transaksi berhasil ditambahkan");
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
        // cetak invoice
        java.sql.Connection con = null;
        try {

            String report = ("src/Report/nota_laundry.jasper");

            // mengambil parameter dari iReport
            HashMap hash = new HashMap();
            hash.put("id_member", no_invoice);
            JasperReport JRpt = JasperCompileManager.compileReport(report);
            JasperPrint JPrint = JasperFillManager.fillReport(JRpt, null, con);
            JasperViewer.viewReport(JPrint, false);
        } catch (Exception e) {
            System.out.println("Report Can't view because : " + e);
        }
    }//GEN-LAST:event_btnCetakInvoiceActionPerformed

    private void tgl_diterimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tgl_diterimaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tgl_diterimaActionPerformed

    private void txt_jml_kgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_jml_kgActionPerformed
        // TODO add your handling code here:
   
    }//GEN-LAST:event_txt_jml_kgActionPerformed

    private void txt_total_hargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_total_hargaActionPerformed
        // TODO add your handling code here
    }//GEN-LAST:event_txt_total_hargaActionPerformed

    private void txt_id_pelangganKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_id_pelangganKeyReleased
        // TODO add your handling code here:
        tampil();
    }//GEN-LAST:event_txt_id_pelangganKeyReleased

    private void jns_laundryKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jns_laundryKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jns_laundryKeyReleased

    private void Harga1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Harga1KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_Harga1KeyReleased

    private void txt_jml_kgKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_jml_kgKeyReleased
        // TODO add your handling code here:
        int JumlahBarang1, HargaBarang1;
        JumlahBarang1 = Integer.parseInt(txt_jml_kg.getText());
        HargaBarang1 = Integer.parseInt(Harga1.getText());
        
        int jns_pakaian = HargaBarang1 * JumlahBarang1;
        txt_total_harga.setText(Integer.toString(jns_pakaian));
    }//GEN-LAST:event_txt_jml_kgKeyReleased

    private void dashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dashboardActionPerformed
        // TODO add your handling code here:
        new halm_dashboard().setVisible(true);
        dispose();
    }//GEN-LAST:event_dashboardActionPerformed

    private void pelanggan_baruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pelanggan_baruActionPerformed
        // TODO add your handling code here:
        new halm_pelanggan_baru().setVisible(true);
        dispose();
    }//GEN-LAST:event_pelanggan_baruActionPerformed

    private void transaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transaksiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_transaksiActionPerformed

    private void data_pelangganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_data_pelangganActionPerformed
        // TODO add your handling code here:
        new halm_data_pelanggan().setVisible(true);
        dispose();
    }//GEN-LAST:event_data_pelangganActionPerformed

    private void laporan_pendapatanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_laporan_pendapatanActionPerformed
        // TODO add your handling code here:
        new halm_pendapatan().setVisible(true);
        dispose();
    }//GEN-LAST:event_laporan_pendapatanActionPerformed

    private void txt_tgl_selesaiPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txt_tgl_selesaiPropertyChange
        // TODO add your handling code here:
        if (txt_tgl_selesai.getDate() != null) {
            SimpleDateFormat ubahFormat = new SimpleDateFormat("yyyy-MM-dd");
            String date = String.valueOf(ubahFormat.format(txt_tgl_selesai.getDate()));
        }
    }//GEN-LAST:event_txt_tgl_selesaiPropertyChange

    private void banyak_jaketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_banyak_jaketActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_banyak_jaketActionPerformed

    private void banyak_jaketKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_banyak_jaketKeyReleased
        // TODO add your handling code here:
        try {
            int harga, banyak;
            harga = Integer.parseInt(harga_jaket.getText());
            banyak = Integer.parseInt(banyak_jaket.getText());

            int total = harga * banyak;
            harga_jaket.setText(Integer.toString(total));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_banyak_jaketKeyReleased

    private void dashboard1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dashboard1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dashboard1ActionPerformed

    private void pelanggan_baru1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pelanggan_baru1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pelanggan_baru1ActionPerformed

    private void transaksi1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transaksi1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_transaksi1ActionPerformed

    private void data_pelanggan1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_data_pelanggan1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_data_pelanggan1ActionPerformed

    private void laporan_pendapatan1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_laporan_pendapatan1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_laporan_pendapatan1ActionPerformed

    private void jaketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jaketActionPerformed
        // TODO add your handling code here:
        if(jaket.isSelected()) {
            ket_plain.setText(ket_plain.getText() +"\n JAKET");
            ket_plain.setVisible(true);
            total.setVisible(true);
            total_plain.setVisible(true);
            
            jaket.setVisible(true);
            banyak_jaket.setVisible(true);
            xjaket.setVisible(true);
            cbjaket.setVisible(true);
            rp_jaket.setVisible(true);
            harga_jaket.setVisible(true);
        } else {
            ket_plain.setText("");
            harga_jaket.setText("0");
            
            banyak_jaket.setVisible(false);
            xjaket.setVisible(false);
            cbjaket.setVisible(false);
            rp_jaket.setVisible(false);
            harga_jaket.setVisible(false);
        }
    }//GEN-LAST:event_jaketActionPerformed

    private void cbjaketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbjaketActionPerformed
        // TODO add your handling code here:
        String ukuran = (String)cbjaket.getSelectedItem();
        switch (ukuran){
            case "M":
                harga_jaket.setText("1000");
                break;

            case "L":
                harga_jaket.setText("2000");
                break;

            case "XL":
                harga_jaket.setText("3000");
                break;
            default:
                JOptionPane.showMessageDialog(this, "Silahkan pilih untuk melanjutkan!");
        }
    }//GEN-LAST:event_cbjaketActionPerformed

    private void cbselimutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbselimutActionPerformed
        // TODO add your handling code here:
        String ukuran = (String)cbselimut.getSelectedItem();
        switch (ukuran){
            case "M":
                harga_selimut.setText("3000");
            break;

            case "L":
                harga_selimut.setText("5000");
            break;

            case "XL":
                harga_selimut.setText("7000");
            break;
        }
    }//GEN-LAST:event_cbselimutActionPerformed

    private void cbhandukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbhandukActionPerformed
        // TODO add your handling code here:
        String ukuran = (String)cbhanduk.getSelectedItem();
        switch (ukuran){
            case "M":
                harga_handuk.setText("1000");
            break;

            case "L":
                harga_handuk.setText("1500");
            break;

            case "XL":
                harga_handuk.setText("2000");
            break;
        }
    }//GEN-LAST:event_cbhandukActionPerformed

    private void cbbonekaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbonekaActionPerformed
        // TODO add your handling code here:
        String ukuran = (String)cbboneka.getSelectedItem();
        switch (ukuran){
            case "M":
                harga_boneka.setText("4000");
            break;

            case "L":
                harga_boneka.setText("7000");
            break;

            case "XL":
                harga_boneka.setText("10000");
            break;
        }
    }//GEN-LAST:event_cbbonekaActionPerformed

    private void banyak_bonekaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_banyak_bonekaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_banyak_bonekaActionPerformed

    private void banyak_bonekaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_banyak_bonekaKeyReleased
        // TODO add your handling code here:
        try {
            int harga, banyak;
            harga = Integer.parseInt(harga_boneka.getText());
            banyak = Integer.parseInt(banyak_boneka.getText());

            int total = harga * banyak;
            harga_boneka.setText(Integer.toString(total));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_banyak_bonekaKeyReleased

    private void banyak_selimutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_banyak_selimutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_banyak_selimutActionPerformed

    private void banyak_selimutKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_banyak_selimutKeyReleased
        // TODO add your handling code here:
        try {
            int harga, banyak;
            harga = Integer.parseInt(harga_selimut.getText());
            banyak = Integer.parseInt(banyak_selimut.getText());

            int total = harga * banyak;
            harga_selimut.setText(Integer.toString(total));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_banyak_selimutKeyReleased

    private void banyak_handukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_banyak_handukActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_banyak_handukActionPerformed

    private void banyak_handukKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_banyak_handukKeyReleased
        // TODO add your handling code here::
        try {
            int harga, banyak;
            harga = Integer.parseInt(harga_handuk.getText());
            banyak = Integer.parseInt(banyak_handuk.getText());

            int total = harga * banyak;
            harga_handuk.setText(Integer.toString(total));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_banyak_handukKeyReleased

    private void selimutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selimutActionPerformed
        // TODO add your handling code here:
        if(selimut.isSelected()) {
            ket_plain.setText(ket_plain.getText() +"\n SELIMUT");
            ket_plain.setVisible(true);
            total.setVisible(true);
            total_plain.setVisible(true);
            
            selimut.setVisible(true);
            banyak_selimut.setVisible(true);
            xselimut.setVisible(true);
            cbselimut.setVisible(true);
            rp_selimut.setVisible(true);
            harga_selimut.setVisible(true);
        } else {
            ket_plain.setText("");
            harga_selimut.setText("0");
            
            banyak_selimut.setVisible(false);
            xselimut.setVisible(false);
            cbselimut.setVisible(false);
            rp_selimut.setVisible(false);
            harga_selimut.setVisible(false);
        }
    }//GEN-LAST:event_selimutActionPerformed

    private void handukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_handukActionPerformed
        // TODO add your handling code here:
        if(handuk.isSelected()) {
            ket_plain.setText(ket_plain.getText() +"\n HANDUK");
            ket_plain.setVisible(true);
            total.setVisible(true);
            total_plain.setVisible(true);
            
            handuk.setVisible(true);
            banyak_handuk.setVisible(true);
            xhanduk.setVisible(true);
            cbhanduk.setVisible(true);
            rp_handuk.setVisible(true);
            harga_handuk.setVisible(true);
        } else {
            ket_plain.setText("");
            harga_handuk.setText("0");
            
            banyak_handuk.setVisible(false);
            xhanduk.setVisible(false);
            cbhanduk.setVisible(false);
            rp_handuk.setVisible(false);
            harga_handuk.setVisible(false);
        }
    }//GEN-LAST:event_handukActionPerformed

    private void bonekaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bonekaActionPerformed
        // TODO add your handling code here:
        if(boneka.isSelected()) {
            ket_plain.setText(ket_plain.getText() +"\n BONEKA");
            ket_plain.setVisible(true);
            total.setVisible(true);
            total_plain.setVisible(true);
            
            boneka.setVisible(true);
            banyak_boneka.setVisible(true);
            xboneka.setVisible(true);
            cbboneka.setVisible(true);
            rp_boneka.setVisible(true);
            harga_boneka.setVisible(true);
        } else {
            ket_plain.setText("");
            harga_boneka.setText("0");
            
            banyak_boneka.setVisible(false);
            xboneka.setVisible(false);
            cbboneka.setVisible(false);
            rp_boneka.setVisible(false);
            harga_boneka.setVisible(false);
        }
    }//GEN-LAST:event_bonekaActionPerformed

    private void total_plainMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_total_plainMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_total_plainMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int jaket, selimut, handuk, boneka;
        jaket = Integer.parseInt(harga_jaket.getText());
        selimut = Integer.parseInt(harga_selimut.getText());
        handuk = Integer.parseInt(harga_handuk.getText());
        boneka = Integer.parseInt(harga_boneka.getText());

        int total = jaket  + handuk + boneka;
        total_plain.setText(Integer.toString(total));

        // untuk jenis laundry + jenis pakaian lain
        int JumlahBarang1, HargaBarang1;
        JumlahBarang1 = Integer.parseInt(txt_jml_kg.getText());
        HargaBarang1 = Integer.parseInt(Harga1.getText());

        int jns_pakaian = HargaBarang1 * JumlahBarang1;
        int total_bayar = total + jns_pakaian;
        txt_total_harga.setText(Integer.toString(total_bayar));
    }//GEN-LAST:event_jButton1ActionPerformed

    private void harga_jaketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_harga_jaketActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_harga_jaketActionPerformed
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(halm_transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(halm_transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(halm_transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(halm_transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new halm_transaksi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Harga1;
    private javax.swing.JPanel Hitung;
    private javax.swing.JPanel Hitung1;
    private javax.swing.JTextField banyak_boneka;
    private javax.swing.JTextField banyak_handuk;
    private javax.swing.JTextField banyak_jaket;
    private javax.swing.JTextField banyak_selimut;
    private javax.swing.JCheckBox boneka;
    private javax.swing.JButton btnCetakInvoice;
    private javax.swing.JComboBox<String> cbboneka;
    private javax.swing.JComboBox<String> cbhanduk;
    private javax.swing.JComboBox<String> cbjaket;
    private javax.swing.JComboBox<String> cbselimut;
    private javax.swing.JButton dashboard;
    private javax.swing.JButton dashboard1;
    private javax.swing.JButton data_pelanggan;
    private javax.swing.JButton data_pelanggan1;
    private javax.swing.JCheckBox handuk;
    private javax.swing.JTextField harga_boneka;
    private javax.swing.JTextField harga_handuk;
    private javax.swing.JTextField harga_jaket;
    private javax.swing.JTextField harga_selimut;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JCheckBox jaket;
    private javax.swing.JComboBox<String> jns_laundry;
    private javax.swing.JLabel ket_plain;
    private javax.swing.JButton laporan_pendapatan;
    private javax.swing.JButton laporan_pendapatan1;
    private javax.swing.JLabel no_invoice;
    private javax.swing.JLabel no_invoice1;
    private javax.swing.JButton pelanggan_baru;
    private javax.swing.JButton pelanggan_baru1;
    private javax.swing.JLabel rp_boneka;
    private javax.swing.JLabel rp_handuk;
    private javax.swing.JLabel rp_jaket;
    private javax.swing.JLabel rp_selimut;
    private javax.swing.JCheckBox selimut;
    private javax.swing.JTextField tgl_diterima;
    private javax.swing.JLabel total;
    private javax.swing.JLabel total_plain;
    private javax.swing.JButton transaksi;
    private javax.swing.JButton transaksi1;
    private javax.swing.JTextField txt_alamat;
    private javax.swing.JTextField txt_id_pelanggan;
    private javax.swing.JTextField txt_jml_kg;
    private javax.swing.JTextField txt_jml_potong1;
    private javax.swing.JTextField txt_nama;
    private com.toedter.calendar.JDateChooser txt_tgl_selesai;
    private javax.swing.JTextField txt_total_harga;
    private javax.swing.JLabel xboneka;
    private javax.swing.JLabel xhanduk;
    private javax.swing.JLabel xjaket;
    private javax.swing.JLabel xselimut;
    // End of variables declaration//GEN-END:variables
}
