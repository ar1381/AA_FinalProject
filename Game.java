import javax.imageio.ImageIO;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.awt.geom.AffineTransform;
import javax.swing.Timer;
public class Game extends JPanel implements ActionListener , MouseListener{
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
    private String imagePathName = "DefaultArrow.png";
    private ImageIcon soundOn = new ImageIcon("SoundOn.png");
    private ImageIcon soundOff = new ImageIcon("SoundOff.png");
    private JCheckBox Sound = new JCheckBox();
    Game(int HitBalls , double[] arr){
        frame.setSize(800 , 1000);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(this);
        this.arr = arr;
        this.addMouseListener(this);
        numberOfNeedle = HitBalls;
        arrow = loadImage(imagePathName);
        this.setLayout(null);
        Sound.setSelectedIcon(soundOff);
        Sound.setIcon(soundOn);
        timer.start();
        frame.setVisible(true);

    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D)g;
        Sound.setBounds((3 *frame.getWidth())/4   , (3*frame.getHeight()) /4 , 200 , 100);
        this.add(Sound);
        if(isEnd){
            if(isLost){
            g2d.setPaint(Color.red);
            Sound.setBackground(Color.red);
            }
            else{
                g2d.setPaint(Color.GREEN);
                Sound.setBackground(Color.green);
            }
            g2d.fillRect(0, 0, frame.getWidth() , frame.getHeight());
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
        double start = System.nanoTime();
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
        if(arr[0] == 0){
            double end = System.nanoTime();
            System.out.println((end - start) / Math.pow(10, 9));
        }
    }
    @Override
    public void mouseClicked(MouseEvent e){
        //invoked when a mouse button has been clicked (pressed and released) on a component
        if(!isEnd){
            arr[numberOfNeedle] =45;
            numberOfNeedle += 1;
            trowing = true;
            
            if(lost()){
                timer.stop();
                isLost = true;
                isEnd = true;
                repaint();
                endGame(isLost);
            }
            else if(numberOfNeedle == arr.length ){
                isEnd = true;
                timer.stop();
                repaint();
                endGame(isLost);
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
    public void endGame(boolean isLost){
        // try {
        //     Thread.sleep(50);
        // } catch (InterruptedException e) {
        //     System.out.println("INNNNN");
        // }
        // JFrame frame1 = new JFrame();
        // frame1.setSize(800 , 1000);
        // frame1.setLocationRelativeTo(null);
        // frame1.setBackground(Color.WHITE);
        // frame1.setLayout(null);
        // JLabel label = new JLabel();
        // label.setFont(new Font("MV Boli" , Font.BOLD , 75));
        // if(isLost){
        //     label.setText("Game Over");
        //     label.setForeground(Color.RED);
        // }
        // else {
        //     label.setText("Sucsses");
        //     label.setForeground(Color.GREEN); 
        // }
        // label.setPreferredSize();
        // frame1.setVisible(true);
        // frame.setVisible(false);

    }

}