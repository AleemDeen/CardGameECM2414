import java.util.List;
import java.util.ArrayList;

public class Player {
    // The player's preferred card number
    int prefNum;
    
    // List to store the player's hand of cards
    List<Card> hand = new ArrayList<>();

    // Constructor to initialize the player with a preferred card number and their initial hand of cards
    public Player(int preferredNum, ArrayList<Card> firstHand) {
        prefNum = preferredNum; // Set the player's preferred card number
        hand = firstHand; // Assign the initial hand of cards to the player
    }

    // Checks if the player has won with the current hand (all cards are the same)
    // This method needs bug checking and extension for handling what happens when a player wins
    public Boolean checkWin() {
        // Assume player wins unless proven otherwise
        Boolean winTrue = true;

        // Get the card number of the first card in the hand
        int firstNum = hand.get(0).cardNumber;

        // Check if all cards in the hand have the same number as the first card
        for (int i = 0; i < 3; i++) {
            if (hand.get(i).cardNumber != firstNum) {
                // If any card has a different number, the player doesn't win
                winTrue = false;
            }
        }

        return winTrue; // Return whether the player has won
    }

    // Adds the new card to the hand, then returns the first card that is NOT the preferred number
    // Also checks if the player has won
    public Card nextTurn(Card newCard) {
        // This method would be extended to add the new card and implement game logic
        return hand.get(0); // Return the first card in the player's hand (the card to play)
    }
}
