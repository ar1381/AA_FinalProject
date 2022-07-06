import javax.swing.*;
import java.io.*;
import java.net.URL;

public class GameUser {
    private int level;
    private int[] items;
    private String userName;

    GameUser(int level , int[] items , String userName){
        this.level = level;
        this.items = items;
        this.userName = userName;
        try{
            BufferedWriter passWriter=new BufferedWriter(new FileWriter("Level.txt",true));
            passWriter.write(this.userName+":"+this.level+"\n");
            passWriter.close();
            BufferedWriter  scoreWriter=new BufferedWriter(new FileWriter("Market_Items.txt",true));
            scoreWriter.write(this.userName+":");
            for (int i = 0 ; i < items.length ; ++i){
                scoreWriter.write(String.valueOf(items[i]));
            }
            scoreWriter.write("\n");
            scoreWriter.close();

        }catch(IOException e){
            JOptionPane.showMessageDialog(null,"file doesn't exist");

        }
    }
    public static void main(String[] args) {
        int[] i = {0 , 0, 0, 0,0};
        new GameUser(3,i, "M");
    }

}
