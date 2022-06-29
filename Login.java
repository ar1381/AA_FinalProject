import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener, MouseListener {
        private JLabel jLabel1;
        private JLabel jLabel2;
        private JLabel jLabel3;
        private JPanel jPanel1;
        private JTextField jTextField1;
        private JButton jButton1;

        public Login() {
                setLayout(new BorderLayout());
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                setTitle("Login");
                setBackground(new Color(0, 64, 255));
                setPreferredSize(new Dimension(800, 600));
                setResizable(false);

                jPanel1 = new JPanel();
                jLabel2 = new JLabel();
                jLabel3 = new JLabel();
                jTextField1 = new JTextField();
                jButton1 = new JButton();

                jLabel1 = new JLabel(new ImageIcon("AA_FinalProject/Login-bg.jpg"));
                add(jLabel1);

                jButton1.setText("Submit");
                jButton1.setBackground(new Color(11, 187, 172));
                jButton1.setForeground(new Color(255, 255, 255));
                jButton1.setFont(new Font("Ink Free", 1, 18));
                jButton1.setFocusable(false);
                jButton1.setCursor(new Cursor(Cursor.HAND_CURSOR));
                jButton1.addMouseListener(this);

                jTextField1.setFont(new Font("Yu Gothic UI Semibold", 1, 16));
                jTextField1.setBackground(new Color(0, 20, 0));
                jTextField1.setForeground(new Color(255, 255, 255));

                jLabel2.setBackground(new Color(255, 255, 255));
                jLabel2.setFont(new Font("Yu Gothic UI", 1, 48));
                jLabel2.setHorizontalAlignment(SwingConstants.CENTER);
                jLabel2.setForeground(new Color(255, 255, 255));
                jLabel2.setText("Welcome");

                jLabel3.setFont(new Font("Ink Free", 1, 24));
                jLabel3.setForeground(new Color(255, 255, 255));
                jLabel3.setText("Username :");

                GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout
                                                                .createSequentialGroup()
                                                                .addContainerGap(GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addComponent(jLabel2)
                                                                .addGap(86, 86, 86))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                GroupLayout.Alignment.LEADING)
                                                                                .addGroup(jPanel1Layout
                                                                                                .createSequentialGroup()
                                                                                                .addGap(29, 29, 29)
                                                                                                .addComponent(jLabel3,
                                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                                128,
                                                                                                                GroupLayout.PREFERRED_SIZE)
                                                                                                .addGap(18, 18, 18)
                                                                                                .addComponent(jTextField1,
                                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                                183,
                                                                                                                GroupLayout.PREFERRED_SIZE))
                                                                                .addGroup(jPanel1Layout
                                                                                                .createSequentialGroup()
                                                                                                .addGap(124, 124, 124)
                                                                                                .addComponent(jButton1,
                                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                                143,
                                                                                                                GroupLayout.PREFERRED_SIZE)))
                                                                .addContainerGap(32, Short.MAX_VALUE)));
                jPanel1Layout.setVerticalGroup(
                                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(jLabel2)
                                                                .addGap(66, 66, 66)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel3)
                                                                                .addComponent(jTextField1,
                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                37,
                                                                                                GroupLayout.PREFERRED_SIZE))
                                                                .addGap(33, 33, 33)
                                                                .addComponent(jButton1,
                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                30,
                                                                                GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap(14, Short.MAX_VALUE)));

                jPanel1.setBackground(new Color(0, 0, 0, 70));

                jLabel1.setLayout(new FlowLayout());
                jLabel1.add(jPanel1);

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
                if (e.getSource() == jButton1)
                        jButton1.setBackground(new Color(255, 51, 0));

        }

        @Override
        public void mouseExited(MouseEvent e) {
                jButton1.setBackground(new Color(11, 187, 172));

        }

        @Override
        public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub

        }

}
