import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.net.URL;

public class Settings extends JFrame implements ActionListener, MouseListener {
        private javax.swing.JButton backbtn;
        private javax.swing.JButton passbtn;
        private javax.swing.JButton activatebtn;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel cheatlbl;
        private javax.swing.JLabel hintlbl;
        private javax.swing.JLabel usernameToplbl;
        private javax.swing.JLabel scoreToplbl;
        private javax.swing.JLabel usernameToplbl2;
        private javax.swing.JLabel scoreToplbl2;
        private javax.swing.JLabel titlelbl;
        private javax.swing.JLabel oldPasslbl;
        private javax.swing.JLabel newPasslbl;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JTextField usernameField;
        private javax.swing.JTextField oldPassField;
        private javax.swing.JTextField newPassField;
        private javax.swing.JTextField activateField;
        private javax.swing.JLabel newUsernamelbl;
        private int command = -1;

        public Settings() {
                setLayout(new BorderLayout());
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                setTitle("Settings");
                setBackground(new Color(0, 64, 255));
                setPreferredSize(new Dimension(800, 700));
                setResizable(false);

                jPanel1 = new javax.swing.JPanel();
                usernameToplbl = new javax.swing.JLabel();
                scoreToplbl = new javax.swing.JLabel();
                usernameToplbl2 = new javax.swing.JLabel();
                scoreToplbl2 = new javax.swing.JLabel();
                titlelbl = new javax.swing.JLabel();
                backbtn = new javax.swing.JButton();
                oldPasslbl = new javax.swing.JLabel();
                newPasslbl = new javax.swing.JLabel();
                cheatlbl = new javax.swing.JLabel();
                oldPassField = new javax.swing.JTextField();
                newPassField = new javax.swing.JTextField();
                activateField = new javax.swing.JTextField();
                passbtn = new javax.swing.JButton();
                activatebtn = new javax.swing.JButton();
                hintlbl = new javax.swing.JLabel();
                newUsernamelbl = new javax.swing.JLabel();
                usernameField = new javax.swing.JTextField();
                jLabel1 = new javax.swing.JLabel();

                usernameToplbl.setFont(new java.awt.Font("Ink Free", 1, 18)); // NOI18N
                usernameToplbl.setForeground(new java.awt.Color(255, 153, 0));
                usernameToplbl.setText("username :");

                scoreToplbl.setFont(new java.awt.Font("Ink Free", 1, 18));
                scoreToplbl.setForeground(new java.awt.Color(255, 153, 0));// NOI18N
                scoreToplbl.setText("Score :");

                usernameToplbl2.setForeground(new java.awt.Color(255, 255, 255));
                usernameToplbl2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
                usernameToplbl2.setText("dssdd");

                scoreToplbl2.setForeground(new java.awt.Color(255, 255, 255));
                scoreToplbl2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
                scoreToplbl2.setText("dssdd");

                titlelbl.setForeground(new java.awt.Color(255, 153, 0));
                titlelbl.setFont(new java.awt.Font("Segoe Script", 1, 36)); // NOI18N
                titlelbl.setText("Settings");

                newUsernamelbl.setForeground(new java.awt.Color(255, 255, 255));
                newUsernamelbl.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
                newUsernamelbl.setText("Username :");

                oldPasslbl.setForeground(new java.awt.Color(255, 255, 255));
                oldPasslbl.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
                oldPasslbl.setText("Old password :");

                newPasslbl.setForeground(new java.awt.Color(255, 255, 255));
                newPasslbl.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
                newPasslbl.setText("New password :");

                cheatlbl.setForeground(new java.awt.Color(255, 255, 255));
                cheatlbl.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
                cheatlbl.setText("Cheat Code :");

                usernameField.setBackground(new java.awt.Color(0, 15, 18));
                usernameField.setForeground(new java.awt.Color(255, 255, 255));

                oldPassField.setBackground(new java.awt.Color(0, 15, 18));
                oldPassField.setForeground(new java.awt.Color(255, 255, 255));

                newPassField.setBackground(new java.awt.Color(0, 15, 18));
                newPassField.setForeground(new java.awt.Color(255, 255, 255));

                activateField.setBackground(new java.awt.Color(0, 15, 18));
                activateField.setForeground(new java.awt.Color(255, 255, 255));

                backbtn.setBackground(new Color(11, 168, 156));
                backbtn.setFont(new Font("Ink Free", 1, 16));
                backbtn.setForeground(new Color(255, 255, 255));
                backbtn.setText("Back");
                backbtn.setFocusable(false);
                backbtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
                backbtn.addMouseListener(this);
                backbtn.addActionListener(this);

                passbtn.setBackground(new Color(11, 168, 156));
                passbtn.setFont(new Font("Ink Free", 1, 16));
                passbtn.setForeground(new Color(255, 255, 255));
                passbtn.setText("Change Password");
                passbtn.setFocusable(false);
                passbtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
                passbtn.addMouseListener(this);
                passbtn.addActionListener(this);

                activatebtn.setBackground(new Color(11, 168, 156));
                activatebtn.setFont(new Font("Ink Free", 1, 16));
                activatebtn.setForeground(new Color(255, 255, 255));
                activatebtn.setText("Activate");
                activatebtn.setFocusable(false);
                activatebtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
                activatebtn.addMouseListener(this);
                activatebtn.addActionListener(this);

                hintlbl.setForeground(new java.awt.Color(0, 255, 51));
                hintlbl.setText("Only OG's know about it ( HINT: gta max health && money )");

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(jPanel1Layout
                                                                                                .createSequentialGroup()
                                                                                                .addContainerGap()
                                                                                                .addGroup(jPanel1Layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addGroup(jPanel1Layout
                                                                                                                                .createSequentialGroup()
                                                                                                                                .addComponent(scoreToplbl,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                61,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                .addPreferredGap(
                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                                .addComponent(scoreToplbl2,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                181,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                .addGap(42, 42, 42)
                                                                                                                                .addComponent(titlelbl,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                152,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                                .addGroup(jPanel1Layout
                                                                                                                                .createSequentialGroup()
                                                                                                                                .addComponent(usernameToplbl)
                                                                                                                                .addPreferredGap(
                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                                .addComponent(usernameToplbl2,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                181,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                                                .addGroup(jPanel1Layout
                                                                                                .createSequentialGroup()
                                                                                                .addGap(295, 295, 295)
                                                                                                .addComponent(activatebtn,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                170,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addGroup(jPanel1Layout
                                                                                                .createSequentialGroup()
                                                                                                .addGap(293, 293, 293)
                                                                                                .addComponent(passbtn,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                170,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout
                                                                .createSequentialGroup()
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addComponent(backbtn))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(jPanel1Layout
                                                                                                .createSequentialGroup()
                                                                                                .addGap(184, 184, 184)
                                                                                                .addGroup(jPanel1Layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addGroup(jPanel1Layout
                                                                                                                                .createSequentialGroup()
                                                                                                                                .addComponent(cheatlbl)
                                                                                                                                .addGap(92, 92, 92)
                                                                                                                                .addComponent(activateField,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                190,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                                .addGroup(jPanel1Layout
                                                                                                                                .createSequentialGroup()
                                                                                                                                .addComponent(newPasslbl)
                                                                                                                                .addGap(61, 61, 61)
                                                                                                                                .addComponent(newPassField,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                190,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                                .addGroup(jPanel1Layout
                                                                                                                                .createSequentialGroup()
                                                                                                                                .addGroup(jPanel1Layout
                                                                                                                                                .createParallelGroup(
                                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                                .addComponent(oldPasslbl)
                                                                                                                                                .addComponent(newUsernamelbl))
                                                                                                                                .addGap(70, 70, 70)
                                                                                                                                .addGroup(jPanel1Layout
                                                                                                                                                .createParallelGroup(
                                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                                                                false)
                                                                                                                                                .addComponent(oldPassField,
                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                190,
                                                                                                                                                                Short.MAX_VALUE)
                                                                                                                                                .addComponent(usernameField)))))
                                                                                .addGroup(jPanel1Layout
                                                                                                .createSequentialGroup()
                                                                                                .addGap(213, 213, 213)
                                                                                                .addComponent(hintlbl)))
                                                                .addGap(0, 219, Short.MAX_VALUE)));
                jPanel1Layout.setVerticalGroup(
                                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(jPanel1Layout
                                                                                                .createSequentialGroup()
                                                                                                .addComponent(backbtn,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                39,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                                                164,
                                                                                                                Short.MAX_VALUE))
                                                                                .addGroup(jPanel1Layout
                                                                                                .createSequentialGroup()
                                                                                                .addGap(0, 69, Short.MAX_VALUE)
                                                                                                .addGroup(jPanel1Layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                                .addComponent(usernameToplbl)
                                                                                                                .addComponent(usernameToplbl2,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                25,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addGroup(jPanel1Layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addComponent(titlelbl)
                                                                                                                .addGroup(jPanel1Layout
                                                                                                                                .createParallelGroup(
                                                                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                                                .addComponent(scoreToplbl,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                26,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                .addComponent(scoreToplbl2,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                22,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                                                .addGap(44, 44, 44)))
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                false)
                                                                                .addComponent(newUsernamelbl,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                .addComponent(usernameField))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(oldPasslbl)
                                                                                .addComponent(oldPassField,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                33,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(newPassField,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                31,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(newPasslbl))
                                                                .addGap(18, 18, 18)
                                                                .addComponent(passbtn,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                30,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(65, 65, 65)
                                                                .addComponent(hintlbl)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(cheatlbl)
                                                                                .addComponent(activateField,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                33,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(activatebtn,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                31,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(74, 74, 74)));

                URL url = getClass().getResource("gta-bg.jpg");
                jLabel1 = new JLabel(new ImageIcon(new File(url.getPath()).getAbsolutePath()));
                add(jLabel1);

                jPanel1.setBackground(new Color(0, 0, 0, 90));
                jLabel1.setLayout(new FlowLayout());
                jLabel1.add(jPanel1);

                pack();
                setLocationRelativeTo(null);
                setVisible(true);
        }

        @Override
        public void mouseClicked(MouseEvent e) {
                // TODO Auto-generated method stub
                if(e.getSource() == backbtn)
                        command = 1;

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
                if (e.getSource() == backbtn)
                        backbtn.setBackground(new Color(255, 51, 0));
                if (e.getSource() == passbtn)
                        passbtn.setBackground(new Color(255, 51, 0));
                if (e.getSource() == activatebtn)
                        activatebtn.setBackground(new Color(255, 51, 0));
        }

        @Override
        public void mouseExited(MouseEvent e) {
                backbtn.setBackground(new Color(11, 168, 156));
                passbtn.setBackground(new Color(11, 168, 156));
                activatebtn.setBackground(new Color(11, 168, 156));

        }

        @Override
        public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub

        }
        public int getCommand() {
                return command;
            }
            
         public void setCommand(int n) {
                command = n;
            }

}
