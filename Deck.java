import java.util.List;
import java.util.ArrayList;

public class Deck {
    // List to store the cards in the deck
    List<Card> cards = new ArrayList<>();

    // Constructor to initialize the deck with a list of cards
    public Deck(List<Card> newCards) {
        // Initialize the deck with the provided list of cards
        cards = newCards;
    }

    // Pulls a card from the "top" of the deck and changes the nextDeck of the card
    // to point to the next deck
    public Card pullCard(int numDecks) {
        // Return the first card from the deck (the top card)
        return cards.get(0);
    }
}
