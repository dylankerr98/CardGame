class Hand {

    public Card[] hand;
    int index = 0;


    // Constructor - Creates a hand of n size card objects
    public Hand(int n){

        this.hand = new Card[n];
    }


    // Constructor - Creates a hand of 13 size card objects
    public Hand(){

        this.hand = new Card[13];
    }


    // Add a card to hand object array
    public void addCard(Card dealtCard) {

        try {

            hand[index] = dealtCard;
        }

        catch ( Exception e) {

            System.out.println("You already have 13 cards!!!");
        }

        index++;
    }
}