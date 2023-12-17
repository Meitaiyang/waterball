public class AI extends Player{
    @Override
    public void nameSelf(int order) {
        this.name = "AI" + order;
    }

    @Override
    public void showCard() throws IllegalArgumentException {
        // random select a card from valid cards
        hand.showCard(hand.validCard().get((int)(Math.random() * hand.validCard().size())));
    }
}
