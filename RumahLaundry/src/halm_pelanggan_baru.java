
import java.awt.HeadlessException;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
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
    private ResultSet rs;    
    PreparedStatement ps;

    public halm_pelanggan_baru() {
        initComponents();
        conn = koneksi.koneksi.getConnection();
        input_otomatis();
        tampil_tanggal_sekarang();
        txt_nama.requestFocus();
    }
    
    public void tampil_tanggal_sekarang() {
        Date ys = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        txt_tgl_daftar.setText(sdf.format(ys));
    }
    
    public void input_otomatis() {
        try {
            stat = conn.createStatement();
            rs = stat.executeQuery("SELECT * FROM tb_member order by id_member desc");
            if (rs.next()) {
                String kode = rs.getString("id_member").substring(1);
                String auto_number = "" + (Integer.parseInt(kode) + 1);
                String Nol = "";

                if(auto_number.length() == 1) {
                    Nol = "000";
                } else if (auto_number.length() == 2) {
                    Nol = "00";
                } else if(auto_number.length() == 3) {
                    Nol = "0";
                } else if(auto_number.length() == 4) {
                    Nol = "";
                }
                txt_id_pelanggan.setText("MEM-" + Nol + auto_number);
            } else {
                txt_id_pelanggan.setText("MEM-0001");
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

        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txt_tgl_daftar = new javax.swing.JTextField();
        txt_id_pelanggan = new javax.swing.JTextField();
        txt_noTelp = new javax.swing.JTextField();
        cb_jk = new javax.swing.JComboBox<>();
        hapus = new java.awt.Button();
        simpan = new java.awt.Button();
        jPanel4 = new javax.swing.JPanel();
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
        txt_nama = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_alamat = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(180, 199, 231));
        jPanel2.setForeground(new java.awt.Color(45, 85, 151));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 101, -1, -1));

        jLabel6.setBackground(new java.awt.Color(45, 85, 151));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(47, 85, 151));
        jLabel6.setText("ID PELANGGAN");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, 208, 29));

        jLabel7.setBackground(new java.awt.Color(45, 85, 151));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(47, 85, 151));
        jLabel7.setText("NAMA");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, 358, 23));

        jLabel8.setBackground(new java.awt.Color(45, 85, 151));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(47, 85, 151));
        jLabel8.setText("JENIS KELAMIN");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, 590, -1));

        jLabel9.setBackground(new java.awt.Color(45, 85, 151));
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(47, 85, 151));
        jLabel9.setText("TANGGAL DAFTAR");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 280, -1, -1));
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(804, 403, -1, -1));

        jLabel11.setBackground(new java.awt.Color(45, 85, 151));
        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(47, 85, 151));
        jLabel11.setText("NO.TELP");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 370, -1, -1));

        jLabel12.setBackground(new java.awt.Color(45, 85, 151));
        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(47, 85, 151));
        jLabel12.setText("ALAMAT");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 450, -1, -1));

        txt_tgl_daftar.setEnabled(false);
        txt_tgl_daftar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_tgl_daftarActionPerformed(evt);
            }
        });
        jPanel2.add(txt_tgl_daftar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 320, 420, 30));

        txt_id_pelanggan.setEnabled(false);
        txt_id_pelanggan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_id_pelangganActionPerformed(evt);
            }
        });
        jPanel2.add(txt_id_pelanggan, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, 420, 30));

        txt_noTelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_noTelpActionPerformed(evt);
            }
        });
        jPanel2.add(txt_noTelp, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 400, 420, 30));

        cb_jk.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Laki-laki", "Perempuan" }));
        cb_jk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_jkActionPerformed(evt);
            }
        });
        jPanel2.add(cb_jk, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, 420, 34));

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

        jPanel4.setBackground(new java.awt.Color(218, 227, 243));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setBackground(new java.awt.Color(45, 85, 151));
        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(45, 85, 151));
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rumahlaundry/pelanggan baru.png"))); // NOI18N
        jLabel13.setText("PELANGGAN BARU");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 560, -1));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 1160, 60));

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

        txt_nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_namaActionPerformed(evt);
            }
        });
        jPanel2.add(txt_nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 160, 420, 30));

        txt_alamat.setColumns(20);
        txt_alamat.setRows(5);
        jScrollPane1.setViewportView(txt_alamat);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 480, 420, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1437, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 919, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_noTelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_noTelpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_noTelpActionPerformed

    private void txt_id_pelangganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_id_pelangganActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_id_pelangganActionPerformed

    private void txt_tgl_daftarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_tgl_daftarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_tgl_daftarActionPerformed

    private void simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanActionPerformed
        // TODO add your handling code here:
        txt_tgl_daftar.requestFocus();
        String id_member = txt_id_pelanggan.getText();
        String nama = txt_nama.getText();
        String jenis_kelamin = cb_jk.getSelectedItem().toString();
        String tanggalDaftar = txt_tgl_daftar.getText();
        String noTelp = txt_noTelp.getText();
        String alamat = txt_alamat.getText();
        
        try {
            String sql = "insert into tb_member (id_member, nama, jenis_kelamin, tgl_daftar, no_telp, alamat) values (?,?,?,?,?,?)";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, id_member);
            pst.setString(2, nama);
            pst.setString(3, jenis_kelamin);
            pst.setString(4, tanggalDaftar);
            pst.setString(5, noTelp);
            pst.setString(6, alamat);
            pst.execute();
            JOptionPane.showMessageDialog(this, "Pelanggan baru berhasil ditambahkan");
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(this, "Pelanggan baru gagal ditambahkan");
        }
    }//GEN-LAST:event_simpanActionPerformed

    private void hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusActionPerformed
        txt_nama.setText("");
        txt_noTelp.setText("");
        txt_alamat.setText("");
        txt_nama.requestFocus();
         
    }//GEN-LAST:event_hapusActionPerformed

    private void dashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dashboardActionPerformed
        // TODO add your handling code here:
        new halm_dashboard().setVisible(true);
        dispose();
    }//GEN-LAST:event_dashboardActionPerformed

    private void pelanggan_baruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pelanggan_baruActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pelanggan_baruActionPerformed

    private void transaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transaksiActionPerformed
        // TODO add your handling code here:
        new halm_transaksi().setVisible(true);
        dispose();
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

    private void txt_namaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_namaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_namaActionPerformed

    private void cb_jkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_jkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_jkActionPerformed

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
    private javax.swing.JButton dashboard;
    private javax.swing.JButton data_pelanggan;
    private java.awt.Button hapus;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton laporan_pendapatan;
    private javax.swing.JButton pelanggan_baru;
    private java.awt.Button simpan;
    private javax.swing.JButton transaksi;
    private javax.swing.JTextArea txt_alamat;
    private javax.swing.JTextField txt_id_pelanggan;
    private javax.swing.JTextField txt_nama;
    private javax.swing.JTextField txt_noTelp;
    private javax.swing.JTextField txt_tgl_daftar;
    // End of variables declaration//GEN-END:variables
}
