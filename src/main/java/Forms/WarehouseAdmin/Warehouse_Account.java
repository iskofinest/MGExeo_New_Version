package Forms.WarehouseAdmin;

import Forms.Login;
import Forms.ShowItemStock;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class Warehouse_Account extends javax.swing.JFrame {

    JFrame frame;
    public Warehouse_Account() {
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

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnViewReceiving = new javax.swing.JButton();
        btnAddWithdrawalReport = new javax.swing.JButton();
        btnAddReceivingReport = new javax.swing.JButton();
        btnViewItems = new javax.swing.JButton();
        btnAddReturnReport = new javax.swing.JButton();
        lblLogOut = new javax.swing.JLabel();

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 0, 51));
        jButton1.setText("VIEW NOTIFICATIONS");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBounds(new java.awt.Rectangle(117, 47, 0, 0));

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Vani", 1, 18)); // NOI18N
        jLabel1.setText("Warehouse Account");

        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 26)); // NOI18N
        jLabel4.setText("Integrated Inventory System");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel5.setText("Manages You Inventory for your Company's Convenience");

        btnViewReceiving.setBackground(new java.awt.Color(204, 204, 204));
        btnViewReceiving.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnViewReceiving.setText("VIEW RECEIVING REPORT");
        btnViewReceiving.setToolTipText("");
        btnViewReceiving.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewReceivingActionPerformed(evt);
            }
        });

        btnAddWithdrawalReport.setBackground(new java.awt.Color(204, 204, 204));
        btnAddWithdrawalReport.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnAddWithdrawalReport.setText("ADD WITHDRAWAL REPORT");
        btnAddWithdrawalReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddWithdrawalReportActionPerformed(evt);
            }
        });

        btnAddReceivingReport.setBackground(new java.awt.Color(204, 204, 204));
        btnAddReceivingReport.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnAddReceivingReport.setText("ADD RECEIVING REPORT");
        btnAddReceivingReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddReceivingReportActionPerformed(evt);
            }
        });

        btnViewItems.setBackground(new java.awt.Color(204, 204, 204));
        btnViewItems.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnViewItems.setText("VIEW WITHDRAWAL REPORTS");
        btnViewItems.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewItemsActionPerformed(evt);
            }
        });

        btnAddReturnReport.setBackground(new java.awt.Color(204, 204, 204));
        btnAddReturnReport.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnAddReturnReport.setText("VIEW STOCKS");
        btnAddReturnReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddReturnReportActionPerformed(evt);
            }
        });

        lblLogOut.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblLogOut.setText("Log-out");
        lblLogOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLogOutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblLogOutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblLogOutMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAddReturnReport, javax.swing.GroupLayout.DEFAULT_SIZE, 589, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 373, Short.MAX_VALUE)
                            .addComponent(lblLogOut))
                        .addComponent(btnAddWithdrawalReport, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnViewItems, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAddReceivingReport, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnViewReceiving, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblLogOut))
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5))
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(btnAddWithdrawalReport, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnViewItems, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAddReceivingReport, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnViewReceiving, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAddReturnReport, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddReceivingReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddReceivingReportActionPerformed
        // TODO add your handling code here:
        SwingUtilities.invokeLater(() -> {
            dispose();
//            frame = new AddReceivingReport(this);
            frame = new AddReceiving(this);
            frame.setVisible(true);
        });
    }//GEN-LAST:event_btnAddReceivingReportActionPerformed

    private void btnAddReturnReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddReturnReportActionPerformed
        SwingUtilities.invokeLater(() -> {
            dispose();
            new ShowItemStock(this).setVisible(true);
        });
    }//GEN-LAST:event_btnAddReturnReportActionPerformed

    private void btnViewReceivingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewReceivingActionPerformed
        SwingUtilities.invokeLater(() -> {
            new ViewReceiving(this).setVisible(true);
        });
    }//GEN-LAST:event_btnViewReceivingActionPerformed

    private void lblLogOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogOutMouseClicked
        SwingUtilities.invokeLater(() -> {
           int confirmation = JOptionPane.showConfirmDialog(null, "Are you sure you want to Logout?", "LOG-OUT CONFIRM", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
           if(confirmation == 0) {
               ConstantHandlers.ConstantHandler.user = null;
               dispose();
               new Login().setVisible(true);
           } 
        });
    }//GEN-LAST:event_lblLogOutMouseClicked

    private void lblLogOutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogOutMouseEntered
        SwingUtilities.invokeLater(() -> {
            lblLogOut.setFont(new Font("Times New Roman", 1, 14));
        });
    }//GEN-LAST:event_lblLogOutMouseEntered

    private void lblLogOutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogOutMouseExited
        SwingUtilities.invokeLater(() -> {
            lblLogOut.setFont(new Font("Times New Roman", 0, 16));
        });
    }//GEN-LAST:event_lblLogOutMouseExited

    private void btnAddWithdrawalReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddWithdrawalReportActionPerformed
        SwingUtilities.invokeLater(() -> {
            dispose();
            new AddWithdrawal(this).setVisible(true);
        });
    }//GEN-LAST:event_btnAddWithdrawalReportActionPerformed

    private void btnViewItemsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewItemsActionPerformed
        SwingUtilities.invokeLater(() -> {
            dispose();
            new ShowWithdrawalReport(this).setVisible(true);
        });
    }//GEN-LAST:event_btnViewItemsActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        System.out.println(getBounds().toString());
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(Warehouse_Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Warehouse_Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Warehouse_Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Warehouse_Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Warehouse_Account().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddReceivingReport;
    private javax.swing.JButton btnAddReturnReport;
    private javax.swing.JButton btnAddWithdrawalReport;
    private javax.swing.JButton btnViewItems;
    private javax.swing.JButton btnViewReceiving;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblLogOut;
    // End of variables declaration//GEN-END:variables
}
