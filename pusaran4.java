import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class pintu4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pusaran4 extends Actor
{
    private GreenfootImage[] images = new GreenfootImage[4];
    private int currentImage;
    /**
     * Act - do whatever the pintu1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private void animasi()
    {
        if(currentImage ==3){
            currentImage =0;
        }else{
            currentImage++;
        }
        setImage(images[currentImage]);
    }
    public pusaran4()
    {
        images[0] = new GreenfootImage ("editt.png");
        images[1] = new GreenfootImage ("edit6.png");
        images[2] = new GreenfootImage ("edit7.png");
        images[3] = new GreenfootImage ("edit8.png");
        currentImage = 0;
    }
    public void act() 
    {
      if(isTouching(kurkur.class)){
           Greenfoot.setWorld(new Selesai());
           Greenfoot.playSound("masuk.mp3");
        }
        setLocation(620, 386);
        animasi();
    }
}
