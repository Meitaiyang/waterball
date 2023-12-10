public abstract class Player {
    private String name;
    private Hand hand;
    private UNO game;

    public abstract String nameSelf();

    public String getName() {
        return name;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public Hand getHand() {
        return hand;
    }

    public void addCard(Card card){
        hand.addCard(card);
    }

    public abstract void showCard();

    public void joinGame(UNO uno){
        this.game = uno;
    }

    

}
