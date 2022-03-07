/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;
import java.util.HashMap;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.bson.Document;
/**
 *
 * @author hp
 */
public class adminForm extends javax.swing.JFrame {
    
    private HashMap<Integer,Document>consumer=new HashMap<>();
    public String []meterIDs;
    
    
    
    public adminForm() {
        initComponents();
        disableComboBox2();
    }

     public void disableComboBox2()
    {
        jComboBox2.setEnabled(false);
    }
    public void resetTable(DefaultTableModel dtm)
    {
       dtm.setRowCount(0);
    }
    public adminForm(String id,String sessionID)
    {
        initComponents();
        l1.setText(id+" now active");
       
        disableComboBox2();
        sessionLabel.setText(sessionID);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        billrate = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        lbillpay = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        tYear = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tUnits = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        lPaychk = new javax.swing.JCheckBox();
        jScrollPane4 = new javax.swing.JScrollPane();
        BillTa = new javax.swing.JTextArea();
        jButton6 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        filtercb = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        consumer_label = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        jCheckBox3 = new javax.swing.JCheckBox();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        pText = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        jButton8 = new javax.swing.JButton();
        unRadio = new javax.swing.JRadioButton();
        l1 = new javax.swing.JLabel();
        sessionLabel = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("USEB Home");
        setPreferredSize(new java.awt.Dimension(1120, 880));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Update"));

        jLabel1.setText("Bill Rate/Unit");

        jLabel2.setText("Late Bill Pay Amount");

        jButton1.setText("UPDATE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jCheckBox1.setText("Get stored values");
        jCheckBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox1ItemStateChanged(evt);
            }
        });
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        ta.setColumns(20);
        ta.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        ta.setLineWrap(true);
        ta.setRows(3);
        ta.setBorder(null);
        ta.setFocusable(false);
        ta.setRequestFocusEnabled(false);
        ta.setVerifyInputWhenFocusTarget(false);
        jScrollPane1.setViewportView(ta);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jCheckBox1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(billrate)
                    .addComponent(lbillpay, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(60, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(billrate, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbillpay, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                .addGap(17, 17, 17))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Billing "));

        jLabel4.setText("Meter ID");

        jComboBox2.setToolTipText("Meter IDs of all users");
        jComboBox2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jComboBox2FocusGained(evt);
            }
        });

        jLabel5.setText("Billing for month");

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
        jComboBox3.setPreferredSize(new java.awt.Dimension(31, 22));

        jLabel6.setText("Year");

        jLabel7.setText("Units Consumed");

        jButton3.setText("Generate Bill");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        lPaychk.setText("Last Bill Late Payment");
        lPaychk.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                lPaychkItemStateChanged(evt);
            }
        });

        BillTa.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.light"));
        BillTa.setColumns(20);
        BillTa.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        BillTa.setLineWrap(true);
        BillTa.setRows(5);
        BillTa.setToolTipText("Bill description will be shown here");
        BillTa.setWrapStyleWord(true);
        BillTa.setFocusable(false);
        BillTa.setRequestFocusEnabled(false);
        BillTa.setVerifyInputWhenFocusTarget(false);
        jScrollPane4.setViewportView(BillTa);

        jButton6.setText("GET");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton9.setText("Create Bill");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tYear, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tUnits, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jComboBox3, 0, 183, Short.MAX_VALUE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(15, 15, 15))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(lPaychk)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                        .addComponent(jButton6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tYear, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tUnits, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lPaychk)
                    .addComponent(jButton9)))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("New Meter Connections"));

        jLabel3.setText("Search consumers by");

        filtercb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pincode", "All" }));
        filtercb.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                filtercbItemStateChanged(evt);
            }
        });
        filtercb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filtercbActionPerformed(evt);
            }
        });

        jButton2.setText("Generate List");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel8.setText("Name of new consumer");

        consumer_label.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel9.setText("Enter a meter ID ");

        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });

        jCheckBox3.setText("Check for valid ID/Non-duplicate ID");
        jCheckBox3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox3ItemStateChanged(evt);
            }
        });
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });

        jButton4.setText("Register Consumer");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Remove Consumer");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Select consumer from the above table and press Insert");
        jLabel10.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton7.setText("INSERT");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel11.setText("Pincode");

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Meter No.", "Area Code", "Aadhar ID", "NOC"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        table1.setColumnSelectionAllowed(true);
        table1.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(table1);
        table1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (table1.getColumnModel().getColumnCount() > 0) {
            table1.getColumnModel().getColumn(0).setMaxWidth(400);
        }

        jButton8.setText("Reset Table");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        unRadio.setText("Unregistered Only");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBox3)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(73, 73, 73)
                                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(consumer_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(id, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(unRadio, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                    .addGap(83, 83, 83)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(filtercb, 0, 191, Short.MAX_VALUE)
                                        .addComponent(pText)))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 572, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(95, 95, 95))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(filtercb, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(pText, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(unRadio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(9, 9, 9)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(consumer_label, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addComponent(jCheckBox3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        l1.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N

        sessionLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        sessionLabel.setForeground(new java.awt.Color(255, 51, 51));
        sessionLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jMenu1.setText("Session");

        jMenuItem1.setText("Logout");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar2.add(jMenu1);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(473, 473, 473)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 611, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(l1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sessionLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(l1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(sessionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void filtercbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filtercbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_filtercbActionPerformed

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox1ItemStateChanged
       
        List<String> data=new src.dataExtractor().getDefaultBillValues();
        ta.append("\tBill Rate : Rs "+data.get(0)+"/per unit\n\n\tLate bill-pay fine : Rs "+data.get(1)+" + net pay amt");// TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            String br=billrate.getText();
            String lbp=lbillpay.getText();
            int f=new src.dataExtractor().updateDefaultBillValues(br, lbp);
            if(f==1)
            {
                JOptionPane.showMessageDialog(this, "Values updated successfully!");
            }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       String filter=filtercb.getSelectedItem().toString();
       DefaultTableModel dtm=(DefaultTableModel)table1.getModel();
       int unregFlag=0;
       if(unRadio.isSelected()){
           unregFlag=1;
       }
       if(filter.equals("Pincode"))
       {
           String pincode=pText.getText();
           consumer=new src.dataExtractor().getListOfConsumers(pincode,unregFlag);
       }
       else
       {
           consumer=new src.dataExtractor().getListOfConsumers(unregFlag);
       }
       if(consumer.size()==0){
           JOptionPane.showMessageDialog(this,"No new meter registrations present!");
       }
       else
       {
           for(int i=0;i<consumer.size();i++)
       {
           Object[] data={consumer.get(i).get("Consumer Name"),consumer.get(i).get("Meter No"),consumer.get(i).get("Pincode"),consumer.get(i).get("Consumer Aadhar No")
             ,consumer.get(i).get("House NOC")};
           dtm.insertRow(i,data);
           
       }
       }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void filtercbItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_filtercbItemStateChanged
        String str=filtercb.getSelectedItem().toString();
        if(str.equals("Pincode"))
        {
            pText.setEnabled(true);
            pText.setEditable(true);
        }
        else
        {
            pText.setEditable(false);
            pText.setEnabled(false);
        }// TODO add your handling code here:
    }//GEN-LAST:event_filtercbItemStateChanged

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
            DefaultTableModel dtm=(DefaultTableModel)table1.getModel();
            if(dtm.getRowCount()==0)
            {
                JOptionPane.showMessageDialog(this, "No data present in table !","Error",JOptionPane.WARNING_MESSAGE);
            }
            resetTable(dtm);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        try
        {
            int r=table1.getSelectedRow();
            int c=table1.getSelectedColumn();
           
            if(!table1.getValueAt(r, 1).toString().equals("NA"))
            {
                id.setText(table1.getValueAt(r, 1).toString());
            }
            
             String str=table1.getValueAt(r, c).toString();
             consumer_label.setText(str);
            
            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, "No cell selected !","Null data",JOptionPane.WARNING_MESSAGE);
        }
        
            
            
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jCheckBox3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox3ItemStateChanged
        
        
    }//GEN-LAST:event_jCheckBox3ItemStateChanged

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
        String meterID=id.getText();
        int r=table1.getSelectedRow();
        if(meterID.equals(""))
        {
            JOptionPane.showMessageDialog(this, "Assign a meter ID","ERROR",JOptionPane.WARNING_MESSAGE);
            jCheckBox3.setSelected(false);
        }
        
        else if(!table1.getValueAt(r, 1).toString().equals("NA"))
            {
                JOptionPane.showMessageDialog(this, "Consumer already has a meter connection","Error",JOptionPane.INFORMATION_MESSAGE);
            }
        else
        {
            int f=new src.dataExtractor().checkMeter(meterID);
        if(f==2)
        {
            JOptionPane.showMessageDialog(this,"Meter ID :"+meterID+" is UNIQUE !","Success",JOptionPane.INFORMATION_MESSAGE);
        }
        if(f==1)
        {
            id.setText("");
            JOptionPane.showMessageDialog(this, "Meter ID : "+meterID+" ALREADY registered !","Message",JOptionPane.INFORMATION_MESSAGE);
            jCheckBox3.setSelected(false);
        }
        }
        
    }//GEN-LAST:event_jCheckBox3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       if(jCheckBox3.isSelected())
       {
           String consumerName=consumer_label.getText();
           String meterID=id.getText();
           
           int k=JOptionPane.showConfirmDialog(this,"You are about to register "+consumerName+"\nMeter ID : "+meterID,"Confirm",JOptionPane.INFORMATION_MESSAGE);
           
           if(k==JOptionPane.YES_OPTION)
           {
               String password=new src.dataExtractor().registerMeterConnection(consumerName, meterID);
               JOptionPane.showMessageDialog(this, "Password : "+password+".\nSave this for future login");
               JOptionPane.showMessageDialog(this, "Consumer with meterID : "+meterID+" successfully registered !","Success",JOptionPane.INFORMATION_MESSAGE);
           }
       }
       else
       {
           JOptionPane.showMessageDialog(this,"Meter ID should be verified first !");
       }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        String consumerName=consumer_label.getText();
        String meterID=id.getText();
        int f=0;
        if(!consumerName.equals(""))
        {
            f=new src.dataExtractor().dropMeterConnectionReq(consumerName);
        }
        if(f!=1)
        {
            JOptionPane.showMessageDialog(this, "Consumer connection request rejected !\nREFRESH the table","Success",JOptionPane.INFORMATION_MESSAGE);
        }
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jComboBox2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jComboBox2FocusGained
        
    }//GEN-LAST:event_jComboBox2FocusGained

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        try
        {
        String meterID=jComboBox2.getSelectedItem().toString();
        String month=jComboBox3.getSelectedItem().toString();
        String year=tYear.getText();
        String units=tUnits.getText();
        
        String latePay=new src.dataExtractor().getLatePay();
        String billrate=new src.dataExtractor().getBillRate();
        String latePaycnf="NA";
        
         Double amt=Double.parseDouble(units)*Double.parseDouble(billrate);
        if(lPaychk.isSelected()==true)
        {
            amt+=Double.parseDouble(latePay);
            latePaycnf="Rs "+latePay+" applied /-";
        }
        BillTa.append("\nConsumer : "+new src.dataExtractor().getConsumerName(meterID)+"\nMeter No. : "+meterID+"\n"
                + "Total Bill Amount : Rs "+String.valueOf(amt)+"\nUnits Consumed : "+units+"\nBill Rate : Rs "+billrate+" per unit"+
                        "\nBilling Month : "+month+" "+year+"\nLate Bill Pay Charges : "+latePaycnf);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this,"Please fill out every field !","Error",JOptionPane.WARNING_MESSAGE);
        }
       
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void lPaychkItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_lPaychkItemStateChanged
       if(BillTa.getColumns()>0)
       {
           BillTa.setText("");
       }
    }//GEN-LAST:event_lPaychkItemStateChanged

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        if(jComboBox2.getItemCount()==0)
        {
            meterIDs=new src.dataExtractor().getAllMeters();
            for(String s: meterIDs)
            {
                jComboBox2.addItem(s);
            }
        }
        jButton6.setEnabled(false);
        jComboBox2.setEnabled(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        String meterID=jComboBox2.getSelectedItem().toString();
        String month=jComboBox3.getSelectedItem().toString();
        String year=tYear.getText();
        String units=tUnits.getText();
        
        String latePay=new src.dataExtractor().getLatePay();
        String billrate=new src.dataExtractor().getBillRate();
        String latePaycnf="NA";
        
         Double amt=Double.parseDouble(units)*Double.parseDouble(billrate);
        if(lPaychk.isSelected()==true)
        {
            amt+=Double.parseDouble(latePay);
            latePaycnf="Rs "+latePay+" applied /-";
        }
        
       int f=new src.dataExtractor().insertIntoBillingDocument(meterID, year, month, units, latePaycnf, String.valueOf(amt));
       
       if(f==1)
       {
           JOptionPane.showMessageDialog(this,"Bill created for "+month+" "+year+" for consumer : "+meterID+" successfully");
       }
       else
       {
           JOptionPane.showMessageDialog(this, "Fatal Error, please try again later !","ERROR",JOptionPane.WARNING_MESSAGE);
       }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        String session=sessionLabel.getText();
        int j=JOptionPane.showConfirmDialog(this, "Logout from current session ?");
        if(j==JOptionPane.YES_OPTION)
        {
            new sessions.logs().setUnActive(session);
            this.setVisible(false);
            JOptionPane.showMessageDialog(this, "Successfully logged out!","USEB",JOptionPane.INFORMATION_MESSAGE);
            new gui.userlogin().setVisible(true);
        }
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(adminForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea BillTa;
    private javax.swing.JTextField billrate;
    private javax.swing.JLabel consumer_label;
    private javax.swing.JComboBox<String> filtercb;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel l1;
    private javax.swing.JCheckBox lPaychk;
    private javax.swing.JTextField lbillpay;
    private javax.swing.JTextField pText;
    private javax.swing.JLabel sessionLabel;
    private javax.swing.JTextField tUnits;
    private javax.swing.JTextField tYear;
    private javax.swing.JTextArea ta;
    private javax.swing.JTable table1;
    private javax.swing.JRadioButton unRadio;
    // End of variables declaration//GEN-END:variables
}
