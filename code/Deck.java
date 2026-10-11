import java.util.ArrayList;

/**
 * Manages the dungeon deck of Room Cards.
 * Student Starter Code.
 */
public class Deck {
    private ArrayList<Card> cards;

    public Deck() {
        cards = new ArrayList<Card>();
    }

    /**
     * Populates the deck with initial cards. Fully provided.
     */
    public void buildDeck() {
        cards.add(new RestCard(10));
        cards.add(new RestCard(15));
        
        // Note: You must write TreasureCard and TrapCard before these lines compile!
        
        cards.add(new TreasureCard("Panacea", "An almight potion that heals any ailment", 50, new ActionCard("Panacea", 0, 0, 15)));
        cards.add(new TreasureCard("Fireball", "Dispose of your foes with a grand blaze", 50, new ActionCard("Fireball", 50, 0, 0)));
        cards.add(new TreasureCard("Heavy Shield", "A trusty shield to block the mightiest strikes", 25, new ActionCard("Heavy Shield", 0, 15, 0)));
        cards.add(new TreasureCard("Aegis", "A shield once weiled by a goddess", 0, new ActionCard("Aegis", 0, 75, 0)));
        cards.add(new TreasureCard("Excalibur", "The holy sword of Britain", 0, new ActionCard("Excalibur", 75, 0, 0)));
        cards.add(new TreasureCard("Gold Nugget", "A tiny golden nugget", 15));
        cards.add(new TreasureCard("Gold Ingot", "Another ingot could forge you a brittle sword!", 25));
        cards.add(new TreasureCard("Gold Chest", "The chest reveals a large amount of gold coins!", 100));
        cards.add(new TreasureCard("Steel Sword", "A sharp, yet trusty friend", 25, new ActionCard("Steel Sword", 8, 0, 0)));
        cards.add(new TreasureCard("Thunderbolt", "Conjure a grand bolt of lightning", 50, new ActionCard("Thunderbolt", 50, 0, 0)));
        cards.add(new TreasureCard("Elven Bow", "A bow created by the elves, known for their archery", 25, new ActionCard("Elven Bow", 10, 0, 0)));
        cards.add(new TreasureCard("Warhammer", "SMASH!!!", 25, new ActionCard("Warhammer", 25, 0, 0)));
        cards.add(new TreasureCard("Red Potion", "Drinking this red potion, heals some health", 0, new ActionCard("Red Potion", 0, 0, 10)));
        
        cards.add(new TrapCard("Poison Dart", "A hidden dart shoots from the wall.", 5));
        cards.add(new TrapCard("Huge Stone", "A huge stone rolls towards you.", 20));
        cards.add(new TrapCard("Pitt Fall", "The floor opens beneath your feet.", 10));
        cards.add(new TrapCard("Spike Trap", "The walls unleash a brigade of spikes impaling you.", 15));
        
        cards.add(new MonsterCard("Goblin", "A sneaky green menace.", 8, 3));
        cards.add(new MonsterCard("Wolf", "A ferrocious beast.", 10, 7));
        cards.add(new MonsterCard("Skeleton", "A spooky scary guy.", 5, 10));
        cards.add(new MonsterCard("Ogre", "A treacheruous giant.", 20, 15));
        cards.add(new MonsterCard("Spider", "An eight-legged foe.", 3, 6));
        cards.add(new MonsterCard("Zombie", "The corpse of a fellow adventurer.", 5, 7));
        cards.add(new MonsterCard("Minotaur", "Half man, half bull.", 50, 25));
        cards.add(new MonsterCard("Cultist", "Frail, yet persistent in their ideals.", 5, 10));
    }

    /**
     * Randomizes the order of the cards in the ArrayList.
     */
    public void shuffle() {
        // TODO: Implement shuffling logic using Math.random() or java.util.Collections
        
        for (int i = 0; i < cards.size(); i++) {
            Card currentCard = cards.get(i);
            int randNum = (int) (Math.random() * cards.size() - i) + i;
            
            cards.set(i, cards.get(randNum));
            cards.set(randNum, currentCard);
            
        }
        
    }

    /**
     * Removes and returns the top card from the deck.
     */
    public Card drawCard() {
        // TODO: Remove and return the card at index 0. Return null if empty.
        if (cards.size() == 0) {
            return null;
        }
        
        Card drawed = cards.remove(0);
        
        return drawed;
    }

    /**
     * Checks if the deck is empty.
     */
    public boolean isEmpty() {
        // TODO: Return true if the deck size is 0, false otherwise.
        
        if (cards.size() == 0) {
            return true;
        }
        
        return false;
    }

    /**
     * Returns the current number of cards in the deck.
     */
    public int size() {
        // TODO: Return the size of the ArrayList.
        return cards.size();
    }
}