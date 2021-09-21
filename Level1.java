import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BrickWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level1 extends World
{
    /**
     * Constructor for objects of class BrickWorld.
     * 
     */
    public Level1()
    {    
        // Create a new world with 1200x800 cells with a cell size of 1x1 pixels.
        super(1200, 800, 1, false); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        setPaintOrder(Player.class, Platform.class, Obstacle.class, Collectable.class, Door.class, HUD.class);
        Player player = new Player();
        addObject(player,35,645);
        Door door = new Door();
        addObject(door,605,40);
        door.setLocation(705,35);
        player.setLocation(40,560);
        BrickWall brickWall = new BrickWall();
        addObject(brickWall,370,435);
        door.setLocation(1180,30);
        door.setLocation(1165,30);
        player.setLocation(20,600);
        player.setLocation(35,660);
        door.setLocation(1175,55);
        brickWall.setLocation(460,515);
        player.setLocation(25,715);
        SmBrickWall smBrickWall = new SmBrickWall();
        addObject(smBrickWall,55,450);
        TrapDoor trapDoor = new TrapDoor();
        addObject(trapDoor,215,275);
        TrapDoor trapDoor2 = new TrapDoor();
        addObject(trapDoor2,530,160);
        Bomb bomb = new Bomb();
        addObject(bomb,570,110);
        BrickWall brickWall2 = new BrickWall();
        addObject(brickWall2,960,100);
        SmBrickWall smBrickWall2 = new SmBrickWall();
        addObject(smBrickWall2,982,208);
        Powerup powerup = new Powerup();
        addObject(powerup,945,170);
        Powerup powerup2 = new Powerup();
        addObject(powerup2,1010,170);
        powerup.setLocation(955,165);
        powerup2.setLocation(1000,165);
        BrickWall brickWall3 = new BrickWall();
        addObject(brickWall3,835,350);
        brickWall3.setLocation(970,300);
        TrapDoor trapDoor3 = new TrapDoor();
        addObject(trapDoor3,865,595);
        SmBrickWall smBrickWall3 = new SmBrickWall();
        addObject(smBrickWall3,1100,590);
        trapDoor3.setLocation(920,520);
        smBrickWall3.setLocation(1120,545);
        Bomb bomb2 = new Bomb();
        addObject(bomb2,1005,670);
        Floor floor = new Floor();
        addObject(floor,630,605);
        player.setLocation(30,580);
        bomb2.setLocation(965,530);
        floor.setLocation(850,700);
        bomb2.setLocation(1035,675);
        player.setLocation(45,645);
    }
}
