import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;

public class CardGame extends Thread {
    // List to store players in the game
    private List<Player> players = new ArrayList<>();
    
    // List to store the decks in the game
    private List<Deck> decks = new ArrayList<>();
    
    // Number of players in the game
    private static int playerCount;

    // Method to read data from the "pack.txt" file
    private String loadCardData() throws IOException {
        Path filePath = Paths.get("pack.txt");
        return Files.readString(filePath);
    }

    // Generates a list of cards based on the data read from the "pack.txt" file
    private List<Card> createCards() throws Exception {
        List<Card> generatedCards = new ArrayList<>();
        String cardData = loadCardData();
        String[] cardValues = cardData.split(",");
        
        for (String value : cardValues) {
            if (!value.equals(",")) {
                int cardValue = Integer.parseInt(value.trim());
                Card card = new Card(cardValue, 0); // Default deck ID 0
                generatedCards.add(card);
            }
        }
        return generatedCards;
    }

    // Sets up the game by distributing cards among players and decks
    public void initializeGame(int numberOfPlayers, int numberOfDecks) throws Exception {
        List<Card> availableCards = createCards();

        // Assign 4 cards to each player
        for (int i = 0; i < numberOfPlayers; i++) {
            List<Card> hand = new ArrayList<>();
            for (int j = 0; j < 4; j++) {
                Card card = availableCards.remove(0);
                card.setPlayerPointer(i + 1); // Set the player's ID
                hand.add(card);
            }
            players.add(new Player(i + 1, hand));
        }

        // Distribute remaining cards into decks
        int cardsPerDeck = availableCards.size() / numberOfDecks;
        for (int i = 0; i < numberOfDecks; i++) {
            List<Card> deckCards = new ArrayList<>();
            for (int j = 0; j < cardsPerDeck; j++) {
                Card card = availableCards.remove(0);
                card.setDeckPointer(i + 1); // Set the deck's ID
                deckCards.add(card);
            }
            decks.add(new Deck(deckCards));
        }
    }

    // Placeholder for handling the next turn (game logic not implemented)
    public void playNextTurn() {
        // Game turn logic to be added
    }
}

