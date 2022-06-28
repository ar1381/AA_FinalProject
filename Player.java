import java.util.HashMap;

public class Player {
    static public HashMap<String, String> userPass = new HashMap<>();
    static public HashMap<String, Long> userScore = new HashMap<>();


    private String userName;
    private String password;
    private long score;

    public Player() {
        addUserPass(userName, password);
        addUserScore(userName, score);
//        
    }
//
//    public Player(String userName, String password) {
//        this.userName = userName;
//        this.password = password;
//        addUserPass(userName, password);
//        addUserScore(userName, score);
//
//    }
    
     public static HashMap<String,String> getUserPass(){
        return userPass;
    }
   public static   HashMap<String,Long> getUserScore(){
        return userScore;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getScore() {
        return score;
    }

    public void setScore(long score) {
        this.score = score;
    }

    public static void addUserPass(String userName, String password) {
        userPass.put(userName, password);
    }

    public static void addUserScore(String userName, long score) {
        userScore.put(userName, score);
    }
    public static void replaceScore(String userName,long score){
        userScore.replace(userName,score);
    }




}

