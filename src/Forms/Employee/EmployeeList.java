/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms.Employee;

import Classes.Employee;
import Forms.Login;
import Forms.MainView;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jourdanrodrigues
 */
public final class EmployeeList extends javax.swing.JFrame {
    String userName;
    int isManager, employeeId;

    /**
     * Creates new form FormEmployeeList
     */
    public EmployeeList() {
        initComponents();
    }
    
    public EmployeeList(String userName, int isManager, int employeeId) {
        this.userName = userName;
        this.isManager = isManager;
        this.employeeId = employeeId;
        
        initComponents();
        
        UserNameLabel.setText(userName + ".");
        
        listEmployees();
        
        EmployeeNameField.getDocument().addDocumentListener(new DocumentListener() {

            @Override
            public void changedUpdate(DocumentEvent e) {
                listEmployees();
            }

            @Override
            public void insertUpdate(DocumentEvent e) {
                listEmployees();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                listEmployees();
            }
        });
    }
            
    public void listEmployees(){
        try {
            Employee.getEmployeeList(EmployeeNameField.getText(), (DefaultTableModel) EmployeesList.getModel());
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

        EmployeeRegisterButton = new javax.swing.JButton();
        UserNameLabel = new javax.swing.JLabel();
        LogoutButton = new javax.swing.JButton();
        TopLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        EmployeesList = new javax.swing.JTable();
        ClientNameLabel = new javax.swing.JLabel();
        EmployeeNameField = new javax.swing.JTextField();
        BackButton = new javax.swing.JButton();
        EmployeeUpdateButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        EmployeeRegisterButton.setText("Cadastrar Funcionário");
        EmployeeRegisterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmployeeRegisterButtonActionPerformed(evt);
            }
        });

        UserNameLabel.setFont(new java.awt.Font("Ubuntu", 0, 11)); // NOI18N
        UserNameLabel.setText("Não conseguimos obter seu nome.");

        LogoutButton.setFont(new java.awt.Font("Ubuntu", 0, 11)); // NOI18N
        LogoutButton.setText("Logout");
        LogoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutButtonActionPerformed(evt);
            }
        });

        TopLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        TopLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TopLabel.setText("Pesquisa de Funcionários");

        EmployeesList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "NOME"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(EmployeesList);
        if (EmployeesList.getColumnModel().getColumnCount() > 0) {
            EmployeesList.getColumnModel().getColumn(0).setPreferredWidth(15);
        }

        ClientNameLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        ClientNameLabel.setText("NOME");

        EmployeeNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmployeeNameFieldActionPerformed(evt);
            }
        });

        BackButton.setText("Voltar");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        EmployeeUpdateButton.setText("Atualizar Funcionário");
        EmployeeUpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmployeeUpdateButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(62, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TopLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(ClientNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EmployeeNameField))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(EmployeeRegisterButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(EmployeeUpdateButton)))
                .addContainerGap(63, Short.MAX_VALUE))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BackButton)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(LogoutButton)
                        .addComponent(UserNameLabel)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(TopLabel)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ClientNameLabel)
                    .addComponent(EmployeeNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EmployeeRegisterButton)
                    .addComponent(EmployeeUpdateButton))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EmployeeRegisterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmployeeRegisterButtonActionPerformed
        new EmployeeRegister(this.userName, this.isManager, this.employeeId, "fromFormEmployeeList").setVisible(true);
        dispose();
    }//GEN-LAST:event_EmployeeRegisterButtonActionPerformed

    private void LogoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutButtonActionPerformed
        new Login().setVisible(true);
        dispose();
    }//GEN-LAST:event_LogoutButtonActionPerformed

    private void EmployeeNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmployeeNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmployeeNameFieldActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        new MainView(this.userName, this.isManager, this.employeeId).setVisible(true);
        dispose();
    }//GEN-LAST:event_BackButtonActionPerformed

    private void EmployeeUpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmployeeUpdateButtonActionPerformed
        try {
            String selectedEmployeeId = (String) EmployeesList.getModel().getValueAt(EmployeesList.getSelectedRow(), 0);
            new EmployeeUpdate(this.userName, this.isManager, this.employeeId, selectedEmployeeId).setVisible(true);
            dispose();
        }
        catch (ArrayIndexOutOfBoundsException ex) {
            JOptionPane.showMessageDialog(null, "Selecione um funcionário!");
        }
    }//GEN-LAST:event_EmployeeUpdateButtonActionPerformed

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
            java.util.logging.Logger.getLogger(EmployeeList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeeList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeeList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeeList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeeList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JLabel ClientNameLabel;
    private javax.swing.JTextField EmployeeNameField;
    private javax.swing.JButton EmployeeRegisterButton;
    private javax.swing.JButton EmployeeUpdateButton;
    private javax.swing.JTable EmployeesList;
    private javax.swing.JButton LogoutButton;
    private javax.swing.JLabel TopLabel;
    private javax.swing.JLabel UserNameLabel;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
