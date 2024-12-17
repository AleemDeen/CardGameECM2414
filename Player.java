import java.util.List;

public class Player {
    // The preferred card number for the player (used in strategy)
    private int preferredNumber;
    
    // The player's hand of cards
    private List<Card> hand;

    // Constructor to initialize a player with their preferred card number and hand
    public Player(int preferredNumber, List<Card> initialHand) {
        this.preferredNumber = preferredNumber;
        this.hand = initialHand;
    }

    // Checks if the player has won by having all cards in their hand be the same
    public boolean hasWon() {
        int firstCardValue = hand.get(0).getValue();
        
        for (Card card : hand) {
            if (card.getValue() != firstCardValue) {
                return false; // Player has not won
            }
        }
        return true; // Player wins
    }

    // Returns the card to play in the next turn (e.g., the first card in the hand)
    public Card playCard(Card newCard) {
        // For simplicity, returns the first card in hand (could be modified for more complex logic)
        return hand.get(0);
    }
}
