import java.util.List;
import java.util.ArrayList;
import java.nio.file.*;
import java.io.IOException;

public class CardGame extends Thread {
    // List of players in the game
    List<Player> players = new ArrayList<>();
    // List of decks in the game
    List<Deck> decks = new ArrayList<>();
    // Number of players in the game
    static int numPlayers;

    // Constructor for the CardGame class, currently empty
    public static void CardGame() throws Exception {
    }

    // Method to read file contents and return as a single string
    public String readFile() throws IOException {
        Path filePath = Paths.get("pack.txt");
        return Files.readString(filePath);
    }

    // Generates a list of cards from the file
    private ArrayList<Card> CardGeneration() throws Exception {
        ArrayList<Card> cardList = new ArrayList<>();
        String cardData = readFile();
        String[] numList = cardData.split(",");
        System.out.println(numList);

        // Iterate through card data and create new Card objects
        for (String x : numList) {
            if (!x.equals(",")) { // Avoid adding empty strings
                int newNum = Integer.valueOf(x);
                System.out.println(newNum);
                Card newCard = new Card(newNum, 0); // Create a new card
                cardList.add(newCard);
            }
        }

        return cardList;
    }

    // Sets up the game by initializing players and decks
    public void setup(int playerNumber, int deckNumber) throws Exception {
        // Generates all cards for the game
        ArrayList<Card> cards = CardGeneration();

        // Initialize players and assign them cards
        for (int i = 0; i < playerNumber; i++) {
            ArrayList<Card> hand = new ArrayList<>();
            // Each player gets 4 cards
            for (int j = 0; j < 4; j++) {
                Card card = cards.remove(0);
                card.setPlayerPointer(i + 1); // Assign the player to the card
                hand.add(card);
            }
            players.add(new Player(i + 1, hand)); // Add player with their hand
        }

        // Calculate number of cards per deck
        int numOfCardsDeck = cards.size() / deckNumber;
        // Initialize decks and assign cards
        for (int i = 0; i < deckNumber; i++) {
            List<Card> deckCards = new ArrayList<>();
            // Each deck gets a portion of the remaining cards
            for (int j = 0; j < numOfCardsDeck; j++) {
                Card card = cards.remove(0);
                card.setDeckPointer(i + 1); // Assign the deck to the card
                deckCards.add(card);
            }
            decks.add(new Deck(deckCards)); // Add deck to the game
        }
    }

    // Placeholder method for the next turn logic
    public void nextturn() {
        // Logic for processing the next turn (to be implemented)
    }
}
