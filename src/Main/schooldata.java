package Main;

import Class.CellRenderer;
import Class.HeaderRenderer;
import java.awt.Dimension;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.proteanit.sql.DbUtils;

public class schooldata extends javax.swing.JPanel 
{
    
    static Connection con;
    PreparedStatement pst;
    ResultSet rs;

    public schooldata() throws ClassNotFoundException, SQLException 
    {
        initComponents();
        tableDesign();
    }
    
    public void tableDesign() throws ClassNotFoundException, SQLException
    {
        fetchData(); 
        schoolDataTable.getColumnModel().getColumn(0).setHeaderRenderer(new HeaderRenderer());
      
        schoolDataTable.setDefaultRenderer(Object.class, new CellRenderer());

        schoolDataTable.getTableHeader().setPreferredSize(new Dimension(30, 23));
        
        schoolDataTable.getColumnModel().getColumn(0).setHeaderValue("SCHOOL");
        
        fetchData1();
        jTable2.getColumnModel().getColumn(0).setHeaderRenderer(new HeaderRenderer());
        jTable2.getColumnModel().getColumn(1).setHeaderRenderer(new HeaderRenderer());
      
        jTable2.setDefaultRenderer(Object.class, new CellRenderer());

        jTable2.getTableHeader().setPreferredSize(new Dimension(30, 23));
        
        jTable2.getColumnModel().getColumn(0).setHeaderValue("SCHOOL");
        jTable2.getColumnModel().getColumn(1).setHeaderValue("DEPT");
        
       // fetchData2();
        jTable3.getColumnModel().getColumn(0).setHeaderRenderer(new HeaderRenderer());
        jTable3.getColumnModel().getColumn(1).setHeaderRenderer(new HeaderRenderer());
        jTable3.getColumnModel().getColumn(2).setHeaderRenderer(new HeaderRenderer());
      
        jTable3.setDefaultRenderer(Object.class, new CellRenderer());

        jTable3.getTableHeader().setPreferredSize(new Dimension(30, 23));
        
        jTable3.getColumnModel().getColumn(0).setHeaderValue("SCHOOL");
        jTable3.getColumnModel().getColumn(1).setHeaderValue("DEPT");
        jTable3.getColumnModel().getColumn(2).setHeaderValue("MAJOR");
    }
    
    public void fetchData() throws ClassNotFoundException, SQLException
    {

            try
            {
                Class.forName("com.mysql.jdbc.Driver");  
                java.sql.Connection con = DriverManager.getConnection( "jdbc:mysql://localhost:3306/aias", "root", "");
                pst = con.prepareStatement("Select schoolcode from school");
                rs = pst.executeQuery();
                schoolDataTable.setModel(DbUtils.resultSetToTableModel(rs));
            }
            catch (ClassNotFoundException | SQLException ex) 
            {
                Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
            }
        
    }
    
    public void fetchData1() throws ClassNotFoundException, SQLException
    {

            try
            {
                Class.forName("com.mysql.jdbc.Driver");  
                java.sql.Connection con = DriverManager.getConnection( "jdbc:mysql://localhost:3306/aias", "root", "");
                pst = con.prepareStatement("Select schoolcode,deptcode from department");
                rs = pst.executeQuery();
                jTable2.setModel(DbUtils.resultSetToTableModel(rs));
            }
            catch (ClassNotFoundException | SQLException ex) 
            {
                Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
            }
        
    }
    
