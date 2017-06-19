package nibbles;

import java.awt.Graphics;
import java.util.ArrayList;

/**
 *
 * @author karrmanns
 */
public class LevelManager {
    
    private int foodValue, currentLevel;
    public final int MAX_LEVELS = 10;
    private Graphics graphics;
    String[] files ;
    Level level;
    
    public LevelManager(int level, Graphics gIn) {
        files = new String[MAX_LEVELS];
        for(int i = 0; i < MAX_LEVELS; i++)
        {
            files[i] = "Level" + (i + 1);
        }
        currentLevel = level - 1;
        if(currentLevel > MAX_LEVELS - 1)
            currentLevel = MAX_LEVELS - 1;
        graphics = gIn;
    }
    
    public void setupLevel(ArrayList<Entity> addBuffer) {
        foodValue = 0;
        level = new Level(files[currentLevel], addBuffer, graphics);
    }
    
    public int getLevel() {
        return currentLevel;
    }
    
    public Pair getRandomFoodLocation()
    {
        return level.getRandomFoodSpawn();
    }
    
    public Pair getSpawnLocation(int key)
    {
        return level.getSpawnLocation(key);
    }
    
}
