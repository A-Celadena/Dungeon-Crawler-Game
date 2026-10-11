
/**
 * Write a description of class TrapCard here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TrapCard extends Card
{
    // instance variables - replace the example below with your own
    private int damageAmount;

    /**
     * Constructor for objects of class TrapCard
     */
    public TrapCard(String name, String description, int newDamageAmount)
    {
        // initialise instance variables
        super(name, description);
        this.damageAmount = newDamageAmount;
    }
    
    /**
     * Damages the player by the damageAmount.
     * @param p The Player object.
     */
    @Override
    public void applyEffect(Player p) {
        p.takeDamage(damageAmount);
    }
}