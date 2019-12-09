package Main;

import Class.CambiaPanel;
import static Main.login.admin;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;

public class MainDashboard extends javax.swing.JFrame 
{

    public MainDashboard() throws SQLException 
    {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setExtendedState(this.getExtendedState() | MainDashboard.MAXIMIZED_BOTH);
        activeDashboard();
        adminchk();
    }
    
    public void adminchk()
    {
        if(!admin)
        {
            manageBtn.setVisible(false);
            userBtn.setText("PROFILE");
        }
    }
    
    public void activeDashboard() throws SQLException
    {

        CambiaPanel cambiaPanel = new CambiaPanel(mainPanel, new dashboard());
        dashboardBtn.setSelected(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        mainPanel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        dashboardBtn = new rojeru_san.RSButton();
        admissionBtn = new rojeru_san.RSButton();
        dataAnalysisBtn = new rojeru_san.RSButton();
        manageBtn = new rojeru_san.RSButton();
        userBtn = new rojeru_san.RSButton();
        dateTimelbl2 = new javax.swing.JLabel();
        logoutBtn = new rojeru_san.RSButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        user = new javax.swing.JLabel();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));
        mainPanel.setLayout(new javax.swing.BoxLayout(mainPanel, javax.swing.BoxLayout.LINE_AXIS));

        jPanel2.setBackground(new java.awt.Color(70, 80, 86));

