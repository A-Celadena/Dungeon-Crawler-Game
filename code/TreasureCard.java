
/**
 * Write a description of class TreasureCard here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TreasureCard extends Card
{
    // instance variables - replace the example below with your own
    private int goldAmount;
    private ActionCard rewardCard;

    /**
     * Constructor for objects of class TreasureCard
     * 
     * @param name  the name of the ActionCard
     * @param  description  how the ActionCard works/its function
     * @param  newGoldAmount  how much gold they gained or lost
     * @param  newRewardCard what kind of RewardCard they will gain
     * 
     */
    public TreasureCard(String name, String description, int newGoldAmount, ActionCard newRewardCard)
    {
        // initialise instance variables
        super(name, description);
        this.goldAmount = newGoldAmount;
        this.rewardCard = newRewardCard;
    }
    
    public TreasureCard(String name, String description, int newGoldAmount)
    {
        // initialise instance variables
        super(name, description);
        this.goldAmount = newGoldAmount;
    }
    
    /**
     * Rewards the player by the goldAmount.
     * @param p The Player object.
     */
    @Override
    public void applyEffect(Player p) {
        p.addGold(goldAmount);
        if (rewardCard != null) {
            p.addCardToHand(rewardCard);
        }
    }
}