package PresentationLayer;

import javax.swing.*;
import java.awt.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author asharda
 */
public class Settings extends javax.swing.JPanel
{

    /**
     * Creates new form Settings
     */
    private JPanel MainPanel;
    private GUI mainGUI;

    public Settings()
    {
        initComponents();
    }

    public Settings(JPanel MainPanel, GUI mainGUI)
    {
        this.MainPanel = MainPanel;
        this.mainGUI = mainGUI;
        initComponents();
    }

    public void updateUserLabel()
    {
        BAUserNameLabel.setText(GUI.currentUserAccount.getUserName());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jLabel1 = new javax.swing.JLabel();
        changePassword = new javax.swing.JButton();
        changeEmail = new javax.swing.JButton();
        changeLastName = new javax.swing.JButton();
        changeUsername = new javax.swing.JButton();
        changePhone = new javax.swing.JButton();
        changeFirstName = new javax.swing.JButton();
        BackButton = new javax.swing.JButton();
        BAUserNameLabel = new javax.swing.JLabel();
        LogoutButtton = new javax.swing.JButton();
        DeleteAccountButton = new javax.swing.JButton();

        setOpaque(false);

        jLabel1.setFont(new java.awt.Font("DejaVu Sans", 1, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Bank 42");

        changePassword.setText("Change Password");
        changePassword.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                changePasswordActionPerformed(evt);
            }
        });

        changeEmail.setText("Change Email");
        changeEmail.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                changeEmailActionPerformed(evt);
            }
        });

        changeLastName.setText("Change Last Name");
        changeLastName.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                changeLastNameActionPerformed(evt);
            }
        });

        changeUsername.setText("Change Username");
        changeUsername.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                changeUsernameActionPerformed(evt);
            }
        });

        changePhone.setText("Change Phone");
        changePhone.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                changePhoneActionPerformed(evt);
            }
        });

        changeFirstName.setText("Change First Name");
        changeFirstName.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                changeFirstNameMouseClicked(evt);
            }
        });
        changeFirstName.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                changeFirstNameActionPerformed(evt);
            }
        });

        BackButton.setText("Back");
        BackButton.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                BackButtonMouseClicked(evt);
            }
        });

        BAUserNameLabel.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        BAUserNameLabel.setText(PresentationLayer.GUI.currentBankAccount.getAccountName());

        LogoutButtton.setText("Logout");
        LogoutButtton.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                LogoutButttonMouseClicked(evt);
            }
        });

        DeleteAccountButton.setText("Delete Main Account");
        DeleteAccountButton.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                DeleteAccountButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(changePassword, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(changeFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(changeLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(changeUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(changeEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(DeleteAccountButton, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(changePhone, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(LogoutButtton, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BAUserNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(514, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BAUserNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(changeFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(changeLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(changeUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(changePassword, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(changeEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DeleteAccountButton, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(changePhone, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(LogoutButtton, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(196, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void changeFirstNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_changeFirstNameMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_changeFirstNameMouseClicked

    private void changeLastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeLastNameActionPerformed
        String response = JOptionPane.showInputDialog("Enter your new last name only:");
        if (response.length() > 0)
            GUI.currentUserAccount.setLastName(response);
    }//GEN-LAST:event_changeLastNameActionPerformed

    private void changeFirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeFirstNameActionPerformed
        String response = JOptionPane.showInputDialog("Enter your new first name only:");
        if (response.length() > 0)
            GUI.currentUserAccount.setFirstName(response);
    }//GEN-LAST:event_changeFirstNameActionPerformed

    private void changeUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeUsernameActionPerformed
        String response = JOptionPane.showInputDialog("Enter your new username:");
        if (response.length() > 0)
            GUI.currentUserAccount.setUserName(response);
    }//GEN-LAST:event_changeUsernameActionPerformed

    private void changePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changePasswordActionPerformed
        String response = JOptionPane.showInputDialog("Enter your new first name only:");
        if (response.length() > 0)
            GUI.currentUserAccount.setPassword(response);
    }//GEN-LAST:event_changePasswordActionPerformed

    private void changeEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeEmailActionPerformed
        String response = JOptionPane.showInputDialog("Enter your new email:");
        if (response.length() > 0)
            GUI.currentUserAccount.setEmail(response);
    }//GEN-LAST:event_changeEmailActionPerformed

    private void changePhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changePhoneActionPerformed
        String response = JOptionPane.showInputDialog("Enter your new phone number:");
        if (response.length() > 0)
            GUI.currentUserAccount.setPhone(response);
    }//GEN-LAST:event_changePhoneActionPerformed

    private void BackButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackButtonMouseClicked
        CardLayout layout = (CardLayout) (MainPanel.getLayout());
        layout.show(MainPanel, "AccList");
    }//GEN-LAST:event_BackButtonMouseClicked

    private void LogoutButttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutButttonMouseClicked
        GUI.currentBankAccount = null;
        GUI.currentUserAccount = null;
        CardLayout layout = (CardLayout) (MainPanel.getLayout());
        layout.show(MainPanel, "Login");
    }//GEN-LAST:event_LogoutButttonMouseClicked

    private void DeleteAccountButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteAccountButtonMouseClicked
        CardLayout layout = (CardLayout) (MainPanel.getLayout());
        layout.show(MainPanel, "Delete");
    }//GEN-LAST:event_DeleteAccountButtonMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BAUserNameLabel;
    private javax.swing.JButton BackButton;
    private javax.swing.JButton DeleteAccountButton;
    private javax.swing.JButton LogoutButtton;
    private javax.swing.JButton changeEmail;
    private javax.swing.JButton changeFirstName;
    private javax.swing.JButton changeLastName;
    private javax.swing.JButton changePassword;
    private javax.swing.JButton changePhone;
    private javax.swing.JButton changeUsername;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
