import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.net.URL;
import java.io.File;

public class GameMissions extends JFrame  implements ActionListener , MouseListener {
    private JLabel pageNumber; 
    private int page= 1;
    private JButton[] mission = new JButton[16];
    private JLabel next;
    private JLabel pervious;
    private JPanel panelCenter;
    private JPanel panelSouth;
    private JPanel panelTop;
    private JPanel panelLeft;
    private JPanel panelRight;
    private JLabel label;
    private int maxPage = 3;
    private double money;
    private int level = 1;
    private int currentLevel;
    private Game t1;
    private JLabel back ;
    private JPanel backPanel ;
    private JPanel southRightPanel;
    private int command =-1;

    GameMissions(int level){
        this.level = level;
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
        panelSouth = new JPanel();
        panelSouth.setBackground(new Color(0x151B54));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());
        JPanel panel = new JPanel();
        JPanel panel1 = new JPanel();
        panelSouth.add(pervious);
        panelSouth.add(pageNumber);
        panelSouth.add(next);
        backPanel = new JPanel();
        backPanel.setBackground(new Color(0x151B54));
        backPanel.setPreferredSize(new Dimension(75 , 20));
        southRightPanel = new JPanel();
        southRightPanel.setBackground(new Color(0x151B54));
        southRightPanel.setPreferredSize(new Dimension(75 , 30));
        backPanel.setLayout(new BorderLayout());
        panel.setLayout(new BorderLayout());
        panel.add(panelSouth , BorderLayout.CENTER);
        panel1.setPreferredSize(new Dimension( 50 ,50));
        panel1.setBackground(Color.WHITE);
        panel.add(backPanel, BorderLayout.WEST);
        panel.add(southRightPanel , BorderLayout.EAST);
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
        for(int i = 15 ; i >= level ; --i){
            mission[i].setEnabled(false);
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
        back = new JLabel("Menu");
        back.setForeground(Color.white);
        back.setPreferredSize(new Dimension(60, 60));
        back.addMouseListener(this);
        back.setPreferredSize(new Dimension(60 , 50));
        backPanel.add(back , BorderLayout.EAST);
        this.add(panelLeft, BorderLayout.WEST);
        this.add(panelRight , BorderLayout.EAST);
        this.setSize(800 , 700);
        this.setLocationRelativeTo(null);
    
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource() == next && next.isEnabled()){
            page += 1;
            pageNumber.setText("        " + page); 
            for(int i = 0 ; i<mission.length ; ++i){
                mission[i].setText(String.valueOf(16*(page -1) + (i + 1)));
            }
            if(level > (page - 1) * 16){
                for(int i = 15 ; i >= level - ((page - 1) * 16) ; --i){
                    mission[i].setEnabled(false);
                }
            }
            else{
                for(int i = 0 ; i < mission.length ; ++i){
                    mission[i].setEnabled(false);
                }
            }

        }
        else if(e.getSource() == pervious && pervious.isEnabled()){
            page -= 1;
            pageNumber.setText("        " + page); 
            for(int i = 0 ; i<mission.length ; ++i){
                mission[i].setText(String.valueOf(16*(page -1) + (i + 1)));
            }
            if(level > (page - 1)  * 16 && level <= page * 16){
                for(int i = 0 ; i < level - (page - 1) * 16 ; ++i){
                    mission[i].setEnabled(true);
                }
            }
            else if(level > page * 16){
                for(int i = 0 ; i < mission.length ; ++i){
                    mission[i].setEnabled(true);
                }
            }
            else{
                for(int i = 0 ; i < mission.length ; ++i){
                    mission[i].setEnabled(false);
                }
            }
            

            // if(level <= 16){
            //     for(int i = 0 ; i < level ; ++i){
            //         mission[i].setEnabled(true);
            //     }
            // }
            // else if(level <=32){
            //     for(int i = 0 ; i < level -16 ; ++i){
            //         mission[i].setEnabled(true);
            //     }
            // }
            // else if(level <=48){
            //     for(int i = 0 ; i < level -32  ; ++i){
            //         mission[i].setEnabled(true);
            //     }
            // }
        }
        else if(e.getSource() == back){
            command = 1;
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
        Missions(e.getActionCommand());
    }
    public int getCommand(){
        if(t1 != null){
            return t1.getCommand();
        }
        else{
            return command;
        }
    }
    public void setCommand(int n){
        command= n;
    }
    public void DisposeGame(){
        if(t1 != null)
            t1.DisposeFrame();
    }
    public void Missions(String mission){
        currentLevel = Integer.parseInt(mission);
        switch(mission){
            case "1":
                double[]  arr1 = {1 , 68 , 79 , 180 , 200 , 0,0,0 ,0,0,0,0,0,0,0,0,0};
                this.setVisible(false);
                t1 = new Game(5, arr1 , Integer.parseInt(mission));
                t1.setSpeed(2);
                money =t1.getMoney();
                dispose();
                break;
            case "2":
                double[]  arr2 = {1 , 68 , 79 , 180  , 0,0,0};
                this.setVisible(false);
                t1 = new Game(4, arr2 , Integer.parseInt(mission));
                t1.setSpeed(-2);
                dispose();
                break;
            case "3":
                double[]  arr3 = {1 , 68 , 79 , 0,0,0};
                this.setVisible(false);
                t1 = new Game(3, arr3 , Integer.parseInt(mission));
                t1.setSpeed(2);
                dispose();
                break;
            case "4":
                double[]  arr4 = {1 , 61 , 122, 182,242, 302 , 0, 0, 0, 0, 0, 0, 0, 0,0,0};
                this.setVisible(false);
                t1 = new Game(6, arr4 , Integer.parseInt(mission));
                t1.setSpeed(-2);
                dispose();
                break;
            case "5":
                double[]  arr5 = {1 , 45 , 90, 135, 180, 225, 270, 315 , 0,0,0,0,0,0,0,0,0,0,0,0};
                this.setVisible(false);
                t1 = new Game(8, arr5 , Integer.parseInt(mission));
                t1.setSpeed(2);
                dispose();
                break;
            case "6":
                double[]  arr6 = {1 , 36 , 72,108 ,144, 180, 216,252, 288, 324,0,0,0,0,0 ,0,0,0,0,0,0};
                this.setVisible(false);
                t1 = new Game(10, arr6 , Integer.parseInt(mission)) ;
                t1.setSpeed(-2);
                dispose();
                break;
            case "7":
                double[]  arr7 = {1 , 30 , 60,90,120,150,180,210,240,270,300,330,0,0,0,0,0,0,0,0,0, 0,0,0};
                this.setVisible(false);
                t1 = new Game(12, arr7 , Integer.parseInt(mission));
                t1.setSpeed(2);
                dispose();
                break;
            case "8":
                double[]  arr8 = {1 , 30 , 60,90,120,150,180,210,240,270,300,330,0,0,0,0,0,0,0,0,0,0,0,0, 0,0,0};
                this.setVisible(false);
                t1 = new Game(12, arr8 , Integer.parseInt(mission));
                t1.setSpeed(-2);
                dispose();
                break;
            case "9":
                double[]  arr9 = {1 , 68 , 79 , 180 , 200 , 0,0,0 ,0,0,0,0,0,0,0,0,0};
                this.setVisible(false);
                t1 = new Game(5, arr9 , Integer.parseInt(mission));
                t1.setSpeed(4);
                money =t1.getMoney();
                dispose();
                break;
            case "10":
                double[]  arr10 = {1 , 68 , 79 , 180  , 0,0,0};
                this.setVisible(false);
                t1 = new Game(4, arr10 , Integer.parseInt(mission));
                t1.setSpeed(-4);
                dispose();
                break;
            case "11":
                double[]  arr11 = {1 , 68 , 79 , 0,0,0};
                this.setVisible(false);
                t1 = new Game(3, arr11 , Integer.parseInt(mission) );
                t1.setSpeed(4 );
                dispose();
                break;
            case "12":
                double[]  arr12 = {1 , 61 , 122, 182,242, 302 , 0, 0, 0, 0, 0, 0, 0, 0,0,0};
                this.setVisible(false);
                t1 = new Game(6, arr12 , Integer.parseInt(mission));
                t1.setSpeed(-4);
                dispose();
                break;
            case "13":
                double[]  arr13 = {1 , 45 , 90, 135, 180, 225, 270, 315 , 0,0,0,0,0,0,0,0,0,0,0,0};
                this.setVisible(false);
                t1 = new Game(8, arr13 , Integer.parseInt(mission));
                t1.setSpeed(4);
                dispose();
                break;
            case "14":
                double[]  arr14 = {1 , 36 , 72,108 ,144, 180, 216,252, 288, 324,0,0,0,0,0 ,0,0,0,0,0,0};
                this.setVisible(false);
                t1 = new Game(10, arr14 , Integer.parseInt(mission));
                t1.setSpeed(-4);
                dispose();
                break;
            case "15":
                double[]  arr15 = {1 , 30 , 60,90,120,150,180,210,240,270,300,330,0,0,0,0,0,0,0,0,0, 0,0,0};
                this.setVisible(false);
                t1 = new Game(12, arr15 , Integer.parseInt(mission));
                t1.setSpeed(4);
                dispose();
                break;
            case "16":
                double[]  arr16 = {1 , 30 , 60,90,120,150,180,210,240,270,300,330,0,0,0,0,0,0,0,0,0,0,0,0, 0,0,0};
                this.setVisible(false);
                t1 = new Game(12, arr16 , Integer.parseInt(mission));
                t1.setSpeed(-4);
                dispose();
                break;
            case "17":
                double[]  arr17 = {1 , 68 , 79 , 180 , 200 , 0,0,0 ,0,0,0,0,0,0,0,0,0};
                this.setVisible(false);
                t1 = new Game(5, arr17 , Integer.parseInt(mission));
                t1.setSpeed(6);
                money =t1.getMoney();
                break;
            case "18":
                double[]  arr18 = {1 , 68 , 79 , 180  , 0,0,0};
                this.setVisible(false);
                t1 = new Game(4, arr18 , Integer.parseInt(mission));
                t1.setSpeed(-6);
                dispose();
                break;
            case "19":
                double[]  arr19 = {1 , 68 , 79 , 0,0,0};
                this.setVisible(false);
                t1 = new Game(3, arr19 , Integer.parseInt(mission) );
                t1.setSpeed(6 );
                dispose();
                break;
            case "20":
                double[]  arr20 = {1 , 61 , 122, 182,242, 302 , 0, 0, 0, 0, 0, 0, 0, 0,0,0};
                this.setVisible(false);
                t1 = new Game(6, arr20 , Integer.parseInt(mission));
                t1.setSpeed(-6);
                dispose();
                break;
            case "21":
                double[]  arr21 = {1 , 45 , 90, 135, 180, 225, 270, 315 , 0,0,0,0,0,0,0,0,0,0,0,0};
                this.setVisible(false);
                t1 = new Game(8, arr21 , Integer.parseInt(mission));
                t1.setSpeed(6);
                dispose();
                break;
            case "22":
                double[]  arr22 = {1 , 36 , 72,108 ,144, 180, 216,252, 288, 324,0,0,0,0,0 ,0,0,0,0,0,0};
                this.setVisible(false);
                t1 = new Game(10, arr22 , Integer.parseInt(mission));
                t1.setSpeed(-6);
                dispose();
                break;
            case "23":
                double[]  arr23 = {1 , 30 , 60,90,120,150,180,210,240,270,300,330,0,0,0,0,0,0,0,0,0, 0,0,0};
                this.setVisible(false);
                t1 = new Game(12, arr23 , Integer.parseInt(mission));
                t1.setSpeed(6);
                dispose();
                break;
            case "24":
                double[]  arr24 = {1 , 30 , 60,90,120,150,180,210,240,270,300,330,0,0,0,0,0,0,0,0,0,0,0,0, 0,0,0};
                this.setVisible(false);
                t1 = new Game(12, arr24 , Integer.parseInt(mission));
                t1.setSpeed(-6);
                dispose();
                break;
                
            case "48":
                double[]  arr48 = {1 , 30 , 60,90,120,150,180,210,240,270,300,330,0};
                this.setVisible(false);
                t1 = new Game(11, arr48 , Integer.parseInt(mission));
                t1.setSpeed(-4);
                dispose();
                break;
                
        }
    }
    public int getCurrentLevel(){
        return currentLevel;
    }
}
