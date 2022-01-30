public class Card {

    public static final String[] RANKS = {"2" , "3", "4", "5",
            "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

    private static final String[] SUITS = {"Hearts", "Clubs", "Diamonds", "Spades"};

    // Assign card rank a value 2 - 10 for numbered cards, 10 - 13 for card ranking
    // Assign card suit a value 0 - 3 for suit ranking
    private final int rank;
    private final int suit;


    // Constructor - Card objects
    public Card(int rank, int suit) {

        this.rank = rank;
        this.suit = suit;
    }


    // Return card object rank
    public int getRank() {

        return this.rank;
    }


    // Return card object suit
    public int getSuit() {

        return this.suit;
    }


    // Return a string combination for card rank and suit
    public String toString() {

        return RANKS[this.rank] + " of " + SUITS[this.suit];
    }

}
