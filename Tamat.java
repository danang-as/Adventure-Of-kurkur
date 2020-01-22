import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Gameover here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tamat extends World
{

    /**
     * Constructor for objects of class Gameover.
     * 
     */
    public Tamat()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        Kembali kembali = new Kembali();
        addObject(kembali,209,353);
        Cobalagi cobalagi = new Cobalagi();
        addObject(cobalagi,521,354);
        kembali.setLocation(77,351);
        removeObject(kembali);
        kembali3 kembali3 = new kembali3();
        addObject(kembali3,71,352);
    }
}
