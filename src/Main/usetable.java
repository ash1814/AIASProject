package Main;

import Class.*;
import static Main.login.admin;
import static Main.login.userID;
import java.awt.Dimension;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.proteanit.sql.DbUtils;

public class usetable extends javax.swing.JPanel 
{
    static Connection con;
    PreparedStatement pst;
    ResultSet rs;
    
    public usetable() throws ClassNotFoundException, SQLException 
    {
        initComponents();
        tableDesign();
    }

    public void tableDesign() throws ClassNotFoundException, SQLException
    {
        fetchData();
                
        jTable1.getColumnModel().getColumn(0).setHeaderRenderer(new HeaderRenderer());
        jTable1.getColumnModel().getColumn(1).setHeaderRenderer(new HeaderRenderer());
        jTable1.getColumnModel().getColumn(2).setHeaderRenderer(new HeaderRenderer());
        jTable1.getColumnModel().getColumn(3).setHeaderRenderer(new HeaderRenderer());
        jTable1.getColumnModel().getColumn(4).setHeaderRenderer(new HeaderRenderer());
      
        jTable1.setDefaultRenderer(Object.class, new CellRenderer());

        jTable1.getTableHeader().setPreferredSize(new Dimension(30, 23));
        
            jTable1.getColumnModel().getColumn(0).setHeaderValue("ID");
            jTable1.getColumnModel().getColumn(1).setHeaderValue("Name");
            jTable1.getColumnModel().getColumn(2).setHeaderValue("Group");
            jTable1.getColumnModel().getColumn(3).setHeaderValue("Email");
            jTable1.getColumnModel().getColumn(4).setHeaderValue("Password");
    }
    
