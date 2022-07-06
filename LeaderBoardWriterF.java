
import java.io.File;
import java.io.IOException;
import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;
import javax.imageio.IIOException;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;


public class LeaderBoardWriterF {
    private HashMap<String, BigInteger> userScoreP = new HashMap<>();
    private HashMap<String, BigInteger> userScoreSorted = new HashMap<>();

    private JTextArea jTextArea;

    public LeaderBoardWriterF(JTextArea jTextArea) {


        File file = new File("userScore.txt");
        try {

            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                String s = sc.nextLine();
                BigInteger score = new BigInteger(s.substring(s.indexOf(":") + 1));
                userScoreP.put(s.substring(0, s.indexOf(":")), score);
            }

            sc.close();


        } catch (IOException e) {

        }
        userScoreSorted = this.sortByValue(userScoreP);
        String result="";
        int i=1;
        for(String s:userScoreSorted.keySet()){
            result+=i+"- User Name :" +s+  "     Score : "   +userScoreSorted.get(s)+"\n";
            i++;
        }
        jTextArea.setText(result);
        
        

    }

    public HashMap<String, BigInteger> sortByValue(HashMap<String, BigInteger> hm) {

        List<Map.Entry<String, BigInteger>> list =
                new LinkedList<Map.Entry<String, BigInteger>>(hm.entrySet());


        Collections.sort(list, new Comparator<Map.Entry<String, BigInteger>>() {
            public int compare(Map.Entry<String, BigInteger> o1,
                               Map.Entry<String, BigInteger> o2) {
                return (o2.getValue()).compareTo(o1.getValue());
            }
        });

        HashMap<String, BigInteger> temp = new LinkedHashMap<String, BigInteger>();
        for (Map.Entry<String, BigInteger> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        return temp;
    }
    public  HashMap<String,BigInteger> getUserScoreSorted(){
        return userScoreSorted;
    }


}

