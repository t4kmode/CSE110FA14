/*
 * Team 42
 * CSE 110, Fall 2014
 *  
 * Author(s):Zachary Preece-Scaringe
 * 
 * Summary:Panel which will get the input for and create a new bank account.
 */
package PresentationLayer;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Ryan
 */
public class CreateBankAccount extends javax.swing.JPanel
{

    private JPanel MainPanel;
    private GUI mainGUI;
    
    //types of accounts for account type selection comboboxes
    String[] accTypes =
    {
        "Checking", "Savings"
    };

     /*This constructor takes in MainPanel and mainGUI from GUI.java which gives us access to
     the main panel and ther panels public methods */
    public CreateBankAccount(JPanel MainPanel, GUI mainGUI)
    {
        this.mainGUI = mainGUI;
        this.MainPanel = MainPanel;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AccountNameField = new javax.swing.JTextField();
        TypeCombo = new javax.swing.JComboBox();
        AccountTypeLabel = new javax.swing.JLabel();
        AccountNameLabel = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(244, 88));

        AccountNameField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                AccountNameFieldFocusGained(evt);
            }
        });

        TypeCombo.setModel(new DefaultComboBoxModel(accTypes));

        AccountTypeLabel.setText("Account Type:");

        AccountNameLabel.setText("Account Name:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AccountNameField)
            .addGroup(layout.createSequentialGroup()
                .addComponent(AccountTypeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 73, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TypeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(AccountNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AccountTypeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TypeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AccountNameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AccountNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    /**
     * parent's GetPanel() getter function. Returns a JPanel
     * @return JPanel
     */
    public javax.swing.JPanel getCreateBankAccountPanel()
    {
        return this;
    }

    //Creates an account if its input fields hold valid input
    public void CreateAccount()
    {
        //if nothing entered, error message
        if (AccountNameField.getText().length() == 0)
        {
            JOptionPane.showMessageDialog(null, "Please enter an account name", "Bank 42", 1, GUI.icon);
        }

        //name too long, error message
        else if (AccountNameField.getText().length() > 15)
        {
            JOptionPane.showMessageDialog(null, "Your account name is too long\n bank account names must be at most 15 characters", "Bank 42", 1, GUI.icon);
        }

        //matching account, error message
        else if (GUI.currentUserAccount.findBankAccount(AccountNameField.getText()) != null)
        {
            JOptionPane.showMessageDialog(null, "You have an existing bank account with that name"
                    + "\n Please Choose A Valid Name", "Bank 42", 1, GUI.icon);
            AccountNameField.setText("");
        }

        //name available, create account
        else if (nameIsValid(AccountNameField.getText()))
        {
            GUI.currentUserAccount.insertBankAccount(0, AccountNameField.getText(), TypeCombo.getSelectedItem().toString());            
            
            //update table and database
            mainGUI.getAccList().update();
            GUI.dataout.exportDB(GUI.MasterTable);
            
            //verification popup
            JOptionPane.showMessageDialog(null, TypeCombo.getSelectedItem() + " Account: " + AccountNameField.getText() + " successfully created", "Bank 42", 1, GUI.icon);
            
            //reset account name field
            AccountNameField.setText("");
        }

        else
        {
            //invalid input error message;
            JOptionPane.showMessageDialog(null, "Invalid input.\nOnly alphanumeric characters are allowed.\nNo spaces.", "Bank 42", 1);
            AccountNameField.setText("");
        }

    }

    private void AccountNameFieldFocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_AccountNameFieldFocusGained
    {//GEN-HEADEREND:event_AccountNameFieldFocusGained
        AccountNameField.setText("");
    }//GEN-LAST:event_AccountNameFieldFocusGained

    //checks to see if the name is valid
    private boolean nameIsValid(String n)
    {
        for (int i = 0; i < n.length(); i++)
        {
            char a = n.charAt(i);
            if (a < 48 || (a > 57 && a < 65) || (a > 90 && a < 97) || (a > 123))
                return false;
        }

        return true;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AccountNameField;
    private javax.swing.JLabel AccountNameLabel;
    private javax.swing.JLabel AccountTypeLabel;
    private javax.swing.JComboBox TypeCombo;
    // End of variables declaration//GEN-END:variables
}
