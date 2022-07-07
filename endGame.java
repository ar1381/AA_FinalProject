import java.awt.*;
import java.awt.event.*;
import javax.swing.*;



public class endGame extends JPanel implements ActionListener{
    private JFrame frame;
    private JButton OKBUtton;
    private JButton RetryButton;
    private JButton nextButton;
    private boolean isLost;
    private JLabel label;
    private JLabel moneyLabel;
    private JLabel runTimeLabel;
    private int level;
    private double runTime;
    private double money;
    private int command = -1;
    private VALS v;
    private int nlevel = 0;
    private int nscore = 0;
    
    endGame(boolean isLost , int level , double TimeInSecond, VALS v){
        this.v = v;
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700 , 1000);
        frame.setLocationRelativeTo(null);
        frame.add(this);
        this.isLost = isLost;
        this.level = level;
        runTime = TimeInSecond;
        money = amountOfMoney();
        money = Math.round(money);
        this.setLayout(null);
        this.setBackground(Color.WHITE);
        OKBUtton = new JButton("OK");
        RetryButton = new JButton("Retry");
        nextButton = new JButton("Next");
        label = new JLabel();
        label.setFont(new Font("MV Boli" , Font.BOLD, 75));
        moneyLabel = new JLabel("Money : ");
        moneyLabel.setFont(new Font("MV Boli", Font.ITALIC , 25));
        moneyLabel.setForeground(new Color(0x949EC9));
        runTimeLabel = new JLabel("Time : ");
        runTimeLabel.setFont(new Font("MV Boli", Font.ITALIC , 25));
        runTimeLabel.setForeground(new Color(0x949EC9));

        OKBUtton.setFont(new Font("MV Boli" , Font.PLAIN , 20));
        OKBUtton.setBackground(new Color(0x949EC9));
        OKBUtton.setForeground(new Color(0x151B54));
        
        RetryButton.setFont(new Font("MV Boli" , Font.PLAIN , 20));
        RetryButton.setBackground(new Color(0x949EC9));
        RetryButton.setForeground(new Color(0x151B54));
        
        nextButton.setFont(new Font("MV Boli" , Font.PLAIN , 20));
        nextButton.setBackground(new Color(0x949EC9));
        nextButton.setForeground(new Color(0x151B54));

        RetryButton.addActionListener(this);
        this.add(OKBUtton);
        this.add(RetryButton);
        this.add(nextButton);
        this.add(label);
        this.add(moneyLabel);
        this.add(runTimeLabel);
        OKBUtton.addActionListener(this);
        nextButton.addActionListener(this);

        OKBUtton.setFocusable(false);
        RetryButton.setFocusable(false);
        nextButton.setFocusable(false);

        frame.setVisible(true);

    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        if (isLost){
            RetryButton.setBounds((1 * frame.getWidth()) / 3 - 50, (2 * frame.getHeight())/3, 100, 40);
            OKBUtton.setBounds((2 * frame.getWidth()) / 3 - 50, (2 * frame.getHeight())/3, 100, 40);
            label.setForeground(Color.red);
            label.setText("Fail");
            label.setBounds(frame.getWidth() / 2 - 75 , frame.getHeight()/3 , 200 ,75);
        }
        else {
            if ( nlevel == 0&& level + 1> v.getLevel() && level <= 47){
                v.ChangeLevel(level + 1);
                nlevel++;
            }
            if(nscore == 0){
                v.changeScore((int) money);
                nscore++;
            }
            OKBUtton.setBounds((1 * frame.getWidth()) / 6 - 50, (2 * frame.getHeight())/3, 100, 40);
            RetryButton.setBounds((1 * frame.getWidth()) /2 - 50 , (2 * frame.getHeight())/3, 100, 40);
            nextButton.setBounds((5 * frame.getWidth()) / 6 - 50 , (2 * frame.getHeight())/3, 100, 40);
            if(level == 48){
                nextButton.setEnabled(false);
            }
            label.setForeground(Color.green);
            label.setText("Success");
            label.setBounds(frame.getWidth() / 2 - 145 , frame.getHeight()/3 , 350 ,75);
        }
        runTimeLabel.setText("Time : " + (int) runTime / 60 + ":" + String.valueOf((String.valueOf((int)runTime % 60).length() == 2) ? ((int)runTime % 60) : ("0" +(int) runTime % 60))+ " (min)");
        runTimeLabel.setBounds((4 * frame.getWidth()) / 6 - 100 , frame.getHeight() / 2, 300, 30);
        moneyLabel.setText("Score : " + money);
        moneyLabel.setBounds( (2 * frame.getWidth()) / 6  - 100 , frame.getHeight() / 2, 300, 30);
     }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == OKBUtton){
            if(isLost)
                command = 2;
            else
                command = 11;// means you have won
        }
        else if(e.getSource() == RetryButton){
            command = 22;
        }
        else if(e.getSource() == nextButton){
            command = 21;
        }
        else{
            repaint();
        }
        
    }
    public double amountOfMoney(){
        double n;
        if(runTime < 1){
            runTime = 1;
        }
        if (isLost)
            return 0;
        if(level < 10){
            n = (10 * level / runTime) ;
            return n;
        }
        if(level < 20){
            n = (15 * level / runTime);
            return n;
        }
        if(level < 30){
            n = (10 * level / runTime);
            return n ;
        }
        if(level < 40){
            n = (15 * level / runTime);
            return n;
        }
        else{
            n = (20 * level/ runTime);
            return n;
        }
    }
    public int getCommand(){
        return command;
    }
    // @Override
    // public void mouseClicked(java.awt.event.MouseEvent e) {
        
    // }
    // @Override
    // public void mousePressed(java.awt.event.MouseEvent e) {
    //     // TODO Auto-generated method stub
        
    // }
    // @Override
    // public void mouseReleased(java.awt.event.MouseEvent e) {
    //     // TODO Auto-generated method stub
        
    // }
    // @Override
    // public void mouseEntered(java.awt.event.MouseEvent e) {
    //     // TODO Auto-generated method stub
        
    // }
    // @Override
    // public void mouseExited(java.awt.event.MouseEvent e) {
    //     // TODO Auto-generated method stub
        
    //}
    public void DisposeFrame(){
        command = -1;
        frame.dispose();
    }
}
