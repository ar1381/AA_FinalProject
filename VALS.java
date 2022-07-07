import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import javax.sql.rowset.spi.SyncResolver;

public class VALS {
    private int MAX_level = 0;
    private int money = 0;
    private String SKIN_enabled = "DefaultArrow.png";
    private boolean SKIN_yellow_bought = false;
    private boolean SKIN_green_bought = false;
    private boolean SKIN_white_bought = false;
    private boolean SKIN_purple_bought = false;
    private boolean SKIN_red_bought = false;
    private String selectedSkin = "DefaultArrow.png";
    private String username;
    private String marketItems;
    private String filePath;
    private GameUser gameUser;
    public VALS(String username){
        this.username = username;
        getMarketItems();
        getMaxLevel();
        enable_Green();
        enable_Purple();
        enable_Red();
        enable_White();
        enable_yellow();
        URL url = getClass().getResource("userScore.txt");
        File userPass1 = new File(new File(url.getPath()).getAbsolutePath());
        try {
            Scanner myReader = new Scanner(userPass1);
            while (myReader.hasNextLine()){
                String data = myReader.nextLine();
                if(data.substring(0,data.indexOf(':')).equals(username)){
                    this.money = Integer.parseInt(data.substring(data.indexOf(':')+1,data.length()));
                }
            
            }
            myReader.close();
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
    public void enable_yellow(){
        if(marketItems.charAt(0) == '1'){
            SKIN_yellow_bought = true;
        }
        if(marketItems.charAt(0) == '2'){
            SKIN_yellow_bought= true;
            selectedSkin = "YellowArrow.png";
        }
    }
    public void enable_Green(){
        if(marketItems.charAt(1) == '1'){
            SKIN_green_bought = true;
        }
        if(marketItems.charAt(1) == '2'){
            SKIN_green_bought= true;
            selectedSkin = "GreenArrow.png";
        }
    }
    public void enable_White(){
        if(marketItems.charAt(2) == '1'){
            SKIN_white_bought = true;
        }
        if(marketItems.charAt(2) == '2'){
            SKIN_white_bought= true;
            selectedSkin = "WhiteArrow.png";
        }
    }
    public void enable_Purple(){
        if(marketItems.charAt(3) == '1'){
            SKIN_purple_bought = true;
        }
        if(marketItems.charAt(3) == '2'){
            SKIN_purple_bought= true;
            selectedSkin = "PurpleArrow.png";
        }
    }
    public void enable_Red(){
        if(marketItems.charAt(4) == '1'){
            SKIN_red_bought = true;
        }
        if(marketItems.charAt(4) == '2'){
            SKIN_red_bought= true;
            selectedSkin = "RedArrow.png";
        }
    }
    private void getMaxLevel(){

        filePath = "Level.txt";
        try {
            Scanner myReader = new Scanner(new File(filePath));
            while (myReader.hasNextLine()){
                String data = myReader.nextLine();
                if(data.substring(0,data.indexOf(':')).equals(username)){
                    MAX_level =Integer.parseInt(data.substring(username.length()+ 1,data.length())) ;
                }
            
            }
            myReader.close();
        } catch (FileNotFoundException e) {
        }  
    }
    private void getMarketItems(){
            filePath = "Market_Items.txt";
        try {
            Scanner myReader = new Scanner(new File(filePath));
            while (myReader.hasNextLine()){
                try{
                String data = myReader.nextLine();
                if(data.substring(0,data.indexOf(':')).equals(username)){
                    marketItems = data.substring(username.length()+ 1, username.length() +6);
                }
            }catch(Exception e){}
            }
            if (marketItems == null){
                int[] arr = {0,0,0,0,0};
                gameUser = new GameUser(1, arr, username);
                getMarketItems();
            }
            myReader.close();
        } catch (FileNotFoundException e) {
        }  
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
    public void changeMarketItems(String items){
        try{
            filePath = "Market_Items.txt";
            Scanner sc = new Scanner(new File(filePath));
            StringBuffer buffer = new StringBuffer();
            while (sc.hasNextLine()) {
                buffer.append(sc.nextLine()+System.lineSeparator());
            }
            String fileContents = buffer.toString();
            sc.close();
            String oldLine =username+":"+marketItems ;
            String newLine = username+":"+items;
            fileContents = fileContents.replaceAll(oldLine, newLine);
            FileWriter writer = new FileWriter(filePath);
            writer.append(fileContents);
            writer.flush();
            writer.close();
        }catch(IOException e){
        }
        marketItems = items;
        enable_Green();
        enable_Purple();
        enable_Red();
        enable_White();
        enable_yellow();
    }
    public void ChangeLevel(int newLevel){
        try{
        filePath = "Level.txt";
        Scanner sc = new Scanner(new File(filePath));
        StringBuffer buffer = new StringBuffer();
        while (sc.hasNextLine()) {
            buffer.append(sc.nextLine()+System.lineSeparator());
        }
        String fileContents = buffer.toString();
        sc.close();
        String oldLine =username+":"+MAX_level ;
        String newLine = username+":"+newLevel;
        fileContents = fileContents.replaceAll(oldLine, newLine);
        FileWriter writer = new FileWriter(filePath);
        writer.append(fileContents);
        writer.flush();
        writer.close();
    }catch(IOException e){
    }
    MAX_level = newLevel;
    }
    public int getLevel(){
        return MAX_level;
    }
    public void changeScore(int score){
        try{
            filePath = "userScore.txt";
            Scanner sc = new Scanner(new File(filePath));
            StringBuffer buffer = new StringBuffer();
            while (sc.hasNextLine()) {
                buffer.append(sc.nextLine()+System.lineSeparator());
            }
            String fileContents = buffer.toString();
            sc.close();
            String oldLine = username+":"+money ;
            int n = money + score;
            String newLine = username+":"+n;
            fileContents = fileContents.replaceAll(oldLine, newLine);
            FileWriter writer = new FileWriter(filePath);
            writer.append(fileContents);
            writer.flush();
            writer.close();
        }catch(IOException e){
        }
        money += score; 
    }
    public String getItems(){
        return marketItems;
    }
    public String getSelectedSkin(){
        return selectedSkin;
    }
}
