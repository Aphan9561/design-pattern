package strategy;
import java.util.Random;

public class WeaponAxe implements WeaponBehavior {
    public String attack() 
    {
        Random r = new Random();
        int phrase = r.nextInt((3 - 1)) + 1;
        if (phrase == 1 )
        {
            return "Swing an axe";
        }
        else
        {
            return "Twirl with an axe";
        }
    }
}
