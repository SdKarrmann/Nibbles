/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nibbles;

import java.io.IOException;
import java.net.URL;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

/**
 *
 * @author Steven
 */
public class SoundManager {
    
    public static final String START_TUNE = "Resources\\LevelStartTune.wav";
    public static final String INTRO_TUNE = "Resources\\IntroTune.wav";
    public static final String EAT_TUNE = "Resources\\EatEdible.wav";
    public static final String COLLISION_TUNE = "Resources\\Collision.wav";
    
    public void playSound(String fileName) {
        try 
        {
            Clip clip = AudioSystem.getClip();
            URL url = this.getClass().getResource(fileName);
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(url);
            clip.open(audioIn);
            clip.start(); 
        }
        catch(IOException | LineUnavailableException | UnsupportedAudioFileException e)
        {
            System.out.println("Error playing sound clip: " + fileName);
        }
    }
    
}
