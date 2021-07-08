
import java.io.File;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import javax.swing.JOptionPane;
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
public class halm_dashboard extends javax.swing.JFrame {

    /**
     * Creates new form 
     */
    public halm_dashboard() {
        initComponents();
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
        dashboard = new javax.swing.JButton();
        pelanggan_baru = new javax.swing.JButton();
        transaksi = new javax.swing.JButton();
        data_pelanggan = new javax.swing.JButton();
        laporan_pendapatan = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(180, 199, 231));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jPanel7.setBackground(new java.awt.Color(45, 85, 151));
        jPanel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel8.setBackground(new java.awt.Color(45, 85, 151));
        jLabel8.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("           Hari ini");
        jLabel8.setToolTipText("");
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("            HARI INI");
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel11.setName(""); // NOI18N

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(850, 850, 850)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1027, 113, 150, 30));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rumahlaundry/grafikk.png"))); // NOI18N
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(454, 173, -1, -1));

        jPanel4.setBackground(new java.awt.Color(218, 227, 243));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setBackground(new java.awt.Color(45, 85, 151));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(45, 85, 151));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rumahlaundry/homee.png"))); // NOI18N
        jLabel5.setText("DASHBOARD");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 342, -1));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 1160, 60));

        jLabel6.setBackground(new java.awt.Color(45, 85, 151));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(45, 85, 151));
        jLabel6.setText("MEI 2021");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(604, 123, -1, -1));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel6.setAlignmentX(0.0F);
        jPanel6.setAlignmentY(0.0F);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 148, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 38, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1027, 143, -1, -1));

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel10.setAlignmentX(0.0F);
        jPanel10.setAlignmentY(0.0F);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 38, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1027, 243, -1, -1));

        jPanel11.setBackground(new java.awt.Color(45, 85, 151));
        jPanel11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel9.setBackground(new java.awt.Color(45, 85, 151));
        jLabel9.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("           Hari ini");
        jLabel9.setToolTipText("");
        jLabel9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("          MINGGU INI");
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel12.setName(""); // NOI18N

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(850, 850, 850)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1027, 213, 150, 30));

        jPanel13.setBackground(new java.awt.Color(45, 85, 151));
        jPanel13.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel10.setBackground(new java.awt.Color(45, 85, 151));
        jLabel10.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("           Hari ini");
        jLabel10.setToolTipText("");
        jLabel10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("           BULAN INI");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setName(""); // NOI18N

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(850, 850, 850)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1027, 313, 150, 30));

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel12.setAlignmentX(0.0F);
        jPanel12.setAlignmentY(0.0F);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 38, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1027, 343, -1, -1));

        jButton1.setText("Tampilkan Grafik");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 460, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1437, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 919, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void laporan_pendapatanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_laporan_pendapatanActionPerformed
        // TODO add your handling code here:
        new halm_pendapatan().setVisible(true);
        dispose();
    }//GEN-LAST:event_laporan_pendapatanActionPerformed

    private void data_pelangganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_data_pelangganActionPerformed
        // TODO add your handling code here:
        try {
            File namafile = new File("src/Report/data_member.jasper");
            JasperPrint jp = JasperFillManager.fillReport(namafile.getPath(), null, koneksi.getConnection());
            JasperViewer.viewReport(jp, false);
        } catch ( JRException e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }//GEN-LAST:event_data_pelangganActionPerformed

    private void transaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transaksiActionPerformed
        // TODO add your handling code here:
        new halm_transaksi().setVisible(true);
        dispose();
    }//GEN-LAST:event_transaksiActionPerformed

    private void pelanggan_baruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pelanggan_baruActionPerformed
        // TODO add your handling code here:
        new halm_pelanggan_baru().setVisible(true);
        dispose();
    }//GEN-LAST:event_pelanggan_baruActionPerformed

    private void dashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dashboardActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dashboardActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        DefaultCategoryDataset dcd = new DefaultCategoryDataset();
        dcd.setValue(45.100, "Mac OS", "2020");
        dcd.setValue(60.100, "Windows", "2020");
        dcd.setValue(35.100, "Linux", "2020");
        dcd.setValue(15.100, "Lainnya", "2020");
        
        JFreeChart freeChart = ChartFactory.createBarChart("Pengguna Browser "
                + "tahun ini", "Tahun", "Data Pengguna OS %", dcd, PlotOrientation.VERTICAL,
                true, true, true);
        ChartFrame cf = new ChartFrame("Data pengguna OS 2020 (hanya ilustrasi)", freeChart);
        
        cf.setSize(700, 500);
        cf.setVisible(true);
        cf.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButton1ActionPerformed

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
                new halm_dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton dashboard;
    private javax.swing.JButton data_pelanggan;
    private javax.swing.JButton jButton1;
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
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JButton laporan_pendapatan;
    private javax.swing.JButton pelanggan_baru;
    private javax.swing.JButton transaksi;
    // End of variables declaration//GEN-END:variables
}
