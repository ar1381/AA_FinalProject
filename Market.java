import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.net.URL;

public class Market extends javax.swing.JFrame implements ActionListener, MouseListener {

        private JButton yellowbtn;
        private JButton greenbtn;
        private JButton whitebtn;
        private JButton redbtn;
        private JButton purplebtn;
        private JLabel bglbl;
        private JLabel purplelbl;
        private JLabel moneylbl3;
        private JLabel moneylbl4;
        private JLabel moneylbl5;
        private JLabel titlelabel;
        private JLabel greenlbl;
        private JLabel moneylbl;
        private JLabel moneylbl2;
        private JLabel yellowlbl;
        private JLabel redlbl;
        private JLabel whitelbl;
        private JPanel jPanel1;
        private javax.swing.JButton jButton6;
        private VALS v ;
        private String itemString;
        private int command = -1;
        private int money;

        public Market(VALS v) {
                this.v = v;
                itemString = v.getItems();
                money = v.getMoney();
                setLayout(new BorderLayout());
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                setTitle("Market");
                setBackground(new Color(0, 64, 255));
                setPreferredSize(new Dimension(800, 600));
                setResizable(false);

                jPanel1 = new JPanel();
                yellowbtn = new JButton();
                greenbtn = new JButton();
                whitebtn = new JButton();
                redbtn = new JButton();
                purplebtn = new JButton();
                titlelabel = new JLabel();
                greenlbl = new JLabel();
                moneylbl = new JLabel();
                moneylbl2 = new JLabel();
                yellowlbl = new JLabel();
                redlbl = new JLabel();
                whitelbl = new JLabel();
                purplelbl = new JLabel();
                moneylbl3 = new JLabel();
                moneylbl4 = new JLabel();
                moneylbl5 = new JLabel();
                bglbl = new JLabel();
                jButton6 = new JButton();

                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                setPreferredSize(new Dimension(800, 600));

                URL url = getClass().getResource("yellow.jpg");
                yellowbtn.setIcon(new ImageIcon(new File(url.getPath()).getAbsolutePath()));
                yellowbtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
                yellowbtn.addMouseListener(this);

                URL url2 = getClass().getResource("green.jpg");
                greenbtn.setIcon(new ImageIcon(new File(url2.getPath()).getAbsolutePath()));
                greenbtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
                greenbtn.addMouseListener(this);

                URL url3 = getClass().getResource("white.jpg");
                whitebtn.setIcon(new ImageIcon(new File(url3.getPath()).getAbsolutePath()));
                whitebtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
                whitebtn.addMouseListener(this);

                URL url4 = getClass().getResource("red.jpg");
                redbtn.setIcon(new ImageIcon(new File(url4.getPath()).getAbsolutePath()));
                redbtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
                redbtn.addMouseListener(this);

                URL url5 = getClass().getResource("purple.jpg");
                purplebtn.setIcon(new ImageIcon(new File(url5.getPath()).getAbsolutePath()));
                purplebtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
                purplebtn.addMouseListener(this);

                jButton6.setBackground(new Color(11, 168, 156));
                jButton6.setFont(new Font("Ink Free", 1, 16));
                jButton6.setForeground(new Color(255, 255, 255));
                jButton6.setFocusable(false);
                jButton6.setCursor(new Cursor(Cursor.HAND_CURSOR));
                jButton6.setText("Back");
                jButton6.addMouseListener(this);
                jButton6.addMouseListener(this);

                titlelabel.setForeground(new Color(255, 255, 255));
                titlelabel.setFont(new Font("Segoe Script", 1, 60));
                titlelabel.setText("Market");

                greenlbl.setFont(new Font("Trebuchet MS", 1, 36));
                greenlbl.setForeground(new Color(0, 255, 0));
                greenlbl.setText("Green");

                moneylbl.setFont(new Font("Segoe UI", 0, 24));
                moneylbl.setForeground(new Color(255, 255, 255));
                moneylbl.setText("100$");

                moneylbl2.setFont(new Font("Segoe UI", 0, 24));
                moneylbl2.setForeground(new Color(255, 255, 255));
                moneylbl2.setText("100$");

                yellowlbl.setFont(new Font("Trebuchet MS", 1, 36));
                yellowlbl.setForeground(new Color(255, 204, 0));
                yellowlbl.setText("Yellow");

                redlbl.setFont(new Font("Trebuchet MS", 1, 36)); // NOI18N
                redlbl.setForeground(new Color(255, 0, 0));
                redlbl.setText("Red");

                whitelbl.setFont(new Font("Trebuchet MS", 1, 36)); // NOI18N
                whitelbl.setForeground(new Color(255, 255, 255));
                whitelbl.setText("White");

                purplelbl.setFont(new Font("Trebuchet MS", 1, 36)); // NOI18N
                purplelbl.setForeground(new Color(102, 0, 255));
                purplelbl.setText("Purple");

                moneylbl3.setFont(new Font("Segoe UI", 0, 24));
                moneylbl3.setForeground(new Color(255, 255, 255)); // NOI18N
                moneylbl3.setText("100$");

                moneylbl4.setFont(new Font("Segoe UI", 0, 24));
                moneylbl4.setForeground(new Color(255, 255, 255));// NOI18N
                moneylbl4.setText("100$");

                moneylbl5.setFont(new Font("Segoe UI", 0, 24));
                moneylbl5.setForeground(new Color(255, 255, 255)); // NOI18N
                moneylbl5.setText("100$");

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout
                                                                .createSequentialGroup()
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(jPanel1Layout
                                                                                                .createSequentialGroup()
                                                                                                .addGap(33, 33, 33)
                                                                                                .addGroup(jPanel1Layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addComponent(redbtn,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                150,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(yellowbtn,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                150,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                                .addGroup(jPanel1Layout
                                                                                                .createSequentialGroup()
                                                                                                .addGap(51, 51, 51)
                                                                                                .addComponent(yellowlbl))
                                                                                .addGroup(jPanel1Layout
                                                                                                .createSequentialGroup()
                                                                                                .addGap(78, 78, 78)
                                                                                                .addComponent(moneylbl4,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                58,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(jPanel1Layout
                                                                                                .createSequentialGroup()
                                                                                                .addGroup(jPanel1Layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addGroup(jPanel1Layout
                                                                                                                                .createSequentialGroup()
                                                                                                                                .addGap(104, 104,
                                                                                                                                                104)
                                                                                                                                .addComponent(purplelbl))
                                                                                                                .addGroup(jPanel1Layout
                                                                                                                                .createSequentialGroup()
                                                                                                                                .addGap(130, 130,
                                                                                                                                                130)
                                                                                                                                .addComponent(moneylbl2,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                58,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                                                66,
                                                                                                                Short.MAX_VALUE))
                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                jPanel1Layout.createSequentialGroup()
                                                                                                                .addPreferredGap(
                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                Short.MAX_VALUE)
                                                                                                                .addGroup(jPanel1Layout
                                                                                                                                .createParallelGroup(
                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                                                                jPanel1Layout.createSequentialGroup()
                                                                                                                                                                .addComponent(purplebtn,
                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                150,
                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                                .addGap(52, 52, 52))
                                                                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                                                                jPanel1Layout.createSequentialGroup()
                                                                                                                                                                .addComponent(titlelabel)
                                                                                                                                                                .addGap(18, 18, 18)))))
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(greenbtn,
                                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                150,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                jPanel1Layout.createSequentialGroup()
                                                                                                                .addComponent(greenlbl,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                110,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addGap(14, 14, 14))
                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                jPanel1Layout.createSequentialGroup()
                                                                                                                .addComponent(moneylbl3,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                58,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addGap(39, 39, 39))
                                                                                .addComponent(whitebtn,
                                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                150,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jButton6,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                81,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(70, 70, 70)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                .addComponent(redlbl)
                                                                                .addComponent(moneylbl5,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                58,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                jPanel1Layout.createSequentialGroup()
                                                                                                                .addComponent(whitelbl)
                                                                                                                .addGap(106, 106,
                                                                                                                                106))
                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                jPanel1Layout.createSequentialGroup()
                                                                                                                .addComponent(moneylbl,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                58,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addGap(129, 129,
                                                                                                                                129)))));
                jPanel1Layout.setVerticalGroup(
                                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                false)
                                                                                .addGroup(jPanel1Layout
                                                                                                .createSequentialGroup()
                                                                                                .addComponent(jButton6,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                30,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addGroup(jPanel1Layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                                .addComponent(yellowbtn,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                150,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(greenbtn,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                150,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addGroup(jPanel1Layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                                false)
                                                                                                                .addGroup(jPanel1Layout
                                                                                                                                .createSequentialGroup()
                                                                                                                                .addComponent(greenlbl,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                27,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                .addPreferredGap(
                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                                .addComponent(moneylbl3)
                                                                                                                                .addPreferredGap(
                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                Short.MAX_VALUE)
                                                                                                                                .addComponent(whitebtn,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                150,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                                .addGroup(jPanel1Layout
                                                                                                                                .createSequentialGroup()
                                                                                                                                .addComponent(yellowlbl,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                27,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                .addPreferredGap(
                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                                .addComponent(moneylbl4)
                                                                                                                                .addGap(61, 61, 61)
                                                                                                                                .addComponent(redbtn,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                150,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                                                .addGap(18, 18, 18)
                                                                                                .addGroup(jPanel1Layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                                .addComponent(redlbl,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                27,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(whitelbl,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                27,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                .addGap(3, 3, 3))
                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                jPanel1Layout.createSequentialGroup()
                                                                                                                .addContainerGap()
                                                                                                                .addComponent(titlelabel,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                56,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addPreferredGap(
                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                Short.MAX_VALUE)
                                                                                                                .addComponent(purplebtn,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                150,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addPreferredGap(
                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                .addComponent(purplelbl)
                                                                                                                .addPreferredGap(
                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                .addComponent(moneylbl2)
                                                                                                                .addGap(104, 104,
                                                                                                                                104)))
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(moneylbl5)
                                                                                .addComponent(moneylbl))
                                                                .addContainerGap()));

                URL url6 = getClass().getResource("market-bg.jpg");
                bglbl.setIcon(new javax.swing.ImageIcon(new File(url6.getPath()).getAbsolutePath()));
                jPanel1.setBackground(new Color(0, 0, 0, 90));
                bglbl.setLayout(new FlowLayout());
                bglbl.add(jPanel1);
                
                add(bglbl);

                pack();
                setLocationRelativeTo(null);
                // setVisible(true);
        }

        public int getCommand() {
                return command;
        }

        public void setCommand(int n) {
                command = n;
        }

        @Override
        public void mouseClicked(MouseEvent e) {
                // TODO Auto-generated method stub

                if(e.getSource() == yellowbtn){
                        if(v.isSKIN_yellow_bought()){
                                itemString = itemString.replaceAll("2", "1");
                                itemString = "2" + itemString.substring(1);
                                v.changeMarketItems(itemString);
                                JOptionPane.showMessageDialog(null, "You Selcted Yellow Arrow", "Selected Skin", JOptionPane.INFORMATION_MESSAGE);
                        }else if(money >= 100){
                                if(JOptionPane.showConfirmDialog(null, "Do you want to buy this Arrow ?", "Buy", JOptionPane.YES_NO_OPTION) == 0){
                                money -= 100;
                                v.changeScore(-100);
                                itemString = itemString.replaceAll("2", "1");
                                itemString = "2" + itemString.substring(1);
                                v.changeMarketItems(itemString);
                                JOptionPane.showMessageDialog(null, "from now you have this Skin\nYour score :"+v.getMoney(), "message", JOptionPane.INFORMATION_MESSAGE);
                                }
                        }
                        else{
                                JOptionPane.showMessageDialog(null, "You dont have enough score", "Warning", JOptionPane.WARNING_MESSAGE);
                        }
                                
                }
                if(e.getSource() == greenbtn){
                        if(v.isSKIN_green_bought()){
                                itemString = itemString.replaceAll("2", "1");
                                itemString = itemString.substring(0, 1)+"2" + itemString.substring(2);
                                v.changeMarketItems(itemString);
                                JOptionPane.showMessageDialog(null, "You Selcted Green Arrow", "Selected Skin", JOptionPane.INFORMATION_MESSAGE);
                        }else if(money >= 100){
                                if(JOptionPane.showConfirmDialog(null, "Do you want to buy this Arrow ?", "Buy", JOptionPane.YES_NO_OPTION) == 0){
                                money -= 100;
                                v.changeScore(-100);
                                itemString = itemString.replaceAll("2", "1");
                                itemString = itemString.charAt(0)+"2" + itemString.substring(2);
                                v.changeMarketItems(itemString);
                                JOptionPane.showMessageDialog(null, "from now you have this Skin\nYour score :"+v.getMoney(), "message", JOptionPane.INFORMATION_MESSAGE);
                                }
                        }
                        else{
                                JOptionPane.showMessageDialog(null, "You dont have enough score", "Warning", JOptionPane.WARNING_MESSAGE);
                        }
                }
                if(e.getSource() == redbtn){
                        if(v.isSKIN_red_bought()){
                                itemString = itemString.replaceAll("2", "1");
                                itemString = itemString.subSequence(0, 4)+"2";
                                v.changeMarketItems(itemString);
                                JOptionPane.showMessageDialog(null, "You Selcted Red Arrow", "Selected Skin", JOptionPane.INFORMATION_MESSAGE);
                        }else if(money >= 100){
                                if(JOptionPane.showConfirmDialog(null, "Do you want to buy this Arrow ?", "Buy", JOptionPane.YES_NO_OPTION) == 0){
                                money -=100;
                                v.changeScore((-100));
                                itemString = itemString.replaceAll("2", "1");
                                itemString = itemString.subSequence(0, 4)+"2";
                                v.changeMarketItems(itemString);
                                JOptionPane.showMessageDialog(null, "from now you have this Skin\nYour score :"+v.getMoney(), "message", JOptionPane.INFORMATION_MESSAGE);
                                }
                        }
                        else{
                                JOptionPane.showMessageDialog(null, "You dont have enough score", "Warning", JOptionPane.WARNING_MESSAGE);
                        }
                }
                if(e.getSource() == whitebtn){
                        if(v.isSKIN_white_bought()){
                                itemString = itemString.replaceAll("2", "1");
                                itemString = itemString.subSequence(0, 2)+"2" + itemString.substring(3);
                                v.changeMarketItems(itemString);
                                JOptionPane.showMessageDialog(null, "You Selcted White Arrow", "Selected Skin", JOptionPane.INFORMATION_MESSAGE);
                        }else if(money >= 100){
                                if(JOptionPane.showConfirmDialog(null, "Do you want to buy this Arrow ?", "Buy", JOptionPane.YES_NO_OPTION) == 0){
                                money -= 100;
                                v.changeScore((-100));
                                itemString = itemString.replaceAll("2", "1");
                                itemString = itemString.subSequence(0, 2)+"2" + itemString.substring(3);
                                v.changeMarketItems(itemString);
                                JOptionPane.showMessageDialog(null, "from now you have this Skin\nYour score :"+v.getMoney(), "message", JOptionPane.INFORMATION_MESSAGE);
                                }
                        }
                        else{
                                JOptionPane.showMessageDialog(null, "You dont have enough score", "Warning", JOptionPane.WARNING_MESSAGE);
                        }
                }
                if(e.getSource() == purplebtn){
                        if(v.isSKIN_purple_bought()){
                                itemString = itemString.replaceAll("2", "1");
                                itemString = itemString.subSequence(0, 3)+"2" + itemString.substring(4);
                                v.changeMarketItems(itemString);
                                JOptionPane.showMessageDialog(null, "You Selcted Purple Arrow", "Selected Skin", JOptionPane.INFORMATION_MESSAGE);
                        }
                        else if(money >= 100){
                                if(JOptionPane.showConfirmDialog(null, "Do you want to buy this Arrow ?", "Buy", JOptionPane.YES_NO_OPTION) == 0){
                                money -= 100;
                                v.changeScore(-100);
                                itemString = itemString.replaceAll("2", "1");
                                itemString = itemString.subSequence(0, 3)+"2" + itemString.substring(4);
                                v.changeMarketItems(itemString);
                                JOptionPane.showMessageDialog(null, "from now you have this Skin\nYour score :"+v.getMoney(), "message", JOptionPane.INFORMATION_MESSAGE);
                                }
                        }
                        else{
                                JOptionPane.showMessageDialog(null, "You dont have enough score", "Warning", JOptionPane.WARNING_MESSAGE);
                        }

                }
                if (e.getSource() == jButton6){
                        command = 1;
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
                if (e.getSource() == jButton6)
                        jButton6.setBackground(new Color(255, 51, 0));

        }

        @Override
        public void mouseExited(MouseEvent e) {
                jButton6.setBackground(new Color(11, 168, 156));
        }

        @Override
        public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                
        }
}
