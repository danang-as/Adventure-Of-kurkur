import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Selesai here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Selesai extends World
{

    /**
     * Constructor for objects of class Selesai.
     * 
     */
    public Selesai()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 400, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Kembali kembali = new Kembali();
        addObject(kembali,147,343);
        kembali.setLocation(42,367);
        removeObject(kembali);
        kembali3 kembali3 = new kembali3();
        addObject(kembali3,39,369);
    }
}
