/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms.Vehicle;

import Classes.Vehicle;
import Forms.Login;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

/**
 *
 * @author jourdanrodrigues
 */
public class VehicleUpdate extends javax.swing.JFrame {
    String userName, vehicleId;
    int isManager, employeeId;

    /**
     * Creates new form VehicleUpdate
     */
    public VehicleUpdate() {
        initComponents();
    }
    
    public VehicleUpdate(String userName, int isManager, int employeeId, String vehicleId) {
        try {
            this.userName = userName;
            this.isManager = isManager;
            this.vehicleId = vehicleId;
            this.employeeId = employeeId;

            initComponents();
        
            UserNameLabel.setText(userName + ".");
            
            Map<String, String> map = Vehicle.getVehicle(vehicleId);
        
            ModelTextField.setText(map.get("model"));
            ColorTextField.setText(map.get("color"));
            ChassisTextField.setText(map.get("chassis"));
            YearTextField.setText(map.get("year"));
            ManufacturerTextField.setText(map.get("manufacturer"));
            CarPriceTextField.setText(map.get("price"));
        }
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ocorreu o seguinte erro:\n" + ex.getMessage());
            new VehicleList(userName, isManager, employeeId).setVisible(true);
            dispose();
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

        ManufacturerTextField = new javax.swing.JTextField();
        PhoneLabel = new javax.swing.JLabel();
        TopLabel = new javax.swing.JLabel();
        BackButton = new javax.swing.JButton();
        CityLabel = new javax.swing.JLabel();
        ColorTextField = new javax.swing.JTextField();
        FullNameLabel = new javax.swing.JLabel();
        UserNameLabel = new javax.swing.JLabel();
        RGLabel = new javax.swing.JLabel();
        ModelTextField = new javax.swing.JTextField();
        LogoutButton = new javax.swing.JButton();
        EmailLabel = new javax.swing.JLabel();
        YearTextField = new javax.swing.JTextField();
        ChassisTextField = new javax.swing.JTextField();
        CPFLabel = new javax.swing.JLabel();
        UpdateButton = new javax.swing.JButton();
        CarPriceTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ManufacturerTextField.setToolTipText("Somente números");
        ManufacturerTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManufacturerTextFieldActionPerformed(evt);
            }
        });

        PhoneLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        PhoneLabel.setText("COR");

        TopLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        TopLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TopLabel.setText("Atualização de Veículo");

        BackButton.setText("Voltar");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        CityLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        CityLabel.setText("PREÇO");

        ColorTextField.setToolTipText("Somente números");
        ColorTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ColorTextFieldActionPerformed(evt);
            }
        });

        FullNameLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        FullNameLabel.setText("MODELO");

        UserNameLabel.setFont(new java.awt.Font("Ubuntu", 0, 11)); // NOI18N
        UserNameLabel.setText("Não conseguimos obter seu nome.");

        RGLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        RGLabel.setText("ANO");

        ModelTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModelTextFieldActionPerformed(evt);
            }
        });

        LogoutButton.setFont(new java.awt.Font("Ubuntu", 0, 11)); // NOI18N
        LogoutButton.setText("Logout");
        LogoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutButtonActionPerformed(evt);
            }
        });

        EmailLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        EmailLabel.setText("CHASSI");

        YearTextField.setToolTipText("Somente números");
        YearTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YearTextFieldActionPerformed(evt);
            }
        });

        ChassisTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChassisTextFieldActionPerformed(evt);
            }
        });

        CPFLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        CPFLabel.setText("FABRICANTE");

        UpdateButton.setText("ATUALIZAR");
        UpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateButtonActionPerformed(evt);
            }
        });

        CarPriceTextField.setToolTipText("Somente números");
        CarPriceTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CarPriceTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(BackButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(UserNameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LogoutButton))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TopLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ModelTextField)
                            .addComponent(FullNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(EmailLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ChassisTextField)))
                    .addGroup(javax.swing.GroupLayout.Alignment.CENTER, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ManufacturerTextField)
                            .addComponent(CPFLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(PhoneLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ColorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(UpdateButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RGLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(YearTextField))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(CityLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                            .addComponent(CarPriceTextField))))
                .addContainerGap(60, Short.MAX_VALUE))
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
                    .addComponent(FullNameLabel)
                    .addComponent(EmailLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ModelTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ChassisTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CPFLabel)
                    .addComponent(PhoneLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ManufacturerTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ColorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RGLabel)
                    .addComponent(CityLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(YearTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CarPriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(UpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ManufacturerTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManufacturerTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ManufacturerTextFieldActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        new VehicleList(this.userName, this.isManager, this.employeeId).setVisible(true);
        dispose();
    }//GEN-LAST:event_BackButtonActionPerformed

    private void ColorTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ColorTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ColorTextFieldActionPerformed

    private void ModelTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModelTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ModelTextFieldActionPerformed

    private void LogoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutButtonActionPerformed
        new Login().setVisible(true);
        dispose();
    }//GEN-LAST:event_LogoutButtonActionPerformed

    private void YearTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YearTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_YearTextFieldActionPerformed

    private void ChassisTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChassisTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChassisTextFieldActionPerformed

    private void UpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateButtonActionPerformed

        try {
            Map<String, String> map = new HashMap<>();

            map.put("manufacturer", ManufacturerTextField.getText());
            map.put("chassis", ChassisTextField.getText());
            map.put("color", ColorTextField.getText());
            map.put("year", YearTextField.getText());
            map.put("model", ModelTextField.getText());
            map.put("price", CarPriceTextField.getText());
            map.put("id", this.vehicleId);

            Vehicle vehicle = new Vehicle(map);
            String [] operationResponse = vehicle.updateVehicle();

            JOptionPane.showMessageDialog(null, operationResponse[1]);

            if (operationResponse[0].equals("success")){
                new VehicleList(this.userName, this.isManager, this.employeeId).setVisible(true);
                dispose();
            }
        }
        catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_UpdateButtonActionPerformed

    private void CarPriceTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CarPriceTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CarPriceTextFieldActionPerformed

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
            java.util.logging.Logger.getLogger(VehicleUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VehicleUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VehicleUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VehicleUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VehicleUpdate().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JLabel CPFLabel;
    private javax.swing.JTextField CarPriceTextField;
    private javax.swing.JTextField ChassisTextField;
    private javax.swing.JLabel CityLabel;
    private javax.swing.JTextField ColorTextField;
    private javax.swing.JLabel EmailLabel;
    private javax.swing.JLabel FullNameLabel;
    private javax.swing.JButton LogoutButton;
    private javax.swing.JTextField ManufacturerTextField;
    private javax.swing.JTextField ModelTextField;
    private javax.swing.JLabel PhoneLabel;
    private javax.swing.JLabel RGLabel;
    private javax.swing.JLabel TopLabel;
    private javax.swing.JButton UpdateButton;
    private javax.swing.JLabel UserNameLabel;
    private javax.swing.JTextField YearTextField;
    // End of variables declaration//GEN-END:variables
}
