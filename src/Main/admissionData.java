package Main;

import Class.CambiaPanel;
import java.text.ParseException;

public class admissionData extends javax.swing.JPanel {

    public admissionData() throws ClassNotFoundException, ParseException 
    {
        initComponents();
        activePanel();
    }
    
    public void activePanel() throws ClassNotFoundException, ParseException, ParseException
    {
        CambiaPanel cambiaPanel = new CambiaPanel(admissiondata1, new addata());
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        admissiondata1 = new javax.swing.JPanel();

        admissiondata1.setLayout(new javax.swing.BoxLayout(admissiondata1, javax.swing.BoxLayout.LINE_AXIS));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(admissiondata1, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(admissiondata1, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel admissiondata1;
    // End of variables declaration//GEN-END:variables
}
