package strategy;
import java.util.Random;

public class WeaponBow implements WeaponBehavior{
    public String attack() 
    {
        Random r = new Random();
        int phrase = r.nextInt((3 - 1)) + 1;
        if (phrase == 1 )
        {
            return "Draw and loose an arrow";
        }
        else
        {
            return "Shoot arrow high in the sky";
        }
    }
    
}
