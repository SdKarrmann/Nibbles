package nibbles;

import java.awt.Graphics;

/**
 * This class represents a game entity in Nibbles. This is an object that will
 * need to be drawn to the screen and checked for collisions.
 * @author polusj
 */
public abstract class Entity implements ICollidable, IDrawable 
{
    protected int x, y;
    protected Graphics g;
    
    public Entity(int x, int y, Graphics g)
    {
        this.x = x;
        this.y = y;
        this.g = g;
    }
    
    public Entity(Entity e)
    {
        this.x = e.x;
        this.y = e.y;
        this.g = e.g;
    }
    
    public abstract void update();
    
    @Override
    public abstract void draw(boolean colorful);
    
    @Override
    public abstract boolean areCollided(ICollidable collidable);
    
    @Override
    public abstract BoundingBox getBoundingBox();
}
