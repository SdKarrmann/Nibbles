package nibbles;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Steven
 */
public class CollisionLookup {
    
    private ArrayList<CollisionPair> pairs = new ArrayList<CollisionPair>();
    
    public void register(Class collideFirst, Class collideSecond, ICollisionRun runner) {
        pairs.add(new CollisionPair(collideFirst, collideSecond, runner));
    }
    
    public void runCollision(ICollidable collideFirst, ICollidable collideSecond) {
        for(CollisionPair current : pairs)
            if(current.collisionMatch(collideFirst, collideSecond))
                current.collide(collideFirst, collideSecond);
    }
    
    private class CollisionPair {
        private Class collidedFirst;
        private Class collidedSecond;
        private ICollisionRun collide;
        
        public CollisionPair(Class first, Class second, ICollisionRun collideIn) {
            collidedFirst = first;
            collidedSecond = second;
            collide = collideIn;
        }
        
        public void collide(ICollidable collideFirst, ICollidable collideSecond) {
            collide.run(collideFirst, collideSecond);
        }
        
        public boolean collisionMatch(Object firstParam, Object secondParam) {
            return collidedFirst.equals(firstParam.getClass()) 
                    && collidedSecond.equals(secondParam.getClass());
        }
    }
    
    public interface ICollisionRun<T extends ICollidable, K extends ICollidable> {
        
        public void run(T collidedFirst, K collidedSecond);
        
    }
    
}
