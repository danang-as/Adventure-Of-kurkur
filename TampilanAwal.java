import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TampilanAwal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TampilanAwal extends World
{

    /**
     * Constructor for objects of class TampilanAwal.
     * 
     */
    public GreenfootSound bg1 = new GreenfootSound("menu.mp3");
    public TampilanAwal()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    public void act(){
       stopped();
       started();
    }
    public void stopped(){
       bg1.setVolume(95);      
       bg1.pause();
    }
    public void started(){
      bg1.setVolume(95);
      bg1.playLoop();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Main main = new Main();
        addObject(main,332,187);
        gelembung gelembung = new gelembung();
        addObject(gelembung,524,165);
        gelembung gelembung2 = new gelembung();
        addObject(gelembung2,506,290);
        gelembung gelembung3 = new gelembung();
        addObject(gelembung3,447,208);
        gelembung gelembung4 = new gelembung();
        addObject(gelembung4,405,307);
        gelembung gelembung5 = new gelembung();
        addObject(gelembung5,481,376);
        gelembung gelembung6 = new gelembung();
        addObject(gelembung6,423,116);
        gelembung gelembung7 = new gelembung();
        addObject(gelembung7,406,383);
        gelembung gelembung8 = new gelembung();
        addObject(gelembung8,285,310);
        gelembung gelembung9 = new gelembung();
        addObject(gelembung9,373,252);
        gelembung gelembung10 = new gelembung();
        addObject(gelembung10,324,125);
        gelembung gelembung11 = new gelembung();
        addObject(gelembung11,250,215);
        removeObject(gelembung9);
        removeObject(gelembung3);
        removeObject(gelembung10);
        removeObject(gelembung11);
        removeObject(gelembung5);
        gelembung7.setLocation(73,61);
        gelembung4.setLocation(122,249);
        gelembung.setLocation(267,54);
        gelembung6.setLocation(434,199);

        gelembung4.setLocation(169,197);
        gelembung8.setLocation(280,336);
        gelembung gelembung12 = new gelembung();
        addObject(gelembung12,529,53);
        gelembung gelembung13 = new gelembung();
        addObject(gelembung13,59,359);
        gelembung6.setLocation(452,151);
        gelembung6.setLocation(465,170);
        gelembung8.setLocation(572,170);
        gelembung12.setLocation(568,41);
        gelembung12.setLocation(547,50);
        gelembung2.setLocation(488,383);
        gelembung6.setLocation(444,234);
        gelembung13.setLocation(488,21);
        gelembung4.setLocation(402,111);
        gelembung6.setLocation(131,362);
        gelembung.setLocation(295,308);
        gelembung2.setLocation(482,312);
        removeObject(gelembung4);
        removeObject(gelembung12);
        removeObject(gelembung13);
        removeObject(gelembung7);
        gelembung8.setLocation(543,188);
        removeObject(main);
        removeObject(gelembung8);
        removeObject(gelembung2);
        removeObject(gelembung);
        gelembung gelembung14 = new gelembung();
        addObject(gelembung14,559,171);
        gelembung gelembung15 = new gelembung();
        addObject(gelembung15,430,261);
        gelembung gelembung16 = new gelembung();
        addObject(gelembung16,288,314);
        Main main2 = new Main();
        addObject(main2,318,163);
        Help help = new Help();
        addObject(help,318,266);
        help.setLocation(64,300);
        main2.setLocation(308,193);
        About about = new About();
        addObject(about,525,291);
    }
}
