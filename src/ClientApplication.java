public class ClientApplication {

    //Bubble sort player hand by suit and card rank.
    public static Hand sortHand(Hand playerHand) {

        Card temp;
        boolean isSorted = false;
        int lastUnsorted = playerHand.hand.length - 1;

        while (!isSorted) {

            isSorted = true;

            for (int i = 0; i < lastUnsorted; i++) {

                if (playerHand.hand[i].getRank() > playerHand.hand[i+1].getRank()) {

                    temp = playerHand.hand[i];
                    playerHand.hand[i] = playerHand.hand[i + 1];
                    playerHand.hand[i + 1] = temp;
                    isSorted = false;
                }

                if (playerHand.hand[i].getSuit() > playerHand.hand[i+1].getSuit()) {

                    temp = playerHand.hand[i];
                    playerHand.hand[i] = playerHand.hand[i + 1];
                    playerHand.hand[i + 1] = temp;
                    isSorted = false;
                }
            }

            lastUnsorted--;
        }

        return playerHand;
    }


    // For every card in player hand object array, print card to screen
    public static void showHand(Hand playerHand) {

        for (Card card: playerHand.hand) {

            System.out.println(card);
        }

    }


    public static void main(String[] args) {


        // Create a new deck of 52 cards
        Deck deck = new Deck();

        System.out.println("Not shuffled Deck ----------------------------------------------");
        // Show current state of deck
        deck.showDeck();

        System.out.println("\nShuffled Deck --------------------------------------------------");
        // Randomly shuffle entire deck
        deck.shuffleDeck();

        // Show current state of deck
        deck.showDeck();

        // Create four new player hands
        Hand player1 = new Hand();
        Hand player2 = new Hand();
        Hand player3 = new Hand();
        Hand player4 = new Hand();

        // Deal each player a card from the top of the deck in turn, repeat until deck is empty
        for (int i = 0; i < 13; i++) {

            player1.addCard(deck.dealCard());
            player2.addCard(deck.dealCard());
            player3.addCard(deck.dealCard());
            player4.addCard(deck.dealCard());
        }

        //player4.addCard(deck.dealCard());  -- Use to display exception handling, try to deal another card to player

        // Show current state of 4 players hands
        System.out.println("\nPlayer1 Not Sorted----------------------------------------------");
        showHand(player1);

        System.out.println("\nPlayer2 Not Sorted----------------------------------------------");
        showHand(player2);

        System.out.println("\nPlayer3 Not Sorted----------------------------------------------");
        showHand(player3);

        System.out.println("\nPlayer4 Not Sorted----------------------------------------------");
        showHand(player4);

        // Sort 4 players hand by suit rank & card rank
        System.out.println("\nPlayer1 Sorted----------------------------------------------");
        showHand(sortHand(player1));

        System.out.println("\nPlayer2 Sorted----------------------------------------------");
        showHand(sortHand(player2));

        System.out.println("\nPlayer3 Sorted----------------------------------------------");
        showHand(sortHand(player3));

        System.out.println("\nPlayer4 Sorted----------------------------------------------");
        showHand(sortHand(player4));

    }
}
