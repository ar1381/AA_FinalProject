import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JScrollPane;


public class LeaderBoard extends javax.swing.JFrame implements MouseListener {


    public LeaderBoard() {
        initComponents();
        
        new LeaderBoardWriterF(jTextArea1);
        this.setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")

    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(750, 468));
        setSize(new java.awt.Dimension(750, 468));
        getContentPane().setLayout(null);

        jTextArea1.setBackground(new java.awt.Color(204, 204, 204));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextArea1.setEditable(false);
        jScrollPane2.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(50, 90, 660, 290);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(158, 49, 104, 25);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("Leader Board");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(250, 30, 250, 48);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 0));
        getContentPane().add(jLabel4);
        jLabel4.setBounds(390, 50, 340, 25);
        
        back = new JLabel("back");
        back.setBounds(20 , 20 , 80 , 40);
        back.setFont(new Font("MV Boli" , Font.PLAIN, 20));
        back.setForeground(Color.red);
        back.setFocusable(false);
        back.addMouseListener(this);
        getContentPane().add(back);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getClassLoader().getResource("Login-bg.jpg"))); // NOI18N
        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(-90, -490, 1030, 1260);
        setResizable(false);

        pack();
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
            java.util.logging.Logger.getLogger(LeaderBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LeaderBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LeaderBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LeaderBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LeaderBoard().setVisible(true);
            }
        });
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource() == back){
            command = 2;
        }       
    }


    @Override
    public void mousePressed(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }


    @Override
    public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }


    @Override
    public void mouseEntered(MouseEvent e) {
        if(e.getSource() == back){
            back.setForeground(Color.white);
        }
        
    }


    @Override
    public void mouseExited(MouseEvent e) {
        if(e.getSource() == back){
            back.setForeground(Color.red);
        }
        
    }
    public void setCommand(int n){
        command = n;
    }
    public int getCommand(){
        return command;
    }
    private javax.swing.JLabel jLabel2;
    private JLabel   back;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private int command = -1;

}
