
import java.awt.HeadlessException;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Fauzan
 */
public class halm_pelanggan_baru extends javax.swing.JFrame {

    private Connection conn;
    private Statement stat;
    private ResultSet res;

    public halm_pelanggan_baru() {
        initComponents();
        conn = koneksi.koneksi.getConnection();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txt_nama = new javax.swing.JTextField();
        txt_id_pelanggan = new javax.swing.JTextField();
        txt_noTelp = new javax.swing.JTextField();
        txt_alamat = new javax.swing.JTextField();
        cb_jk = new javax.swing.JComboBox<>();
        hapus = new java.awt.Button();
        simpan = new java.awt.Button();
        date = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(180, 199, 231));
        jPanel2.setForeground(new java.awt.Color(45, 85, 151));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(156, 194, 230));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(51, 102, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rumahlaundry/logorl.png"))); // NOI18N
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 11, -1, -1));

        jLabel3.setBackground(new java.awt.Color(45, 85, 151));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(45, 85, 151));
        jLabel3.setText("RUMAH");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 19, -1, -1));

        jLabel4.setBackground(new java.awt.Color(45, 85, 151));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(45, 85, 151));
        jLabel4.setText("LAUNDRY");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 62, -1, -1));

        jButton2.setBackground(new java.awt.Color(230, 244, 241));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(45, 85, 151));
        jButton2.setText("DASHBOARD");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 124, 319, 47));

        jButton3.setBackground(new java.awt.Color(230, 244, 241));
        jButton3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(45, 85, 151));
        jButton3.setText("PELANGGAN BARU");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 177, 319, 47));

        jButton4.setBackground(new java.awt.Color(230, 244, 241));
        jButton4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(45, 85, 151));
        jButton4.setText("TRANSAKSI");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 319, 47));

        jButton5.setBackground(new java.awt.Color(230, 244, 241));
        jButton5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(45, 85, 151));
        jButton5.setText("DATA PELANGGAN");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 283, 319, 47));

        jButton6.setBackground(new java.awt.Color(230, 244, 241));
        jButton6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton6.setForeground(new java.awt.Color(45, 85, 151));
        jButton6.setText("LAPORAN PENDAPATAN");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 336, 319, 47));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 701));

        jPanel4.setBackground(new java.awt.Color(218, 227, 243));

        jLabel1.setBackground(new java.awt.Color(45, 85, 151));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(45, 85, 151));
        jLabel1.setText("PELANGGAN BARU");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(618, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 0, -1, -1));
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 101, -1, -1));

        jLabel6.setBackground(new java.awt.Color(45, 85, 151));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(47, 85, 151));
        jLabel6.setText("ID PELANGGAN");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(371, 75, 208, 29));

        jLabel7.setBackground(new java.awt.Color(45, 85, 151));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(47, 85, 151));
        jLabel7.setText("NAMA");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(371, 141, 358, 23));

        jLabel8.setBackground(new java.awt.Color(45, 85, 151));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(47, 85, 151));
        jLabel8.setText("JENIS KELAMIN");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(371, 211, 590, -1));

        jLabel9.setBackground(new java.awt.Color(45, 85, 151));
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(47, 85, 151));
        jLabel9.setText("TANGGAL DAFTAR");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(371, 291, -1, -1));
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(804, 403, -1, -1));

        jLabel11.setBackground(new java.awt.Color(45, 85, 151));
        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(47, 85, 151));
        jLabel11.setText("NO.TELP");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(371, 375, -1, -1));

        jLabel12.setBackground(new java.awt.Color(45, 85, 151));
        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(47, 85, 151));
        jLabel12.setText("ALAMAT");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(371, 457, -1, -1));

        txt_nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_namaActionPerformed(evt);
            }
        });
        jPanel2.add(txt_nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(371, 170, 300, 30));

        txt_id_pelanggan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_id_pelangganActionPerformed(evt);
            }
        });
        jPanel2.add(txt_id_pelanggan, new org.netbeans.lib.awtextra.AbsoluteConstraints(371, 105, 300, 30));

        txt_noTelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_noTelpActionPerformed(evt);
            }
        });
        jPanel2.add(txt_noTelp, new org.netbeans.lib.awtextra.AbsoluteConstraints(371, 409, 300, 30));

        txt_alamat.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txt_alamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_alamatActionPerformed(evt);
            }
        });
        jPanel2.add(txt_alamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(371, 515, 300, 95));

        cb_jk.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Laki-laki", "Perempuan" }));
        jPanel2.add(cb_jk, new org.netbeans.lib.awtextra.AbsoluteConstraints(371, 239, 300, 34));

        hapus.setBackground(new java.awt.Color(180, 199, 231));
        hapus.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        hapus.setLabel("HAPUS");
        hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusActionPerformed(evt);
            }
        });
        jPanel2.add(hapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(838, 380, 220, 62));

        simpan.setBackground(new java.awt.Color(143, 170, 220));
        simpan.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        simpan.setLabel("SIMPAN");
        simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanActionPerformed(evt);
            }
        });
        jPanel2.add(simpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(838, 246, 220, 62));
        jPanel2.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 330, 301, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1265, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_alamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_alamatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_alamatActionPerformed

    private void txt_noTelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_noTelpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_noTelpActionPerformed

    private void txt_id_pelangganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_id_pelangganActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_id_pelangganActionPerformed

    private void txt_namaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_namaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_namaActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        new halm_pendapatan().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        new halm_transaksi().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        new halm_dashboard().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanActionPerformed
        // TODO add your handling code here:
        long id_member = Long.parseLong(txt_id_pelanggan.getText());
        String nama = txt_nama.getText();
        String jenis_kelamin = cb_jk.getSelectedItem().toString();
        String tanggalDaftar = date.getDateFormatString();
        String noTelp = txt_noTelp.getText();
        String alamat = txt_alamat.getText();
        try {
            String sql = "insert into tb_member (id_member, nama, jenis_kelamin, no_telp, alamat) values (?,?,?,?,?)";
            PreparedStatement pst=conn.prepareStatement(sql);
            pst.setLong(1, id_member);
            pst.setString(2, nama);
            pst.setString(3, jenis_kelamin);
            pst.setString(4,noTelp);
            pst.setString(5, alamat);
            pst.execute();
            JOptionPane.showMessageDialog(this, "Tambah Data Berhasil");
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(this, "Tambah Data Gagal");
        }
    }//GEN-LAST:event_simpanActionPerformed

    private void hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusActionPerformed
         txt_id_pelanggan.setText(""); 
         txt_nama.setText("");  
         txt_noTelp.setText(""); 
         txt_alamat.setText(""); 
         txt_id_pelanggan.requestFocus(); 
    }//GEN-LAST:event_hapusActionPerformed

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
            java.util.logging.Logger.getLogger(halm_pelanggan_baru.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(halm_pelanggan_baru.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(halm_pelanggan_baru.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(halm_pelanggan_baru.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new halm_pelanggan_baru().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cb_jk;
    private com.toedter.calendar.JDateChooser date;
    private java.awt.Button hapus;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private java.awt.Button simpan;
    private javax.swing.JTextField txt_alamat;
    private javax.swing.JTextField txt_id_pelanggan;
    private javax.swing.JTextField txt_nama;
    private javax.swing.JTextField txt_noTelp;
    // End of variables declaration//GEN-END:variables
}
