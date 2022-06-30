import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.net.URL;

public class Market extends javax.swing.JFrame {

    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    
    public static void main(String[] args) {
        new Market();
    }
    public Market() {
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Market");
        setBackground(new Color(0, 64, 255));
        setPreferredSize(new Dimension(800, 600));
        setResizable(false);

        jPanel1 = new JPanel();
        jButton1 = new JButton();
        jButton2 = new JButton();
        jButton3 = new JButton();
        jButton4 = new JButton();
        jButton5 = new JButton();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        jLabel4 = new JLabel();
        jLabel6 = new JLabel();
        jLabel7 = new JLabel();
        jLabel8 = new JLabel();
        jLabel9 = new JLabel();
        jLabel10 = new JLabel();
        jLabel11 = new JLabel();
        jLabel12 = new JLabel();
        jLabel13 = new JLabel();
        jLabel1 = new JLabel();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(800, 600));
    
        URL url = getClass().getResource("yellow.jpg");
        jButton1.setIcon(new ImageIcon(new File(url.getPath()).getAbsolutePath()));
        jButton1.setCursor(new Cursor(Cursor.HAND_CURSOR));
    
        URL url2 = getClass().getResource("green.jpg");
        jButton2.setIcon(new ImageIcon(new File(url2.getPath()).getAbsolutePath()));
        jButton2.setCursor(new Cursor(Cursor.HAND_CURSOR));
    
        URL url3 = getClass().getResource("white.jpg");
        jButton3.setIcon(new ImageIcon(new File(url3.getPath()).getAbsolutePath()));
        jButton3.setCursor(new Cursor(Cursor.HAND_CURSOR));
    
        URL url4 = getClass().getResource("red.jpg");
        jButton4.setIcon(new ImageIcon(new File(url4.getPath()).getAbsolutePath()));
        jButton4.setCursor(new Cursor(Cursor.HAND_CURSOR));
    
        URL url5 = getClass().getResource("purple.jpg");
        jButton5.setIcon(new ImageIcon(new File(url5.getPath()).getAbsolutePath()));
        jButton5.setCursor(new Cursor(Cursor.HAND_CURSOR));

        jLabel2.setForeground(new Color(255, 255, 255));
        jLabel2.setFont(new Font("Segoe Script", 1, 60));
        jLabel2.setText("Market");

        jLabel3.setFont(new Font("Trebuchet MS", 1, 36));
        jLabel3.setForeground(new Color(0, 255, 0));
        jLabel3.setText("Green");

        jLabel4.setFont(new Font("Segoe UI", 0, 24));
        jLabel4.setForeground(new Color(255, 255, 255));
        jLabel4.setText("100$");

        jLabel6.setFont(new Font("Segoe UI", 0, 24));
        jLabel6.setForeground(new Color(255, 255, 255));
        jLabel6.setText("100$");

        jLabel7.setFont(new Font("Trebuchet MS", 1, 36));
        jLabel7.setForeground(new Color(255, 204, 0));
        jLabel7.setText("Yellow");

        jLabel8.setFont(new Font("Trebuchet MS", 1, 36)); // NOI18N
        jLabel8.setForeground(new Color(255, 0, 0));
        jLabel8.setText("Red");

        jLabel9.setFont(new Font("Trebuchet MS", 1, 36)); // NOI18N
        jLabel9.setForeground(new Color(255, 255, 255));
        jLabel9.setText("White");

        jLabel10.setFont(new Font("Trebuchet MS", 1, 36)); // NOI18N
        jLabel10.setForeground(new Color(102, 0, 255));
        jLabel10.setText("Purple");

        jLabel11.setFont(new Font("Segoe UI", 0, 24));
        jLabel11.setForeground(new Color(255, 255, 255)); // NOI18N
        jLabel11.setText("100$");

        jLabel12.setFont(new Font("Segoe UI", 0, 24));
        jLabel12.setForeground(new Color(255, 255, 255));// NOI18N
        jLabel12.setText("100$");

        jLabel13.setFont(new Font("Segoe UI", 0, 24));
        jLabel13.setForeground(new Color(255, 255, 255)); // NOI18N
        jLabel13.setText("100$");

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(33, 33, 33)
                                                .addGroup(jPanel1Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(51, 51, 51)
                                                .addComponent(jLabel7))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(78, 78, 78)
                                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 58,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout
                                                .createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 150,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(86, 86, 86))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(43, 43, 43)
                                                                .addComponent(jLabel2))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(104, 104, 104)
                                                                .addComponent(jLabel10))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(130, 130, 130)
                                                                .addComponent(jLabel13,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 58,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51,
                                                        Short.MAX_VALUE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING,
                                                javax.swing.GroupLayout.PREFERRED_SIZE, 150,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                jPanel1Layout.createSequentialGroup()
                                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(14, 14, 14))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                jPanel1Layout.createSequentialGroup()
                                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(39, 39, 39))
                                        .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING,
                                                javax.swing.GroupLayout.PREFERRED_SIZE, 150,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(47, 47, 47))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 58,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                jPanel1Layout.createSequentialGroup()
                                                        .addComponent(jLabel9)
                                                        .addGap(69, 69, 69))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                jPanel1Layout.createSequentialGroup()
                                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(86, 86, 86)))));
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(22, 22, 22)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jButton1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                150,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jButton2,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                150,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(jLabel2,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 56,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                                                false)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(jLabel3,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 27,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jLabel4)
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        Short.MAX_VALUE)
                                                                .addComponent(jButton3,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 150,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(jLabel7,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 27,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jLabel6)
                                                                .addGap(61, 61, 61)
                                                                .addComponent(jButton4,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 150,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(3, 3, 3))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout
                                                .createSequentialGroup()
                                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 150,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel10)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel13)
                                                .addGap(104, 104, 104)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel11)
                                        .addComponent(jLabel12))
                                .addContainerGap()));
    
        URL url6 = getClass().getResource("market-bg.jpg");
        jLabel1.setIcon(new javax.swing.ImageIcon(new File(url6.getPath()).getAbsolutePath()));
        jPanel1.setBackground(new Color(0, 0, 0, 90));
        jLabel1.setLayout(new FlowLayout());
        jLabel1.add(jPanel1);

        add(jLabel1);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

}
