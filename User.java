import javax.swing.*;
import java.io.*;
import java.net.URL;

public class User {
    private String userName;
    private String password;
    private long score;

    User(String userName,String password){
        this.userName=userName;
        this.password=password;
        score=0;
        try{
            URL url = getClass().getResource("userPass.txt");
            BufferedWriter passWriter=new BufferedWriter(new FileWriter(new File(url.getPath()).getAbsolutePath(),true));
            passWriter.write(this.userName+":"+this.password+"\n");
            passWriter.close();
            URL url2 = getClass().getResource("userScore.txt");
            BufferedWriter  scoreWriter=new BufferedWriter(new FileWriter(new File(url.getPath()).getAbsolutePath(),true));
            scoreWriter.write(this.userName+":"+score+"\n");
            scoreWriter.close();

        }catch(IOException e){
            JOptionPane.showMessageDialog(null,"file doesn't exist");

        }
    }

    public static void main(String[] args) {
        var a=new User("arma","1234");
    }
}
