package Main;

import Class.CambiaPanel;
import java.sql.SQLException;

/**
 *
 * @author Farhan
 */
public class user extends javax.swing.JPanel {

    /**
     * Creates new form purchase
     */
    public user() throws ClassNotFoundException, SQLException 
    {
        initComponents();
        activeDashboard();
    }

    public void activeDashboard() throws ClassNotFoundException, SQLException
    {
        CambiaPanel cambiaPanel = new CambiaPanel(purchaseMainPanel, new usetable());

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        purchaseMainPanel = new javax.swing.JPanel();

        purchaseMainPanel.setLayout(new javax.swing.BoxLayout(purchaseMainPanel, javax.swing.BoxLayout.LINE_AXIS));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(purchaseMainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 930, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(purchaseMainPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel purchaseMainPanel;
    // End of variables declaration//GEN-END:variables
}
