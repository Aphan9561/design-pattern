package strategy;
import java.util.Random;

public class WeaponSword implements WeaponBehavior {
    public String attack() 
    {
        Random r = new Random();
        int phrase = r.nextInt((4 - 1)) + 1;
        if (phrase == 1 )
        {
            return "Lunge and strike with sword";
        }
        else if ( phrase == 2 )
        {
            return "Fancy turn and slice with sword";
        }
        else 
        {
            return "Jam opponents blade with sword";
        }
    }
}
