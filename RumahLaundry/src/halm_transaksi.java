import koneksi.koneksi;
import java.io.File;
import java.sql.Connection;
import koneksi.koneksi;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
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
        conn = koneksi.getConnection();
        input_otomatis();
        jns_laundry();
        jns_plain();
        tampil_tanggal_sekarang();
        txt_id_pelanggan.requestFocus();
    }
    
    public void jns_laundry() {
        try {
           String sql = "SELECT * FROM tb_jns_laundry";
           st = conn.createStatement();
           rs = st.executeQuery(sql);
           jns_laundry.addItem("");
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
    
    public void jns_plain() {
        try {
           String sql = "SELECT * FROM tb_jns_plain";
           st = conn.createStatement();
           rs = st.executeQuery(sql);
           jns_plain.addItem("");
           while (rs.next()) {
             String jns = rs.getString("nama_plain");         
             jns_plain.addItem(jns);
           }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "GAGAL MENAMPILKAN DATA");
        }
    }

    public void input_otomatis() {
        try {
            st = conn.createStatement();
            rs = st.executeQuery("SELECT * FROM tb_laundry order by id_laundry desc");
            if (rs.next()) {
                String kode = rs.getString("id_laundry").substring(1);
                String AN = "" + (Integer.parseInt(kode) + 1);
                String Nol = "";

                if(AN.length()==1) {
                    Nol = "000";
                } else if (AN.length() == 2) {
                    Nol = "00";
                } else if(AN.length() == 3) {
                    Nol = "0";
                } else if(AN.length() == 4) {
                    Nol = "";
                }
                no_invoice.setText("TRAN-" + Nol + AN);
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_id_pelanggan = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        btnSimpan = new javax.swing.JButton();
        jns_laundry = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        tgl_selesai = new com.toedter.calendar.JDateChooser();
        jns_plain = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jPanel4 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        dashboard = new javax.swing.JButton();
        pelanggan_baru = new javax.swing.JButton();
        transaksi = new javax.swing.JButton();
        data_pelanggan = new javax.swing.JButton();
        laporan_pendapatan = new javax.swing.JButton();
        no_invoice = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        btnCetakInvoice = new javax.swing.JButton();
        tgl_diterima = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(180, 199, 231));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 102, 255), null));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 153));
        jLabel1.setText("ID PELANGGAN");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, 143, 30));

        txt_id_pelanggan.setAutoscrolls(false);
        jPanel1.add(txt_id_pelanggan, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, 500, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 153));
        jLabel6.setText("NAMA");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, -1, -1));

        jTextField2.setAutoscrolls(false);
        jTextField2.setEnabled(false);
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, 500, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 51, 153));
        jLabel7.setText("ALAMAT");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, -1, -1));

        jTextField3.setAutoscrolls(false);
        jTextField3.setEnabled(false);
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, 500, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 51, 153));
        jLabel8.setText("JENIS LAUNDRY");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 250, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 51, 153));
        jLabel9.setText("JUMLAH POTONG");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 330, -1, -1));

        jTextField5.setAutoscrolls(false);
        jPanel1.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 350, 500, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 51, 153));
        jLabel10.setText("JUMLAH KG");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 400, -1, -1));

        jTextField6.setAutoscrolls(false);
        jPanel1.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 420, 500, 30));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 51, 153));
        jLabel11.setText("JENIS PAKAIAN LAIN");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 470, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 51, 153));
        jLabel12.setText("TOTAL HARGA");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 670, -1, -1));

        jTextField8.setAutoscrolls(false);
        jPanel1.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 690, 500, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 153));
        jLabel5.setText("DITERIMA");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 380, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 51, 153));
        jLabel15.setText("SELESAI TANGGAL:");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 450, -1, -1));

        btnSimpan.setBackground(new java.awt.Color(230, 244, 241));
        btnSimpan.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSimpan.setForeground(new java.awt.Color(45, 85, 151));
        btnSimpan.setText("SIMPAN");
        btnSimpan.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });
        jPanel1.add(btnSimpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 570, 290, 40));

        jns_laundry.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jns_laundry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jns_laundryActionPerformed(evt);
            }
        });
        jPanel1.add(jns_laundry, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 278, 500, 30));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rumahlaundry/logo besar.png"))); // NOI18N
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 80, 280, 250));
        jPanel1.add(tgl_selesai, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 470, 290, 30));

        jns_plain.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(jns_plain, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 498, 500, 30));

        jButton2.setBackground(new java.awt.Color(230, 244, 241));
        jButton2.setForeground(new java.awt.Color(45, 85, 151));
        jButton2.setText("+");
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 500, 50, 30));

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jList1.setAutoscrolls(false);
        jScrollPane1.setViewportView(jList1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 530, 500, 130));

        jPanel4.setBackground(new java.awt.Color(218, 227, 243));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setBackground(new java.awt.Color(45, 85, 151));
        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(45, 85, 151));
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rumahlaundry/transaksi.png"))); // NOI18N
        jLabel14.setText("TRANSAKSI");
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 342, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 1160, 60));

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

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 920));

        no_invoice.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        no_invoice.setForeground(new java.awt.Color(45, 85, 151));
        no_invoice.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(no_invoice, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 340, 140, 30));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(45, 85, 151));
        jLabel13.setText("No. Invoice: ");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 340, 120, 30));

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
        jPanel1.add(btnCetakInvoice, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 520, 290, 40));

        tgl_diterima.setEnabled(false);
        tgl_diterima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tgl_diterimaActionPerformed(evt);
            }
        });
        jPanel1.add(tgl_diterima, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 400, 290, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1437, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 919, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jns_laundryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jns_laundryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jns_laundryActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSimpanActionPerformed

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

    private void btnCetakInvoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCetakInvoiceActionPerformed
        // TODO add your handling code here:
        try {
            File namafile = new File("src/Report/nota_laundry.jasper");
            JasperPrint jp = JasperFillManager.fillReport(namafile.getPath(), null, koneksi.getConnection());
            JasperViewer.viewReport(jp, false);
        } catch ( JRException e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }//GEN-LAST:event_btnCetakInvoiceActionPerformed

    private void tgl_diterimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tgl_diterimaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tgl_diterimaActionPerformed

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
    private javax.swing.JButton btnCetakInvoice;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton dashboard;
    private javax.swing.JButton data_pelanggan;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JComboBox<String> jns_laundry;
    private javax.swing.JComboBox<String> jns_plain;
    private javax.swing.JButton laporan_pendapatan;
    private javax.swing.JLabel no_invoice;
    private javax.swing.JButton pelanggan_baru;
    private javax.swing.JTextField tgl_diterima;
    private com.toedter.calendar.JDateChooser tgl_selesai;
    private javax.swing.JButton transaksi;
    private javax.swing.JTextField txt_id_pelanggan;
    // End of variables declaration//GEN-END:variables
}
