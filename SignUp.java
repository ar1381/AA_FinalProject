
import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class SignUp extends javax.swing.JFrame {
    
    public SignUp() {
        initComponents();
        this.getContentPane().setBackground(new Color(51,51,51));
        this.setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")

    private void initComponents() {

        labelSignUpuserName = new javax.swing.JLabel();
        signUpuserName = new javax.swing.JTextField();
        labelSignUpPassword = new javax.swing.JLabel();
        signUpPassword = new javax.swing.JPasswordField();
        labelSignUpConfirmPass = new javax.swing.JLabel();
        signUpConfirmPass = new javax.swing.JPasswordField();
        signUpbuttonSignUp = new javax.swing.JButton();
        buttonCancel = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(55, 55, 55));
        setMaximumSize(new java.awt.Dimension(750, 468));
        setMinimumSize(new java.awt.Dimension(750, 468));
        setPreferredSize(new java.awt.Dimension(750, 468));
        setResizable(false);
        setSize(new java.awt.Dimension(750, 468));
        getContentPane().setLayout(null);

        labelSignUpuserName.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        labelSignUpuserName.setForeground(new java.awt.Color(255, 255, 255));
        labelSignUpuserName.setText("User Name :");
        getContentPane().add(labelSignUpuserName);
        labelSignUpuserName.setBounds(200, 150, 64, 16);
        getContentPane().add(signUpuserName);
        signUpuserName.setBounds(290, 150, 217, 22);

        labelSignUpPassword.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        labelSignUpPassword.setForeground(new java.awt.Color(255, 255, 255));
        labelSignUpPassword.setText("Password :");
        getContentPane().add(labelSignUpPassword);
        labelSignUpPassword.setBounds(200, 190, 64, 16);

        signUpPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpPasswordActionPerformed(evt);
            }
        });
        getContentPane().add(signUpPassword);
        signUpPassword.setBounds(290, 230, 217, 22);

        labelSignUpConfirmPass.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        labelSignUpConfirmPass.setForeground(new java.awt.Color(255, 255, 255));
        labelSignUpConfirmPass.setText("Confirm Pass :");
        getContentPane().add(labelSignUpConfirmPass);
        labelSignUpConfirmPass.setBounds(190, 230, 75, 16);
        getContentPane().add(signUpConfirmPass);
        signUpConfirmPass.setBounds(290, 190, 217, 22);

        signUpbuttonSignUp.setBackground(new java.awt.Color(0, 204, 51));
        signUpbuttonSignUp.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        signUpbuttonSignUp.setText("Sign Up");
        signUpbuttonSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpbuttonSignUpActionPerformed(evt);
            }
        });
        getContentPane().add(signUpbuttonSignUp);
        signUpbuttonSignUp.setBounds(290, 280, 90, 34);

        buttonCancel.setBackground(new java.awt.Color(255, 0, 51));
        buttonCancel.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        buttonCancel.setText("Cancel");
        buttonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelActionPerformed(evt);
            }
        });
        getContentPane().add(buttonCancel);
        buttonCancel.setBounds(413, 280, 90, 34);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("sign up");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(300, 30, 290, 50);
    
        URL url = getClass().getResource("img.png");
        jLabel2.setIcon(new javax.swing.ImageIcon(new File(url.getPath()).getAbsolutePath())); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(-10, 0, 750, 430);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void signUpPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUpPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_signUpPasswordActionPerformed

    private void signUpbuttonSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUpbuttonSignUpActionPerformed
        String user11=signUpuserName.getText();
        String pass=String.copyValueOf(signUpPassword.getPassword());
        String passc=String.copyValueOf(signUpConfirmPass.getPassword());
        boolean checkContains=false;
        if(evt.getSource()==signUpbuttonSignUp){
            if(!user11.equals("") && !pass.equals("") && !passc.equals("")){

                if(pass.equals(passc)){
    
                    URL url = getClass().getResource("userPass.txt");
                    File userPass1 = new File(new File(url.getPath()).getAbsolutePath());
                    try {
                        Scanner myReader = new Scanner(userPass1);
                        while (myReader.hasNextLine()){
                            String data = myReader.nextLine();
                            if(data.substring(0,data.indexOf(':')).equals(user11)){
                                checkContains=true;
                            }

                        }

                    } catch (FileNotFoundException e) {
                        JOptionPane.showMessageDialog(null,"nadari file");
                    }


                    if (checkContains==false){
                        User obj=new User(user11,pass);
                        JOptionPane.showMessageDialog(rootPane, "Your account was created successfully");
                        this.dispose();
                    }else{
                        JOptionPane.showMessageDialog(rootPane, "This username already exists");
                    }
                    
                }else{
                    JOptionPane.showMessageDialog(rootPane,"Passwords are not equal");
                }
                
            }else{
                JOptionPane.showMessageDialog(rootPane, "Feilds shoud not be empty","Error", JOptionPane.ERROR_MESSAGE);
            }
            
        }
    }

    private void buttonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelActionPerformed
        
        this.dispose();
        
    }


    public static void main(String args[]) {



        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUp().setVisible(true);
            }
        });
    }


    private javax.swing.JButton buttonCancel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel labelSignUpConfirmPass;
    private javax.swing.JLabel labelSignUpPassword;
    private javax.swing.JLabel labelSignUpuserName;
    private javax.swing.JPasswordField signUpConfirmPass;
    private javax.swing.JPasswordField signUpPassword;
    private javax.swing.JButton signUpbuttonSignUp;
    private javax.swing.JTextField signUpuserName;

}
