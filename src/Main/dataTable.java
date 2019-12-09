package Main;

import Class.*;
import java.awt.Dimension;

public class dataTable extends javax.swing.JPanel 
{
    public dataTable() 
    {
        initComponents();
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        selectOptionForProductTypelbl = new javax.swing.JLabel();
        itemNameLbl5 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        selectOptionForProductTypelbl1 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        itemNameLbl6 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();
        jComboBox5 = new javax.swing.JComboBox<>();
        selectOptionForProductTypelbl2 = new javax.swing.JLabel();
        selectOptionForProductTypelbl3 = new javax.swing.JLabel();
        jComboBox6 = new javax.swing.JComboBox<>();
        selectOptionForProductTypelbl4 = new javax.swing.JLabel();
        jComboBox7 = new javax.swing.JComboBox<>();
        addschoolbtn = new rojeru_san.RSButton();
        addschoolbtn1 = new rojeru_san.RSButton();

        setBackground(new java.awt.Color(241, 243, 246));

        jPanel3.setBackground(new java.awt.Color(241, 243, 246));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 255), 2));

        jComboBox1.setFont(new java.awt.Font("Microsoft JhengHei", 1, 13)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(0, 0, 255));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Supplier Wise", "Generic Name Wise", "Category Wise" }));
        jComboBox1.setFocusable(false);

        selectOptionForProductTypelbl.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
        selectOptionForProductTypelbl.setText("Focus Year");

        itemNameLbl5.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
        itemNameLbl5.setText("To Year");

        jComboBox2.setFont(new java.awt.Font("Microsoft JhengHei", 1, 13)); // NOI18N
        jComboBox2.setForeground(new java.awt.Color(0, 0, 255));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Supplier Wise", "Generic Name Wise", "Category Wise" }));
        jComboBox2.setFocusable(false);

        selectOptionForProductTypelbl1.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
        selectOptionForProductTypelbl1.setText("Semester");

        jComboBox3.setFont(new java.awt.Font("Microsoft JhengHei", 1, 13)); // NOI18N
        jComboBox3.setForeground(new java.awt.Color(0, 0, 255));
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Supplier Wise", "Generic Name Wise", "Category Wise" }));
        jComboBox3.setFocusable(false);

        itemNameLbl6.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
        itemNameLbl6.setText("From Year");

        jComboBox4.setFont(new java.awt.Font("Microsoft JhengHei", 1, 13)); // NOI18N
        jComboBox4.setForeground(new java.awt.Color(0, 0, 255));
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Supplier Wise", "Generic Name Wise", "Category Wise" }));
        jComboBox4.setFocusable(false);

        jComboBox5.setFont(new java.awt.Font("Microsoft JhengHei", 1, 13)); // NOI18N
        jComboBox5.setForeground(new java.awt.Color(0, 0, 255));
        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Supplier Wise", "Generic Name Wise", "Category Wise" }));
        jComboBox5.setFocusable(false);

        selectOptionForProductTypelbl2.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
        selectOptionForProductTypelbl2.setText("School");

        selectOptionForProductTypelbl3.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
        selectOptionForProductTypelbl3.setText("Department");

        jComboBox6.setFont(new java.awt.Font("Microsoft JhengHei", 1, 13)); // NOI18N
        jComboBox6.setForeground(new java.awt.Color(0, 0, 255));
        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Supplier Wise", "Generic Name Wise", "Category Wise" }));
        jComboBox6.setFocusable(false);

        selectOptionForProductTypelbl4.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
        selectOptionForProductTypelbl4.setText("Major");

        jComboBox7.setFont(new java.awt.Font("Microsoft JhengHei", 1, 13)); // NOI18N
        jComboBox7.setForeground(new java.awt.Color(0, 0, 255));
        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Supplier Wise", "Generic Name Wise", "Category Wise" }));
        jComboBox7.setFocusable(false);

        addschoolbtn.setBackground(new java.awt.Color(64, 68, 100));
        addschoolbtn.setText("Reset");
        addschoolbtn.setColorHover(new java.awt.Color(101, 104, 130));
        addschoolbtn.setFont(new java.awt.Font("Roboto Bold", 0, 13)); // NOI18N
        addschoolbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addschoolbtnActionPerformed(evt);
            }
        });

        addschoolbtn1.setBackground(new java.awt.Color(64, 68, 100));
        addschoolbtn1.setText("Generate");
        addschoolbtn1.setColorHover(new java.awt.Color(101, 104, 130));
        addschoolbtn1.setFont(new java.awt.Font("Roboto Bold", 0, 13)); // NOI18N
        addschoolbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addschoolbtn1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(itemNameLbl6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(selectOptionForProductTypelbl1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addComponent(selectOptionForProductTypelbl4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jComboBox7, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jComboBox3, 0, 1, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(itemNameLbl5, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                            .addComponent(selectOptionForProductTypelbl2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox5, 0, 1, Short.MAX_VALUE))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(selectOptionForProductTypelbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(selectOptionForProductTypelbl3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox6, 0, 1, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addComponent(addschoolbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(addschoolbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(itemNameLbl6)
                            .addComponent(itemNameLbl5)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(selectOptionForProductTypelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(selectOptionForProductTypelbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(selectOptionForProductTypelbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(selectOptionForProductTypelbl3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(selectOptionForProductTypelbl4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addschoolbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addschoolbtn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(5, 5, 5))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(532, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addschoolbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addschoolbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addschoolbtnActionPerformed

    private void addschoolbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addschoolbtn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addschoolbtn1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.RSButton addschoolbtn;
    private rojeru_san.RSButton addschoolbtn1;
    private javax.swing.JLabel itemNameLbl5;
    private javax.swing.JLabel itemNameLbl6;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JComboBox<String> jComboBox7;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel selectOptionForProductTypelbl;
    private javax.swing.JLabel selectOptionForProductTypelbl1;
    private javax.swing.JLabel selectOptionForProductTypelbl2;
    private javax.swing.JLabel selectOptionForProductTypelbl3;
    private javax.swing.JLabel selectOptionForProductTypelbl4;
    // End of variables declaration//GEN-END:variables
}
