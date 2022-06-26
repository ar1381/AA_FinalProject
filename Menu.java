import javax.swing.*;
import java.awt.*;

public class Menu extends JFrame {
        private ButtonGroup buttonGroup1;
        private JButton jButton1;
        private JButton jButton2;
        private JButton jButton3;
        private JButton jButton4;
        private JLabel jLabel1;
        private JLabel jLabel2;
        private JPanel jPanel1;

        Menu() {
                setLayout(new BorderLayout());
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                setTitle("AA Game");
                setBackground(new Color(0, 64, 255));
                setPreferredSize(new Dimension(800, 600));
                setResizable(false);

                buttonGroup1 = new ButtonGroup();
                jPanel1 = new JPanel();

                jLabel1 = new JLabel();
                jButton1 = new JButton();
                jButton2 = new JButton();
                jButton3 = new JButton();
                jButton4 = new JButton();

                jLabel2 = new JLabel(new ImageIcon("AA_FinalProject/bg.jpg"));
                add(jLabel2);

                jPanel1.setBackground(new Color(0, 0, 0, 85));
                jLabel1.setFont(new Font("SansSerif", 1, 60));
                jLabel1.setForeground(new Color(204, 255, 255));
                jLabel1.setHorizontalAlignment(SwingConstants.CENTER);
                jLabel1.setText("AA Game");

                jButton1.setBackground(new Color(5, 61, 109));
                jButton1.setFont(new Font("Ink Free", 1, 36));
                jButton1.setForeground(new Color(255, 255, 255));
                jButton1.setText("Start");
                jButton1.setFocusable(false);

                jButton2.setBackground(new Color(5, 61, 109));
                jButton2.setFont(new Font("Ink Free", 1, 24));
                jButton2.setForeground(new Color(255, 255, 255));
                jButton2.setText("Settings");
                jButton2.setFocusable(false);

                jButton3.setBackground(new Color(5, 61, 109));
                jButton3.setFont(new Font("Ink Free", 1, 24));
                jButton3.setForeground(new Color(255, 255, 255));
                jButton3.setText("About");
                jButton3.setFocusable(false);

                jButton4.setBackground(new Color(5, 61, 109));
                jButton4.setFont(new Font("Ink Free", 1, 24));
                jButton4.setForeground(new Color(255, 255, 255));
                jButton4.setText("Exit");
                jButton4.setFocusable(false);

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
                                                                                                                .addComponent(jButton1,
                                                                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                                                                145,
                                                                                                                                Short.MAX_VALUE)
                                                                                                                .addComponent(jButton2,
                                                                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                                                                Short.MAX_VALUE)
                                                                                                                .addComponent(jButton3,
                                                                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                                                                Short.MAX_VALUE)
                                                                                                                .addComponent(jButton4,
                                                                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                                                                Short.MAX_VALUE)))
                                                                                .addGroup(jPanel1Layout
                                                                                                .createSequentialGroup()
                                                                                                .addGap(61, 61, 61)
                                                                                                .addComponent(jLabel1,
                                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                                273,
                                                                                                                GroupLayout.PREFERRED_SIZE)))
                                                                .addContainerGap(56, Short.MAX_VALUE)));
                jPanel1Layout.setVerticalGroup(
                                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(34, 34, 34)
                                                                .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 83,
                                                                                GroupLayout.PREFERRED_SIZE)
                                                                .addGap(41, 41, 41)
                                                                .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 56,
                                                                                GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 34,
                                                                                GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(jButton3, GroupLayout.PREFERRED_SIZE, 34,
                                                                                GroupLayout.PREFERRED_SIZE)
                                                                .addGap(60, 60, 60)
                                                                .addComponent(jButton4, GroupLayout.PREFERRED_SIZE, 53,
                                                                                GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap(61, Short.MAX_VALUE)));

                jLabel2.setLayout(new FlowLayout());
                jLabel2.add(jPanel1);

                pack();
                setLocationRelativeTo(null);
                setVisible(true);
        }

}
