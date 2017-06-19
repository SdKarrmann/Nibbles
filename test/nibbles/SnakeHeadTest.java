/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nibbles;

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
public class SnakeHeadTest {
    
    JFrame frame;
    SnakeHead instance;
    
    public SnakeHeadTest() {
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
        instance = new SnakeHead(frame.getGraphics(), 0, 0);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of setDirect method, of class SnakeHead.
     */
    @Test
    public void testSetDirect() {
        System.out.println("setDirect");
        EnumDirection direct = EnumDirection.DOWN;
        instance.setDirect(direct);
        assertEquals(direct, instance.getDirection());
    }

    /**
     * Test of getDirection method, of class SnakeHead.
     */
    @Test
    public void testGetDirection() {
        System.out.println("getDirection");
        EnumDirection expResult = EnumDirection.DOWN; //UP is the default direction
        EnumDirection result = instance.getDirection();
        assertEquals(expResult, result);
    }
    
}
