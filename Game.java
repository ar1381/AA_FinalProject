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
    JButton okButton = new JButton("OK");
    JLabel label = new JLabel();
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
                trowingY -=15;
                if(trowingY <= (frame.getHeight()/2) +imageY + arrow.getHeight())
                    trowing= false;
                }
                if(lost()){
                    timer.stop();
                    isLost = true;
                    isEnd = true;
                    repaint();
                    g2d.setPaint(Color.black);
                    g2d.fillRect(frame.getWidth()/2 - 135,frame.getHeight()/2 - 210, 270, 420);
                    g2d.setPaint(Color.blue);
                    g2d.fillRect(frame.getWidth()/2 - 125,frame.getHeight()/2 - 200, 250, 400);
                    this.add(okButton);
                    okButton.setBounds(frame.getWidth() / 2 -25 , frame.getHeight()/ 2 +70, 50, 25);
                    okButton.setBackground(Color.yellow);
                    okButton.setForeground(Color.blue);
                    label.setFont(new Font("MV Boli" , Font.PLAIN,75));
                    label.setForeground(Color.red);
                    label.setText("Game Over");
                    this.add(label);
                    label.setBounds(frame.getWidth() / 2 -100 , frame.getHeight()/ 2 -150, 200, 75);

                }
                    else if(numberOfNeedle == arr.length ){
                        isEnd = true;
                        timer.stop();
                        endGame(isLost);
                        repaint();
                    }
            }
            else{
                if(numberOfNeedle != arr.length){
                at = AffineTransform.getTranslateInstance((frame.getWidth() / 2 ) , 500 );
                at.rotate(Math.toRadians(45));
                g2d.drawImage(arrow, at , null);
                }
            }
    }
    // if(isEnd){
    //     g2d.setFont(new Font("MV Boli" , Font.PLAIN,75));
    //     g2d.setPaint(Color.black);
    //     if(isLost){
    //         g2d.drawString("Game Over", (frame.getWidth()/ 2) - 200, (frame.getHeight() / 2)+250);
    //     }
    //     else{
    //         g2d.drawString("Victory", (frame.getWidth() / 2) - 130, (frame.getHeight() / 2) +250);
    //     }
    // }
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
        try{
            arr[numberOfNeedle] =45;
            numberOfNeedle += 1;
            trowing = true;
            }catch(Exception o){

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
        Graphics2D g = (Graphics2D) this.getGraphics();
        g.setPaint(Color.black);
        g.fillRect(frame.getWidth()/2 - 135,frame.getHeight()/2 - 210, 270, 420);
        g.setPaint(Color.blue);
        g.fillRect(frame.getWidth()/2 - 125,frame.getHeight()/2 - 200, 250, 400);
        this.add(okButton);
        okButton.setBackground(Color.yellow);
        okButton.setForeground(Color.blue);
        if(isLost){
            label.setForeground(Color.red);
            label.setText("Game Over");
        }
        else{
            label.setForeground(Color.green);
            label.setText("Victory");
        }
        okButton.setBounds((2*frame.getWidth() )/ 3 , (2 * frame.getHeight())/ 3 , 100,100);
        this.add(label);
        label.setBounds(frame.getWidth() / 2  -125, frame.getHeight()/2 - 40 , 250 , 75);
    }

}