    public void fetchData2() throws ClassNotFoundException, SQLException
    {

            try
            {
                Class.forName("com.mysql.jdbc.Driver");  
                java.sql.Connection con = DriverManager.getConnection( "jdbc:mysql://localhost:3306/aias", "root", "");
                pst = con.prepareStatement("");
                rs = pst.executeQuery();
                jTable3.setModel(DbUtils.resultSetToTableModel(rs));
            }
            catch (ClassNotFoundException | SQLException ex) 
            {
                Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
            }
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        schoolDataTable = new javax.swing.JTable();
        itemNameLbl5 = new javax.swing.JLabel();
        schooltxt = new javax.swing.JFormattedTextField();
        addschoolbtn = new rojeru_san.RSButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        itemNameLbl6 = new javax.swing.JLabel();
        jFormattedTextField2 = new javax.swing.JFormattedTextField();
        rSButton15 = new rojeru_san.RSButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        itemNameLbl7 = new javax.swing.JLabel();
        jFormattedTextField3 = new javax.swing.JFormattedTextField();
        rSButton16 = new rojeru_san.RSButton();
        selectOptionForProductTypelbl = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        itemNameLbl8 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();
        itemNameLbl9 = new javax.swing.JLabel();

        schoolDataTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        schoolDataTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"454af6afa"},
                {"gsaasg"},
                {"asgsa"},
                {"gasg"}
            },
            new String [] {
                "School"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        schoolDataTable.setGridColor(new java.awt.Color(153, 153, 153));
        schoolDataTable.setRowHeight(23);
        schoolDataTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                schoolDataTableMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(schoolDataTable);

        itemNameLbl5.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
        itemNameLbl5.setText("School");

        schooltxt.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("YYYY"))));
        schooltxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                schooltxtActionPerformed(evt);
            }
        });

        addschoolbtn.setBackground(new java.awt.Color(64, 68, 100));
        addschoolbtn.setText("ADD");
        addschoolbtn.setColorHover(new java.awt.Color(101, 104, 130));
        addschoolbtn.setFont(new java.awt.Font("Roboto Bold", 0, 13)); // NOI18N
        addschoolbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addschoolbtnActionPerformed(evt);
            }
        });

        jTable2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"454af6afa", null},
                {"gsaasg", null},
                {"asgsa", null},
                {"gasg", null}
            },
            new String [] {
                "School", "Department"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.setGridColor(new java.awt.Color(153, 153, 153));
        jTable2.setRowHeight(23);
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTable2MousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        itemNameLbl6.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
        itemNameLbl6.setText("Department");

        jFormattedTextField2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("YYYY"))));
        jFormattedTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextField2ActionPerformed(evt);
            }
        });

        rSButton15.setBackground(new java.awt.Color(64, 68, 100));
        rSButton15.setText("ADD");
        rSButton15.setColorHover(new java.awt.Color(101, 104, 130));
        rSButton15.setFont(new java.awt.Font("Roboto Bold", 0, 13)); // NOI18N
        rSButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButton15ActionPerformed(evt);
            }
        });

        jTable3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"454af6afa", null, null},
                {"gsaasg", null, null},
                {"asgsa", null, null},
                {"gasg", null, null}
            },
            new String [] {
                "School", "Department", "Major"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable3.setGridColor(new java.awt.Color(153, 153, 153));
        jTable3.setRowHeight(23);
        jTable3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTable3MousePressed(evt);
            }
        });
        jScrollPane3.setViewportView(jTable3);

        itemNameLbl7.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
        itemNameLbl7.setText("School");

        jFormattedTextField3.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("YYYY"))));
        jFormattedTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextField3ActionPerformed(evt);
            }
        });

        rSButton16.setBackground(new java.awt.Color(64, 68, 100));
        rSButton16.setText("ADD");
        rSButton16.setColorHover(new java.awt.Color(101, 104, 130));
        rSButton16.setFont(new java.awt.Font("Roboto Bold", 0, 13)); // NOI18N
        rSButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButton16ActionPerformed(evt);
            }
        });

        selectOptionForProductTypelbl.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
        selectOptionForProductTypelbl.setText("School");

        jComboBox2.setFont(new java.awt.Font("Microsoft JhengHei", 1, 13)); // NOI18N
        jComboBox2.setForeground(new java.awt.Color(0, 0, 255));
        jComboBox2.setFocusable(false);

        jComboBox3.setFont(new java.awt.Font("Microsoft JhengHei", 1, 13)); // NOI18N
        jComboBox3.setForeground(new java.awt.Color(0, 0, 255));
        jComboBox3.setFocusable(false);

        itemNameLbl8.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
        itemNameLbl8.setText("Department");

        jComboBox4.setFont(new java.awt.Font("Microsoft JhengHei", 1, 13)); // NOI18N
        jComboBox4.setForeground(new java.awt.Color(0, 0, 255));
        jComboBox4.setFocusable(false);

        itemNameLbl9.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
        itemNameLbl9.setText("Major");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(itemNameLbl5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(schooltxt, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addschoolbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(selectOptionForProductTypelbl)
                        .addGap(47, 47, 47)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rSButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(itemNameLbl6, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFormattedTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(itemNameLbl7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(itemNameLbl9)
                                .addGap(9, 9, 9)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(itemNameLbl8, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBox4, 0, 162, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jFormattedTextField3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rSButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(rSButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(itemNameLbl5)
                                .addComponent(schooltxt, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(addschoolbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(selectOptionForProductTypelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(rSButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(itemNameLbl7)
                                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(itemNameLbl8)
                                .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(itemNameLbl6)
                                    .addComponent(jFormattedTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 379, Short.MAX_VALUE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jFormattedTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(itemNameLbl9))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addschoolbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addschoolbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addschoolbtnActionPerformed

    private void schoolDataTableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_schoolDataTableMousePressed

    }//GEN-LAST:event_schoolDataTableMousePressed

    private void schooltxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_schooltxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_schooltxtActionPerformed

    private void jTable2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable2MousePressed

    private void jFormattedTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextField2ActionPerformed

    private void rSButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButton15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rSButton15ActionPerformed

    private void jTable3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable3MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable3MousePressed

    private void jFormattedTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextField3ActionPerformed

    private void rSButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButton16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rSButton16ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.RSButton addschoolbtn;
    private javax.swing.JLabel itemNameLbl5;
    private javax.swing.JLabel itemNameLbl6;
    private javax.swing.JLabel itemNameLbl7;
    private javax.swing.JLabel itemNameLbl8;
    private javax.swing.JLabel itemNameLbl9;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JFormattedTextField jFormattedTextField2;
    private javax.swing.JFormattedTextField jFormattedTextField3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private rojeru_san.RSButton rSButton15;
    private rojeru_san.RSButton rSButton16;
    private javax.swing.JTable schoolDataTable;
    private javax.swing.JFormattedTextField schooltxt;
    private javax.swing.JLabel selectOptionForProductTypelbl;
    // End of variables declaration//GEN-END:variables
}
