import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.Scanner;

public class VALS {
    private int MAX_level = 0;
    private int money = 0;
    private boolean SKIN_yellos_enabled = false;
    private String username;
    public VALS(String username){
        this.username = username;
        boolean checkUser=false;
        boolean checkPass=false;
        URL url = getClass().getResource("userScore.txt");
        File userPass1 = new File(new File(url.getPath()).getAbsolutePath());
        try {
            Scanner myReader = new Scanner(userPass1);
            while (myReader.hasNextLine()){
                String data = myReader.nextLine();
                if(data.substring(0,data.indexOf(':')).equals(username)){
                    checkUser=true;
                    this.money = Integer.parseInt(data.substring(data.indexOf(':')+1,data.length()));
                }
            
            }
        } catch (FileNotFoundException e) {
        }
    }
}
