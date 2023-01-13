package strategy;
import java.util.Random;

public class WeaponKnife implements WeaponBehavior{
    public String attack() 
    {
        Random r = new Random();
        int phrase = r.nextInt((4 - 1)) + 1;
        if (phrase == 1 )
        {
            return "Slice with knife";
        }
        else if ( phrase == 2 )
        {
            return "Jab with a knife";
        }
        else 
        {
            return "Sneak up on opponent with knife";
        }
    }
}
