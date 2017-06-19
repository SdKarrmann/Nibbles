package nibbles;

import java.awt.Color;
import java.awt.Graphics;

/**
 * A generic class dictating the state of a snake piece. This class may be
 * instantiated to act as a simple body piece, or it may be overridden for
 * use in more complicated snake pieces. See {@link SnakeHead} for an example.
 * 
 * @author Steven
 */
public class SnakePart extends Entity {
    public static final int WIDTH = 10;
    private BoundingBox box;
    private Color color;
    
    public SnakePart(Graphics graphicsIn, int xIn, int yIn, Color colorIn) {
        super(xIn, yIn, graphicsIn);
        box = new BoundingBox(xIn, yIn, WIDTH, WIDTH);
        color = colorIn;
    }
    
    public SnakePart(SnakePart sp)
    {
        super(sp);
        if(sp != null)
        {
            box = new BoundingBox(sp.getBoundingBox());
        }
        else
        {
            box = new BoundingBox();
        }
    }
    
    @Override
    public void update() { }
    
    public void draw(boolean colorful) {
        if(colorful)
            g.setColor(color);
        else
            g.setColor(Color.WHITE);
        g.fillRect(x, y, WIDTH, WIDTH);
    }
    
    public Graphics getGraphics() {
        return g;
    }
    
    public int getX() {
        return x;
    }
    
    public int getY() {
        return y;
    }
    
    public void setX(int xNew) {
        x = xNew;
        box.setX(xNew);
    }
    
    public void setY(int yNew) {
        y = yNew;
        box.setY(yNew);
    }

    @Override
    public boolean areCollided(ICollidable collidable) {
        return collidable.getBoundingBox().isCollided(this.getBoundingBox());
    }

    @Override
    public BoundingBox getBoundingBox() {
        return box;
    }
    
}
