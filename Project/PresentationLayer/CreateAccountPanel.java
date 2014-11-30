package PresentationLayer;

import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * 11/9 Michio Takemoto
 * Uses import/export now, but we have a FEW issues
 ** 1) When invalid input, we have to reset all the buttons or reset the page itself
 that all the fields will reset as well. As of now, if we tried to submit something
 invalid, but we correct it and submit, it will still be invalid as the old data
 doesn't leave

 */
/**
 *
 * @author asharda
 */
public class CreateAccountPanel extends javax.swing.JPanel
{

    private JPanel MainPanel;
    private GUI mainGUI;

    /**
     * Creates new form CreateAccount
     */
    public CreateAccountPanel()
    {
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
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel2 = new javax.swing.JPanel();
        HeaderPanel = new javax.swing.JPanel();
        Bank42 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        confirmPassword = new javax.swing.JPasswordField();
        email = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        phone = new javax.swing.JTextField();
        lastName = new javax.swing.JTextField();
        username = new javax.swing.JTextField();
        firstName = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        createUserAccount = new javax.swing.JButton();
        spacinglabellol = new javax.swing.JLabel();
        BackButton = new javax.swing.JButton();
        errorMessage = new javax.swing.JLabel();
        fillerlabellol = new javax.swing.JLabel();
        spacinglabellol1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        FirstNameError = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        LastNameError = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        UsernameError = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        PasswordError = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        ConfirmPasswordError = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        EmailError = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        PhoneError = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(800, 600));
        setLayout(new java.awt.GridBagLayout());

        jPanel2.setOpaque(false);
        jPanel2.setLayout(new java.awt.GridBagLayout());

        HeaderPanel.setBackground(new java.awt.Color(255, 255, 255));
        HeaderPanel.setOpaque(false);
        HeaderPanel.setLayout(new java.awt.GridBagLayout());

