package nibbles;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;

/**
 *
 * @author brincksl
 */
public class Edibles extends Entity {
    
    private BoundingBox box;
    private int count;
    private int width, height;
    private Font font = new Font("Px437 VGA SquarePx", Font.PLAIN, 20);
    
    public Edibles(int x, int y, int value, Graphics g) {
        super(x, y, g);
        count = value;
        if(count < 0)
            count = 0;
        FontMetrics fm = g.getFontMetrics();
        String displayNum = String.valueOf(count);
        width = g.getFontMetrics().stringWidth(displayNum);
        height = g.getFontMetrics().getAscent();
        box = new BoundingBox(x, y - height, width, height);
    }
    
    public int getValue() {
        return count;
    }

    @Override
    public boolean areCollided(ICollidable collidable) {
        if(collidable == null)
            return false;
        return this.box.isCollided(collidable.getBoundingBox());
    }

    @Override
    public BoundingBox getBoundingBox() {
        return box;
    }

    @Override
    public void update() { }
    
    @Override
    public void draw(boolean colorful) {
        
        if(colorful)
            g.setColor(Color.WHITE);
        else
            g.setColor(Color.WHITE);
        g.drawString(String.valueOf(count), this.box.getX(), this.box.getY() + height);
    }
    
}
