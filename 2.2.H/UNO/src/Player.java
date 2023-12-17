public abstract class Player {

    // 不太確定這邊應該要用getter去讓child class取得，還是這樣開protected就好
    protected String name;
    protected Hand hand;
    private UNO game;

    public Player() {
        setHand(new Hand());
    }

    public abstract void nameSelf(int order);

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

    public abstract void showCard() throws Exception;

    public void joinGame(UNO uno){
        this.game = uno;
    }

}
