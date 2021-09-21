import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Obstacle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Obstacle extends Actor
{
    /**
     * Act - do whatever the Obstacle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        protected abstract void fall();
        
        // Returns true if the child object is on the ground, 
        // false otherwise
        protected boolean isOnGround()
        {
            Actor ground = getOneObjectAtOffset(0, getImage().getHeight() /
        }
        
    }
}
