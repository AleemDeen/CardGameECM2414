import java.util.Objects;

public class Card {
    // The number representing the card's face value
    private final int value;
    
    // The ID of the deck that the card belongs to
    private final int deckId;

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

    // Provides a string representation of the card for output
    @Override
    public String toString() {
        return "Card[value=" + value + ", deck=" + deckId + "]";
    }

    // Checks if two cards are equal by comparing their value and deck ID
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Card card = (Card) obj;
        return value == card.value && deckId == card.deckId;
    }

    // Computes a hash code based on card value and deck ID
    @Override
    public int hashCode() {
        return Objects.hash(value, deckId);
    }
}

