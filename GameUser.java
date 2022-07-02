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
            URL url = getClass().getResource("Level.txt");
            BufferedWriter levelWriter = new BufferedWriter(new FileWriter(new File(url.getPath()).getAbsolutePath(),true));
            levelWriter.write(userName+":"+level+"\n");
            levelWriter.close();
            URL url2 = getClass().getResource("Market_Items.txt");
            BufferedWriter  itemsWriter=new BufferedWriter(new FileWriter(new File(url.getPath()).getAbsolutePath(),true));
            itemsWriter.write(userName+":");
            for(int i = 0 ; i < items.length - 1; ++i){
                itemsWriter.write(String.valueOf(items[i]));
            }
            itemsWriter.write(items[4] + "}\n");
            itemsWriter.close();
            System.out.println("Finish");


        }catch(IOException e){
            JOptionPane.showMessageDialog(null,"file doesn't exist");

        }
    }

}
