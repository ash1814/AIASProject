package Main;

import Class.*;

public class dataAnalysis extends javax.swing.JPanel 
{
    public dataAnalysis() 
    {
        initComponents();
        activePanel();
    }
    
    public void activePanel()
    {
        CambiaPanel cambiaPanel = new CambiaPanel(productPanel, new dataTable());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        productPanel = new javax.swing.JPanel();

        productPanel.setLayout(new javax.swing.BoxLayout(productPanel, javax.swing.BoxLayout.LINE_AXIS));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(productPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 829, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(productPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 637, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel productPanel;
    // End of variables declaration//GEN-END:variables
}
