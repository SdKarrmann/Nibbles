/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nibbles;

import java.awt.Color;
import java.awt.Frame;
import javax.swing.JFrame;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author polusj
 */
public class SnakeTest {
    
    static Snake instance;
    static JFrame frame;
    
    public SnakeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        frame = new JFrame();
        instance = new Snake(0, 0, frame.getGraphics(), 1);
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of SetDirection method, of class Snake.
     */
    @Test
    public void testSetDirection() {
        System.out.println("SetDirection");
        EnumDirection direct = EnumDirection.DOWN;
        instance.SetDirection(direct);
        assertEquals(direct, instance.getDirection());
    }

    /**
     * Test of getDirection method, of class Snake.
     */
    @Test
    public void testGetDirection() {
        System.out.println("getDirection");
        EnumDirection expResult = EnumDirection.DOWN;
        instance.SetDirection(expResult);
        EnumDirection result = instance.getDirection();
        assertEquals(expResult, result);
    }

    /**
     * Test of equals method, of class Snake.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = new Snake(instance);
        boolean expResult = true;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
    }
    
}
