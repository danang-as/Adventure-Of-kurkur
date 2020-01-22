import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Aboutus here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Aboutus extends World
{
    public GreenfootSound bg2 = new GreenfootSound("gabung.mp3");
    /**
     * Constructor for objects of class Aboutus.
     * 
     */
    public Aboutus()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 400, 1); 
        getBackground().scale(800,400);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Kembali kembali = new Kembali();
        addObject(kembali,29,376);
        removeObject(kembali);
        kembali2 kembali2 = new kembali2();
        addObject(kembali2,33,375);
        kembali2.setLocation(27,38);
    }

    public void act()
    {
     stopped();
       started();
    }
    public void stopped(){
       bg2.setVolume(95);      
       bg2.pause();
    }
    public void started(){
      bg2.setVolume(95);
      bg2.playLoop();
    }
}
