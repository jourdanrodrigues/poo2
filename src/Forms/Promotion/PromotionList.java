/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms.Promotion;

import Classes.Promotion;
import Forms.Login;
import Forms.MainView;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jourdanrodrigues
 */
public final class PromotionList extends javax.swing.JFrame {
    String userName;
    int isManager, employeeId;

    /**
     * Creates new form PromotionList
     */
    public PromotionList() {
        initComponents();
    }
    
    public PromotionList(String userName, int isManager, int employeeId){
        this.userName = userName;
        this.isManager = isManager;
        this.employeeId = employeeId;
        
        initComponents();
        
        listPromotions();
        
        UserNameLabel.setText(userName + ".");
    }
            
    public void listPromotions(){
        try {
            Promotion.getPromotionList((DefaultTableModel) PromotionsList.getModel());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ocorreu o seguinte erro:\n" + ex.getMessage());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LogoutButton = new javax.swing.JButton();
        UserNameLabel = new javax.swing.JLabel();
        PromotionRegisterButton = new javax.swing.JButton();
        BackButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        PromotionsList = new javax.swing.JTable();
        TopLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LogoutButton.setFont(new java.awt.Font("Ubuntu", 0, 11)); // NOI18N
        LogoutButton.setText("Logout");
        LogoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutButtonActionPerformed(evt);
            }
        });

        UserNameLabel.setFont(new java.awt.Font("Ubuntu", 0, 11)); // NOI18N
        UserNameLabel.setText("Não conseguimos obter seu nome.");

        PromotionRegisterButton.setText("CADASTRAR PROMOÇÃO");
        PromotionRegisterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PromotionRegisterButtonActionPerformed(evt);
            }
        });

        BackButton.setText("Voltar");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        PromotionsList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "DESC. (%)", "DATA FINAL", "VEÍCULO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(PromotionsList);
        if (PromotionsList.getColumnModel().getColumnCount() > 0) {
            PromotionsList.getColumnModel().getColumn(0).setPreferredWidth(15);
        }

        TopLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        TopLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TopLabel.setText("Lista de Promoções");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(PromotionRegisterButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TopLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE))
                .addGap(0, 60, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(BackButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(UserNameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LogoutButton))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LogoutButton)
                    .addComponent(UserNameLabel)
                    .addComponent(BackButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(TopLabel)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PromotionRegisterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LogoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutButtonActionPerformed
        new Login().setVisible(true);
        dispose();
    }//GEN-LAST:event_LogoutButtonActionPerformed

    private void PromotionRegisterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PromotionRegisterButtonActionPerformed
        new PromotionRegister(this.userName, this.isManager, this.employeeId, "fromPromotionList").setVisible(true);
        dispose();
    }//GEN-LAST:event_PromotionRegisterButtonActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        new MainView(this.userName, this.isManager, this.employeeId).setVisible(true);
        dispose();
    }//GEN-LAST:event_BackButtonActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(PromotionList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PromotionList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PromotionList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PromotionList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PromotionList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JButton LogoutButton;
    private javax.swing.JButton PromotionRegisterButton;
    private javax.swing.JTable PromotionsList;
    private javax.swing.JLabel TopLabel;
    private javax.swing.JLabel UserNameLabel;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
