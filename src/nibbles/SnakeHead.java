package nibbles;

import java.awt.Color;
import java.awt.Graphics;

/**
 * A special {@link SnakePart} that stores the direction of the {}
 * 
 * @author Steven
 */
public class SnakeHead extends SnakePart {
    
    private EnumDirection direction;
    
    public SnakeHead(Graphics graphicsIn, int xIn, int yIn, Color colorIn) {
        super(graphicsIn, xIn, yIn, colorIn);
        direction = EnumDirection.DOWN;
    }
    
    public SnakeHead(SnakeHead sh)
    {
        super(sh);
        if(sh != null)
        {
            direction = sh.direction;
        }
    }
    
    public void setDirect(EnumDirection direct) 
    {
        if(direct != null)
            direction = direct;
    }
    
    public EnumDirection getDirection() {
        return direction;
    }
    
}
