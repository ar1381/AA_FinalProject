import javax.swing.JFrame;
import javax.swing.Timer;
import java.awt.*;
import java.awt.event.*;
public class Launch implements ActionListener{
    private Timer timer ;
    private double money = 0 ;
    private int missions  = 3;
    private int MENU = 1;
    private int GAME_MISSIONS = 2;
    private int SETTINGS = 3;
    private int command = 1;
    private int NO_COMMAND = -1;
    private int n = 0;
    private String username;
    Menu menu = new Menu();
    GameMissions gameMissions = new GameMissions();
    Settings settings = new Settings();
    Launch(String username){
        timer = new Timer(100, this);
        timer.start();
        this.username = username;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(command == MENU){
            if(n == 0 ){
                menu.setVisible(true);
                n++;
            }
            if(menu.getCommand() != NO_COMMAND){
                command = menu.getCommand();
                menu.setCommand(-1);
                menu.setVisible(false);
                n =0;
            }

        }
        else if( command == GAME_MISSIONS){
            if(n == 0){
                gameMissions.setVisible(true);
                n++;
            }
            if(gameMissions.getCommand() != NO_COMMAND){
                command = gameMissions.getCommand();
                n = 0;
                gameMissions.setVisible(false);
                gameMissions.DisposeGame();
            }
        }
        else if(command == SETTINGS){
            if(n == 0){
                settings.setVisible(true);
                n++;
            }
            if(settings.getCommand() != NO_COMMAND){
                command = settings.getCommand();
                n=0;
                settings.setVisible(false);
                settings.dispose();
            }
        }

    }
}