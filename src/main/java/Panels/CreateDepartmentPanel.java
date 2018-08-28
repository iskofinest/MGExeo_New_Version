
package Panels;

import Entities.Department;
import Services.DepartmentService;
import javax.swing.JOptionPane;

public class CreateDepartmentPanel extends javax.swing.JPanel {

    Department department;
    /**
     * Creates new form CreateDepartmentPanel
     */
    public CreateDepartmentPanel() {
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

        jPanel5 = new javax.swing.JPanel();
        lblFirstName = new javax.swing.JLabel();
        lblEmployeeId = new javax.swing.JLabel();
        txtDepartmentName = new javax.swing.JTextField();
        txtDepartmentCode = new javax.swing.JTextField();
        btnCreateDepartment = new javax.swing.JButton();

        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel5.setMaximumSize(new java.awt.Dimension(32767, 248));
        jPanel5.setPreferredSize(new java.awt.Dimension(444, 248));

        lblFirstName.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblFirstName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblFirstName.setText("DEPARTMENT NAME*");

        lblEmployeeId.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblEmployeeId.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEmployeeId.setText("DEPARTMENT CODE*");

        txtDepartmentName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtDepartmentName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDepartmentName.setToolTipText("First Name Field");
        txtDepartmentName.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtDepartmentCode.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtDepartmentCode.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDepartmentCode.setToolTipText("Employee ID field");
        txtDepartmentCode.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnCreateDepartment.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnCreateDepartment.setForeground(new java.awt.Color(0, 102, 102));
        btnCreateDepartment.setText("CREATE DEPARTMENT");
        btnCreateDepartment.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnCreateDepartment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateDepartmentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblFirstName, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                    .addComponent(lblEmployeeId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDepartmentCode, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDepartmentName, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCreateDepartment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDepartmentCode, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmployeeId, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDepartmentName, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(btnCreateDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 442, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 187, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(11, 11, 11)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateDepartmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateDepartmentActionPerformed
        // TODO add your handling code here:
        String departmentCode = txtDepartmentCode.getText().trim();
        String departmentName = txtDepartmentName.getText().trim();
        if(departmentCode.equals("")) {
            JOptionPane.showMessageDialog(null, "Please specify the department code!", "TRANSACTION FAILED", JOptionPane.ERROR_MESSAGE);
        } else if(departmentName.equals("")) {
            JOptionPane.showMessageDialog(null, "Please specify the department name!", "TRANSACTION FAILED", JOptionPane.ERROR_MESSAGE);
        } else if(DepartmentService.isExisting("code", departmentCode)) {
            JOptionPane.showMessageDialog(null, "Department code already exists!", "TRANSACTION FAILED", JOptionPane.ERROR_MESSAGE);
        } else if(DepartmentService.isExisting("name", departmentName)) {
            JOptionPane.showMessageDialog(null, "Department name already exists!", "TRANSACTION FAILED", JOptionPane.ERROR_MESSAGE);
        } else {
            int confirmation = JOptionPane.showConfirmDialog(null, "Are you sure you want to add Department?", "CONFIRM ADD DEPARTMENT", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
            if(confirmation == 0) {
                Department department = new Department();
                department.setCode(departmentCode);
                department.setName(departmentName);
                if(DepartmentService.saveDepartment(department)) {
                    JOptionPane.showMessageDialog(null, "Department successfully saved!", "SUCCESS", JOptionPane.INFORMATION_MESSAGE);
                    this.department = department;
                    clearFields();
                } else {
                    JOptionPane.showMessageDialog(null, "Department failed to save!!", "TRANSACTION FAILED", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_btnCreateDepartmentActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateDepartment;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel lblEmployeeId;
    private javax.swing.JLabel lblFirstName;
    private javax.swing.JTextField txtDepartmentCode;
    private javax.swing.JTextField txtDepartmentName;
    // End of variables declaration//GEN-END:variables

    public Department getDepartment() {
        return department;
    }

    private void clearFields() {
        txtDepartmentCode.setText("");
        txtDepartmentName.setText("");
    }
    
}