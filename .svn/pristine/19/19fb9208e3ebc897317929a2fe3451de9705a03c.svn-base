package nibbles;

/**
 * This class implements a way to detect 2D collisions. It represents an entity
 * as a rectangle which can be checked for collisions with other BoundingBoxes.
 * @author karrmanns
 */
public class BoundingBox {
    
    private int x, y, width, height;
    
    // Represents an entity that will always collide with others
    public static final BoundingBox ALWAYS_COLLIDED = new EveryWhereBox();
    
    /**
     * Empty box constructor
     */
    public BoundingBox()
    {
        x = 0;
        y = 0;
        width = 0;
        height = 0;
    }
    
    /**
     * Parameterized constructor
     * @param xIn
     * @param yIn
     * @param widthIn
     * @param heightIn 
     */
    public BoundingBox(int xIn, int yIn, int widthIn, int heightIn) {
        x = xIn;
        y = yIn;
        width = widthIn;
        height = heightIn;
    }
    
    /**
     * Copy constructor
     * @param bb 
     */
    public BoundingBox(BoundingBox bb)
    {
        x = bb.x;
        y = bb.y;
        width = bb.width;
        height = bb.height;
    }
    
    /**
     * Setter method
     * @param xNew new left edge of this box
     */
    public void setX(int xNew) {
        x = xNew;
    }
    
    /**
     * Setter method
     * @param yNew new bottom edge of this box
     */
    public void setY(int yNew) {
        y = yNew;
    }
    
    /**
     * Getter method
     * @return the left edge of this box
     */
    public int getX() {
        return x;
    }
    
    /**
     * Getter method
     * @return the bottom edge of this box
     */
    public int getY() {
        return y;
    }
    
    /**
     * Getter method
     * @return width of this box
     */
    public int getWidth() {
        return width;
    }
    
    /**
     * Getter method
     * @return height of this box
     */
    public int getHeight() {
        return height;
    }
    
    /**
     * Method that determines whether this and the passed-in box are colliding.
     * @param box other box to check for collision with this
     * @return true if this and box are colliding, false if not
     */
    public boolean isCollided(BoundingBox box) {
        boolean yFlag = y < box.y && box.y < y + height //Are they collided on the y-axis?
                || y < box.y + box.height && box.y + box.height <= y + height;
        boolean xFlag = x < box.x && box.x < x + width //Are they collided on the x-axis?
                || x < box.x + box.width && box.x + box.width <= x + width;
        return yFlag && xFlag;// && box.isCollided(this); //Both boxes must agree on the collision.
    }
    
    private static class EveryWhereBox extends BoundingBox {
        
        public EveryWhereBox() {
            super(0, 0, 0, 0);
        }
        
        public boolean isCollided(BoundingBox box) {
            return true;
        }
        
    }
    
}
