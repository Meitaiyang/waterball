import static java.lang.String.format;

public class AIPlayer extends Player{

    @Override
    public void nameSelf(int order){
        this.name = format("AI-%d", order);
    }

    @Override
    public Card showCard(){
        List<Card> matchingCards = new ArrayList<>();
        Card card = dask.showTopCard();

    }
}
