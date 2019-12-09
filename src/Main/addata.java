package Main;

import Class.CellRenderer;
import Class.HeaderRenderer;
import java.awt.Dimension;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import net.proteanit.sql.DbUtils;
import org.apache.poi.xssf.usermodel.XSSFCell;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class addata extends javax.swing.JPanel 
{
    JFileChooser fileChooser = null;
    static boolean c = false, dis = false;
    static FileInputStream fis;
    
    Connection con;
    ResultSet rs;
    Statement st;
    PreparedStatement pst;
    
    public addata() throws ClassNotFoundException, ParseException
    {
        initComponents();
        tableDesign(); 
        Jcombo();
    }
    
    public void tableDesign()
    {
        try 
        {
            fetchData();
            
            jTable1.getColumnModel().getColumn(0).setHeaderRenderer(new HeaderRenderer());
            jTable1.getColumnModel().getColumn(1).setHeaderRenderer(new HeaderRenderer());
            jTable1.getColumnModel().getColumn(2).setHeaderRenderer(new HeaderRenderer());
            jTable1.getColumnModel().getColumn(3).setHeaderRenderer(new HeaderRenderer());
            jTable1.getColumnModel().getColumn(4).setHeaderRenderer(new HeaderRenderer());
            jTable1.getColumnModel().getColumn(5).setHeaderRenderer(new HeaderRenderer());
            jTable1.getColumnModel().getColumn(6).setHeaderRenderer(new HeaderRenderer());
            
            jTable1.setDefaultRenderer(Object.class, new CellRenderer());
            
            jTable1.getTableHeader().setPreferredSize(new Dimension(30, 23));
            
            jTable1.getColumnModel().getColumn(0).setHeaderValue("Year");
            jTable1.getColumnModel().getColumn(1).setHeaderValue("School");
            jTable1.getColumnModel().getColumn(2).setHeaderValue("Department");
            jTable1.getColumnModel().getColumn(3).setHeaderValue("Major");
            jTable1.getColumnModel().getColumn(4).setHeaderValue("Student No.");
            jTable1.getColumnModel().getColumn(5).setHeaderValue("Semester");
            jTable1.getColumnModel().getColumn(6).setHeaderValue("Slot"); 
        } 
        catch (ClassNotFoundException ex) 
        {
            Logger.getLogger(addata.class.getName()).log(Level.SEVERE, null, ex);
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(addata.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void tableDesign2()
    {
        jTable1.getColumnModel().getColumn(0).setHeaderRenderer(new HeaderRenderer());
        jTable1.getColumnModel().getColumn(1).setHeaderRenderer(new HeaderRenderer());
        jTable1.getColumnModel().getColumn(2).setHeaderRenderer(new HeaderRenderer());
        jTable1.getColumnModel().getColumn(3).setHeaderRenderer(new HeaderRenderer());
        jTable1.getColumnModel().getColumn(4).setHeaderRenderer(new HeaderRenderer());
        jTable1.getColumnModel().getColumn(5).setHeaderRenderer(new HeaderRenderer());
        jTable1.getColumnModel().getColumn(6).setHeaderRenderer(new HeaderRenderer());
        jTable1.setDefaultRenderer(Object.class, new CellRenderer());
        jTable1.getTableHeader().setPreferredSize(new Dimension(30, 23));
        jTable1.getColumnModel().getColumn(0).setHeaderValue("Year");
        jTable1.getColumnModel().getColumn(1).setHeaderValue("School");
        jTable1.getColumnModel().getColumn(2).setHeaderValue("Department");
        jTable1.getColumnModel().getColumn(3).setHeaderValue("Major");
        jTable1.getColumnModel().getColumn(4).setHeaderValue("Student No.");
        jTable1.getColumnModel().getColumn(5).setHeaderValue("Semester");
        jTable1.getColumnModel().getColumn(6).setHeaderValue("Slot");
    }
    
    public void fetchData() throws ClassNotFoundException, SQLException
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");  
            con = DriverManager.getConnection( "jdbc:mysql://localhost:3306/aias", "root", "");
            pst = con.prepareStatement("Select * from admission");
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
    
    public void Jcombo() throws ClassNotFoundException, ParseException
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");  
            java.sql.Connection con = DriverManager.getConnection( "jdbc:mysql://localhost:3306/aias", "root", "");
            pst = con.prepareStatement("Select distinct year from admission");
            rs = pst.executeQuery();
            
            while(rs.next())
            {
                String name = rs.getString("year");
 
                yearCombo.addItem(name);
            }
            
            pst = con.prepareStatement("Select distinct majorname from admission");
            rs = pst.executeQuery();
            
            while(rs.next())
            {
                String name3 = rs.getString("majorname");
                MajorCombo.addItem(name3);
            }
            
            pst = con.prepareStatement("Select distinct semester from admission");
            rs = pst.executeQuery();
            
            while(rs.next())
            {
                String name4 = rs.getString("semester");
                semesterCombo.addItem(name4);
            }
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

    public void Insertion() throws IOException, ClassNotFoundException
    {
        boolean msg = false;
        try
        {
            String school = null, dept = null, major = null;
            int stdntNo = 0;
            
            
            
            XSSFWorkbook wb = new XSSFWorkbook(xlFileLocationtxt.getText());
            XSSFSheet sheet = wb.getSheetAt(0);

            XSSFCell cell;
            DataFormatter df = new DataFormatter();
            
            for(int i = 0; i < sheet.getPhysicalNumberOfRows(); i++)
            {
                    StringBuilder sb = new StringBuilder();
                    XSSFRow r = sheet.getRow(i);
                    CellType type;

                    for(int j = 0; j <= 1; j++) 
                    {
                        cell = r.getCell(j);
                        
                        if (cell == null || cell.getCellType() == CellType.BLANK) 
                        {
                            type = CellType.BLANK;
                        } 
                        else 
                        {
                            type = cell.getCellType();
                        }

                        switch (type) 
                        {
                            case NUMERIC:
                                stdntNo = Integer.parseInt(df.formatCellValue(cell));
                                break;

                            case STRING:
                                major = df.formatCellValue(cell);
                                
                                if (major.contains("'")) 
                                {
                                    major = major.replace("'", "''");
                                }
                                break;

                            default:
                                break;
                        }
                    }

                    st = con.createStatement();                   
                    rs = st.executeQuery("select * from major where majorname='"+major+"'");

                    while(rs.next()) 
                    {
                        dept = rs.getString("deptcode");
                    }

                    st = con.createStatement();
                    rs = st.executeQuery("select * from department where deptcode='"+dept+"'");

                    while(rs.next())
                    {
                        school = rs.getString("schoolcode");
                    }

                    sb.append(year.getText()).append(",").append("'").append(school).append("'").append(",").append("'").append(dept).append("'")
                        .append(",").append("'").append(major).append("'").append(",").append(stdntNo).append(",").append("'").
                        append(semester.getSelectedItem().toString()).append("'").append(",").
                        append(slot.getSelectedItem().toString());

                
                    //"INSERT INTO admission VALUES(2013,SECS,CSE,BSc - Computer Engineering,91,Summer,1)"
                    String sql = "INSERT INTO admission VALUES("+sb.toString()+")";
                    st = con.createStatement();
                    st.executeUpdate(sql);
                    System.out.println("INSERT INTO admission VALUES("+sb.toString()+")");

                    msg = true;
            }
            if(msg)
            {
                JOptionPane.showMessageDialog(null, "Data Loaded");
                tableDesign();
            }
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        selectOptionForProductTypelbl = new javax.swing.JLabel();
        slot = new javax.swing.JComboBox<>();
        semester = new javax.swing.JComboBox<>();
        rSButton13 = new rojeru_san.RSButton();
        rSButton14 = new rojeru_san.RSButton();
        rSButton15 = new rojeru_san.RSButton();
        itemNameLbl6 = new javax.swing.JLabel();
        itemNameLbl11 = new javax.swing.JLabel();
        xlFileLocationtxt = new javax.swing.JTextField();
        itemNameLbl12 = new javax.swing.JLabel();
        yearCombo = new javax.swing.JComboBox<>();
        selectOptionForProductTypelbl2 = new javax.swing.JLabel();
        semesterCombo = new javax.swing.JComboBox<>();
        itemNameLbl15 = new javax.swing.JLabel();
        MajorCombo = new javax.swing.JComboBox<>();
        itemNameLbl16 = new javax.swing.JLabel();
        totalStudent = new javax.swing.JLabel();
        year = new org.jdesktop.swingx.JXTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        jPanel3.setBackground(new java.awt.Color(241, 243, 246));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 255), 2));

        selectOptionForProductTypelbl.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
        selectOptionForProductTypelbl.setText("Slot");

        slot.setFont(new java.awt.Font("Microsoft JhengHei", 1, 13)); // NOI18N
        slot.setForeground(new java.awt.Color(0, 0, 255));
        slot.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2" }));
        slot.setFocusable(false);

        semester.setFont(new java.awt.Font("Microsoft JhengHei", 1, 13)); // NOI18N
        semester.setForeground(new java.awt.Color(0, 0, 255));
        semester.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Spring", "Summer", "Autumn" }));
        semester.setFocusable(false);
        semester.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                semesterActionPerformed(evt);
            }
        });

        rSButton13.setBackground(new java.awt.Color(64, 68, 100));
        rSButton13.setText("IMPORT DATA");
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

        rSButton15.setBackground(new java.awt.Color(64, 68, 100));
        rSButton15.setText("PRINT DATA");
        rSButton15.setColorHover(new java.awt.Color(101, 104, 130));
        rSButton15.setFont(new java.awt.Font("Roboto Bold", 0, 13)); // NOI18N
        rSButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButton15ActionPerformed(evt);
            }
        });

        itemNameLbl6.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
        itemNameLbl6.setText("Year");

        itemNameLbl11.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
        itemNameLbl11.setText("Semester");

        xlFileLocationtxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                xlFileLocationtxtMouseClicked(evt);
            }
        });
        xlFileLocationtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xlFileLocationtxtActionPerformed(evt);
            }
        });

        itemNameLbl12.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
        itemNameLbl12.setText("Year");

        yearCombo.setFont(new java.awt.Font("Microsoft JhengHei", 1, 13)); // NOI18N
        yearCombo.setForeground(new java.awt.Color(0, 0, 255));
        yearCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All" }));
        yearCombo.setFocusable(false);
        yearCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearComboActionPerformed(evt);
            }
        });

        selectOptionForProductTypelbl2.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
        selectOptionForProductTypelbl2.setText("Semester");

        semesterCombo.setFont(new java.awt.Font("Microsoft JhengHei", 1, 13)); // NOI18N
        semesterCombo.setForeground(new java.awt.Color(0, 0, 255));
        semesterCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All" }));
        semesterCombo.setFocusable(false);
        semesterCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                semesterComboActionPerformed(evt);
            }
        });

        itemNameLbl15.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
        itemNameLbl15.setText("Major Name");

        MajorCombo.setFont(new java.awt.Font("Microsoft JhengHei", 1, 13)); // NOI18N
        MajorCombo.setForeground(new java.awt.Color(0, 0, 255));
        MajorCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All" }));
        MajorCombo.setFocusable(false);
        MajorCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MajorComboActionPerformed(evt);
            }
        });

        itemNameLbl16.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
        itemNameLbl16.setText("Total Student");

        totalStudent.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        totalStudent.setText("No, Student");

        year.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                            .addComponent(itemNameLbl6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(itemNameLbl11, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(semester, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addComponent(selectOptionForProductTypelbl)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(slot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(xlFileLocationtxt))
                    .addComponent(rSButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 144, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(itemNameLbl15)
                            .addComponent(itemNameLbl12, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(yearCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(selectOptionForProductTypelbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(semesterCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(MajorCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rSButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rSButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(itemNameLbl16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(totalStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(itemNameLbl12)
                            .addComponent(yearCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(selectOptionForProductTypelbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(semesterCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rSButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(itemNameLbl15)
                            .addComponent(MajorCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rSButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(itemNameLbl16)
                            .addComponent(totalStudent)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(itemNameLbl6)
                                .addComponent(itemNameLbl11)
                                .addComponent(semester, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(selectOptionForProductTypelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(slot, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(xlFileLocationtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rSButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10))
        );

        jTable1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "YEAR", "SCHOOL CODE", "DEPT CODE", "MAJOR NAME", "NO. STUDENT", "SEMESTER", "SLOT"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setGridColor(new java.awt.Color(153, 153, 153));
        jTable1.setRowHeight(23);
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(5, 5, 5))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE)
                .addGap(5, 5, 5))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void rSButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButton15ActionPerformed
        //pdfprint();
    }//GEN-LAST:event_rSButton15ActionPerformed

    private void rSButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButton14ActionPerformed
        tableDesign();
    }//GEN-LAST:event_rSButton14ActionPerformed

    private void rSButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButton13ActionPerformed
        if(year.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Year is empty");
        }
        else
        {
            try 
            {
                Insertion(); 
            } 
            catch (IOException ex) 
            {
                Logger.getLogger(addata.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(addata.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_rSButton13ActionPerformed

    private void semesterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_semesterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_semesterActionPerformed

    private void yearComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yearComboActionPerformed

    private void MajorComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MajorComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MajorComboActionPerformed

    private void semesterComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_semesterComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_semesterComboActionPerformed

    private void xlFileLocationtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xlFileLocationtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_xlFileLocationtxtActionPerformed

    private void xlFileLocationtxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xlFileLocationtxtMouseClicked
        fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("MS Office Documents","xlsx","CSV"));
        fileChooser.setAcceptAllFileFilterUsed(true);
        int result = fileChooser.showOpenDialog(null);        
        if(result == JFileChooser.APPROVE_OPTION) 
        {
            String ex ;
            File selectedFile = fileChooser.getSelectedFile();
            String name = selectedFile.getName();
            ex = name.substring(name.lastIndexOf("."));
            if(ex.equals(".xlsx"))
            {
                xlFileLocationtxt.setText(selectedFile.getAbsolutePath());
                selectedFile = new File(xlFileLocationtxt.getText());
                dis = true;
                try 
                {
                    fis = new FileInputStream(selectedFile.getAbsolutePath());
                } 
                catch (FileNotFoundException ex1) 
                {
                    JOptionPane.showMessageDialog(null, ex1.getMessage());
                }
            }
            else
            {
                dis = false;
            }
        }
    }//GEN-LAST:event_xlFileLocationtxtMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> MajorCombo;
    private javax.swing.JLabel itemNameLbl11;
    private javax.swing.JLabel itemNameLbl12;
    private javax.swing.JLabel itemNameLbl15;
    private javax.swing.JLabel itemNameLbl16;
    private javax.swing.JLabel itemNameLbl6;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private rojeru_san.RSButton rSButton13;
    private rojeru_san.RSButton rSButton14;
    private rojeru_san.RSButton rSButton15;
    private javax.swing.JLabel selectOptionForProductTypelbl;
    private javax.swing.JLabel selectOptionForProductTypelbl2;
    private javax.swing.JComboBox<String> semester;
    private javax.swing.JComboBox<String> semesterCombo;
    private javax.swing.JComboBox<String> slot;
    private javax.swing.JLabel totalStudent;
    private javax.swing.JTextField xlFileLocationtxt;
    private org.jdesktop.swingx.JXTextField year;
    private javax.swing.JComboBox<String> yearCombo;
    // End of variables declaration//GEN-END:variables
}
