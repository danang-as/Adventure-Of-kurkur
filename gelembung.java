import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class gelembung here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class gelembung extends Actor
{
    /**
     * Act - do whatever the gelembung wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       setLocation(getY() - 10, getX());
           if (getY() <= 20)
           {
               setLocation(getWorld().getHeight() + 20, Greenfoot.getRandomNumber(600));
           }
       
    }    
}
