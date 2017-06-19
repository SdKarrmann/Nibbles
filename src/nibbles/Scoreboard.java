package nibbles;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author polusj
 */
public class Scoreboard extends Entity 
{
    private Player player1;
    private Player player2;
    private int level = 1;
    
    public Scoreboard(int x, int y, Graphics g, Player p1, Player p2)
    {
        super(x, y, g);
        player1 = p1;
        player2 = p2;
    }
    
    @Override
    public void update()
    {
        
    }
    
    @Override
    public void draw(boolean colorful)
    {
        if(colorful)
            g.setColor(Color.WHITE);
        else
            g.setColor(Color.WHITE);
        String displayStr = "P1 Score: " + player1.getScore() + " Lives: " + player1.getLives();
        if(player2 != null)
            displayStr += " P2 Score: " + player2.getScore() + " Lives: " + player2.getLives();
        displayStr += "     Level: " + level;
        g.drawString(displayStr, x, y);
    }
    
    public void setLevel(int lvl) {
        level = lvl;
    }
    
    @Override
    public boolean areCollided(ICollidable collidable)
    {
        return false;
    }
    
    @Override
    public BoundingBox getBoundingBox()
    {
        return new BoundingBox();
    }
    
    public void setScore(int key, int newScore)
    {
//        if(key == 1)
//        {
//            score1 = newScore;
//        }
//        else
//        {
//            score2 = newScore;
//        }
    }
    
}
