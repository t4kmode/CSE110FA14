/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PresentationLayer;

import javax.swing.JPanel;

/**
 *
 * @author Zack
 */
public class ForgotPasswordPanel extends javax.swing.JPanel
{

    private JPanel MainPanel;
    private GUI mainGUI;

    /**
     * Creates new form PasswordFieldPanel
     */
    public ForgotPasswordPanel()
    {
        initComponents();
    }

    public ForgotPasswordPanel(JPanel MainPanel, GUI mainGUI)
    {
        this.MainPanel = MainPanel;
        this.mainGUI = mainGUI;
        initComponents();
    }

    public javax.swing.JPanel GetPanel()
    {
        return this;
    }

    public String GetPassword()
    {
        char[] passwordArray = jPasswordField.getPassword();
        String password = new String(passwordArray);
        return password;
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
        java.awt.GridBagConstraints gridBagConstraints;

        jPasswordField = new javax.swing.JPasswordField();
        EnterPassword = new javax.swing.JLabel();

        setLayout(new java.awt.GridBagLayout());

        jPasswordField.setText("password");
        jPasswordField.setMinimumSize(new java.awt.Dimension(95, 25));
        jPasswordField.setPreferredSize(new java.awt.Dimension(95, 25));
        jPasswordField.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusGained(java.awt.event.FocusEvent evt)
            {
                jPasswordFieldFocusGained(evt);
            }
        });
        jPasswordField.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                jPasswordFieldKeyPressed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        add(jPasswordField, gridBagConstraints);

        EnterPassword.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        EnterPassword.setText("Please enter your new password");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 15, 0);
        add(EnterPassword, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void jPasswordFieldFocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_jPasswordFieldFocusGained
    {//GEN-HEADEREND:event_jPasswordFieldFocusGained
        jPasswordField.setText("");
    }//GEN-LAST:event_jPasswordFieldFocusGained

    private void jPasswordFieldKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_jPasswordFieldKeyPressed
    {//GEN-HEADEREND:event_jPasswordFieldKeyPressed

    }//GEN-LAST:event_jPasswordFieldKeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel EnterPassword;
    private javax.swing.JPasswordField jPasswordField;
    // End of variables declaration//GEN-END:variables
}