package observers;

import game.Observer;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.*;
import java.io.File;

// Observer that plays sound when an item is picked up
public class SoundManager implements Observer {
    boolean firstTime = true;
    @Override
    public void update(String message) {
        if (firstTime) {
            playSound("data/door_creak.wav");
            firstTime= false;
        }

        else {
            playSound("data/ominous.wav");
        }
    }

    private void playSound(String soundFile) {
        try {
            File file = new File(soundFile);
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();
        } catch (Exception e) {
            System.out.println("Error playing sound: " + e.getMessage());
        }
    }
}