        Bank42.setFont(new java.awt.Font("DejaVu Sans", 1, 48)); // NOI18N
        Bank42.setForeground(new java.awt.Color(51, 0, 255));
        Bank42.setText("Bank 42");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        HeaderPanel.add(Bank42, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        jPanel2.add(HeaderPanel, gridBagConstraints);

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 0, 255));
        jLabel2.setText("First Name:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        jPanel1.add(jLabel2, gridBagConstraints);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 0, 255));
        jLabel7.setText("Email:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        jPanel1.add(jLabel7, gridBagConstraints);

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(51, 0, 255));
        jLabel15.setText("Phone:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        jPanel1.add(jLabel15, gridBagConstraints);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 0, 255));
        jLabel6.setText("Confirm Password:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        jPanel1.add(jLabel6, gridBagConstraints);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 0, 255));
        jLabel4.setText("Password:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        jPanel1.add(jLabel4, gridBagConstraints);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 0, 255));
        jLabel3.setText("Last Name:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        jPanel1.add(jLabel3, gridBagConstraints);

        confirmPassword.setBackground(new Color(255,255,255,190));
        confirmPassword.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusGained(java.awt.event.FocusEvent evt)
            {
                confirmPasswordFocusGained(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanel1.add(confirmPassword, gridBagConstraints);

        email.setBackground(new Color(255,255,255,190));
        email.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusGained(java.awt.event.FocusEvent evt)
            {
                emailFocusGained(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanel1.add(email, gridBagConstraints);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 0, 255));
        jLabel5.setText("Username:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        jPanel1.add(jLabel5, gridBagConstraints);

        phone.setBackground(new Color(255,255,255,190));
        phone.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusGained(java.awt.event.FocusEvent evt)
            {
                phoneFocusGained(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanel1.add(phone, gridBagConstraints);

        lastName.setBackground(new Color(255,255,255,190));
        lastName.setMaximumSize(new java.awt.Dimension(6, 20));
        lastName.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusGained(java.awt.event.FocusEvent evt)
            {
                lastNameFocusGained(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanel1.add(lastName, gridBagConstraints);

        username.setBackground(new Color(255,255,255,190));
        username.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusGained(java.awt.event.FocusEvent evt)
            {
                usernameFocusGained(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanel1.add(username, gridBagConstraints);

        firstName.setBackground(new Color(255,255,255,190));
        firstName.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusGained(java.awt.event.FocusEvent evt)
            {
                firstNameFocusGained(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanel1.add(firstName, gridBagConstraints);

        password.setBackground(new Color(255,255,255,190));
        password.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusGained(java.awt.event.FocusEvent evt)
            {
                passwordFocusGained(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanel1.add(password, gridBagConstraints);

        createUserAccount.setBackground(new java.awt.Color(255, 255, 255));
        createUserAccount.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        createUserAccount.setForeground(new java.awt.Color(51, 0, 255));
        createUserAccount.setText("Create User Account");
        createUserAccount.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                createUserAccountActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 18;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanel1.add(createUserAccount, gridBagConstraints);

        spacinglabellol.setText(" ");
        spacinglabellol.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 17;
        jPanel1.add(spacinglabellol, gridBagConstraints);

        BackButton.setBackground(new java.awt.Color(255, 255, 255));
        BackButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BackButton.setForeground(new java.awt.Color(51, 0, 255));
        BackButton.setText("Back");
        BackButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                BackButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 20;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanel1.add(BackButton, gridBagConstraints);

        errorMessage.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        errorMessage.setForeground(new java.awt.Color(255, 102, 102));
        errorMessage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        errorMessage.setText("Please fill in the fields below to create an account.");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        jPanel1.add(errorMessage, gridBagConstraints);

        fillerlabellol.setText(" ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 19;
        jPanel1.add(fillerlabellol, gridBagConstraints);

        spacinglabellol1.setText(" ");
        spacinglabellol1.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 17;
        jPanel1.add(spacinglabellol1, gridBagConstraints);

        jLabel1.setText(" ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        jPanel1.add(jLabel1, gridBagConstraints);

        jLabel8.setText(" ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        jPanel1.add(jLabel8, gridBagConstraints);

        jPanel3.setBackground(new java.awt.Color(255, 160, 122));
        jPanel3.setLayout(new java.awt.GridBagLayout());

        FirstNameError.setForeground(new java.awt.Color(255, 102, 102));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanel3.add(FirstNameError, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanel1.add(jPanel3, gridBagConstraints);

        jLabel9.setText(" ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        jPanel1.add(jLabel9, gridBagConstraints);

        jPanel4.setBackground(new java.awt.Color(255, 160, 122));
        jPanel4.setLayout(new java.awt.GridBagLayout());

        LastNameError.setForeground(new java.awt.Color(255, 102, 102));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanel4.add(LastNameError, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanel1.add(jPanel4, gridBagConstraints);

        jPanel5.setBackground(new java.awt.Color(255, 160, 122));
        jPanel5.setLayout(new java.awt.GridBagLayout());

        UsernameError.setForeground(new java.awt.Color(255, 102, 102));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanel5.add(UsernameError, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanel1.add(jPanel5, gridBagConstraints);

        jPanel6.setBackground(new java.awt.Color(255, 160, 122));
        jPanel6.setLayout(new java.awt.GridBagLayout());

        PasswordError.setForeground(new java.awt.Color(255, 102, 102));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanel6.add(PasswordError, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanel1.add(jPanel6, gridBagConstraints);

        jPanel7.setBackground(new java.awt.Color(255, 160, 122));
        jPanel7.setLayout(new java.awt.GridBagLayout());

        ConfirmPasswordError.setForeground(new java.awt.Color(255, 102, 102));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanel7.add(ConfirmPasswordError, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanel1.add(jPanel7, gridBagConstraints);

        jPanel8.setBackground(new java.awt.Color(255, 160, 122));
        jPanel8.setLayout(new java.awt.GridBagLayout());

        EmailError.setForeground(new java.awt.Color(255, 102, 102));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanel8.add(EmailError, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanel1.add(jPanel8, gridBagConstraints);

        jPanel9.setBackground(new java.awt.Color(255, 160, 122));
        jPanel9.setLayout(new java.awt.GridBagLayout());

        PhoneError.setForeground(new java.awt.Color(255, 102, 102));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 15;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanel9.add(PhoneError, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 15;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanel1.add(jPanel9, gridBagConstraints);

        jLabel10.setText(" ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        jPanel1.add(jLabel10, gridBagConstraints);

        jLabel11.setText(" ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        jPanel1.add(jLabel11, gridBagConstraints);

        jLabel12.setText(" ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 9;
        jPanel1.add(jLabel12, gridBagConstraints);

        jLabel13.setText(" ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 13;
        jPanel1.add(jLabel13, gridBagConstraints);

        jLabel14.setText(" ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 15;
        jPanel1.add(jLabel14, gridBagConstraints);

        jLabel16.setText(" ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 11;
        jPanel1.add(jLabel16, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        jPanel2.add(jPanel1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
        add(jPanel2, gridBagConstraints);

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/hitchguide42robot.jpg"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        add(Background, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents
    public CreateAccountPanel(JPanel MainPanel, GUI mainGUI)
    {
        this.mainGUI = mainGUI;
        this.MainPanel = MainPanel;
        initComponents();
    }
    
    public void clearfields() {
        phone.setText("");
        email.setText("");
        confirmPassword.setText("");
        password.setText("");
        username.setText("");
        lastName.setText("");
        firstName.setText("");
    }
    
    public void clearerrors() {
        FirstNameError.setText("");
        LastNameError.setText("");
        UsernameError.setText("");
        PasswordError.setText("");
        ConfirmPasswordError.setText("");
        EmailError.setText("");
        PhoneError.setText(""); 
    }

    private void createUserAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createUserAccountActionPerformed

        errorMessage.setForeground(Color.red);

        String name1 = firstName.getText().trim();
        String name2 = lastName.getText().trim();
        String user = username.getText().trim();
        String input3 = email.getText().trim();
        String phoneNumber = phone.getText().trim();

        char[] input1 = password.getPassword();
        char[] input2 = confirmPassword.getPassword();

        String pass1 = new String(input1);
        String pass2 = new String(input2);

        boolean account_accepted = true;
        
        clearerrors();
        
        if (!((name1.length() > 0) && (validateFirstName(name1) == true))) {
            FirstNameError.setText("Your first name was entered incorrectly.");
            account_accepted = false;   
        }
        if (!((name2.length() > 0) && (validateLastName(name2) == true)))  {
            LastNameError.setText("Your last name was entered incorrectly.");
            account_accepted = false;
        }
        if (!((user.length() > 0) && (validate(user) == true))) {
            UsernameError.setText("Your username was entered incorrectly.");
            account_accepted = false;    
        }
        if (!(((pass1.length()) > 0) && (validatePassword(pass1) == true))) {
            PasswordError.setText("Your password was invalid");
            account_accepted = false;   
        }
        if (!(pass1.equals(pass2))) {
            ConfirmPasswordError.setText("Your password doesn't match confirm password");
            account_accepted = false; 
        }
        if (!((input3.length() > 0) && (isValidEmailAddress(input3)))) {
            EmailError.setText("Your email was entered incorrectly.");
            account_accepted = false;
        }
        if (!validatePhoneNumber(phoneNumber)) {
            PhoneError.setText("Your phone number was entered incorrectly.");
            account_accepted = false; 
        }
        
        if(account_accepted==true)
        {
            GUI.currentUserAccount = GUI.MasterTable.insertUserAccount(user, input3);
            if (GUI.currentUserAccount != null)
            {
                GUI.currentUserAccount.setFirstName(name1);
                GUI.currentUserAccount.setLastName(name2);
                GUI.currentUserAccount.setUserName(user);
                GUI.currentUserAccount.setPassword(pass1);
                GUI.currentUserAccount.setEmail(input3);
                GUI.currentUserAccount.setPhone(phoneNumber);
                System.out.println("You have successfully created your user account!");
                JOptionPane.showMessageDialog(null, "You have successfully created your user account!", "Success!",
                        JOptionPane.INFORMATION_MESSAGE);

                // Clear all text fields
                phone.setText("");
                email.setText("");
                confirmPassword.setText("");
                password.setText("");
                username.setText("");
                lastName.setText("");
                firstName.setText("");

                CardLayout layout = (CardLayout) (MainPanel.getLayout());
                //send the layout of MainPanel to new display of JPanel "MainMenu"
                layout.show(MainPanel, "Login");
            }
            else
                JOptionPane.showMessageDialog(null, "ERROR! An account with that User Name or Email already exists.", "ERROR", JOptionPane.ERROR_MESSAGE);

            //ANY TIME THERE's DATA CHANGING (viewing information doesn't count as changing) EXPORT!
             /*
             ImportExport dataout = new ImportExport();
             if (dataout.exportDB(GUI.MasterTable))
             {
             System.out.println("\nExported file to local source file"
             + " THROUGH CREATE ACCOUNT GUI\n");

             }
             else
             {
             System.err.println("\n\nCould not export THROUGH CREATE ACCOUNT GUI, ERROR\n\n");
             }

             }*/
        }
    }//GEN-LAST:event_createUserAccountActionPerformed

    private void firstNameFocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_firstNameFocusGained
    {//GEN-HEADEREND:event_firstNameFocusGained
        firstName.setText("");
    }//GEN-LAST:event_firstNameFocusGained

    private void lastNameFocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_lastNameFocusGained
    {//GEN-HEADEREND:event_lastNameFocusGained
        lastName.setText("");
    }//GEN-LAST:event_lastNameFocusGained

    private void usernameFocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_usernameFocusGained
    {//GEN-HEADEREND:event_usernameFocusGained
        username.setText("");
    }//GEN-LAST:event_usernameFocusGained

    private void passwordFocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_passwordFocusGained
    {//GEN-HEADEREND:event_passwordFocusGained
        password.setText("");
    }//GEN-LAST:event_passwordFocusGained

    private void confirmPasswordFocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_confirmPasswordFocusGained
    {//GEN-HEADEREND:event_confirmPasswordFocusGained
        confirmPassword.setText("");
    }//GEN-LAST:event_confirmPasswordFocusGained

    private void emailFocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_emailFocusGained
    {//GEN-HEADEREND:event_emailFocusGained
        email.setText("");
    }//GEN-LAST:event_emailFocusGained

    private void phoneFocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_phoneFocusGained
    {//GEN-HEADEREND:event_phoneFocusGained
        phone.setText("");
    }//GEN-LAST:event_phoneFocusGained

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_BackButtonActionPerformed
    {//GEN-HEADEREND:event_BackButtonActionPerformed
        clearfields();
        clearerrors();
        CardLayout layout = (CardLayout) (MainPanel.getLayout());
        layout.show(MainPanel, "Login");
    }//GEN-LAST:event_BackButtonActionPerformed

    public static boolean validatePhoneNumber(String phoneNo)
    {
        //validate phone numbers of format "1234567890"
        if (phoneNo.matches("\\d{10}"))
            return true;

        //validating phone number with -, . or spaces
        else if (phoneNo.matches("\\d{3}[-\\.\\s]\\d{3}[-\\.\\s]\\d{4}"))
            return true;

        //validating phone number with extension length from 3 to 5
        else if (phoneNo.matches("\\d{3}-\\d{3}-\\d{4}\\s(x|(ext))\\d{3,5}"))
            return true;

        //validating phone number where area code is in braces ()
        else if (phoneNo.matches("\\(\\d{3}\\)-\\d{3}-\\d{4}"))
            return true;

        //return false if nothing matches the input
        else
            return false;
    }

    public static boolean isValidEmailAddress(String email)
    {
        String ePattern = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
        java.util.regex.Pattern p = java.util.regex.Pattern.compile(ePattern);
        java.util.regex.Matcher m = p.matcher(email);
        return m.matches();
    }

    public static boolean validateFirstName(String firstName)
    {
        return firstName.matches("[a-zA-z]+([ '-][a-zA-Z]+)*");
    } // end method validateFirstName

    // validate last name
    public static boolean validateLastName(String lastName)
    {
        return lastName.matches("[a-zA-z]+([ '-][a-zA-Z]+)*");
    } // end method validateLastName

    public static boolean validate(final String username)
    {
        String USERNAME_PATTERN = "^[a-z0-9_-]{3,20}$";
        Pattern pattern = Pattern.compile(USERNAME_PATTERN);
        Matcher matcher = pattern.matcher(username);
        return matcher.matches();
    }

    public static boolean validatePassword(final String username)
    {
        String passwd = "aaZZa44@";
        String pattern = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{5,10}";
        return passwd.matches(pattern);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JLabel Background;
    private javax.swing.JLabel Bank42;
    private javax.swing.JLabel ConfirmPasswordError;
    private javax.swing.JLabel EmailError;
    private javax.swing.JLabel FirstNameError;
    private javax.swing.JPanel HeaderPanel;
    private javax.swing.JLabel LastNameError;
    private javax.swing.JLabel PasswordError;
    private javax.swing.JLabel PhoneError;
    private javax.swing.JLabel UsernameError;
    private javax.swing.JPasswordField confirmPassword;
    private javax.swing.JButton createUserAccount;
    private javax.swing.JTextField email;
    private javax.swing.JLabel errorMessage;
    private javax.swing.JLabel fillerlabellol;
    private javax.swing.JTextField firstName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTextField lastName;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField phone;
    private javax.swing.JLabel spacinglabellol;
    private javax.swing.JLabel spacinglabellol1;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
