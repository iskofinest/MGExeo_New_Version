
package Forms.WarehouseAdmin;

import ConstantHandlers.ConstantHandler;
import Entities.ItemStock;
import Entities.Project;
import Entities.Purchases.ItemRequest;
import Entities.Purchases.WithdrawalReport;
import Entities.User;
import Services.ItemRequestService;
import Services.ItemStockService;
import Services.ProjectService;
import Services.UserService;
import Services.WithdrawalReportService;
import java.awt.Frame;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

public class AddWithdrawal extends javax.swing.JFrame {

    Frame previousFrame;
    List<ItemStock> itemStocks;
    List<Project> projects;
    List<User> users;
    
    Vector<Vector> stockData;
    Vector<String> stockColumns;
    
    Vector<Vector> withdrawalData;
    Vector<String> withdrawalColumns;
    
    List<Integer> withdrawPosition = new ArrayList<>();
    BigDecimal totalAmount = new BigDecimal(0);
    
    public AddWithdrawal() {
        initComponents();
        initializeData();
    }

    public AddWithdrawal(Frame previousFrame) {
        initComponents();
        this.previousFrame = previousFrame;
        initializeData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jdcDate = new com.toedter.calendar.JDateChooser();
        txtTruckNo = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        txtWithdrawalNo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtIssuingWarehouse = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cbxProjectCode = new javax.swing.JComboBox<>();
        txtLocation = new javax.swing.JTextField();
        cbxProjectName = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtContainerNo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblStocks = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblWithdraw = new javax.swing.JTable();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        txtTotalAmount = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        cbxRequestedBy = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 1936, 1038));
        setExtendedState(6);
        setMaximumSize(new java.awt.Dimension(1928, 1038));
        setMinimumSize(new java.awt.Dimension(1928, 1038));
        setPreferredSize(new java.awt.Dimension(1928, 1038));

        jPanel1.setBackground(new java.awt.Color(102, 153, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(1904, 980));
        jPanel1.setMinimumSize(new java.awt.Dimension(1904, 980));
        jPanel1.setPreferredSize(new java.awt.Dimension(1904, 980));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ADD WITHDRAWAL");

        jPanel2.setBackground(new java.awt.Color(102, 153, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 0, 0, 0, new java.awt.Color(0, 0, 0)));

        jPanel4.setBackground(new java.awt.Color(102, 153, 255));

        jdcDate.setBackground(new java.awt.Color(102, 153, 255));
        jdcDate.setDateFormatString("MMMM-dd-yyyy");
        jdcDate.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jdcDate.setPreferredSize(new java.awt.Dimension(115, 17));

        txtTruckNo.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jPanel3.setBackground(new java.awt.Color(102, 153, 255));

        txtWithdrawalNo.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("ISSUING WAREHOUSE:  ");

        txtIssuingWarehouse.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("WITHDRAWAL NO:  ");
        jLabel2.setMaximumSize(new java.awt.Dimension(63, 22));
        jLabel2.setMinimumSize(new java.awt.Dimension(63, 22));
        jLabel2.setPreferredSize(new java.awt.Dimension(63, 22));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtWithdrawalNo, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtIssuingWarehouse, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtWithdrawalNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtIssuingWarehouse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("DATE:  ");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("LOADED ON TRUCK NO:  ");

        cbxProjectCode.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        cbxProjectCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxProjectCodeActionPerformed(evt);
            }
        });

        txtLocation.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        cbxProjectName.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        cbxProjectName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxProjectNameActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("PROJECT CODE:  ");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("LOCATION:  ");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("PROJECT NAME:  ");

        txtContainerNo.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("CONTAINER NO:  ");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbxProjectName, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jdcDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbxProjectCode, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel7))
                                .addGap(0, 3, Short.MAX_VALUE))
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTruckNo)
                            .addComponent(txtContainerNo)
                            .addComponent(txtLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, 0))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jdcDate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTruckNo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel7))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(cbxProjectCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtContainerNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel8))
                .addGap(12, 12, 12)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(cbxProjectName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(0, 0, 0))
        );

        tblStocks.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ITEM CODE", "DESCRIPTION", "QUANTITY", "UNIT", "UNIT PRICE", "CURRENCY"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblStocks.setToolTipText("Double click row to add in Withdrawal Items");
        tblStocks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblStocksMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblStocks);
        if (tblStocks.getColumnModel().getColumnCount() > 0) {
            tblStocks.getColumnModel().getColumn(0).setResizable(false);
            tblStocks.getColumnModel().getColumn(0).setPreferredWidth(30);
            tblStocks.getColumnModel().getColumn(1).setResizable(false);
            tblStocks.getColumnModel().getColumn(1).setPreferredWidth(200);
            tblStocks.getColumnModel().getColumn(2).setResizable(false);
            tblStocks.getColumnModel().getColumn(2).setPreferredWidth(20);
            tblStocks.getColumnModel().getColumn(3).setResizable(false);
            tblStocks.getColumnModel().getColumn(3).setPreferredWidth(20);
            tblStocks.getColumnModel().getColumn(4).setResizable(false);
            tblStocks.getColumnModel().getColumn(4).setPreferredWidth(30);
            tblStocks.getColumnModel().getColumn(5).setResizable(false);
            tblStocks.getColumnModel().getColumn(5).setPreferredWidth(30);
        }

        tblWithdraw.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ITEM CODE", "DESCRIPTION", "QUANTITY", "UNIT", "UNIT PRICE", "CURRENCY", "TOTAL COST"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblWithdraw.setToolTipText("Double click row to return back item");
        tblWithdraw.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblWithdrawMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblWithdraw);
        if (tblWithdraw.getColumnModel().getColumnCount() > 0) {
            tblWithdraw.getColumnModel().getColumn(0).setResizable(false);
            tblWithdraw.getColumnModel().getColumn(0).setPreferredWidth(30);
            tblWithdraw.getColumnModel().getColumn(1).setResizable(false);
            tblWithdraw.getColumnModel().getColumn(1).setPreferredWidth(200);
            tblWithdraw.getColumnModel().getColumn(2).setResizable(false);
            tblWithdraw.getColumnModel().getColumn(2).setPreferredWidth(20);
            tblWithdraw.getColumnModel().getColumn(3).setResizable(false);
            tblWithdraw.getColumnModel().getColumn(3).setPreferredWidth(20);
            tblWithdraw.getColumnModel().getColumn(4).setResizable(false);
            tblWithdraw.getColumnModel().getColumn(4).setPreferredWidth(30);
            tblWithdraw.getColumnModel().getColumn(5).setResizable(false);
            tblWithdraw.getColumnModel().getColumn(5).setPreferredWidth(30);
            tblWithdraw.getColumnModel().getColumn(6).setResizable(false);
        }

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("ITEM STOCKS");

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("WITHDRAWAL ITEM");

        btnSave.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnSave.setText("SAVE");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnBack.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnBack.setText("BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        txtTotalAmount.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        txtTotalAmount.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel10.setText("TOTAL AMOUNT:  ");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel11.setText("REQUESTED BY:  ");

        cbxRequestedBy.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxRequestedBy, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(400, 400, 400))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 808, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(703, 703, 703)
                                .addComponent(btnSave)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnBack)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 1060, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtTotalAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap())))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbxRequestedBy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTotalAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(56, 56, 56)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave)
                    .addComponent(btnBack))
                .addContainerGap(238, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void tblStocksMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblStocksMouseClicked
        SwingUtilities.invokeLater(() -> {
            if(evt.getClickCount()>1) {
                JTable source = (JTable)evt.getSource();
                int row = source.rowAtPoint( evt.getPoint());
//                int confirmation = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this row?", "DELETE CREATED ROW?", JOptionPane.OK_CANCEL_OPTION, 3);
                String input = JOptionPane.showInputDialog(null, "Enter quantity to add: ", "INPUT QUANTITY", JOptionPane.QUESTION_MESSAGE);
                int quantity = 0;
                try {
                    quantity = Integer.parseInt(input);
                    int stockQuantity = Integer.parseInt(tblStocks.getValueAt(row, 2).toString());
                    if(quantity > stockQuantity) {
                        JOptionPane.showMessageDialog(null, "Stock quantity not enough!", "INVALID QUANTITY", JOptionPane.ERROR_MESSAGE);
                    } else {
                        tblStocks.setValueAt(stockQuantity-quantity, row, 2);
                        ItemStock itemStock = itemStocks.get(row);
                        Vector<String> withdrawalRow = new Vector<>();
                        BigDecimal unitPrice = itemStock.getUnitPrice();
                        BigDecimal totalCost = unitPrice.multiply(new BigDecimal(quantity));
                        totalAmount = totalAmount.add(totalCost);
                        txtTotalAmount.setText(totalAmount.toString());
                        withdrawalRow.add(itemStock.getItemCode());
                        withdrawalRow.add(itemStock.getDescription());
                        withdrawalRow.add(quantity + "");
                        withdrawalRow.add(itemStock.getUnit());
                        withdrawalRow.add(unitPrice.toString());
                        withdrawalRow.add(itemStock.getCurrency());
                        withdrawalRow.add(totalCost.toString());
                        withdrawalData.add(withdrawalRow);
                        ((DefaultTableModel)tblWithdraw.getModel()).setDataVector(withdrawalData, withdrawalColumns);
                        if (tblWithdraw.getColumnModel().getColumnCount() > 0) {
                            tblWithdraw.getColumnModel().getColumn(0).setResizable(false);
                            tblWithdraw.getColumnModel().getColumn(0).setPreferredWidth(30);
                            tblWithdraw.getColumnModel().getColumn(1).setResizable(false);
                            tblWithdraw.getColumnModel().getColumn(1).setPreferredWidth(200);
                            tblWithdraw.getColumnModel().getColumn(2).setResizable(false);
                            tblWithdraw.getColumnModel().getColumn(2).setPreferredWidth(20);
                            tblWithdraw.getColumnModel().getColumn(3).setResizable(false);
                            tblWithdraw.getColumnModel().getColumn(3).setPreferredWidth(20);
                            tblWithdraw.getColumnModel().getColumn(4).setResizable(false);
                            tblWithdraw.getColumnModel().getColumn(4).setPreferredWidth(30);
                            tblWithdraw.getColumnModel().getColumn(5).setResizable(false);
                            tblWithdraw.getColumnModel().getColumn(5).setPreferredWidth(30);
                            tblWithdraw.getColumnModel().getColumn(6).setResizable(false);
                            withdrawPosition.add(row);
                        }
                    }
                    
                } catch(Exception e) {
                    JOptionPane.showMessageDialog(null, "Invalid Input", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }//GEN-LAST:event_tblStocksMouseClicked

    private void tblWithdrawMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblWithdrawMouseClicked
        SwingUtilities.invokeLater(() -> {
            if(evt.getClickCount()>1) {
                int confirmation = JOptionPane.showConfirmDialog(null, "Remove this row from withdrawal?", "CONFIRM REMOVE", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
                if(confirmation == 0) {
                    JTable source = (JTable)evt.getSource();
                    int row = source.rowAtPoint( evt.getPoint());
                    int stockRow = withdrawPosition.remove(row);
                    int withdrawQuantity = Integer.parseInt(String.valueOf(((DefaultTableModel)tblWithdraw.getModel()).getValueAt(row, 2).toString()));
                    BigDecimal cost = BigDecimal.valueOf(Double.parseDouble(((DefaultTableModel) tblWithdraw.getModel()).getValueAt(row, 6).toString()));
                    totalAmount = totalAmount.subtract(cost);
                    txtTotalAmount.setText(totalAmount.toString());
                    int stockQuantity = Integer.parseInt(String.valueOf(((DefaultTableModel)tblStocks.getModel()).getValueAt(stockRow, 2).toString()));
//                    ((DefaultTableModel)tblWithdraw.getModel()).getDataVector().remove(row);
//                    Vector withdrawRow = ((DefaultTableModel)tblWithdraw.getModel()).getDataVector();
                    withdrawalData.remove(row);
                    ((DefaultTableModel)tblWithdraw.getModel()).setDataVector(withdrawalData, withdrawalColumns);
                    tblStocks.getModel().setValueAt(withdrawQuantity + stockQuantity, stockRow, 2);
                    if (tblWithdraw.getColumnModel().getColumnCount() > 0) {
                        tblWithdraw.getColumnModel().getColumn(0).setResizable(false);
                        tblWithdraw.getColumnModel().getColumn(0).setPreferredWidth(30);
                        tblWithdraw.getColumnModel().getColumn(1).setResizable(false);
                        tblWithdraw.getColumnModel().getColumn(1).setPreferredWidth(200);
                        tblWithdraw.getColumnModel().getColumn(2).setResizable(false);
                        tblWithdraw.getColumnModel().getColumn(2).setPreferredWidth(20);
                        tblWithdraw.getColumnModel().getColumn(3).setResizable(false);
                        tblWithdraw.getColumnModel().getColumn(3).setPreferredWidth(20);
                        tblWithdraw.getColumnModel().getColumn(4).setResizable(false);
                        tblWithdraw.getColumnModel().getColumn(4).setPreferredWidth(30);
                        tblWithdraw.getColumnModel().getColumn(5).setResizable(false);
                        tblWithdraw.getColumnModel().getColumn(5).setPreferredWidth(30);
                        tblWithdraw.getColumnModel().getColumn(6).setResizable(false);
                        withdrawPosition.add(row);
                    }
                    
                }
                
            }
        });
    }//GEN-LAST:event_tblWithdrawMouseClicked

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        SwingUtilities.invokeLater(() -> {
            dispose();
            this.previousFrame.setVisible(true);
        });
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        if(txtWithdrawalNo.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter unique withdrawal No", "NO WITHDRAWAL NUMBER", JOptionPane.ERROR_MESSAGE);
        } else if(withdrawalData.size() < 1) {
            JOptionPane.showMessageDialog(null, "NO WITHDRAWAL ITEMS DETECTED", "NO WITHDRAWAL ITEMS", JOptionPane.ERROR_MESSAGE);
        } else {
            int confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want to save this Withdrawal Report?", "CONFIRM SAVE", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
            if(confirm == 0) {
                WithdrawalReport withdrawalReport = new WithdrawalReport();
                withdrawalReport.setWithdrawalNo(txtWithdrawalNo.getText());
                withdrawalReport.setWithdrawalDate(jdcDate.getDate());
                withdrawalReport.setIssuingWarehouse(txtIssuingWarehouse.getText().trim());
                withdrawalReport.setTruckNo(txtTruckNo.getText());
                withdrawalReport.setContainerNo(txtContainerNo.getText());
                withdrawalReport.setLocation(txtLocation.getText());
                withdrawalReport.setTotalAmount(totalAmount);
                withdrawalReport.setRequestedBy(users.get(cbxRequestedBy.getSelectedIndex()));
                withdrawalReport.setProject(projects.get(cbxProjectCode.getSelectedIndex()));
                withdrawalReport.setPreparedBy(ConstantHandler.user.getFirstName() + " " + ConstantHandler.user.getLastName());
                if(WithdrawalReportService.save(withdrawalReport)) {
                    System.err.println("WITHDRAWAL REPORT SUCCESSFULLY SAVED!!");
                    withdrawalData.forEach(data -> {
                        String itemCode = data.get(0).toString();
                        String description = data.get(1).toString();
                        int quantity = Integer.parseInt(data.get(2).toString());
                        String unit = data.get(3).toString();
                        BigDecimal unitPrice = BigDecimal.valueOf(Double.parseDouble(data.get(4).toString()));
                        String currency = data.get(5).toString();
                        ItemRequest itemRequest = new ItemRequest();
                        itemRequest.setWithdrawalReport(withdrawalReport);
                        itemRequest.setItemCode(itemCode);
                        itemRequest.setDescription(description);
                        itemRequest.setQuantity(quantity);
                        itemRequest.setUnit(unit);
                        itemRequest.setUnitPrice(unitPrice);
                        itemRequest.setCurrency(currency);
                        if(ItemRequestService.save(itemRequest)) {
                            System.err.println("ITEM REQUEST SUCCESSFULLY SAVED!!");
                        }
                    });
                    withdrawPosition.forEach(index -> {
                        ItemStock itemStock = itemStocks.get(index);
                        int quantity = Integer.parseInt(((DefaultTableModel)tblStocks.getModel()).getValueAt(index, 2).toString());
                        itemStock.setQuantity(quantity);
                        if(ItemStockService.update(itemStock)) {
                            System.err.println("ITEM STOCK SUCCESSFULLY UPDATED!!");
                        }
                    });
                }
            }
            
        }
        
    }//GEN-LAST:event_btnSaveActionPerformed

    private void cbxProjectNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxProjectNameActionPerformed
        SwingUtilities.invokeLater(() -> {
            int index = cbxProjectName.getSelectedIndex();
            cbxProjectCode.setSelectedIndex(index);
        });
    }//GEN-LAST:event_cbxProjectNameActionPerformed

    private void cbxProjectCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxProjectCodeActionPerformed
        SwingUtilities.invokeLater(() -> {
            int index = cbxProjectCode.getSelectedIndex();
            cbxProjectName.setSelectedIndex(index);
        });
    }//GEN-LAST:event_cbxProjectCodeActionPerformed

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
            java.util.logging.Logger.getLogger(AddWithdrawal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddWithdrawal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddWithdrawal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddWithdrawal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddWithdrawal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> cbxProjectCode;
    private javax.swing.JComboBox<String> cbxProjectName;
    private javax.swing.JComboBox<String> cbxRequestedBy;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private com.toedter.calendar.JDateChooser jdcDate;
    private javax.swing.JTable tblStocks;
    private javax.swing.JTable tblWithdraw;
    private javax.swing.JTextField txtContainerNo;
    private javax.swing.JTextField txtIssuingWarehouse;
    private javax.swing.JTextField txtLocation;
    private javax.swing.JTextField txtTotalAmount;
    private javax.swing.JTextField txtTruckNo;
    private javax.swing.JTextField txtWithdrawalNo;
    // End of variables declaration//GEN-END:variables

    private void initializeData() {
        DefaultComboBoxModel projectCodeModel = new DefaultComboBoxModel();
        DefaultComboBoxModel projectNameModel = new DefaultComboBoxModel();
        DefaultComboBoxModel requestedByModel = new DefaultComboBoxModel();
        projects = ProjectService.findAll();
        projects.forEach(project -> {
            projectCodeModel.addElement(project.getProjectCode());
            projectNameModel.addElement(project.getProjectName());
        });
        users = UserService.findAll();
        users.forEach(user -> requestedByModel.addElement(user.getFirstName() + " " + user.getLastName()));
        stockData = new Vector<>();
        withdrawalData = new Vector<>();
        stockColumns = new Vector<>();
        stockColumns.add("ITEM CODE");
        stockColumns.add("DESCRIPTION");
        stockColumns.add("QUANTITY");
        stockColumns.add("UNIT");
        stockColumns.add("UNIT PRICE");
        stockColumns.add("CURRENCY");
        withdrawalData = new Vector<>();
        withdrawalColumns = new Vector<>();
        withdrawalColumns.add("ITEM CODE");
        withdrawalColumns.add("DESCRIPTION");
        withdrawalColumns.add("QUANTITY");
        withdrawalColumns.add("UNIT");
        withdrawalColumns.add("UNIT PRICE");
        withdrawalColumns.add("CURRENCY");
        withdrawalColumns.add("TOTAL COST");
        itemStocks = ItemStockService.findAll();
        itemStocks.forEach(itemStock -> {
            Vector<String> stockRow = new Vector<>();
            stockRow.add(itemStock.getItemCode());
            stockRow.add(itemStock.getDescription());
            stockRow.add(itemStock.getQuantity() + "");
            stockRow.add(itemStock.getUnit());
            stockRow.add(itemStock.getUnitPrice().toString());
            stockRow.add(itemStock.getCurrency());
            stockData.add(stockRow);
        });
        DefaultTableModel stockModel = new DefaultTableModel(stockData, stockColumns) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            } 
       };
        tblStocks.setModel(stockModel);
        if (tblStocks.getColumnModel().getColumnCount() > 0) {
            tblStocks.getColumnModel().getColumn(0).setResizable(false);
            tblStocks.getColumnModel().getColumn(0).setPreferredWidth(30);
            tblStocks.getColumnModel().getColumn(1).setResizable(false);
            tblStocks.getColumnModel().getColumn(1).setPreferredWidth(200);
            tblStocks.getColumnModel().getColumn(2).setResizable(false);
            tblStocks.getColumnModel().getColumn(2).setPreferredWidth(20);
            tblStocks.getColumnModel().getColumn(3).setResizable(false);
            tblStocks.getColumnModel().getColumn(3).setPreferredWidth(20);
            tblStocks.getColumnModel().getColumn(4).setResizable(false);
            tblStocks.getColumnModel().getColumn(4).setPreferredWidth(30);
            tblStocks.getColumnModel().getColumn(5).setResizable(false);
            tblStocks.getColumnModel().getColumn(5).setPreferredWidth(30);
        }
        SwingUtilities.invokeLater(() -> {
            jdcDate.setDate(new Date());
            AutoCompleteDecorator.decorate(cbxProjectCode);
            AutoCompleteDecorator.decorate(cbxProjectName);
            AutoCompleteDecorator.decorate(cbxRequestedBy);
            cbxProjectCode.setModel(projectCodeModel);
            cbxProjectName.setModel(projectNameModel);
            cbxRequestedBy.setModel(requestedByModel);
        });
    }
}
