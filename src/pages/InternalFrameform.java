/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pages;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author SCC_PC
 */
public class InternalFrameform extends javax.swing.JInternalFrame {

    /**
     * Creates new form InternalFrameform
     */
    public InternalFrameform() {
        initComponents();
    this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
    BasicInternalFrameUI up = (BasicInternalFrameUI)this.getUI();
    up.setNorthPane(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        userPage = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(630, 470));

        userPage.setBackground(new java.awt.Color(255, 255, 102));
        userPage.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CUSTOMER");
        userPage.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(226, 70, 160, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(userPage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(userPage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel userPage;
    // End of variables declaration//GEN-END:variables
}
