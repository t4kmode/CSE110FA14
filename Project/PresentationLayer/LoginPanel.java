package PresentationLayer;

/**
 * **************************************************************************
 *
 * Michio Takemoto CSE 110, Fall 2014 Last Updated: November 3, 2014
 *
 * Team 42
 *
 * File Name: LoginPanel.java Description: This class will define what our Login
 * Page will look like and how it will behave.
 * **************************************************************************
 */
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LoginPanel extends javax.swing.JPanel
{

    // VERY IMPORTANT !! YOU MUST MAKE SURE THAT YOU GIVE EACH NEW PANEL THAT
    // YOU DECLARE A PRIVATE VARIABLE THAT WILL STORE THE MAIN PANEL FROM GUI
    private JPanel MainPanel;
    private GUI mainGUI;
    private static final String USERNAME_PATTERN = "^[a-z0-9_-]{1,15}$";
    private Image image;

    public LoginPanel()
    {
        initComponents();
    }

    /* THIS CONSTRUCTOR IS EXTREMELY IMPORTANT. WRITE A CONSTRUCTOR LIKE THIS
     FOR ALL OTHER PANELS

     This constructor takes in MainPanel from GUI.java which gives us access to
     the main panel where all of our GUI elements will eventually be located. */
    public LoginPanel(JPanel MainPanel, GUI mainGUI)
    {
        this.mainGUI = mainGUI;
        this.MainPanel = MainPanel;
        initComponents();
        /*{
         try
         {
         File image2 = new File("background-wallpapers-24");
         image = javax.imageio.ImageIO.read(image2);
         }
         catch (Exception e) { /*handled in paintComponent()*/ //}
        //}
    }

    /*@Override
     protected void paintComponent(Graphics g)
     {
     super.paintComponent(g);
     if (image != null)
     g.drawImage(image, 0,0,this.getWidth(),this.getHeight(),this);
     }*/
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

        jPanel1 = new javax.swing.JPanel();
        CreateAccButton = new javax.swing.JButton();
        LoginButton = new javax.swing.JButton();
        jPasswordField = new javax.swing.JPasswordField();
        UsernameField = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        UsernameLabel = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        PasswordLabel = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setPreferredSize(new java.awt.Dimension(800, 600));
        setLayout(new java.awt.GridBagLayout());

        jPanel1.setOpaque(false);
        java.awt.GridBagLayout jPanel1Layout = new java.awt.GridBagLayout();
        jPanel1Layout.columnWidths = new int[] {0, 5, 0};
        jPanel1Layout.rowHeights = new int[] {0, 5, 0, 5, 0};
        jPanel1.setLayout(jPanel1Layout);

        CreateAccButton.setBackground(new Color (255,255,255,150));
        CreateAccButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        CreateAccButton.setForeground(new java.awt.Color(51, 0, 255));
        CreateAccButton.setText("Create Account");
        CreateAccButton.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                CreateAccButtonMouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanel1.add(CreateAccButton, gridBagConstraints);

        LoginButton.setBackground(new java.awt.Color(255, 255, 255));
        LoginButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LoginButton.setForeground(new java.awt.Color(51, 0, 255));
        LoginButton.setText("Login");
        LoginButton.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                LoginButtonMouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 50;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        jPanel1.add(LoginButton, gridBagConstraints);

        jPasswordField.setBackground(new Color(255,255,255,150));
        jPasswordField.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 3, 0, 0));
        jPasswordField.setMinimumSize(new java.awt.Dimension(250, 25));
        jPasswordField.setPreferredSize(new java.awt.Dimension(250, 25));
        jPasswordField.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusGained(java.awt.event.FocusEvent evt)
            {
                jPasswordFieldFocusGained(evt);
            }
        });
        jPasswordField.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jPasswordFieldActionPerformed(evt);
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
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipady = 15;
        jPanel1.add(jPasswordField, gridBagConstraints);

        UsernameField.setBackground(new Color(255,255,255,150));
        UsernameField.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 3, 0, 0));
        UsernameField.setDisabledTextColor(new Color(255,255,255,150));
        UsernameField.setMinimumSize(new java.awt.Dimension(250, 25));
        UsernameField.setPreferredSize(new java.awt.Dimension(250, 25));
        UsernameField.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusGained(java.awt.event.FocusEvent evt)
            {
                UsernameFieldFocusGained(evt);
            }
        });
        UsernameField.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                UsernameFieldActionPerformed(evt);
            }
        });
        UsernameField.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                UsernameFieldKeyPressed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipady = 15;
        jPanel1.add(UsernameField, gridBagConstraints);

        jPanel2.setBackground(new Color(255,255,255,150));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setMinimumSize(new java.awt.Dimension(90, 20));
        jPanel2.setPreferredSize(new java.awt.Dimension(90, 20));
        jPanel2.setLayout(new java.awt.GridBagLayout());

        UsernameLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        UsernameLabel.setForeground(new java.awt.Color(51, 0, 255));
        UsernameLabel.setText("Username:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        jPanel2.add(UsernameLabel, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        jPanel1.add(jPanel2, gridBagConstraints);

        jPanel3.setBackground(new Color(255,255,255,150));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setMinimumSize(new java.awt.Dimension(90, 20));
        jPanel3.setPreferredSize(new java.awt.Dimension(90, 20));
        jPanel3.setLayout(new java.awt.GridBagLayout());

        PasswordLabel.setBackground(new Color(255,255,255,200));
        PasswordLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        PasswordLabel.setForeground(new java.awt.Color(51, 0, 255));
        PasswordLabel.setText("Password:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        jPanel3.add(PasswordLabel, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        jPanel1.add(jPanel3, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(300, 0, 0, 0);
        add(jPanel1, gridBagConstraints);

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/rsz_142galaxy Cropped.png"))); // NOI18N
        Background.setToolTipText("");
        Background.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Background.setFocusable(false);
        Background.setInheritsPopupMenu(false);
        Background.setRequestFocusEnabled(false);
        Background.setVerifyInputWhenFocusTarget(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        add(Background, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void Login()
    {
        String username = UsernameField.getText();
        char[] passwordarray = jPasswordField.getPassword();
        String password = new String(passwordarray);

        if ((username.equals("teller")) && (password.equals("teller")))
        {
            CardLayout layout = (CardLayout) (MainPanel.getLayout());
            layout.show(MainPanel, "TellerMainMenu");
            UsernameField.setText(null);
            jPasswordField.setText(null);
            return;
        }

        GUI.currentUserAccount = GUI.MasterTable.findUserAccount(UsernameField.getText());

        if (GUI.currentUserAccount == null)
        {
            JOptionPane.showMessageDialog(null, "Account Not found!", "Error!",
                    JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
            if (password.compareTo(GUI.currentUserAccount.getPassword()) == 0)
            {
                mainGUI.getAccList().update();
                mainGUI.getSettings().update();
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
                UsernameField.setText(null);
                jPasswordField.setText(null);
                layout.show(MainPanel, "AccList");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Invalid Username Password Combination");
            }
            //move the following code in here, for demoing and when we're done testing.
        }
    }

    // Creates an event for the LoginButton that will fire any time the button
    // is clicked. This is just an example to get you started.
    private void LoginButtonMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_LoginButtonMouseClicked
    {//GEN-HEADEREND:event_LoginButtonMouseClicked
        Login();
    }//GEN-LAST:event_LoginButtonMouseClicked

    private void CreateAccButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CreateAccButtonMouseClicked

        UsernameField.setText(null);
        jPasswordField.setText(null);
        //retrieve MainPanel to transfer it's layout to CreateAccountPanel
        CardLayout layout = (CardLayout) (MainPanel.getLayout());

        //send the layout of MainPanel to new display of JPanel "CreateAcc"
        layout.show(MainPanel, "CreateAcc");

    }//GEN-LAST:event_CreateAccButtonMouseClicked

    private void UsernameFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_UsernameFieldFocusGained
        UsernameField.setText("");
    }//GEN-LAST:event_UsernameFieldFocusGained

    private void UsernameFieldKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_UsernameFieldKeyPressed
    {//GEN-HEADEREND:event_UsernameFieldKeyPressed
        int key = evt.getKeyCode();
        if (key == java.awt.event.KeyEvent.VK_ENTER)
        {
            Login();
        }
    }//GEN-LAST:event_UsernameFieldKeyPressed

    private void jPasswordFieldKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_jPasswordFieldKeyPressed
    {//GEN-HEADEREND:event_jPasswordFieldKeyPressed
        int key = evt.getKeyCode();
        if (key == java.awt.event.KeyEvent.VK_ENTER)
        {
            Login();
        }
    }//GEN-LAST:event_jPasswordFieldKeyPressed

    private void jPasswordFieldFocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_jPasswordFieldFocusGained
    {//GEN-HEADEREND:event_jPasswordFieldFocusGained
        jPasswordField.setText("");
    }//GEN-LAST:event_jPasswordFieldFocusGained

    private void UsernameFieldActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_UsernameFieldActionPerformed
    {//GEN-HEADEREND:event_UsernameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsernameFieldActionPerformed

    private void jPasswordFieldActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jPasswordFieldActionPerformed
    {//GEN-HEADEREND:event_jPasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordFieldActionPerformed

    public boolean validate(final String username)
    {

        Pattern pattern = Pattern.compile(USERNAME_PATTERN);
        Matcher matcher = pattern.matcher(username);

        if (matcher.matches() == false)
            JOptionPane.showMessageDialog(null, "Your username contains illegal characters!", "Error!",
                    JOptionPane.INFORMATION_MESSAGE);
        return matcher.matches();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JButton CreateAccButton;
    private javax.swing.JButton LoginButton;
    private javax.swing.JLabel PasswordLabel;
    private javax.swing.JTextField UsernameField;
    private javax.swing.JLabel UsernameLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField jPasswordField;
    // End of variables declaration//GEN-END:variables

}
