import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BrickWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level2 extends World
{
    private final float GRAVITY = 0.0767f;
    private final GreenfootSound MUSIC = new GreenfootSound("bensound-littleidea.mp3");
    private final int SPEED = 4;
    private final float JUMP_FORCE = 5.6f;
    private final int MAX_HEALTH = 5;
    private final int MAX_POWERUP = 3;
    private final Class NEXT_LEVEL = Level3.class;
    
    /**
     * Constructor for objects of class BrickWorld.
     * 
     */
    public Level2()
    {    
        // Create a new world with 1200x800 cells with a cell size of 1x1 pixels.
        super(1200, 800, 1, false); 
        prepare();
    }
    
    public void act()
    {
        spawn();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        addObject(new Player(SPEED, JUMP_FORCE, GRAVITY, MAX_HEALTH, MAX_POWERUP, NEXT_LEVEL, MUSIC), 30,750);
        addObject(new Floor(),630,800);
        addObject(new Door(),1167,50);
        addObject(new BrickWall(),1036,685);
        addObject(new BrickWall(),558,370);
        addObject(new BrickWall(),1040,100);
        addObject(new SmBrickWall(),472,575);
        addObject(new SmBrickWall(),109,505);
        addObject(new SmBrickWall(),682,235);
        addObject(new SmBrickWall(),361,510);
        addObject(new SmBrickWall(),710,630);
        addObject(new Gem(),900,760);
        addObject(new Gem(),800,760);
        addObject(new Gem(),130,460);
        addObject(new TrapDoor(),305,605);
        addObject(new Bomb(GRAVITY),65,460);
    }

    private void spawn()
    {
        if(Math.random() < 0.0025)
        {
            addObject(new Rock(GRAVITY), Greenfoot.getRandomNumber(1200), -30);
        }

    }
    
    
}
