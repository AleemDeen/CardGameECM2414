public class Card {
    // The number representing the card's face value
    private final int value;
    
    // The ID of the deck that the card belongs to
    private final int deckId;

    // Player pointer (to assign which player the card belongs to)
    private int playerPointer = -1;

    // Deck pointer (to assign which deck the card belongs to)
    private int deckPointer = -1;

    // Constructor to create a new card with a specific value and deck ID
    public Card(int cardValue, int deckId) {
        this.value = cardValue;
        this.deckId = deckId;
    }

    // Returns the card's value
    public int getValue() {
        return value;
    }

    // Returns the ID of the deck the card is part of
    public int getDeckId() {
        return deckId;
    }

    // Sets the player pointer for the card
    public void setPlayerPointer(int playerId) {
        this.playerPointer = playerId;
    }

    // Sets the deck pointer for the card
    public void setDeckPointer(int deckId) {
        this.deckPointer = deckId;
    }

    // Provides a string representation of the card for output
    @Override
    public String toString() {
        return "Card[value=" + value + ", deck=" + deckId + ", player=" + playerPointer + ", deckPointer=" + deckPointer + "]";
    }
}
