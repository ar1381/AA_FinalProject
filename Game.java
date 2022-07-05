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
import java.util.Arrays;

import javax.swing.Timer;
public class Game<url> extends JPanel implements ActionListener , MouseListener{
    private boolean isPaused = false;
    private boolean pauseOpened = false;
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
    private String imagePathName;
    URL url2 = getClass().getResource("SoundOn.png");
    private ImageIcon soundOn = new ImageIcon(new File(url2.getPath()).getAbsolutePath());
    URL url3 = getClass().getResource("SoundOff.png");
    private ImageIcon soundOff = new ImageIcon(new File(url3.getPath()).getAbsolutePath());
    URL url4 = getClass().getResource("p2.png");
    private ImageIcon pauseON = new ImageIcon(new File(url4.getPath()).getAbsolutePath());
    private JCheckBox Sound = new JCheckBox();
    private JCheckBox pause = new JCheckBox();
    private pauseMenu pausemenu = new pauseMenu();;
    private int n = 0;
    private double startTime;
    private double endTime;
    private int level;// should add a label
    private endGame g;
    private SimpleAudioPlayer audioPlayer;
    private boolean reduceSpeedInGame = false;
    private int[] reduseDegree;
    VALS v;
    Game(int HitBalls , double[] arr , int level, VALS v){
        this.v = v;
//        URL url = getClass().getResource(v.getSKIN_enabled());
        imagePathName = v.getSKIN_enabled();
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
        pause.addActionListener(this);
        try {
            audioPlayer = new SimpleAudioPlayer("Blop-Free-Sound-Effect.wav");
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
        this.add(pause);
        Sound.setBounds((3 *frame.getWidth())/4   , (3*frame.getHeight()) /4 , 200 , 100);
        this.add(Sound);
        if(isEnd){
            if(isLost){
            g2d.setPaint(Color.red);
            Sound.setBackground(Color.red);
            pause.setBackground(Color.red);
            g2d.fillRect(0, 0, frame.getWidth() , frame.getHeight());   
            g2d.setFont(new Font("MV Boli" , Font.BOLD,30));
            g2d.setPaint(Color.BLACK);   
            g2d.drawString("You Lost!",frame.getWidth() / 2 - 80, (3 * frame.getHeight()) / 5);
            }
            else{
                g2d.setPaint(Color.GREEN);
                Sound.setBackground(Color.green);
                pause.setBackground(Color.green);
                g2d.fillRect(0, 0, frame.getWidth() , frame.getHeight());   
                g2d.setFont(new Font("MV Boli" , Font.BOLD,30));
                g2d.setPaint(Color.BLACK);   
                g2d.drawString("You Win!",frame.getWidth() / 2 - 80, (3 * frame.getHeight()) / 5);
            }   
            g2d.setFont(new Font("MV Boli" , Font.PLAIN,20));
            g2d.drawString("when you are ready click on screen!", frame.getWidth()/2 - 170, (3*frame.getHeight())/5 + 50);

        }
            for (int i = 0; i < numberOfNeedle; i++) {
                at = AffineTransform.getTranslateInstance((frame.getWidth() / 2) + imageX, (frame.getHeight() / 2) + imageY);
                at.rotate(Math.toRadians(arr[i]), imageRadian, imageRadian);
                g2d.setPaint(Color.black);
                g2d.fillOval((frame.getWidth() / 2) - 100, (frame.getHeight() / 2) - 280, 200, 200);
                g2d.setPaint(Color.white);
                g2d.setFont(new Font("MV Boli", Font.PLAIN, 50));
                String needleLeft = String.valueOf(arr.length - numberOfNeedle);
                g2d.drawString(needleLeft, (frame.getWidth() / 2) - 20 - ((needleLeft.length() - 1) * 5), (frame.getHeight() / 2) - 160);
                g2d.drawImage(arrow, at, null);
                if (trowing) {
                    if (!isEnd) {
                        at = AffineTransform.getTranslateInstance((frame.getWidth() / 2), trowingY);
                        at.rotate(Math.toRadians(45));
                        g2d.drawImage(arrow, at, null);
                        trowingY -= 15;
                        if (trowingY <= (frame.getHeight() / 2) + imageY + arrow.getHeight())
                            trowing = false;
                    }
                }
                if (numberOfNeedle != arr.length) {
                    at = AffineTransform.getTranslateInstance((frame.getWidth() / 2), 500);
                    at.rotate(Math.toRadians(45));
                    g2d.drawImage(arrow, at, null);
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
        if(pauseOpened ){
            if(!pausemenu.isP()){
                isPaused = pausemenu.isP();
                pauseOpened = false;
                pausemenu.dispose();
            }
        }
        if(!pausemenu.isP()){
            isPaused = false;
            pauseOpened = false;
        }
        if (e.getSource() == pause){
            isPaused = true;
            if (!pauseOpened) {
                pausemenu.setisP(true);
                pausemenu.setVisible(true);
                pauseOpened = true;
            }
            if(!pausemenu.isP()){
                isPaused = pausemenu.isP();
            }

        }
        if(randomDirction){
            speed *= randomSpin(true);
        }
        if (!isPaused) {
            for (int i = 0; i < numberOfNeedle; ++i) {
                arr[i] += speed;
                if (arr[i] >= 360) {
                    arr[i] = 0;
                } else if (arr[i] <= 0)
                    arr[i] = 360;
            }
            if(reduceSpeedInGame){
                for(int j = 0; j < reduseDegree.length ; ++j){
                        if(arr[0] >= reduseDegree[j] && arr[0] < reduseDegree[j] + speed || arr[0] >= reduseDegree[j] && arr[0] < reduseDegree[j] - speed){
                            if(j % 2 == 1)
                                speed *= 2;
                            else
                                speed /= 2;
                        }
                }
            }
        }
        repaint();
    }
    @Override
    public void mouseClicked(MouseEvent e){
        //invoked when a mouse button has been clicked (pressed and released) on a component
        if(!Sound.isSelected() && !pauseOpened){
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
        }

        if(!isEnd && !isPaused){
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
        else if(isEnd) {
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
    public void reduceSpeed( int[] degree ){
        reduceSpeedInGame = true;
        reduseDegree = degree;
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
        if(g != null)
            g.DisposeFrame();
    }
    public int getCommand(){
        if(g != null)
            return g.getCommand();
        if(isPaused)
            return pausemenu.getCommand();
        return -1;
    }
    public double getMoney(){
        return money;
    }
}