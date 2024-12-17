import java.util.List;

public class Deck {
    // List to store the cards in the deck
    private List<Card> cardsInDeck;

    // Constructor to initialize a deck with a list of cards
    public Deck(List<Card> cards) {
        this.cardsInDeck = cards;
    }

    // Pulls the top card from the deck (removes and returns the first card)
    public Card drawCard() {
        return cardsInDeck.get(0); // Returns the first card (top of the deck)
    }
}
