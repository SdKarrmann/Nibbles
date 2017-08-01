package nibbles;

import java.awt.Graphics;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Represents the game environment for a level of Nibbles
 * @author karrmanns
 */
public class Level {
    private static final int UNIT = 10;
    private ArrayList<Entity> entities;
    private ArrayList<Pair> foodLocations = new ArrayList<>();
    private ArrayList<Pair> spawnLocations = new ArrayList<>();
    Graphics graphics;
    
    // Reserve space at the top of the screen for scoreboard, etc.
    public static final int TOP_OFFSET = 50;
    
    public Level(String fileName, ArrayList<Entity> addBuffer, Graphics gIn) {
        entities = addBuffer;
        graphics = gIn;
        BufferedReader reader;
        try 
        {
            BufferedInputStream iStream = new BufferedInputStream(getClass().getResourceAsStream("Resources/" + fileName + ".txt"));
            reader = new BufferedReader(new InputStreamReader(iStream));
            ArrayList<char[]> lines = new ArrayList<>();
            String temp = reader.readLine();
            while(temp != null) 
            {
                lines.add(temp.toCharArray());
                temp = reader.readLine();
            }
            for(int i = 0; i < lines.size(); i ++)
                readArray(lines.get(i), i);
        } 
        catch (IOException e) 
        {
            System.out.println("Error loading level: " + fileName + "; " + e.getLocalizedMessage());
        }
    }
    
    private void readArray(char[] array, int currentLine) {
        for(int i = 0; i < array.length; i ++) {
            char current = array[i];
            Pair coords = new Pair(i * UNIT, currentLine * UNIT + TOP_OFFSET);
            switch (current) {
                case 'x':
                case 'X':
                    Wall wall = new Wall(coords.x, coords.y, UNIT, UNIT, graphics);
                    entities.add(wall);
                    break;
                case 'e':
                case 'E':
                    foodLocations.add(coords);
                    break;
                case 's':
                case 'S':
                    spawnLocations.add(coords);
                    break;
            }
        }
    }
    
    public Pair getRandomFoodSpawn() {
        if(foodLocations.isEmpty())
            return new Pair();
        return foodLocations.get((int) (Math.random() * (foodLocations.size() - 1)));
    }
    
    public Pair getSpawnLocation(int key)
    {
        if(spawnLocations.isEmpty())
            return new Pair();
        if(key - 1 <= spawnLocations.size())
            return spawnLocations.get(key - 1);
        else
            return spawnLocations.get(0);
    }
    
}
