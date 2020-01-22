import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class musuh here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class musuh extends Actor
{
   
    /**
     * Act - do whatever the musuh wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    

    private int vSpeed = 0;
    private int acceleration = 1;

    private int tinggipijakan = getImage().getHeight();
    private int lebarpijakan = getImage().getWidth();
    private int jaraklangkah = (int)tinggipijakan/2;
    private int sudut = (int)lebarpijakan/2;

    private int speed = 2;

    private static final GreenfootImage musuhkir = new GreenfootImage("pelican2.png");
    private static final GreenfootImage musuhkan = new GreenfootImage("pelican.png");
   
    public void act() 
    {
        dilantai();
        bergerak();
        cekjatuh();
        animasi();
    }
    public void animasi()
    {
        if(speed<0)
        {
            setImage(musuhkir);
        }
        else
        {
            setImage(musuhkan);
        }
    }
    boolean dilantai()
    {
        Actor under = getOneObjectAtOffset(0, getImage().getHeight()/2, rintangan.class);
        return under != null;
    }

    private void bergerak()
    {
        Actor ground = getOneObjectAtOffset(sudut, jaraklangkah, rintangan.class);
        if(ground == null)
        {
            speed *= -1;
            sudut *= -1;
        }
        else
        {
            move(speed);
        }
    }

    

    public void cekjatuh()
    {
        if (dilantai()== false)
        {
            fall();
        }
    }

    private void fall()
    {
        setLocation(getX(), getY() + vSpeed);
        vSpeed = vSpeed + acceleration;
    }

    
    
}
