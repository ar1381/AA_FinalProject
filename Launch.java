import javax.swing.Timer;
import java.awt.*;
import java.awt.event.*;
public class Launch implements ActionListener{
    private Timer timer ;
    private int MENU = 1;
    private int GAME_MISSIONS = 2;
    private int SETTINGS = 3;
    private int MARKET = 4;
    private int command = 0;
    private int NO_COMMAND = -1;
    private int NEXTBUTTON_ENDGAME = 21;
    private int RETRYBUTTON_ENDGAME = 22;
    private int n = 0;
    private int currentLevel;
    private String username; 
    private Menu menu;
    private LogIn logIn;
    private int LOGIN = 0;
    private GameMissions gameMissions;
    private Settings settings;
    private Market market ;
    public VALS v;
    private int level;
    Launch(){
        logIn = new LogIn();
        menu = new Menu();
        timer = new Timer(200, this);
        timer.start();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if( command == LOGIN){
            if(n == 0){
                logIn.setVisible(true);
                n++;
            }
            if( logIn.getCommand() != NO_COMMAND){
                command = logIn.getCommand();
                username = logIn.getUserName();
                v = new VALS(username);
                level = v.getLevel();
                logIn.setCommand(-1);
                logIn.setVisible(false);
                n = 0;
                logIn.dispose();
            }
        }
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
                level = v.getLevel();
                gameMissions = new GameMissions(v);
                gameMissions.setVisible(true);
                n++;
            }
            if(gameMissions.getCommand() != NO_COMMAND){
                n = 0;
                command = gameMissions.getCommand();
                currentLevel= gameMissions.getCurrentLevel();
                if(currentLevel + 1 > level && command ==11)// 11 means you have won the game
                    level = currentLevel + 1;
                gameMissions.setCommand(-1);
                gameMissions.setVisible(false);
                gameMissions.DisposeGame();
                gameMissions.dispose();
                if(command == 11)
                    command =1;
            }
        }
        else if(command == SETTINGS){
            if(n == 0){
                settings = new Settings(v);
                settings.setVisible(true);
                n++;
            }
            if(settings.getCommand() != NO_COMMAND){
                command = settings.getCommand();
                n=0;
                settings.setCommand(-1);
                settings.setVisible(false);
                settings.dispose();
            }
        }
        else if (command == MARKET){
            if(n == 0){
                market = new Market(v);
                market.setVisible(true);
                n++;
            }
            else if (market.getCommand() != NO_COMMAND){
                command = market.getCommand();
                n = 0;
                market.setVisible(false);
                market.dispose();
            }
        }
        else if (command == NEXTBUTTON_ENDGAME){
            if(n == 0){
                gameMissions = new GameMissions(v);
                gameMissions.Missions( String.valueOf(currentLevel + 1));
                n++;
            }
            if(gameMissions.getCommand() != NO_COMMAND){
                command = gameMissions.getCommand();
                if(command == 11)
                    command =1;
                n = 0;
                currentLevel = gameMissions.getCurrentLevel();
                if(currentLevel + 1 > level)
                    level = currentLevel + 1;
                gameMissions.DisposeGame();
                gameMissions.dispose();
            }
        }
        else if (command == RETRYBUTTON_ENDGAME){
            if(n == 0){
                gameMissions = new GameMissions(v);
                gameMissions.Missions( String.valueOf(currentLevel));
                n++;
            }
            if(gameMissions.getCommand() != NO_COMMAND){
                command = gameMissions.getCommand();
                n = 0;
                currentLevel = gameMissions.getCurrentLevel();
                gameMissions.DisposeGame();
                gameMissions.dispose();
            }
        }


    }
}