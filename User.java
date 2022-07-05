import javax.swing.*;
import java.io.*;

public class User {
    private String userName;
    private String password;
    private long score;

    User(String userName,String password){
        this.userName=userName;
        this.password=password;
        score=0;
        try{
            BufferedWriter passWriter=new BufferedWriter(new FileWriter("userPass.txt",true));
            passWriter.write(this.userName+":"+this.password+"\n");
            passWriter.close();
            BufferedWriter  scoreWriter=new BufferedWriter(new FileWriter("userScore.txt",true));
            scoreWriter.write(this.userName+":"+score+"\n");
            scoreWriter.close();

        }catch(IOException e){
            JOptionPane.showMessageDialog(null,"file doesn't exist");

        }
    }

}
