import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.Scanner;

public class VALS {
    private int MAX_level = 0;
    private int money = 0;
    private String SKIN_enabled = "DefaultArrow.png";
    private boolean SKIN_yellow_bought = false;
    private boolean SKIN_green_bought = false;
    private boolean SKIN_white_bought = false;
    private boolean SKIN_purple_bought = false;
    private boolean SKIN_red_bought = false;
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
    
    public boolean isSKIN_yellow_bought() {
        return SKIN_yellow_bought;
    }
    
    public String getSKIN_enabled() {
        return SKIN_enabled;
    }
    public void setSKIN_enabled(String s){
        this.SKIN_enabled = s;
    }
    public int getMoney(){
        return money;
    }
    public void setMoney(int m){
        this.money = m;
        //file thing
    }
    public void enable_yellow(){
        //file thing
    }
    
    public boolean isSKIN_green_bought() {
        return SKIN_green_bought;
    }
    
    public void setSKIN_green_bought(boolean SKIN_green_bought) {
        this.SKIN_green_bought = SKIN_green_bought;
    }
    
    public boolean isSKIN_white_bought() {
        return SKIN_white_bought;
    }
    
    public void setSKIN_white_bought(boolean SKIN_white_bought) {
        this.SKIN_white_bought = SKIN_white_bought;
    }
    
    public boolean isSKIN_purple_bought() {
        return SKIN_purple_bought;
    }
    
    public void setSKIN_purple_bought(boolean SKIN_purple_bought) {
        this.SKIN_purple_bought = SKIN_purple_bought;
    }
    
    public boolean isSKIN_red_bought() {
        return SKIN_red_bought;
    }
    
    public void setSKIN_red_bought(boolean SKIN_red_bought) {
        this.SKIN_red_bought = SKIN_red_bought;
    }
}
