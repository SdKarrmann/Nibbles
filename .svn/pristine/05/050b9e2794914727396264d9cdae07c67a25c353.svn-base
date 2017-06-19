package nibbles;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Steven
 */
public class Wall extends Entity {
    
    private BoundingBox wallBox;
    int width, height;
    
    public Wall(int x, int y, int width, int height, Graphics gIn) {
        super(x, y, gIn);     
        this.width = width;        
        this.height = height;        
        wallBox = new BoundingBox(x + 5, y + 5, width - 5, height - 5);
    }

    @Override
    public boolean areCollided(ICollidable collidable) {
        if(collidable != null)
            return collidable.getBoundingBox().isCollided(wallBox);
        return false;
    }

    @Override
    public BoundingBox getBoundingBox() {
        return wallBox;
    }

    @Override
    public void update() { }
    
    @Override
    public void draw(boolean colorful) {
        if(colorful)
            g.setColor(Color.RED.darker());
        else
            g.setColor(Color.GRAY);
        g.fillRect(x, y, width, height);
    }
    
}
