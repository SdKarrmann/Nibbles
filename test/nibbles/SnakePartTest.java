/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nibbles;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author polusj
 */
public class SnakePartTest {
    
    JFrame frame;
    SnakePart instance;
    
    public SnakePartTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        frame = new JFrame();
        instance = new SnakePart(frame.getGraphics(), 0, 0);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getGraphics method, of class SnakePart.
     */
    @Test
    public void testGetGraphics() {
        System.out.println("getGraphics");
        Graphics expResult = frame.getGraphics();
        Graphics result = instance.getGraphics();
        assertEquals(expResult, result);
    }

    /**
     * Test of areCollided method, of class SnakePart.
     */
    @Test
    public void testAreCollided() {
        System.out.println("areCollided");
        ICollidable collidable = new SnakePart(frame.getGraphics(), 1, 1);
        boolean expResult = true;
        boolean result = instance.areCollided(collidable);
        assertEquals(expResult, result);
    }
    
}
