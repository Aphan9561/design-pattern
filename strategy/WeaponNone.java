package strategy;
import java.util.Random;

public class WeaponNone implements WeaponBehavior{
    public String attack() 
    {
        Random r = new Random();
        int phrase = r.nextInt((3 - 1)) + 1;
        if (phrase == 1 )
        {
            return "Oh no! I lost my weapon";
        }
        else
        {
            return "No one let's me have a weapon";
        }
    }
    
}
