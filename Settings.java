import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.net.URL;

public class Settings extends JFrame implements ActionListener, MouseListener {
    private javax.swing.JButton backbtn;
    private javax.swing.JButton usernamebtn;
    private javax.swing.JButton passbtn;
    private javax.swing.JButton activatebtn;
    private javax.swing.JLabel bglbl;
    private javax.swing.JLabel cheatlbl;
    private javax.swing.JLabel hintlbl;
    private javax.swing.JLabel usernamelbl;
    private javax.swing.JLabel scorelbl;
    private javax.swing.JLabel usernamelbl2;
    private javax.swing.JLabel scorelbl2;
    private javax.swing.JLabel settingslbl;
    private javax.swing.JLabel newUsernamelbl;
    private javax.swing.JLabel oldpasslbl;
    private javax.swing.JLabel newpasslbl;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField usernameField;
    private javax.swing.JTextField oldPassField;
    private javax.swing.JTextField newPassField;
    private javax.swing.JTextField cheatField;

    public Settings() {
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Settings");
        setBackground(new Color(0, 64, 255));
        setPreferredSize(new Dimension(800, 700));
        setResizable(false);

        jPanel1 = new javax.swing.JPanel();
        usernamelbl = new javax.swing.JLabel();
        scorelbl = new javax.swing.JLabel();
        usernamelbl2 = new javax.swing.JLabel();
        scorelbl2 = new javax.swing.JLabel();
        settingslbl = new javax.swing.JLabel();
        backbtn = new javax.swing.JButton();
        newUsernamelbl = new javax.swing.JLabel();
        oldpasslbl = new javax.swing.JLabel();
        newpasslbl = new javax.swing.JLabel();
        cheatlbl = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        oldPassField = new javax.swing.JTextField();
        newPassField = new javax.swing.JTextField();
        cheatField = new javax.swing.JTextField();
        usernamebtn = new javax.swing.JButton();
        passbtn = new javax.swing.JButton();
        activatebtn = new javax.swing.JButton();
        hintlbl = new javax.swing.JLabel();

        usernamelbl.setForeground(new Color(255, 153, 0));
        usernamelbl.setFont(new java.awt.Font("Ink Free", 1, 18));
        usernamelbl.setText("username :");

        scorelbl.setForeground(new Color(255, 153, 0));
        scorelbl.setFont(new java.awt.Font("Ink Free", 1, 18));
        scorelbl.setText("Score :");

        usernamelbl2.setForeground(new Color(255, 255, 255));
        usernamelbl2.setFont(new java.awt.Font("Segoe UI", 1, 12));
        usernamelbl2.setText("dssdd");

        scorelbl2.setForeground(new Color(255, 255, 255));
        scorelbl2.setFont(new java.awt.Font("Segoe UI", 1, 12));
        scorelbl2.setText("dssdd");

        settingslbl.setForeground(new Color(255, 153, 0));
        settingslbl.setFont(new java.awt.Font("Segoe Script", 1, 36));
        settingslbl.setText("Settings");

        newUsernamelbl.setForeground(new Color(255, 255, 255));
        newUsernamelbl.setFont(new java.awt.Font("Segoe Print", 1, 18));
        newUsernamelbl.setText("New Username :");

        oldpasslbl.setForeground(new Color(255, 255, 255));
        oldpasslbl.setFont(new java.awt.Font("Segoe Print", 1, 18));
        oldpasslbl.setText("Old password :");

        newpasslbl.setForeground(new Color(255, 255, 255));
        newpasslbl.setFont(new java.awt.Font("Segoe Print", 1, 18));
        newpasslbl.setText("New password :");

        cheatlbl.setForeground(new Color(255, 255, 255));
        cheatlbl.setFont(new java.awt.Font("Segoe Print", 1, 18));
        cheatlbl.setText("Cheat Code :");

        hintlbl.setForeground(new Color(10, 255, 10));
        hintlbl.setText("Only OG's know about it ( HINT: gta max health && money )");

        usernameField.setBackground(new Color(0, 18, 7));
        usernameField.setForeground(new Color(255, 255, 255));

        oldPassField.setBackground(new Color(0, 18, 7));
        oldPassField.setForeground(new Color(255, 255, 255));

        newPassField.setBackground(new Color(0, 18, 7));
        newPassField.setForeground(new Color(255, 255, 255));

        cheatField.setBackground(new Color(0, 18, 7));
        cheatField.setForeground(new Color(255, 255, 255));

        backbtn.setBackground(new Color(11, 168, 156));
        backbtn.setFont(new Font("Ink Free", 1, 16));
        backbtn.setForeground(new Color(255, 255, 255));
        backbtn.setText("Back");
        backbtn.setFocusable(false);
        backbtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        backbtn.addActionListener(this);
        backbtn.addMouseListener(this);

        usernamebtn.setBackground(new Color(11, 168, 156));
        usernamebtn.setFont(new Font("Ink Free", 1, 16));
        usernamebtn.setForeground(new Color(255, 255, 255));
        usernamebtn.setText("Change Username");
        usernamebtn.setFocusable(false);
        usernamebtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        usernamebtn.addActionListener(this);
        usernamebtn.addMouseListener(this);

        passbtn.setBackground(new Color(11, 168, 156));
        passbtn.setFont(new Font("Ink Free", 1, 16));
        passbtn.setForeground(new Color(255, 255, 255));
        passbtn.setText("Change Username");
        passbtn.setFocusable(false);
        passbtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        passbtn.setText("Change Password");
        passbtn.addActionListener(this);
        passbtn.addMouseListener(this);

        activatebtn.setBackground(new Color(11, 168, 156));
        activatebtn.setFont(new Font("Ink Free", 1, 16));
        activatebtn.setForeground(new Color(255, 255, 255));
        activatebtn.setText("Change Username");
        activatebtn.setFocusable(false);
        activatebtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        activatebtn.setText("Change Password");
        activatebtn.setText("Activate");
        activatebtn.addActionListener(this);
        activatebtn.addMouseListener(this);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                                jPanel1Layout.createSequentialGroup()
                                                        .addGap(207, 207, 207)
                                                        .addComponent(hintlbl))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(175, 175, 175)
                                                .addGroup(jPanel1Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                                                false)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(cheatlbl)
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        Short.MAX_VALUE)
                                                                .addComponent(cheatField,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 190,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(jPanel1Layout
                                                                .createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.TRAILING,
                                                                        false)
                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                .addComponent(oldpasslbl)
                                                                                .addPreferredGap(
                                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                        Short.MAX_VALUE)
                                                                                .addComponent(oldPassField,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                        190,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                .addComponent(newUsernamelbl)
                                                                                .addGap(65, 65, 65)
                                                                                .addComponent(usernameField,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                        190,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                        .addComponent(newpasslbl)
                                                                        .addGap(78, 78, 78)
                                                                        .addComponent(newPassField,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                190,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                .addGap(23, 23, 23)))
                                .addGap(0, 119, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(usernamelbl)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(usernamelbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 181,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(backbtn))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout
                                                .createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addGroup(jPanel1Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                jPanel1Layout.createSequentialGroup()
                                                                        .addComponent(usernamebtn,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                170,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGap(276, 276, 276))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                jPanel1Layout.createSequentialGroup()
                                                                        .addComponent(passbtn,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                170,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGap(274, 274, 274))))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(scorelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 61,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(scorelbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 181,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(39, 39, 39)
                                                .addComponent(settingslbl, javax.swing.GroupLayout.PREFERRED_SIZE, 152,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        Short.MAX_VALUE))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(activatebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 170,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(272, 272, 272)));
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(backbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(42, 42, 42))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(15, 82, Short.MAX_VALUE)
                                                                .addComponent(settingslbl)
                                                                .addGap(18, 18, 18))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(29, 29, 29)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(usernamelbl)
                                                                        .addComponent(usernamelbl2,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                25,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(scorelbl,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                26,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(scorelbl2,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                22,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        Short.MAX_VALUE)))
                                                .addGroup(jPanel1Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(usernameField,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 33,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(newUsernamelbl))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(usernamebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(oldpasslbl)
                                        .addComponent(oldPassField, javax.swing.GroupLayout.PREFERRED_SIZE, 33,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(newPassField, javax.swing.GroupLayout.PREFERRED_SIZE, 31,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(newpasslbl))
                                .addGap(29, 29, 29)
                                .addComponent(passbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(54, 54, 54)
                                .addComponent(hintlbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(cheatlbl)
                                        .addComponent(cheatField, javax.swing.GroupLayout.PREFERRED_SIZE, 33,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(activatebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(68, 68, 68)));
        URL url = getClass().getResource("gta-bg.jpg");
        bglbl = new JLabel(new ImageIcon(new File(url.getPath()).getAbsolutePath()));

        jPanel1.setBackground(new Color(0, 0, 0, 95));
        bglbl.setLayout(new FlowLayout());
        bglbl.add(jPanel1);

        add(bglbl);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // TODO Auto-generated method stub

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
        if (e.getSource() == usernamebtn)
            usernamebtn.setBackground(new Color(255, 51, 0));
        if (e.getSource() == passbtn)
            passbtn.setBackground(new Color(255, 51, 0));
        if (e.getSource() == activatebtn)
            activatebtn.setBackground(new Color(255, 51, 0));
        if (e.getSource() == backbtn)
            backbtn.setBackground(new Color(255, 51, 0));

    }

    @Override
    public void mouseExited(MouseEvent e) {
        usernamebtn.setBackground(new Color(11, 168, 156));
        passbtn.setBackground(new Color(11, 168, 156));
        activatebtn.setBackground(new Color(11, 168, 156));
        backbtn.setBackground(new Color(11, 168, 156));

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub

    }

}