    public void fetchData() throws ClassNotFoundException, SQLException
    {
        if(admin)
        {
            try
            {
                Class.forName("com.mysql.jdbc.Driver");  
                java.sql.Connection con = DriverManager.getConnection( "jdbc:mysql://localhost:3306/aias", "root", "");
                pst = con.prepareStatement("Select * from user");
                rs = pst.executeQuery();
                jTable1.setModel(DbUtils.resultSetToTableModel(rs));
            }
            catch (ClassNotFoundException ex) 
            {
                Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
            } 
            catch (SQLException ex) {
                Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else
        {
            try
            {
                Class.forName("com.mysql.jdbc.Driver");  
                java.sql.Connection con = DriverManager.getConnection( "jdbc:mysql://localhost:3306/aias", "root", "");
                pst = con.prepareStatement("Select * from user where userid= '"+userID+"'");
                rs = pst.executeQuery();
                jTable1.setModel(DbUtils.resultSetToTableModel(rs));
                jFormattedTextField1.setEditable(false);
                jFormattedTextField4.setEditable(false);
                jFormattedTextField2.setEditable(false);
                rSButton11.setVisible(false);
                rSButton12.setVisible(false);
            }
            catch (ClassNotFoundException | SQLException ex) 
            {
                Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        itemNameLbl6 = new javax.swing.JLabel();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        rSButton11 = new rojeru_san.RSButton();
        rSButton12 = new rojeru_san.RSButton();
        rSButton13 = new rojeru_san.RSButton();
        rSButton14 = new rojeru_san.RSButton();
        itemNameLbl8 = new javax.swing.JLabel();
        itemNameLbl9 = new javax.swing.JLabel();
        itemNameLbl10 = new javax.swing.JLabel();
        jFormattedTextField2 = new javax.swing.JFormattedTextField();
        jFormattedTextField3 = new javax.swing.JFormattedTextField();
        jFormattedTextField4 = new javax.swing.JFormattedTextField();
        itemNameLbl11 = new javax.swing.JLabel();
        jFormattedTextField5 = new javax.swing.JFormattedTextField();

        setBackground(new java.awt.Color(241, 243, 246));

        jTable1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "Supplier", "Generic Name", "Code", "Batch No.", "Product"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setGridColor(new java.awt.Color(153, 153, 153));
        jTable1.setRowHeight(23);
        jScrollPane1.setViewportView(jTable1);

        jPanel3.setBackground(new java.awt.Color(241, 243, 246));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 255), 2));

        itemNameLbl6.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
        itemNameLbl6.setText("Id");

        jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("YYYY"))));
        jFormattedTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextField1ActionPerformed(evt);
            }
        });

        rSButton11.setBackground(new java.awt.Color(64, 68, 100));
        rSButton11.setText("ADD");
        rSButton11.setColorHover(new java.awt.Color(101, 104, 130));
        rSButton11.setFont(new java.awt.Font("Roboto Bold", 0, 13)); // NOI18N

        rSButton12.setBackground(new java.awt.Color(64, 68, 100));
        rSButton12.setText("DELETE");
        rSButton12.setColorHover(new java.awt.Color(101, 104, 130));
        rSButton12.setFont(new java.awt.Font("Roboto Bold", 0, 13)); // NOI18N
        rSButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButton12ActionPerformed(evt);
            }
        });

        rSButton13.setBackground(new java.awt.Color(64, 68, 100));
        rSButton13.setText("UPDATE");
        rSButton13.setColorHover(new java.awt.Color(101, 104, 130));
        rSButton13.setFont(new java.awt.Font("Roboto Bold", 0, 13)); // NOI18N
        rSButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButton13ActionPerformed(evt);
            }
        });

        rSButton14.setBackground(new java.awt.Color(64, 68, 100));
        rSButton14.setText("REFRESH");
        rSButton14.setColorHover(new java.awt.Color(101, 104, 130));
        rSButton14.setFont(new java.awt.Font("Roboto Bold", 0, 13)); // NOI18N
        rSButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButton14ActionPerformed(evt);
            }
        });

        itemNameLbl8.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
        itemNameLbl8.setText("Name");

        itemNameLbl9.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
        itemNameLbl9.setText("User Type");

        itemNameLbl10.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
        itemNameLbl10.setText("Email");

        jFormattedTextField2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("YYYY"))));
        jFormattedTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextField2ActionPerformed(evt);
            }
        });

        jFormattedTextField3.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("YYYY"))));
        jFormattedTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextField3ActionPerformed(evt);
            }
        });

        jFormattedTextField4.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("YYYY"))));
        jFormattedTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextField4ActionPerformed(evt);
            }
        });

        itemNameLbl11.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
        itemNameLbl11.setText("Password");

        jFormattedTextField5.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("YYYY"))));
        jFormattedTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextField5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(itemNameLbl11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(itemNameLbl10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(itemNameLbl9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                    .addComponent(itemNameLbl8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(itemNameLbl6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(5, 5, 5)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jFormattedTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jFormattedTextField5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
                        .addComponent(jFormattedTextField2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
                        .addComponent(jFormattedTextField4, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
                        .addComponent(jFormattedTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 298, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(rSButton13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rSButton12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rSButton14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(rSButton11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(itemNameLbl6)
                    .addComponent(jFormattedTextField1)
                    .addComponent(rSButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(itemNameLbl8)
                            .addComponent(jFormattedTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(itemNameLbl9)
                            .addComponent(jFormattedTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(itemNameLbl10)
                            .addComponent(jFormattedTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(itemNameLbl11)
                            .addComponent(jFormattedTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(rSButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rSButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rSButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jScrollPane1)
                .addGap(5, 5, 5))
            .addGroup(layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 482, Short.MAX_VALUE)
                .addGap(5, 5, 5))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jFormattedTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextField1ActionPerformed

    private void rSButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButton14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rSButton14ActionPerformed

    private void jFormattedTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextField2ActionPerformed

    private void jFormattedTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextField3ActionPerformed

    private void jFormattedTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextField4ActionPerformed

    private void jFormattedTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextField5ActionPerformed

    private void rSButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButton12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rSButton12ActionPerformed

    private void rSButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButton13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rSButton13ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel itemNameLbl10;
    private javax.swing.JLabel itemNameLbl11;
    private javax.swing.JLabel itemNameLbl6;
    private javax.swing.JLabel itemNameLbl8;
    private javax.swing.JLabel itemNameLbl9;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JFormattedTextField jFormattedTextField2;
    private javax.swing.JFormattedTextField jFormattedTextField3;
    private javax.swing.JFormattedTextField jFormattedTextField4;
    private javax.swing.JFormattedTextField jFormattedTextField5;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private rojeru_san.RSButton rSButton11;
    private rojeru_san.RSButton rSButton12;
    private rojeru_san.RSButton rSButton13;
    private rojeru_san.RSButton rSButton14;
    // End of variables declaration//GEN-END:variables
}
