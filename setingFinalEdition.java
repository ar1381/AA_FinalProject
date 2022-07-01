
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
/*
 
public class setingFinalEdition extends javax.swing.JFrame {
    String userg="";
    String Score="";
    
    public setingFinalEdition() {

        initComponents();
        
        this.setBounds(500,0,470,763);
        File userPass1 = new File("witchUserIsInTheGame.txt");
            try {
                Scanner myReader = new Scanner(userPass1);
                while (myReader.hasNextLine()){
                    String data = myReader.nextLine();
                    jLabel_userName.setText(data.substring(0, data.indexOf(":")));
                     userg = data.substring(0, data.indexOf(":"));
                }
            }
            catch(IOException e){
                                JOptionPane.showMessageDialog(null,"file doesn't exist");

            }
            File userPass2 = new File("userScore.txt");
            try {
                Scanner myReader = new Scanner(userPass2);
                while (myReader.hasNextLine()){
                    String data2 = myReader.nextLine();
                    
                    if (userg.equals(data2.substring(0, data2.indexOf(":")) )){
                        Score = data2.substring(1+data2.indexOf(":"),data2.length());
                        
                        
                        
                        jLabel_Score.setText(Score);
                    }
                }
            }
            catch(IOException e){
                                JOptionPane.showMessageDialog(null,"file doesn't exist");

            }    
    }

    
    @SuppressWarnings("unchecked")
    
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel_userName = new javax.swing.JLabel();
        jLabel_Score = new javax.swing.JLabel();
        jButton_Back = new javax.swing.JButton();
        jTextField1_usserName = new javax.swing.JTextField();
        jTextField2_oldPassword = new javax.swing.JTextField();
        jTextField3_newPassword = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1_changePassword = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton1_chaetBottom = new javax.swing.JButton();
        jTextField1_cheatCode = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("UserName:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(12, 13, 90, 16);

        jLabel2.setText("Score:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(12, 45, 70, 16);

        jLabel_userName.setText("arma");
        getContentPane().add(jLabel_userName);
        jLabel_userName.setBounds(107, 13, 76, 16);

        jLabel_Score.setText("1000");
        getContentPane().add(jLabel_Score);
        jLabel_Score.setBounds(107, 45, 76, 16);

        jButton_Back.setText("Back");
        jButton_Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_BackActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Back);
        jButton_Back.setBounds(394, 13, 57, 25);
        getContentPane().add(jTextField1_usserName);
        jTextField1_usserName.setBounds(190, 125, 177, 31);
        getContentPane().add(jTextField2_oldPassword);
        jTextField2_oldPassword.setBounds(190, 169, 177, 31);
        getContentPane().add(jTextField3_newPassword);
        jTextField3_newPassword.setBounds(190, 218, 177, 33);

        jLabel3.setText("UserName:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(48, 132, 110, 16);

        jLabel4.setText("Old Password:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(48, 176, 120, 16);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 153));
        jLabel5.setText("New Pssword:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(48, 226, 120, 20);

        jButton1_changePassword.setText("change password");
        jButton1_changePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_changePasswordActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1_changePassword);
        jButton1_changePassword.setBounds(190, 269, 177, 25);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); 
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("If you know so you know");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(150, 340, 270, 25);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); 
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Cheat Code:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(48, 379, 120, 30);

        jButton1_chaetBottom.setText("Cheat");
        jButton1_chaetBottom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_chaetBottomActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1_chaetBottom);
        jButton1_chaetBottom.setBounds(190, 425, 177, 36);

        jTextField1_cheatCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1_cheatCodeActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1_cheatCode);
        jTextField1_cheatCode.setBounds(190, 374, 177, 33);

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\MALEKI\\Desktop\\aa project (maleki,eyni)\\gta.jpg")); 
        getContentPane().add(jLabel7);
        jLabel7.setBounds(-3, -87, 470, 930);

        pack();
    }

    private void jButton_BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_BackActionPerformed
        // TODO add your handling code here:
        if(evt.getSource()==jButton_Back){
            this.setVisible(false);
            
        }
    }//GEN-LAST:event_jButton_BackActionPerformed

    private void jButton1_changePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_changePasswordActionPerformed
        // TODO add your handling code here:
        if(evt.getSource()==jButton1_changePassword){
            //String stUser = jTextField1_usserName.getText();
            String username = jTextField1_usserName.getText();
            String oldpassword = jTextField2_oldPassword.getText();
            String newPassword = jTextField3_newPassword.getText();
            try{
                             //Instantiating the File class
      String filePath = "userPass.txt";
      //Instantiating the Scanner class to read the file
      Scanner sc = new Scanner(new File(filePath));
      //instantiating the StringBuffer class
      StringBuffer buffer = new StringBuffer();
      //Reading lines of the file and appending them to StringBuffer
      while (sc.hasNextLine()) {
         buffer.append(sc.nextLine()+System.lineSeparator());
      }
      String fileContents = buffer.toString();
      //System.out.println("Contents of the file: "+fileContents);
      //closing the Scanner object
      sc.close();
      String oldLine =username+":"+oldpassword ;
      String newLine = username+":"+newPassword;
      //Replacing the old line with new line
      fileContents = fileContents.replaceAll(oldLine, newLine);
      //instantiating the FileWriter class
      FileWriter writer = new FileWriter(filePath);
      //System.out.println("");
      //System.out.println("new data: "+fileContents);
      writer.append(fileContents);
      writer.flush();
      JOptionPane.showMessageDialog(rootPane, "pass changed successfully");
            }catch(IOException e){
                JOptionPane.showMessageDialog(rootPane, "change pass error");
            }
        }
    }//GEN-LAST:event_jButton1_changePasswordActionPerformed

    private void jTextField1_cheatCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1_cheatCodeActionPerformed
        
        
    }//GEN-LAST:event_jTextField1_cheatCodeActionPerformed

    private void jButton1_chaetBottomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_chaetBottomActionPerformed
        
        if(evt.getSource()==jButton1_chaetBottom){
            if (jTextField1_cheatCode.getText().equals("hesoyam")||jTextField1_cheatCode.getText().equals("HESOYAM") ){
                try{
                    String filePath = "userScore.txt";
      Scanner sc = new Scanner(new File(filePath));
      StringBuffer buffer = new StringBuffer();
      while (sc.hasNextLine()) {
         buffer.append(sc.nextLine()+System.lineSeparator());
      }
      String userg="";
    String Score="";
      String fileContents = buffer.toString();
      sc.close();
      String oldLine =userg+":"+Score ;
      String newLine = userg+":"+"1000000000";
      fileContents = fileContents.replaceAll(oldLine, newLine);
      FileWriter writer = new FileWriter(filePath);
      writer.append(fileContents);
      writer.flush();
      JOptionPane.showMessageDialog(rootPane, "cheat applied  successfully , enjoy ");
                }catch(IOException e){
                    JOptionPane.showMessageDialog(rootPane, "cheat  error");
                }
            }else{
                JOptionPane.showMessageDialog(rootPane, "code is wrong , ha ha ha you are not one of us");
            }
        }
    }
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(setingFinalEdition.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(setingFinalEdition.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(setingFinalEdition.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(setingFinalEdition.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new setingFinalEdition().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1_chaetBottom;
    private javax.swing.JButton jButton1_changePassword;
    private javax.swing.JButton jButton_Back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel_Score;
    private javax.swing.JLabel jLabel_userName;
    private javax.swing.JTextField jTextField1_cheatCode;
    private javax.swing.JTextField jTextField1_usserName;
    private javax.swing.JTextField jTextField2_oldPassword;
    private javax.swing.JTextField jTextField3_newPassword;
    // End of variables declaration//GEN-END:variables
}
