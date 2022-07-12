import java.awt.Color;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class LogIn extends javax.swing.JFrame {
	// az inga  on system match ke khastebody shoromishe 
	private int command =-1;
	public int getCommand() {
		return command; 
	}
	public void setCommand(int n) {
		command=n;
	}
    public String getUserName(){
        return user22;
    }
	
	/* vali in zamani kar mikone ke barname login baste nabashe
	vali age lagin baste beshe on moghe dige command hammon -1 mishe
	*/
      
    public LogIn() {
        initComponents();
        this.getContentPane().setBackground(new Color(51,51,51));
        this.setLocationRelativeTo(null);
    }


    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        loginUserName = new javax.swing.JTextField();
        labelLoginUserName = new javax.swing.JLabel();
        labelLoginPassword = new javax.swing.JLabel();
        buttonLogin = new javax.swing.JButton();
        buttonSignUp = new javax.swing.JButton();
        loginPassword = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sign In");
        setBackground(new java.awt.Color(51, 51, 51));
        setForeground(new java.awt.Color(51, 255, 255));
        setMaximumSize(new java.awt.Dimension(750, 468));
        setMinimumSize(new java.awt.Dimension(750, 468));
        setName("Login"); // NOI18N
        setPreferredSize(new java.awt.Dimension(750, 468));
        setResizable(false);
        setSize(new java.awt.Dimension(750, 468));
        getContentPane().setLayout(null);
        getContentPane().add(loginUserName);
        loginUserName.setBounds(280, 190, 240, 22);

        labelLoginUserName.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        labelLoginUserName.setForeground(new java.awt.Color(255, 255, 255));
        labelLoginUserName.setText("User Name");
        getContentPane().add(labelLoginUserName);
        labelLoginUserName.setBounds(210, 190, 72, 16);

        labelLoginPassword.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        labelLoginPassword.setForeground(new java.awt.Color(255, 255, 255));
        labelLoginPassword.setText("Password");
        getContentPane().add(labelLoginPassword);
        labelLoginPassword.setBounds(210, 230, 61, 16);

        buttonLogin.setBackground(new java.awt.Color(0, 204, 51));
        buttonLogin.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        buttonLogin.setText("Login");
        buttonLogin.setFocusable(false);
        buttonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLoginActionPerformed(evt);
            }
        });
        getContentPane().add(buttonLogin);
        buttonLogin.setBounds(290, 280, 78, 33);

        buttonSignUp.setBackground(new java.awt.Color(255, 0, 51));
        buttonSignUp.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        buttonSignUp.setText("Sign Up");
        buttonSignUp.setFocusPainted(false);
        buttonSignUp.setFocusable(false);
        buttonSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSignUpActionPerformed(evt);
            }
        });
        getContentPane().add(buttonSignUp);
        buttonSignUp.setBounds(390, 280, 81, 33);
        getContentPane().add(loginPassword);
        loginPassword.setBounds(280, 230, 240, 22);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Login");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(300, 30, 320, 70);
//		"Login-bg.jpg" in aks mored pasand bache hA asht
        //"img.png" in mad nazar ma hast
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getClassLoader().getResource("Login-bg.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 910, 450);

        pack();
    }

    private void buttonSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSignUpActionPerformed
        if(evt.getSource()==buttonSignUp){
            SignUp signUp1=new SignUp();
            signUp1.setVisible(true);
            
           
            
        }
           
    }

    private void buttonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLoginActionPerformed
        if(evt.getSource()==buttonLogin){
            user22=loginUserName.getText();
            String pass22=String.copyValueOf(loginPassword.getPassword());
            boolean checkUser=false;
            boolean checkPass=false;
            File userPass1 = new File("userPass.txt");
            try {
                Scanner myReader = new Scanner(userPass1);
                while (myReader.hasNextLine()){
                    String data = myReader.nextLine();
                    if(data.substring(0,data.indexOf(':')).equals(user22)){
                        checkUser=true;
                        if (data.substring(data.indexOf(':')+1,data.length()).equals(pass22)){
                            checkPass=true;
                            JOptionPane.showMessageDialog(rootPane,"You are in");
                            // in ham az dastorat
                            
                            try{
                                BufferedWriter passWriter=new BufferedWriter(new FileWriter("witchUserIsInTheGame.txt"));
                                passWriter.write(user22+":"+pass22);
                                passWriter.close();
                                

                            }catch(IOException e){
                                JOptionPane.showMessageDialog(null,"file doesn't exist");

                            }
                          //inja baiad kod hatono mizadid 
                            command = 1;
                            //JOptionPane.showMessageDialog(rootPane,"command ="+String.valueOf(command) ,"Error",JOptionPane.ERROR_MESSAGE);
                            
                        }
                    }

                }
                myReader.close();

            } catch (FileNotFoundException e) {
                JOptionPane.showMessageDialog(null,"file not exist");
            }

            if(checkUser==false || checkPass==false){
                
                JOptionPane.showMessageDialog(rootPane, "User name or password is wrong","Error",JOptionPane.ERROR_MESSAGE);
            }

            
        }
    }

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogIn().setVisible(true);
            }
        });
    }


    private javax.swing.JButton buttonLogin;
    private javax.swing.JButton buttonSignUp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JLabel labelLoginPassword;
    private javax.swing.JLabel labelLoginUserName;
    private javax.swing.JPasswordField loginPassword;
    private javax.swing.JTextField loginUserName;
    private String user22;

}
