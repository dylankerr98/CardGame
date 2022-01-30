public interface DeckInterface<Card> {

    /** Prints every Card in the deck object array to the screen. **/
    public void showDeck();

    /** Shuffles entire deck, swaps every cards in deck with a randomly selected card.**/
    public void shuffleDeck();

    /** Deals a single card from top of deck to add card method which adds to players hand
    @Return Card object from top of deck object array **/
    public Card dealCard();

}
