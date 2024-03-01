package main;

import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Sound {
    
    Clip clip;
    File soundFile[] = new File[30];

    public Sound() {

        soundFile[0] = new File("game/res/sound/BlueBoyAdventure.wav");
        soundFile[1] = new File("game/res/sound/coin.wav");
        soundFile[2] = new File("game/res/sound/powerup.wav");
        soundFile[3] = new File("game/res/sound/unlock.wav");
        soundFile[4] = new File("game/res/sound/fanfare.wav");
        soundFile[5] = new File("game/res/sound/hitmonster.wav");
        soundFile[6] = new File("game/res/sound/receivedamage.wav");
        soundFile[7] = new File("game/res/sound/swingweapon.wav");
        soundFile[8] = new File("game/res/sound/levelup.wav");
        
    }

    public void setFile(int i) {

        try {
            
            AudioInputStream ais = AudioSystem.getAudioInputStream(soundFile[i]);
            clip = AudioSystem.getClip();
            clip.open(ais);
            
        } catch (Exception e) {
            
        }
    }
    public void play() {

        clip.start();
    }
    public void loop() {

        clip.loop(Clip.LOOP_CONTINUOUSLY);
    }
    public void stop() {

        clip.stop();
    }
}
