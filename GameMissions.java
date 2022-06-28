import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class GameMissions extends JFrame  implements ActionListener , MouseListener {
    JLabel pageNumber; 
    int page= 1;
    JButton[] mission = new JButton[16];
    JLabel next;
    JLabel pervious;
    JPanel panelCenter;
    JPanel paenlSouth;
    JPanel panelTop;
    JPanel panelLeft;
    JPanel panelRight;
    JLabel label;
    int maxPage = 3;
    GameMissions(){
        pageNumber = new JLabel("       " +page);
        pageNumber.setForeground(Color.white);
        pageNumber.setPreferredSize(new Dimension(60 , 60));
        next = new JLabel("Next");
        next.setForeground(Color.white);
        next.setPreferredSize(new Dimension(60, 60));
        next.addMouseListener(this);
        pervious = new JLabel("Pervious");
        pervious.setForeground(Color.white);
        pervious.setPreferredSize(new Dimension(60 , 60));
        pervious.addMouseListener(this);
        pervious.setEnabled(false);
        paenlSouth = new JPanel();
        paenlSouth.setBackground(new Color(0x151B54));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());
        JPanel panel = new JPanel();
        JPanel panel1 = new JPanel();
        paenlSouth.add(pervious);
        paenlSouth.add(pageNumber);
        paenlSouth.add(next);
        System.out.println(page);
        panel.setLayout(new BorderLayout());
        panel.add(paenlSouth , BorderLayout.CENTER);
        panel1.setPreferredSize(new Dimension( 50 ,50));
        panel1.setBackground(Color.WHITE);
        panel.add(panel1 , BorderLayout.NORTH);
        this.add(panel, BorderLayout.SOUTH);
        panelCenter = new JPanel();
        panelCenter.setLayout(new GridLayout(4 ,4 , 60 , 60));
        for(int i = 0;i<mission.length; ++i){
            mission[i] = new JButton(String.valueOf(i + 1));
            panelCenter.add(mission[i]);
            mission[i].addActionListener(this); 
            mission[i].setFont(new Font("MV Boli" , Font.PLAIN , 30));
            mission[i].setBackground(new Color(0x949EC9));
            mission[i].setForeground(new Color(0x151B54));
            mission[i].setFocusable(false);
        }
        this.add(panelCenter , BorderLayout.CENTER);
        panelTop = new JPanel();
        label = new JLabel("Pick a Mission");
        label.setFont(new Font("MV Boli" , Font.BOLD , 60));
        label.setForeground(new Color(0x151B54));
        panelTop .add(label);
        panelTop.setPreferredSize(new Dimension(100 ,100));
        this.add(panelTop , BorderLayout.NORTH);
        panelLeft = new JPanel();
        panelLeft.setPreferredSize(new Dimension(70 , 100));
        panelRight = new JPanel();
        panelRight.setPreferredSize(new Dimension(70 , 100));
        panelTop.setBackground(Color.WHITE);
        panelRight.setBackground(Color.WHITE);
        panelLeft.setBackground(Color.WHITE);
        panelCenter.setBackground(Color.WHITE);
        this.add(panelLeft, BorderLayout.WEST);
        this.add(panelRight , BorderLayout.EAST);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource() == next && next.isEnabled()){
            page += 1;
            pageNumber.setText("        " + page); 
            for(int i = 0 ; i<mission.length ; ++i){
                mission[i].setText(String.valueOf(16*(page -1) + (i + 1)));
            }
        }
        else if(e.getSource() == pervious && pervious.isEnabled()){
            page -= 1;
            pageNumber.setText("        " + page); 
            for(int i = 0 ; i<mission.length ; ++i){
                mission[i].setText(String.valueOf(16*(page -1) + (i + 1)));
            }
        }
        if(page == 1){
            pervious.setEnabled(false);
        }
        else if(!pervious.isEnabled()){
            pervious.setEnabled(true);
        }
        if(page == maxPage){
            next.setEnabled(false);
        }
        else if(!next.isEnabled()){
            next.setEnabled(true);
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
        // TODO Auto-generated method stub
        
    }
    @Override
    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        switch(e.getActionCommand()){
            case "1":
                double[]  arr1 = {1 , 68 , 79 , 180 , 200 , 0,0,0};
                this.setVisible(false);
                Game t1 = new Game(5, arr1);
                dispose();
                break;
            case "2":
                double[]  arr2 = {1 , 68 , 79 , 180  , 0,0,0};
                this.setVisible(false);
                Game t2 = new Game(4, arr2);
                dispose();
                break;
            case "3":
                double[]  arr3 = {1 , 68 , 79 , 0,0,0};
                this.setVisible(false);
                Game t3 = new Game(3, arr3);
                dispose();
                break;
        }
        
    }
}
