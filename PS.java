
import java.util.HashMap;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Mohammad Mahdi Eyni
 */
public class PS {
    private HashMap<String, String> userPass = new HashMap<>();
    private HashMap<String, Long> userScore = new HashMap<>();
    
    private static final PS instance=new PS();
    
    private PS(){}
    
    public static PS getInstance(){
        return instance;
    }
    public HashMap<String, String> getUserPass(){
        return userPass;
    }
    public HashMap<String, Long> getUserScore(){
        return userScore;
    }
    public void putUserPass(String user,String pass){
        userPass.put(user, pass);
              
    }
    public void putUserScore(String user,long score){
        userScore.put(user, score);
              
    }
    
    
}
