/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nibbles;

import javax.swing.JFrame;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author karrmanns
 */
public class NibblesTest {
    
    Nibbles nibbles;
    JFrame frame;
    
    public NibblesTest() {
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
        nibbles = new Nibbles(frame.getGraphics(), 500, 500, 1);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of tick method, of class Nibbles.
     */
    @Test
    public void testTick() {
        System.out.println("tick");
        nibbles.tick();
    }

    /**
     * Test of pauseGame method, of class Nibbles.
     */
    @Test
    public void testPauseGame() {
        System.out.println("pauseGame");
        nibbles.sparklePause();
        assertEquals(nibbles.isPaused(), true);
    }

    /**
     * Test of quitGame method, of class Nibbles.
     */
    @Test
    public void testQuitGame() {
        System.out.println("quitGame");
        nibbles.quitGame();
        assertEquals(nibbles.inMainMenu(), true);
    }

    /**
     * Test of spawnNewSnake method, of class Nibbles.
     */
    @Test
    public void testSpawnNewSnake() {
        System.out.println("spawnNewSnake");
        nibbles.spawnNewSnake(1, frame.getGraphics());
        assertEquals(nibbles.isSnakeAlive(1), true);
    }

    /**
     * Test of killSnake method, of class Nibbles.
     */
    @Test
    public void testKillSnake() {
        System.out.println("killSnake");
        nibbles.killSnake(1);
        assertEquals(nibbles.isSnakeAlive(1), false);
    }

    /**
     * Test of getLevel method, of class Nibbles.
     */
    @Test
    public void testGetLevel() {
        System.out.println("getLevel");
        int expResult = 0;
        int result = nibbles.getLevel();
        assertEquals(expResult, result);
    }

    /**
     * Test of incLevel method, of class Nibbles.
     */
    @Test
    public void testIncLevel() {
        System.out.println("incLevel");
        nibbles.incLevel();
        assertEquals(nibbles.getLevel(), 2);
    }
}
