import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.net.URL;

public class pauseMenu extends JFrame implements ActionListener, MouseListener {
    private ButtonGroup buttonGroup1;
    private JButton resumebtn;
    private JButton menubtn;
    private JLabel titlelbl;
    private JLabel bglbl;
    private JPanel jPanel1;
    private int command = -1;
    private boolean isp = false;
    
    public static void main(String[] args) {
        new pauseMenu();
    }
    pauseMenu() {
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Pause!");
        setBackground(new Color(0, 64, 255));
        setPreferredSize(new Dimension(300, 400));
        setResizable(false);
        
        buttonGroup1 = new ButtonGroup();
        jPanel1 = new JPanel();
        titlelbl = new JLabel();
        resumebtn = new JButton();
        menubtn = new JButton();
        
        URL url = getClass().getResource("menu-bg.jpg");
        bglbl = new JLabel(new ImageIcon(new File(url.getPath()).getAbsolutePath()));
        add(bglbl);
        
        titlelbl.setFont(new Font("SansSerif", 1, 60));
        titlelbl.setForeground(new Color(204, 255, 255));
        titlelbl.setHorizontalAlignment(SwingConstants.CENTER);
        titlelbl.setText("Pause");
        
        resumebtn.setBackground(new Color(11, 168, 156));
        resumebtn.setFont(new Font("Ink Free", 1, 36));
        resumebtn.setForeground(new Color(255, 255, 255));
        resumebtn.setText("RESUME");
        resumebtn.setFocusable(false);
        resumebtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        resumebtn.addMouseListener(this);
        
        menubtn.setBackground(new Color(11, 168, 156));
        menubtn.setFont(new Font("Ink Free", 1, 24));
        menubtn.setForeground(new Color(255, 255, 255));
        menubtn.setText("MENU");
        menubtn.setFocusable(false);
        menubtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        menubtn.addMouseListener(this);
        
        
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
                                                        .addComponent(resumebtn,
                                                                GroupLayout.DEFAULT_SIZE,
                                                                145,
                                                                Short.MAX_VALUE)
                                                        .addComponent(menubtn,
                                                                GroupLayout.DEFAULT_SIZE,
                                                                GroupLayout.DEFAULT_SIZE,
                                                                Short.MAX_VALUE)
                                                        
                                                        ))
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
                                .addComponent(resumebtn,
                                        GroupLayout.PREFERRED_SIZE,
                                        56,
                                        GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(
                                        LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(menubtn,
                                        GroupLayout.PREFERRED_SIZE,
                                        34,
                                        GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(
                                        LayoutStyle.ComponentPlacement.UNRELATED)
                                ));
        
        jPanel1.setBackground(new Color(0, 0, 0, 80));
        bglbl.setLayout(new FlowLayout());
        bglbl.add(jPanel1);
        
        pack();
        setLocationRelativeTo(null);
    }
    
    @Override
    public void mouseClicked(MouseEvent e) {
        // TODO Auto-generated method stub
        if (e.getSource() == resumebtn) {
            isp = false;
            this.setVisible(false);
        }  else if (e.getSource() == menubtn) {
            this.setVisible(false);
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
        if (e.getSource() == resumebtn)
            resumebtn.setBackground(new Color(255, 51, 0));
        if (e.getSource() == menubtn)
            menubtn.setBackground(new Color(255, 51, 0));
    }
    
    @Override
    public void mouseExited(MouseEvent e) {
        resumebtn.setBackground(new Color(11, 168, 156));
        menubtn.setBackground(new Color(11, 168, 156));
        
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
    
    public boolean isP(){
        return isp;
    }
    public void setisP(boolean p){
        isp = p;
    }
}
