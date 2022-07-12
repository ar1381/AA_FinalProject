import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.jar.Attributes.Name;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class SimpleAudioPlayer
{
    
    Long currentFrame;
    Clip clip;
    String status;
    AudioInputStream audioInputStream;
    URL url ;
    String filePath ;
    

    public SimpleAudioPlayer(String Name)
            throws UnsupportedAudioFileException,
            IOException, LineUnavailableException
    {
        //url = getClass().getResource(Name);
        //filePath = new File(url.getPath()).getAbsolutePath();
        audioInputStream =
                AudioSystem.getAudioInputStream(getClass().getClassLoader().getResource(Name));

        clip = AudioSystem.getClip();

        clip.open(audioInputStream);

    }

}