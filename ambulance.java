import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ambulance here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ambulance extends Actor
{
    /**
     * Act - do whatever the ambulance wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        gerak();
    }
    
    public void gerak()
    {
        if(Greenfoot.isKeyDown("left")){
            if(getX() >= 180) {
                setLocation(getX() -2, getY());
            }
        }
        
        if(Greenfoot.isKeyDown("right")){
            if(getX() <= 428) {
                setLocation(getX() +2, getY());
            }
        }
        
        if(Greenfoot.isKeyDown("Up")){
            setLocation(getX(), getY() -2);
            
        }
        
        if(Greenfoot.isKeyDown("Down")){
            setLocation(getX(), getY() +2);
        }
    }
}
