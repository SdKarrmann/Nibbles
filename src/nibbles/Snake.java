package nibbles;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * A container class for the necessary components of a snake. This includes the
 * {@link SnakeHead} and all of the {@link SnakePart}s.
 * 
 * @author Steven
 */
public class Snake extends Entity {
    
    private LinkedList<SnakePart> tailParts = new LinkedList<SnakePart>();
    private SnakeHead head;
    private final int key;
    private int shouldGrow = 0;
    private int points = 0;
    Color color;
    
    private static final int GROW_AMOUNT = 3;
    
    public Snake(int headRow, int headCol, Graphics g, int keyIn, Color colorIn, SnakePart...parts) 
    {
        super(headRow, headCol, g);
        head = new SnakeHead(g, headRow, headCol, colorIn);
        for(SnakePart part : parts)
            tailParts.add(part);
        key = keyIn;
    }
    
    public Snake(Snake s)
    {
        super(s);
        if(s != null)
        {
            key = s.key;
            points = s.points;
            shouldGrow = s.shouldGrow;
            for(SnakePart sp : tailParts)
            {
                tailParts.add(new SnakePart(sp));
            }
            head = new SnakeHead(s.head);
        }
        else
        {
            key = 0;
        }
    }
    
    @Override
    public void update()
    {
        if(!tailParts.isEmpty()) {
            tailParts.addFirst(new SnakePart(head.getGraphics(), head.getX(), head.getY(), color));
            if(!(shouldGrow > 0)) {
                tailParts.removeLast();
            } else {
                shouldGrow --;
            }
        }
        EnumDirection direct = head.getDirection();
        head.setY(head.getY() + direct.VERTICAL * SnakePart.WIDTH);
        head.setX(head.getX() + direct.HORIZONTAL * SnakePart.WIDTH);
    }
    
    /**
     * Moves the {@link Snake} in the stored {@link EnumDirection} and draws it.
     */
    @Override
    public void draw(boolean colorful) {
        if(colorful)
            g.setColor(Color.RED);
        else
            g.setColor(Color.WHITE);
        head.draw(colorful);
        Iterator<SnakePart> iter = tailParts.iterator();
        while(iter.hasNext())
            iter.next().draw(colorful);
    }
    
    /**
     * Sets the direction that the {@link Snake}'s head is moving.
     * 
     * @param direct The {@link EnumDirection} that the {@link Snake}'s head is moving.
     */
    public void SetDirection(EnumDirection direct) 
    {
        if(!direct.isOpposite(head.getDirection()))
            head.setDirect(direct);
    }
    
    public EnumDirection getDirection() {
        return head.getDirection();
    }
    
    public int getKey() {
        return key;
    }

    public int getPoints() {
        return points;
    }
    
    public void setPoints(int p)
    {
        points = p;
    }

    public void growSnake(int value) 
    {
        this.points += (value * 100);
        this.shouldGrow += value * GROW_AMOUNT;
    }
    
    @Override
    public boolean equals(Object obj)
    {
       if(obj instanceof Snake)
       {
          Snake rhs = (Snake)obj;
          return this.getKey() == rhs.getKey();
       }
       return false;
    }

    @Override
    public boolean areCollided(ICollidable collidable) {
        if(collidable == null)
            return false;
        
        if(collidable.areCollided(this.head) && this != collidable)
            return true;
        else {
            for(SnakePart part : this.tailParts)
                if(part.areCollided(collidable))
                    return true;
        }
        return false;
    }

    @Override
    public BoundingBox getBoundingBox() {
        return head.getBoundingBox();
    }
    
}
