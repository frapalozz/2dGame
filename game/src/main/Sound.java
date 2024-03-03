package main;

import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;

public class Sound {
    
    Clip clip;
    File soundFile[] = new File[30];
    FloatControl fc;
    int volumeScale = 3;
    float volume;

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
        soundFile[9] = new File("game/res/sound/cursor.wav");
        soundFile[10] = new File("game/res/sound/burning.wav");
        soundFile[11] = new File("game/res/sound/cuttree.wav");
        
    }

    public void setFile(int i) {

        try {
            
            AudioInputStream ais = AudioSystem.getAudioInputStream(soundFile[i]);
            clip = AudioSystem.getClip();
            clip.open(ais);
            fc = (FloatControl)clip.getControl(FloatControl.Type.MASTER_GAIN);
            checkVolume();
            
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
    public void checkVolume() {

        switch (volumeScale) {
            case 0: volume = - 80f; break;
            case 1: volume = -20f; break;
            case 2: volume = -12f; break;
            case 3: volume = -5f; break;
            case 4: volume = 1f; break;
            case 5: volume = 6f;  break;
        }
        fc.setValue(volume);
    }
}
