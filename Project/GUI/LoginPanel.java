package GUI;

/****************************************************************************

                                                        Ryan Bridges
                                                        CSE 110, Fall 2014
                                          Last Updated: October 30, 2014

                                Team 42

File Name:      LoginPanel.java
Description:    This class will define what our Login Page will look like and 
                how it will behave.
 ****************************************************************************/

import Backend.UserAccount;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoginPanel extends javax.swing.JPanel
{

    // VERY IMPORTANT !! YOU MUST MAKE SURE THAT YOU GIVE EACH NEW PANEL THAT 
    // YOU DECLARE A PRIVATE VARIABLE THAT WILL STORE THE MAIN PANEL FROM GUI 
    private JPanel MainPanel;
    
    //keeps track of which accounts have been attempted to be logged in. Maximum of 3 login attempts each.
    ArrayList<String> userNamesAttempted = new ArrayList<String>();

    //keeps track of number of login attempts per user name.
    //These two arraylists will always be the same size, so the index in each refer to the same account.
    ArrayList<Integer> loginAttempts = new ArrayList<Integer>();
    
    //Maximum number of login attempts per account
    int maxLoginAttempts = 3;
    
    //Account creation requirements
    int requiredPasswordLength = 4;
    int requiredUsernameLength = 4;

    public LoginPanel()
    {
        initComponents();
    }
    
    /* THIS CONSTRUCTOR IS EXTREMELY IMPORTANT. WRITE A CONSTRUCTOR LIKE THIS
    FOR ALL OTHER PANELS
    
    This constructor takes in MainPanel from GUI.java which gives us access to
    the main panel where all of our GUI elements will eventually be located. */
    public LoginPanel(JPanel MainPanel)
    {
        this.MainPanel = MainPanel;
        initComponents();
        String laf = UIManager.getSystemLookAndFeelClassName();
        try {
            UIManager.setLookAndFeel(laf);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LoginPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(LoginPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(LoginPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(LoginPanel.class.getName()).log(Level.SEVERE, null, ex);
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

        UsernameField = new javax.swing.JTextField();
        PasswordField = new javax.swing.JTextField();
        CreateAccButton = new javax.swing.JButton();
        LoginButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setOpaque(false);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        UsernameField.setText("Username");
        UsernameField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                UsernameFieldFocusGained(evt);
            }
        });
        UsernameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsernameFieldActionPerformed(evt);
            }
        });

        PasswordField.setText("Password");
        PasswordField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                PasswordFieldFocusGained(evt);
            }
        });
        PasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordFieldActionPerformed(evt);
            }
        });

        CreateAccButton.setText("Create Account");
        CreateAccButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CreateAccButtonMouseClicked(evt);
            }
        });
        CreateAccButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                CreateAccButtonKeyPressed(evt);
            }
        });

        LoginButton.setText("Login");
        LoginButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LoginButtonMouseClicked(evt);
            }
        });
        LoginButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                LoginButtonKeyPressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("DejaVu Sans", 1, 48)); // NOI18N
        jLabel1.setText("Bank 42");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(317, 317, 317)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(CreateAccButton, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(LoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addComponent(UsernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)))
                .addGap(340, 340, 340))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addComponent(UsernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CreateAccButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(168, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void UsernameFieldActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_UsernameFieldActionPerformed
    {//GEN-HEADEREND:event_UsernameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsernameFieldActionPerformed

    private void PasswordFieldActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_PasswordFieldActionPerformed
    {//GEN-HEADEREND:event_PasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordFieldActionPerformed

    // Creates an event for the LoginButton that will fire any time the button
    // is clicked. This is just an example to get you started.
        private void LoginButtonMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_LoginButtonMouseClicked
    {//GEN-HEADEREND:event_LoginButtonMouseClicked
        // This line grabs the layout from MainPanel from the GUI class so that
        // we can show a new panel on it
        CardLayout layout = (CardLayout) (MainPanel.getLayout());
        // This will show the next panel when the button is clicked. Notice 
        // the parameters here. MainPanel is passed in, which is the panel from 
        // GUI.java with the CardLayout that our next panel will appear on,
        //  and "AccList" is the name of the panel that will be shown. 
        // "AccList" matches up to the name that we gave the AccountsListPanel
        // in GUI.java. Giving our instance of AccountsListPanel in GUI.java
        // this name and adding that object to MainPanel has allowed us 
        // to access and show that panel from outside of the class as long
        //  as we pass in MainPanel
        // This is an example of how we will access our HashTable from our 
        // other tables. Since it is declared static in GUI.java, we have access
        // to it everywhere.
        
        //The account that is trying to log in
        UserAccount toLogin = GUI.MasterTable.findUserAccount(UsernameField.getText());
        
        //The username was not found
        if (toLogin == null)
        {
            //Show a popup, return to the login page with both fields erased.
            JOptionPane.showMessageDialog(null, "The username was not found.");
            PasswordField.setText("");
            UsernameField.setText("");
            return;
        }
        
        //Here we do all the stuff to check taht the user doesn't attempt to login to the same
        //account too many times.
        String username = UsernameField.getText();
        boolean addUsername = true;
        int index = 0;
        
        //First we find out if they are inputting a username that they've already tried
        for (int i = 0; i < userNamesAttempted.size(); i++)
        {
            if (userNamesAttempted.get(i).equals(username))
            {
                addUsername = false;
                index = i;
            }
        }
        
        if (addUsername)
        {
            //If we are here, then the user has never attempted to login to this account yet.
            //So, we add it to the array lists
            userNamesAttempted.add(username);
            loginAttempts.add(0);
            index = userNamesAttempted.size() - 1;
        }
        else 
        {
            //If we are here, the user has attempted to login here before. 
            //Increment the login attempts by 1.
            loginAttempts.set(index, loginAttempts.get(index) + 1);
        }
        
        //We check that the user hasn't tried to log in too many times
        if (loginAttempts.get(index) >= maxLoginAttempts)
        {
            JOptionPane.showMessageDialog(null, "Too many login attempts. Only 3 are allowed.");
            UsernameField.setText("");
            PasswordField.setText("");
        }
        
        else 
        {
            //The username is valid, and the password is valid
            if (toLogin.getPassword().equals(PasswordField.getText()))
            {
                //Bring the user to the account list panel
                layout.show(MainPanel, "AccList");
            }
            
            //The username is valid, but the password is not valid
            else
            {
                //Show a popup, return to the login page with password field erased.
                JOptionPane.showMessageDialog(null, "Incorrect password.");
                PasswordField.setText("");
            }
        }
    }//GEN-LAST:event_LoginButtonMouseClicked

    private void UsernameFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_UsernameFieldFocusGained
        // TODO add your handling code here:
        if (UsernameField.getText().equals("Username"))
                UsernameField.setText("");
    }//GEN-LAST:event_UsernameFieldFocusGained

    private void PasswordFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PasswordFieldFocusGained
        // TODO add your handling code here:
        if (PasswordField.getText().equals("Password"))
                PasswordField.setText("");
    }//GEN-LAST:event_PasswordFieldFocusGained

    private void CreateAccButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CreateAccButtonMouseClicked
        // TODO add your handling code here:
        
        //Used to make sure user inputs valid data and to tell them what they did wrong if they didn't
        String errorMessage = "";
        boolean validInput = true;
        
        //stores password/username they are trying to use
        String username = UsernameField.getText();
        String password = PasswordField.getText();
        
        //Check for valid username and password inputs
        if (password.length() < requiredPasswordLength)
        {
            errorMessage += ("Password must be a minimum of " + requiredPasswordLength + " characters\n");
            PasswordField.setText("");
            validInput = false;
        }
        
        if (username.length() < requiredUsernameLength)
        {
            errorMessage += ("Username must be a minimum of " + requiredUsernameLength + " characters.\n");
            UsernameField.setText("");
            validInput = false;
        }
        
        //If we have reached this, the password and username are valid
        if (validInput)
        {
            //First check if the user already exists
            if (GUI.MasterTable.findUserAccount(username) != null)
            {
                //duplicate user
                JOptionPane.showMessageDialog(null, "This user already exists.");
                UsernameField.setText("");
            }
            
            //we are all good if we go into here
            else
            {
                //add the user to the master table and then set his password to what he specified
                GUI.MasterTable.insertUserAccount(username);
                UserAccount user = GUI.MasterTable.findUserAccount(username);
                user.setPassword(password);
                JOptionPane.showMessageDialog(null, "Account name: " + username + " successfully created.");
                UsernameField.setText("");
                PasswordField.setText("");
            }
        }
        
        //If we are here, the username and/or password were invalid in some way. Print error message.
        else 
        {
            JOptionPane.showMessageDialog(null, errorMessage);
            UsernameField.setText("");
            PasswordField.setText("");
        }
    }//GEN-LAST:event_CreateAccButtonMouseClicked

    private void LoginButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_LoginButtonKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
            LoginButtonMouseClicked(null);
    }//GEN-LAST:event_LoginButtonKeyPressed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed

    }//GEN-LAST:event_formKeyPressed

    private void CreateAccButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CreateAccButtonKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
            CreateAccButtonMouseClicked(null);
    }//GEN-LAST:event_CreateAccButtonKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CreateAccButton;
    private javax.swing.JButton LoginButton;
    private javax.swing.JTextField PasswordField;
    private javax.swing.JTextField UsernameField;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
    
}
