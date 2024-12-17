// This class represents a single card in the game.
// The Card class was chosen based on the spec's requirements, even though a simpler structure like a list could suffice.
public class Card {

// The face value of the card (e.g., the number on the card).
    int cardNumber;

// NextDeck tells the CardGame which deck the card should go to next.
    int nextDeck;

// PlayerPointer tracks the player currently associated with the card. Default is -1 (unassigned).
    int playerPointer = -1;

// DeckPointer tracks the deck currently associated with the card. Default is -1 (unassigned).
    int deckPointer = -1;


/** Constructor to initialize a Card object. 
firstCardNumber The numeric value of the card.
firstNextDeck   The ID of the next deck the card is associated with.
*/     
    public Card(int firstCardNumber, int firstNextDeck) {
// Assign the initial card value and its associated next deck.
        this.cardNumber = firstCardNumber;
        this.nextDeck = firstNextDeck;
    }

/**
Sets the player pointer to indicate the player currently holding the card.
playerID The ID of the player holding the card.
*/
    public void setPlayerPointer(int playerID) {
// Update the PlayerPointer to reflect the associated player.
        this.playerPointer = playerID;
    }

/**
Sets the deck pointer to indicate the deck currently holding the card.
deckID The ID of the deck holding the card.
*/
    public void setDeckPointer(int deckID) {
// Update the DeckPointer to reflect the associated deck.
        this.deckPointer = deckID;
    }
}
