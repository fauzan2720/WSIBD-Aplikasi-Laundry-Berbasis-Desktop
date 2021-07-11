
import java.io.File;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import koneksi.koneksi;
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
public class halm_data_pelanggan extends javax.swing.JFrame {

    /**
     * Creates new form 
     */
    
    private Connection conn;
    private ResultSet rs;
    PreparedStatement pst;
   
    public halm_data_pelanggan() {
        initComponents();
        conn = koneksi.getConnection();
        UpdateTabel();
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popupMenu1 = new java.awt.PopupMenu();
        popupMenu2 = new java.awt.PopupMenu();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabel_pendapatan = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        dashboard = new javax.swing.JButton();
        pelanggan_baru = new javax.swing.JButton();
        transaksi = new javax.swing.JButton();
        data_pelanggan = new javax.swing.JButton();
        laporan_pendapatan = new javax.swing.JButton();

        popupMenu1.setLabel("popupMenu1");

        popupMenu2.setLabel("popupMenu2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(180, 199, 231));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(218, 227, 243));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setBackground(new java.awt.Color(45, 85, 151));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(45, 85, 151));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rumahlaundry/data pelanggan.png"))); // NOI18N
        jLabel5.setText("DATA PELANGGAN");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 620, -1));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 1160, 60));

        tabel_pendapatan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID_Pelanggan", "Nama", "Jenis Kelamin", "Tanggal Daftar", "No. Telp/HP", "Alamat", "Aksi"
            }
        ));
        jScrollPane2.setViewportView(tabel_pendapatan);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, 980, 270));

        jTextField1.setToolTipText("Masukkan nama pelanggan .....");
        jTextField1.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jTextField1.setMargin(new java.awt.Insets(2, 10, 2, 2));
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, 910, 30));

        jButton7.setBackground(new java.awt.Color(230, 244, 241));
        jButton7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton7.setForeground(new java.awt.Color(45, 85, 151));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rumahlaundry/search.png"))); // NOI18N
        jButton7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 120, 70, 30));

        jButton1.setText("Export to PDF");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 440, 140, 40));

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

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 920));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1437, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 919, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {
            File namafile = new File("src/Report/data_member.jasper");
            JasperPrint jp = JasperFillManager.fillReport(namafile.getPath(), null, koneksi.getConnection());
            JasperViewer.viewReport(jp, false);
        } catch ( JRException e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
        new halm_transaksi().setVisible(true);
        dispose();
    }//GEN-LAST:event_transaksiActionPerformed

    private void data_pelangganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_data_pelangganActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_data_pelangganActionPerformed

    private void laporan_pendapatanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_laporan_pendapatanActionPerformed
        // TODO add your handling code here:
        new halm_pendapatan().setVisible(true);
        dispose();
    }//GEN-LAST:event_laporan_pendapatanActionPerformed

     private void UpdateTabel() {
        try {
            String sql = "SELECT * FROM tb_member            String sql = \"SELECT * FROM tb_member\";\n" +
"";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            DefaultTableModel dtm = (DefaultTableModel) tabel_pendapatan.getModel();
            dtm.setRowCount(0);
            String [] data = new String[6];
            int i = 1;
       
            while(rs.next()) {
                data[0] = rs.getString("id_member");
                data[1] = rs.getString("nama");
                data[2] = rs.getString("jenis_kelamin");
                data[3] = rs.getString("tgl_daftar");
                data[4] = rs.getString("no_telp");
                data[5] = rs.getString("alamat");
                dtm.addRow(data);
                i++;
            }
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
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
            java.util.logging.Logger.getLogger(halm_dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(halm_dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(halm_dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(halm_dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new halm_data_pelanggan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton dashboard;
    private javax.swing.JButton data_pelanggan;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton laporan_pendapatan;
    private javax.swing.JButton pelanggan_baru;
    private java.awt.PopupMenu popupMenu1;
    private java.awt.PopupMenu popupMenu2;
    private javax.swing.JTable tabel_pendapatan;
    private javax.swing.JButton transaksi;
    // End of variables declaration//GEN-END:variables
}
