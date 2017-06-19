/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nibbles;

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
public class BoundingBoxTest {
    
    public BoundingBoxTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
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
     * Test of isCollided method, of class BoundingBox.
     */
    @Test
    public void testDoesCollide() {
        System.out.println("isCollided");
        BoundingBox box = new BoundingBox(0, 0, 5, 10);
        BoundingBox instance = new BoundingBox(0, 0, 10, 20);
        boolean expResult = true;
        boolean result = instance.isCollided(box);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testDoesNotCollide() {
        System.out.println("isCollided");
        BoundingBox box = new BoundingBox(30, 30, 10, 20);
        BoundingBox instance = new BoundingBox(0, 0, 10, 20);
        
        boolean expResult = false;
        boolean result = instance.isCollided(box);
        assertEquals(expResult, result);
    }
}
