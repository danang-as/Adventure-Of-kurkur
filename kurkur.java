import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class kurkur here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class kurkur extends Actor
{
    int speed = 2;
    int nyawa = 3;
    int poin =0;
    
    class Direction {
        public static final int UP = 270;
        public static final int DOWN =90;
        public static final int LEFT =180;
        public static final int RIGHT =0;
    }
    /**
     * Act - do whatever the kurkur wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private GreenfootImage[] image = new GreenfootImage[2];
    private int currentImage;
      public kurkur()
     {
        image[0] = new GreenfootImage("kur1.png");
        image[1] = new GreenfootImage("kur2.png");
        currentImage = 0;
     }
     public void animasi()
     {
        if (currentImage == 1){
            currentImage = 0;
        }else{
            currentImage++;
        }
        setImage(image[currentImage]);
     }
    public void act() 
    {
        if(Greenfoot.isKeyDown("up")){
             setRotation(Direction.UP);
             movePlayer();    
         } else if(Greenfoot.isKeyDown("down")){
             setRotation(Direction.DOWN);
             movePlayer();
         } else if(Greenfoot.isKeyDown("left")){
             setRotation(Direction.LEFT);
             movePlayer();
         } else if(Greenfoot.isKeyDown("right")){
             setRotation(Direction.RIGHT);
             movePlayer();
         }
         movePlayer();
         tampil();
         poin();
         animasi();
         nyawa();
        
    } 
    public void tampil(){
       getWorld().showText("Nyawa saya= "+ nyawa, 100,50);
       getWorld().showText("Score saya= "+ poin, 580,50);
    }
    public void nyawa(){
       if(isTouching(musuh.class)){
          setLocation(88, 22);
          Greenfoot.playSound("kenamusuh.mp3");
          nyawa = nyawa - 1;
          if(nyawa < 1){
              Greenfoot.playSound("end.mp3");
             Greenfoot.setWorld(new Tamat());
             ((blueworld)getWorld()).bg3.stop();
            }
        }
    }
    public void poin(){
       if(isTouching(apel.class)){
          removeTouching(apel.class);
          Greenfoot.playSound("makan.mp3");
          poin = poin + 5; 
          if(poin == 35){
              if(getWorld() instanceof blueworld){
          pusaran1 muncul = new pusaran1();            
          World myWorld = getWorld();
          myWorld.addObject(muncul, myWorld.getWidth()/76, myWorld.getHeight()/93);
          myWorld.removeObject(new pusaran1());}
          else if(getWorld() instanceof level2){          
          pusaran2 muncul = new pusaran2();            
          World myWorld = getWorld();
          myWorld.addObject(muncul, myWorld.getWidth()/76, myWorld.getHeight()/93);
          myWorld.removeObject(new pusaran2());
          }
          else if(getWorld() instanceof level3){          
          pusaran3 muncul = new pusaran3();            
          World myWorld = getWorld();
          myWorld.addObject(muncul, myWorld.getWidth()/76, myWorld.getHeight()/93);
          myWorld.removeObject(new pusaran3());
          }
          else if(getWorld() instanceof level4){          
          pusaran4 muncul = new pusaran4();            
          World myWorld = getWorld();
          myWorld.addObject(muncul, myWorld.getWidth()/76, myWorld.getHeight()/93);
          myWorld.removeObject(new pusaran4());
          
          }
        }
    }
    }    
    public void movePlayer(){
        int currentX = getX();
        int currentY = getY();
        int direction = getRotation();
        int changeX = getChangeX(direction);
        int changeY = getChangeY(direction);
        Actor rintangan = getOneObjectAtOffset(changeX, changeY, rintangan.class);
        if(rintangan==null){
            setLocation(currentX + changeX,currentY + changeY);
        }
    } 
    private int getChangeX(int direction){
        if(direction == Direction.RIGHT){
            return speed;
        } 
        if(direction == Direction.LEFT){
            return -speed;
        } 
        return 0;
    }
    private int getChangeY(int direction){
        if(direction == Direction.DOWN){
            return speed;
        } 
        if(direction == Direction.UP){
            return -speed;
        } 
        return 0;
    }    
}
