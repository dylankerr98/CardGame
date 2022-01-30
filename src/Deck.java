import java.util.Random;

public class Deck implements DeckInterface<Card> {

    private final Card[] cards;
    int topCardIndex = 0;

    // Constructor - Creates a deck of n amount of Card objects
    public Deck(int n) {

        this.cards = new Card[n];
    }


    // Constructor - Creates a deck of 52 card objects, for every
    // suit create 13 cards and assign to cards object array
    public Deck() {

        this.cards = new Card[52];
        int index = 0;

        for(int suit = 0; suit <= 3; suit++) {
            for (int rank = 0; rank <= 12; rank++) {

                cards[index] = new Card(rank, suit);
                index++;
            }
        }
    }


    // For every card in cards object array, print card to screen
    public void showDeck() {

        for (Card card: this.cards) {

            System.out.println(card);
        }
    }


    // For every card in cards object array, swap cards location with location of a randomly selected card in array
    public void shuffleDeck() {

        int j;

        for (int i = 0; i < cards.length; i++ ) {

            j = randInt();
            swapCards(i,j);
        }
    }


    // Return card a card object to deal to a player.
    public Card dealCard() {

        Card dealtCard =  null;

        try {

            Card cardToDeal = getCard(); topCardIndex++;
            dealtCard = cardToDeal;
        }

        catch (Exception e) {

            System.out.println("\nNo cards in deck!!!");
        }

        return dealtCard;
    }


    // Create and return a random integer between first element and last elements of array
    private static int randInt() {

        Random random = new Random();
        int low = 0;
        int high = 51;
        int randNum;
        randNum = random.nextInt(high - low);
        return randNum;
    }


    // Swaps two cards positions in array for specified elements
    private void swapCards(int i, int j) {

        Card temp = cards[i];
        cards[i] = cards[j];
        cards[j] = temp;
    }


    // Returns card object at current array index
    private Card getCard() {

        return cards[topCardIndex];

    }
}
