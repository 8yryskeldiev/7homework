import com.company.Applicable;
import com.company.Hero;

public class Mental extends Hero implements Applicable {


    @Override
    public void applySuperAbility() {
        System.out.println("Mental applies telepathic super Ability");
    }
}
