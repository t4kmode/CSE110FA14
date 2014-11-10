package GUI;
/****************************************************************************

                                                        Ryan Bridges
                                                        CSE 110, Fall 2014
                                          Last Updated: October 30, 2014

                                Team 42

File Name:      AccountsListPanel.java
Description:    This class will define what our Login Page will look like and 
                how it will behave. THIS CLASS IS JUST A PLACEHOLDER RIGHT
                NOW AND DOES NOT DO ANYTHING YET OTHER THAN DISPLAY A MESSAGE
                TELLING US WHICH PANEL IT IS SUPPOSED TO BE.
 ****************************************************************************/
import javax.swing.*;
import java.awt.*;

public class AccountsListPanel extends javax.swing.JPanel
{

    // VERY IMPORTANT !! YOU MUST MAKE SURE THAT YOU GIVE EACH NEW PANEL THAT 
    // YOU DECLARE A PRIVATE VARIABLE THAT WILL STORE THE MAIN PANEL FROM GUI 
    private JPanel MainPanel;
    
    public AccountsListPanel()
    {
        initComponents();
    }
    
    /* THIS CONSTRUCTOR IS EXTREMELY IMPORTANT. WRITE A CONSTRUCTOR LIKE THIS
    FOR ALL OTHER PANELS
    
    This constructor takes in MainPanel from GUI.java which gives us access to
    the main panel where all of our GUI elements will eventually be located. */
    public AccountsListPanel(JPanel MainPanel)
    {
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
    private void initComponents()
    {

        jLabel5 = new javax.swing.JLabel();
        Settings = new javax.swing.JButton();
        Logout = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setOpaque(false);

        jLabel5.setFont(new java.awt.Font("DejaVu Sans", 1, 24)); // NOI18N
        jLabel5.setText("Bank 42");

        Settings.setText("Settings");
        Settings.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                SettingsMouseClicked(evt);
            }
        });
        Settings.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                SettingsActionPerformed(evt);
            }
        });

        Logout.setText("Logout");
        Logout.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                LogoutMouseClicked(evt);
            }
        });
        Logout.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                LogoutActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String []
            {
                "Account Name", "Account Type", "Account Balance"
            }
        )
        {
            Class[] types = new Class []
            {
                java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean []
            {
                false, true, false
            };

            public Class getColumnClass(int columnIndex)
            {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex)
            {
                return canEdit [columnIndex];
            }
        });
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0)
        {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Settings)
                        .addGap(203, 203, 203)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Logout)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(121, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Settings)
                    .addComponent(Logout))
                .addGap(70, 70, 70)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(197, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void SettingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SettingsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SettingsActionPerformed

    private void LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LogoutActionPerformed

    private void LogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutMouseClicked
        //retrieve MainPanel to transfer it's layout to AccountListPanel
        CardLayout layout = (CardLayout) (MainPanel.getLayout());
        
         //send the layout of MainPanel to new display of JPanel "Login"
        layout.show(MainPanel, "Login");
    }//GEN-LAST:event_LogoutMouseClicked

    private void SettingsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SettingsMouseClicked
        CardLayout layout = (CardLayout) (MainPanel.getLayout());
        
        layout.show(MainPanel, "Settings");
    }//GEN-LAST:event_SettingsMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Logout;
    private javax.swing.JButton Settings;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

}

