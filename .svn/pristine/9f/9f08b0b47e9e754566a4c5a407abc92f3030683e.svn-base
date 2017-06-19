package nibbles;

import java.awt.Color;

/**
 *
 * @author polusj
 */
public class Player 
{
    private int score;
    private int lives;
    private int key;
    private Snake snake;
    private Color color;
    
    public Player()
    {
        score = 0;
        lives = 1;
        key = 0;
        color = Color.YELLOW;
    }
    
    public Player(Player p)
    {
        score = p.score;
        lives = p.lives;
        key = p.key;
        snake = new Snake(p.snake);
        color = p.color;
    }
    
    public Player(int key, int score, int lives, Snake snake, Color colorIn)
    {
        this.key = key;
        this.score = score;
        this.lives = lives;
        this.snake = snake;
        color = colorIn;
    }
    
    public void addPoints(int points)
    {
        score += points;
    }
    
    public boolean decrementLives()
    {
        if(--lives <= 0)
        {
            lives = 0;
            return false;
        }
        return true;
    }
    
    public int getScore() { return score; }
    public int getLives() { return lives; }
    public Snake getSnake() { return snake; }
    public int getKey() { return key; }
    public Color getColor() { return color; }
    
    public void setScore(int s) { score = s; }
    public void setLives(int num) { lives = num; }
    public void setSnake(Snake s) { snake = s; }
}