        dashboardBtn.setBackground(new java.awt.Color(93, 93, 93));
        dashboardBtn.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(70, 80, 86)));
        dashboardBtn.setText("DASHBOARD");
        dashboardBtn.setColorHover(new java.awt.Color(4, 181, 173));
        dashboardBtn.setFocusPainted(false);
        dashboardBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        dashboardBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        dashboardBtn.setIconTextGap(-1);
        dashboardBtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        dashboardBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dashboardBtnActionPerformed(evt);
            }
        });

        admissionBtn.setBackground(new java.awt.Color(93, 93, 93));
        admissionBtn.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(70, 80, 86)));
        admissionBtn.setText("ADMISSION DATA");
        admissionBtn.setColorHover(new java.awt.Color(4, 181, 173));
        admissionBtn.setFocusPainted(false);
        admissionBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        admissionBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        admissionBtn.setIconTextGap(-1);
        admissionBtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        admissionBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admissionBtnActionPerformed(evt);
            }
        });

        dataAnalysisBtn.setBackground(new java.awt.Color(93, 93, 93));
        dataAnalysisBtn.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(70, 80, 86)));
        dataAnalysisBtn.setText("DATA ANALYSIS");
        dataAnalysisBtn.setColorHover(new java.awt.Color(4, 181, 173));
        dataAnalysisBtn.setFocusPainted(false);
        dataAnalysisBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        dataAnalysisBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        dataAnalysisBtn.setIconTextGap(-1);
        dataAnalysisBtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        dataAnalysisBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataAnalysisBtnActionPerformed(evt);
            }
        });

        manageBtn.setBackground(new java.awt.Color(93, 93, 93));
        manageBtn.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(70, 80, 86)));
        manageBtn.setText("MANAGE");
        manageBtn.setColorHover(new java.awt.Color(4, 181, 173));
        manageBtn.setFocusPainted(false);
        manageBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        manageBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        manageBtn.setIconTextGap(-1);
        manageBtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        manageBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageBtnActionPerformed(evt);
            }
        });

        userBtn.setBackground(new java.awt.Color(93, 93, 93));
        userBtn.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(70, 80, 86)));
        userBtn.setText("USERS");
        userBtn.setColorHover(new java.awt.Color(4, 181, 173));
        userBtn.setFocusPainted(false);
        userBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        userBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        userBtn.setIconTextGap(-1);
        userBtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        userBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userBtnActionPerformed(evt);
            }
        });

        dateTimelbl2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        dateTimelbl2.setForeground(new java.awt.Color(255, 255, 255));
        dateTimelbl2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dateTimelbl2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_about_31px.png"))); // NOI18N
        dateTimelbl2.setText("About");

        logoutBtn.setBackground(new java.awt.Color(93, 93, 93));
        logoutBtn.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(70, 80, 86)));
        logoutBtn.setText("LOGOUT");
        logoutBtn.setColorHover(new java.awt.Color(4, 181, 173));
        logoutBtn.setFocusPainted(false);
        logoutBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        logoutBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        logoutBtn.setIconTextGap(-1);
        logoutBtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(admissionBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(dashboardBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(dataAnalysisBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(manageBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(userBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(logoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dateTimelbl2, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(dashboardBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                .addGap(1, 1, 1)
                .addComponent(admissionBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                .addGap(1, 1, 1)
                .addComponent(dataAnalysisBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                .addGap(1, 1, 1)
                .addComponent(manageBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                .addGap(1, 1, 1)
                .addComponent(userBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                .addGap(1, 1, 1)
                .addComponent(logoutBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                .addGap(97, 97, 97)
                .addComponent(dateTimelbl2, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.setBackground(new java.awt.Color(60, 141, 188));

        jLabel4.setFont(new java.awt.Font("Microsoft JhengHei", 1, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("ADMISSION INTEREST ANALYSIS SYSTEM");
        jLabel4.setIconTextGap(0);

        user.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        user.setForeground(new java.awt.Color(255, 255, 255));
        user.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        user.setText("Date Time");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 202, Short.MAX_VALUE)
                .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(user, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
                .addGap(7, 7, 7))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dashboardBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dashboardBtnActionPerformed
        try {
            CambiaPanel cambiaPanel = new CambiaPanel(mainPanel, new dashboard());
        } catch (SQLException ex) {
            Logger.getLogger(MainDashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        dashboardBtn.setBackground(new java.awt.Color(4,181,173));
        dashboardBtn.setColorHover(new java.awt.Color(4,181,173));
        admissionBtn.setBackground(new java.awt.Color(93,93,93));       
        manageBtn.setBackground(new java.awt.Color(93,93,93));
        userBtn.setBackground(new java.awt.Color(93,93,93));  ;
        dataAnalysisBtn.setBackground(new java.awt.Color(93,93,93));
        dashboardBtn.setSelected(false);
    }//GEN-LAST:event_dashboardBtnActionPerformed

    private void admissionBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admissionBtnActionPerformed
        try {
            CambiaPanel cambiaPanel = new CambiaPanel(mainPanel, new addata());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MainDashboard.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(MainDashboard.class.getName()).log(Level.SEVERE, null, ex);
        }

        admissionBtn.setBackground(new java.awt.Color(4, 181, 173));
        admissionBtn.setColorHover(new java.awt.Color(4, 181, 173));
        dashboardBtn.setBackground(new java.awt.Color(93, 93, 93));
        manageBtn.setBackground(new java.awt.Color(93, 93, 93));
        userBtn.setBackground(new java.awt.Color(93, 93, 93));
        dataAnalysisBtn.setBackground(new java.awt.Color(93, 93, 93));
        dashboardBtn.setSelected(false);
    }//GEN-LAST:event_admissionBtnActionPerformed

    private void dataAnalysisBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataAnalysisBtnActionPerformed
        CambiaPanel cambiaPanel = new CambiaPanel(mainPanel, new dataAnalysis());
        
        dataAnalysisBtn.setBackground(new java.awt.Color(4, 181, 173));
        dataAnalysisBtn.setColorHover(new java.awt.Color(4, 181, 173));
        dashboardBtn.setBackground(new java.awt.Color(93, 93, 93));
        manageBtn.setBackground(new java.awt.Color(93, 93, 93));
        userBtn.setBackground(new java.awt.Color(93, 93, 93));
        admissionBtn.setBackground(new java.awt.Color(93, 93, 93));
        dashboardBtn.setSelected(false);
    }//GEN-LAST:event_dataAnalysisBtnActionPerformed

    private void manageBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageBtnActionPerformed
        try {
            CambiaPanel cambiaPanel = new CambiaPanel(mainPanel, new school());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MainDashboard.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(MainDashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        manageBtn.setBackground(new java.awt.Color(4, 181, 173));
        manageBtn.setColorHover(new java.awt.Color(4, 181, 173));
        dashboardBtn.setBackground(new java.awt.Color(93, 93, 93));
        dataAnalysisBtn.setBackground(new java.awt.Color(93, 93, 93));
        userBtn.setBackground(new java.awt.Color(93, 93, 93));
        admissionBtn.setBackground(new java.awt.Color(93, 93, 93));
        dashboardBtn.setSelected(false);
    }//GEN-LAST:event_manageBtnActionPerformed

    private void userBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userBtnActionPerformed
        try {
            CambiaPanel cambiaPanel = new CambiaPanel(mainPanel, new user());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MainDashboard.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(MainDashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        userBtn.setBackground(new java.awt.Color(4, 181, 173));
        userBtn.setColorHover(new java.awt.Color(4, 181, 173));
        dashboardBtn.setBackground(new java.awt.Color(93, 93, 93));
        dataAnalysisBtn.setBackground(new java.awt.Color(93, 93, 93));
        manageBtn.setBackground(new java.awt.Color(93, 93, 93));
        admissionBtn.setBackground(new java.awt.Color(93, 93, 93));
        dashboardBtn.setSelected(false);
    }//GEN-LAST:event_userBtnActionPerformed

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        dispose();
        login lg = new login();
lg.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_logoutBtnActionPerformed

    public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            @Override
            public void run() 
            {
                try 
                {
                    UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
                }
                catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) 
                {
                }
                try {  
                    new MainDashboard().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(MainDashboard.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static rojeru_san.RSButton admissionBtn;
    public static rojeru_san.RSButton dashboardBtn;
    public static rojeru_san.RSButton dataAnalysisBtn;
    private javax.swing.JLabel dateTimelbl2;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JPanel jPanel2;
    public static rojeru_san.RSButton logoutBtn;
    public static javax.swing.JPanel mainPanel;
    public static rojeru_san.RSButton manageBtn;
    public static javax.swing.JLabel user;
    public static rojeru_san.RSButton userBtn;
    // End of variables declaration//GEN-END:variables
}
