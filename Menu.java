import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.net.URL;

public class Menu extends JFrame implements ActionListener, MouseListener {
        private ButtonGroup buttonGroup1;
        private JButton startbtn;
        private JButton settingsbtn;
        private JButton aboutbtn;
        private JButton exitbtn;
        private JButton marketbtn;
        private JLabel titlelbl;
        private JLabel bglbl;
        private JPanel jPanel1;
        private int command = -1;

        Menu() {
                setLayout(new BorderLayout());
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                setTitle("AA Game");
                setBackground(new Color(0, 64, 255));
                setPreferredSize(new Dimension(800, 600));
                setResizable(false);

                buttonGroup1 = new ButtonGroup();
                jPanel1 = new JPanel();
                titlelbl = new JLabel();
                startbtn = new JButton();
                settingsbtn = new JButton();
                aboutbtn = new JButton();
                exitbtn = new JButton();
                marketbtn = new JButton();

                URL url = getClass().getResource("menu-bg.jpg");
                bglbl = new JLabel(new ImageIcon(new File(url.getPath()).getAbsolutePath()));
                add(bglbl);

                titlelbl.setFont(new Font("SansSerif", 1, 60));
                titlelbl.setForeground(new Color(204, 255, 255));
                titlelbl.setHorizontalAlignment(SwingConstants.CENTER);
                titlelbl.setText("AA Game");

                startbtn.setBackground(new Color(11, 168, 156));
                startbtn.setFont(new Font("Ink Free", 1, 36));
                startbtn.setForeground(new Color(255, 255, 255));
                startbtn.setText("Start");
                startbtn.setFocusable(false);
                startbtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
                startbtn.addMouseListener(this);

                settingsbtn.setBackground(new Color(11, 168, 156));
                settingsbtn.setFont(new Font("Ink Free", 1, 24));
                settingsbtn.setForeground(new Color(255, 255, 255));
                settingsbtn.setText("Settings");
                settingsbtn.setFocusable(false);
                settingsbtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
                settingsbtn.addMouseListener(this);

                aboutbtn.setBackground(new Color(11, 168, 156));
                aboutbtn.setFont(new Font("Ink Free", 1, 24));
                aboutbtn.setForeground(new Color(255, 255, 255));
                aboutbtn.setText("About");
                aboutbtn.setFocusable(false);
                aboutbtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
                aboutbtn.addMouseListener(this);

                exitbtn.setBackground(new Color(11, 168, 156));
                exitbtn.setFont(new Font("Ink Free", 1, 24));
                exitbtn.setForeground(new Color(255, 255, 255));
                exitbtn.setText("Exit");
                exitbtn.setFocusable(false);
                exitbtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
                exitbtn.addMouseListener(this);

                marketbtn.setBackground(new Color(11, 168, 156));
                marketbtn.setFont(new java.awt.Font("Ink Free", 1, 24));
                marketbtn.setForeground(new java.awt.Color(255, 255, 255));
                marketbtn.setText("Market");
                marketbtn.setFocusable(false);
                marketbtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
                marketbtn.addMouseListener(this);

                GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                GroupLayout.Alignment.LEADING)
                                                                                .addGroup(jPanel1Layout
                                                                                                .createSequentialGroup()
                                                                                                .addGap(117, 117, 117)
                                                                                                .addGroup(jPanel1Layout
                                                                                                                .createParallelGroup(
                                                                                                                                GroupLayout.Alignment.LEADING,
                                                                                                                                false)
                                                                                                                .addComponent(startbtn,
                                                                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                                                                145,
                                                                                                                                Short.MAX_VALUE)
                                                                                                                .addComponent(settingsbtn,
                                                                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                                                                Short.MAX_VALUE)
                                                                                                                .addComponent(aboutbtn,
                                                                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                                                                Short.MAX_VALUE)
                                                                                                                .addComponent(exitbtn,
                                                                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                                                                Short.MAX_VALUE)
                                                                                                                .addComponent(marketbtn,
                                                                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                                                                Short.MAX_VALUE)))
                                                                                .addGroup(jPanel1Layout
                                                                                                .createSequentialGroup()
                                                                                                .addGap(61, 61, 61)
                                                                                                .addComponent(titlelbl,
                                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                                273,
                                                                                                                GroupLayout.PREFERRED_SIZE)))
                                                                .addContainerGap(56, Short.MAX_VALUE)));
                jPanel1Layout.setVerticalGroup(
                                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(34, 34, 34)
                                                                .addComponent(titlelbl,
                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                83,
                                                                                GroupLayout.PREFERRED_SIZE)
                                                                .addGap(41, 41, 41)
                                                                .addComponent(startbtn,
                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                56,
                                                                                GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(settingsbtn,
                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                34,
                                                                                GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(aboutbtn,
                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                34,
                                                                                GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(marketbtn,
                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                34,
                                                                                GroupLayout.PREFERRED_SIZE)
                                                                .addGap(31, 31, 31)
                                                                .addComponent(exitbtn,
                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                53,
                                                                                GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap(44, Short.MAX_VALUE)));

                jPanel1.setBackground(new Color(0, 0, 0, 80));
                bglbl.setLayout(new FlowLayout());
                bglbl.add(jPanel1);

                pack();
                setLocationRelativeTo(null);
                setVisible(true);
        }

        @Override
        public void mouseClicked(MouseEvent e) {
                // TODO Auto-generated method stub
                if (e.getSource() == startbtn) {
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
                if (e.getSource() == startbtn)
                        startbtn.setBackground(new Color(255, 51, 0));
                if (e.getSource() == settingsbtn)
                        settingsbtn.setBackground(new Color(255, 51, 0));
                if (e.getSource() == aboutbtn)
                        aboutbtn.setBackground(new Color(255, 51, 0));
                if (e.getSource() == exitbtn)
                        exitbtn.setBackground(new Color(255, 51, 0));
                if (e.getSource() == marketbtn)
                        marketbtn.setBackground(new Color(255, 51, 0));

        }

        @Override
        public void mouseExited(MouseEvent e) {
                startbtn.setBackground(new Color(11, 168, 156));
                settingsbtn.setBackground(new Color(11, 168, 156));
                aboutbtn.setBackground(new Color(11, 168, 156));
                exitbtn.setBackground(new Color(11, 168, 156));
                marketbtn.setBackground(new Color(11, 168, 156));

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
