package nibbles;

/**
 * A generic direction enumeration. Each direction has two integers that can be
 * added to an object's coordinates to move it in that direction.
 * 
 * @author Steven
 */
public enum EnumDirection {
    
    UP(-1, 0),
    DOWN(1, 0),
    RIGHT(0, 1),
    LEFT(0, -1);
    
    public final int VERTICAL, HORIZONTAL;
    
    private EnumDirection(int vert, int horiz) {
        VERTICAL = vert;
        HORIZONTAL = horiz;
    }
    
    /**
     * Gets a direction based on the offsets.
     * 
     * @param vert The vertical offset of the direction.
     * @param horiz The horizontal offset of the direction.
     * @return The direction which matches the given offsets, or null
     * if no directions matches the given parameters.
     */
    public EnumDirection getDirection(int vert, int horiz) {
        if(vert == -1 && horiz == 0) // TODO: don't use else if blocks. Really.
            return UP;
        else if (vert == 1 && horiz == 0)
            return DOWN;
        else if (horiz == 1 && vert == 0)
            return RIGHT;
        else if (horiz == -1 && vert == 0)
            return LEFT;
        else
            return null;
    }
    
    
    public boolean isOpposite(EnumDirection input)
    {
        if(this == UP && input == DOWN)
            return true;
        if(this == DOWN && input == UP)
            return true;
        if(this == LEFT && input == RIGHT)
            return true;
        if(this == RIGHT && input == LEFT)
            return true;
        return false;
    }
    
}
