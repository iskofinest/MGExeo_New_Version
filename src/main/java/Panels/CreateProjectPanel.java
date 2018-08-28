
package Panels;

import ConstantHandlers.PublicMethods;
import Entities.Department;
import Entities.Project;
import Services.DepartmentService;
import Services.ProjectService;
import java.awt.Frame;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

public class CreateProjectPanel extends javax.swing.JPanel {

    private Project project;
    private List<Department> departments;
    Frame frame;
    
    public CreateProjectPanel() {
        initComponents();
        AutoCompleteDecorator.decorate(cbxDepartmentName);
        departments = DepartmentService.findAll();
        DefaultComboBoxModel departmentNameModel = new DefaultComboBoxModel();
        departments.forEach(department -> departmentNameModel.addElement(department.getName()));
        cbxDepartmentName.setModel(departmentNameModel);
//        lblDepartmentName.setText(ConstantHandler.user.getDepartment().getName());
    }
    
    public CreateProjectPanel(Frame frame) {
        initComponents();
        this.frame = frame;
        AutoCompleteDecorator.decorate(cbxDepartmentName);
        departments = DepartmentService.findAll();
        DefaultComboBoxModel departmentNameModel = new DefaultComboBoxModel();
        departments.forEach(department -> departmentNameModel.addElement(department.getName()));
        cbxDepartmentName.setModel(departmentNameModel);
//        lblDepartmentName.setText(ConstantHandler.user.getDepartment().getName());
    }
    
    private void clearFields() {
        txtProjectName.setText("");
        txtProjectCode.setText("");
        txtTotalBudget.setText("0.00");
        jdcDateStarted.setDate(new Date());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtProjectName = new javax.swing.JTextField();
        txtProjectCode = new javax.swing.JTextField();
        jdcDateStarted = new com.toedter.calendar.JDateChooser();
        txtTotalBudget = new javax.swing.JTextField();
        btnSubmit = new javax.swing.JButton();
        cbxDepartmentName = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(102, 153, 255));
        setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(0, 0, 0)));
        setMaximumSize(new java.awt.Dimension(471, 240));
        setMinimumSize(new java.awt.Dimension(471, 240));
        setRequestFocusEnabled(false);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Department Name:  ");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Project Name:  ");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Project Code:  ");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Date Started:  ");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Total Budget:  ");
        jLabel5.setToolTipText("");

        txtProjectName.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        txtProjectCode.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jdcDateStarted.setDateFormatString("MMMM-dd-yyyy");
        jdcDateStarted.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        txtTotalBudget.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtTotalBudget.setText("0.00");
        txtTotalBudget.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTotalBudgetKeyTyped(evt);
            }
        });

        btnSubmit.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnSubmit.setText("SUBMIT");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        cbxDepartmentName.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        jButton1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jButton1.setText("+");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSubmit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTotalBudget))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtProjectName)
                            .addComponent(txtProjectCode)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jdcDateStarted, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxDepartmentName, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(cbxDepartmentName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtProjectName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(txtProjectCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4))
                    .addComponent(jdcDateStarted, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtTotalBudget, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSubmit)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        int selection = JOptionPane.showConfirmDialog(null, "Are you sure you want to save this project to the database?", "CONFIRM SAVE PROJECT", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(selection == 0) {
            String projectName = txtProjectName.getText();
            String projectCode = txtProjectCode.getText();
            BigDecimal totalBudget = BigDecimal.valueOf(((txtTotalBudget.getText().isEmpty()) ? 0.0: Double.parseDouble(txtTotalBudget.getText())));
            Date dateStarted = jdcDateStarted.getDate();
            project = new Project();
            project.setProjectName(projectName);
            project.setProjectCode(projectCode);
            project.setTotalBudget(totalBudget);
            project.setDateStarted(dateStarted);
            project.setDateCreated(new Date());
            project.setDepartment(departments.get(cbxDepartmentName.getSelectedIndex()));
            if(ProjectService.saveProject(project)) {
                JOptionPane.showMessageDialog(null, "Project Successfully saved to the database", "TRANSACTION SUCCESS", JOptionPane.INFORMATION_MESSAGE);
                clearFields();
            } else {
                JOptionPane.showMessageDialog(null, "Project was not successfully created!!", "TRANSACTION FAILED", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void txtTotalBudgetKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTotalBudgetKeyTyped
        if (!Character.isDigit(evt.getKeyChar()) && !(evt.getKeyChar() == '.')){
            evt.consume();
        } 
    }//GEN-LAST:event_txtTotalBudgetKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Department department = PublicMethods.addDepartment(frame);
        if(department != null) {
            departments.add(department);
            ((DefaultComboBoxModel) cbxDepartmentName.getModel()).addElement(department.getName());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    public Project getProject() {
        return project;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSubmit;
    private javax.swing.JComboBox<String> cbxDepartmentName;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private com.toedter.calendar.JDateChooser jdcDateStarted;
    private javax.swing.JTextField txtProjectCode;
    private javax.swing.JTextField txtProjectName;
    private javax.swing.JTextField txtTotalBudget;
    // End of variables declaration//GEN-END:variables

}