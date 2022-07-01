import javax.imageio.ImageIO;
import java.awt.*;
import javax.sound.sampled.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.geom.AffineTransform;
import java.net.URL;
import javax.swing.Timer;
public class Game<url> extends JPanel implements ActionListener , MouseListener{
    private double speed = 2;
    private int numberOfNeedle = 1;
    private boolean trowing = false;
    private int trowingY = 490;
    private boolean randomDirction = false;
    private boolean isLost = false;
    private boolean isEnd= false;
    private double[] arr ;
    private Timer timer = new Timer(10, this);
    private JFrame frame = new JFrame();
    private int imageY = -177;
    private int imageX = 3;
    private int imageRadian = -3;
    private AffineTransform at;
    private BufferedImage arrow;
    private double money;
    URL url = getClass().getResource("DefaultArrow.png");
    private String imagePathName = new File(url.getPath()).getAbsolutePath();
    URL url2 = getClass().getResource("SoundOn.png");
    private ImageIcon soundOn = new ImageIcon(new File(url2.getPath()).getAbsolutePath());
    URL url3 = getClass().getResource("SoundOff.png");
    private ImageIcon soundOff = new ImageIcon(new File(url3.getPath()).getAbsolutePath());
    URL url4 = getClass().getResource("pausep.png");
    private ImageIcon pauseON = new ImageIcon(new File(url4.getPath()).getAbsolutePath());
    private JCheckBox Sound = new JCheckBox();
    private JCheckBox pause = new JCheckBox();
    private int n = 0;
    private double startTime;
    private double endTime;
    private int level;// should add a label
    private endGame g;
    SimpleAudioPlayer audioPlayer;
    Game(int HitBalls , double[] arr , int level){
        frame.setSize(800 , 1000);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(this);
        this.arr = arr;
        this.level = level;
        this.addMouseListener(this);
        numberOfNeedle = HitBalls;
        arrow = loadImage(imagePathName);
        this.setLayout(null);
        Sound.setSelectedIcon(soundOff);
        Sound.setIcon(soundOn);
        pause.setSelectedIcon(pauseON);
        pause.setIcon(pauseON);
        try {
            audioPlayer = new SimpleAudioPlayer();
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        timer.start();
        startTime = System.nanoTime()/ Math.pow(10, 9);
        frame.setVisible(true);

    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D)g;
        pause.setBounds((4 *frame.getWidth())/5, 10, 100, 100);
        pause.addActionListener(this);
        this.add(pause);
        Sound.setBounds((3 *frame.getWidth())/4   , (3*frame.getHeight()) /4 , 200 , 100);
        this.add(Sound);
        if(isEnd){
            if(isLost){
            g2d.setPaint(Color.red);
            Sound.setBackground(Color.red);
            g2d.fillRect(0, 0, frame.getWidth() , frame.getHeight());   
            g2d.setFont(new Font("MV Boli" , Font.BOLD,30));
            g2d.setPaint(Color.BLACK);   
            g2d.drawString("You Lost!",frame.getWidth() / 2 - 80, (3 * frame.getHeight()) / 5);
            }
            else{
                g2d.setPaint(Color.GREEN);
                Sound.setBackground(Color.green);
                g2d.fillRect(0, 0, frame.getWidth() , frame.getHeight());   
                g2d.setFont(new Font("MV Boli" , Font.BOLD,30));
                g2d.setPaint(Color.BLACK);   
                g2d.drawString("You Win!",frame.getWidth() / 2 - 80, (3 * frame.getHeight()) / 5);
            }   
            g2d.setFont(new Font("MV Boli" , Font.PLAIN,20));
            g2d.drawString("when you are ready click on screen!", frame.getWidth()/2 - 170, (3*frame.getHeight())/5 + 50);

        }
        for(int i = 0 ; i < numberOfNeedle; i++){
            at = AffineTransform.getTranslateInstance((frame.getWidth() / 2 )  + imageX, (frame.getHeight() / 2) +imageY );
            at.rotate(Math.toRadians(arr[i]),imageRadian , imageRadian);
            g2d.setPaint(Color.black);
            g2d.fillOval( (frame.getWidth() / 2) -100 , (frame.getHeight() / 2) - 280 , 200, 200);
            g2d.setPaint(Color.white);            
            g2d.setFont(new Font("MV Boli" , Font.PLAIN,50));
            String needleLeft = String.valueOf(arr.length - numberOfNeedle);
            g2d.drawString(needleLeft, (frame.getWidth() / 2) -20 -((needleLeft.length() - 1)*5), (frame.getHeight() / 2) - 160 );
            g2d.drawImage(arrow, at , null);
            if(trowing){
                if(!isEnd){
                at = AffineTransform.getTranslateInstance((frame.getWidth() / 2 ) , trowingY);
                at.rotate(Math.toRadians(45));
                g2d.drawImage(arrow, at , null);
                trowingY -= 15;
                if(trowingY <= (frame.getHeight()/2) +imageY + arrow.getHeight())
                    trowing= false;
                }
            }
                if(numberOfNeedle != arr.length ){
                at = AffineTransform.getTranslateInstance((frame.getWidth() / 2 ) , 500 );
                at.rotate(Math.toRadians(45));
                g2d.drawImage(arrow, at , null);
            }
    }
    }
    BufferedImage loadImage(String Filename){
        BufferedImage img = null;
        try{
        img = ImageIO.read(new File(Filename));
        }catch(IOException e){

        }
        return img;
    }
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == pause){
        
        }
        if(randomDirction){
            speed *= randomSpin(true);
        }
        for(int i = 0; i < numberOfNeedle ; ++i){
            arr[i] += speed;
            if (arr[i] >= 360){
                arr[i] = 0;
            }
            else if (arr[i] <= 0)
                arr[i] = 360;
        }
        repaint();
    }
    @Override
    public void mouseClicked(MouseEvent e){
        //invoked when a mouse button has been clicked (pressed and released) on a component
        try
        {
        audioPlayer.clip.stop();
        audioPlayer.clip.setMicrosecondPosition(0);
        audioPlayer.clip.start();
        }
        catch (Exception ex)
        {
            System.out.println("Error with playing sound.");
            ex.printStackTrace();
        }

        if(!isEnd){
            arr[numberOfNeedle] =45;
            numberOfNeedle += 1;
            trowing = true;
            
            if(lost()){
                timer.stop();
                isLost = true;
                isEnd = true;
                repaint();
                endTime = System.nanoTime()/  Math.pow(10, 9);
            }
            else if(numberOfNeedle == arr.length ){
                isEnd = true;
                timer.stop();
                repaint();
                endTime = System.nanoTime()/  Math.pow(10, 9);
            }
        }
        else {
            if(n == 0){
            gameEnd();
            n++;
            }
        }
    }
    @Override
    public void mousePressed(MouseEvent e){
        //invoked when a mouse button has been pressed on a compponent
    }
    @Override
    public void mouseReleased(MouseEvent e){
        //invoked when a mouse button has been released on a component 
    }
    @Override
    public void mouseEntered(MouseEvent e){
        //invoked when the mouse enters a component

    }
    @Override
    public void mouseExited(MouseEvent e){
        //involed when the mouse exits a component

    }
    public void setSpeed(double speed){
        this.speed = speed;
    }
    public int randomSpin(boolean t){
        randomDirction = t;
        int randoms = (int) (Math.random() * 400);
        if(randoms == 1){
            return -1;
        }
        return 1;
    }
    public boolean lost(){
        for (int i = 0 ; i < numberOfNeedle  - 1 ; ++i){
            if (  37 <= arr[i] && 53 >= arr[i]){   
            return true;
            }
        }  
        return false;
    }
    public void setArrowTheme(String fileName , int x , int y , int radian){
        imageRadian =radian;
        imagePathName = fileName;
        imageX = x;
        imageY = y;
    }
    public void gameEnd(){
        this.setVisible(false);
        g = new endGame(isLost, level,  (int)endTime - startTime);
        frame.setVisible(false);
        money = g.amountOfMoney();
    }
    public void DisposeFrame(){
        frame.dispose();
        g.DisposeFrame();
    }
    public int getCommand(){
        if(g != null)
            return g.getCommand();
        return -1;
    }
    public double getMoney(){
        return money;
    }

}