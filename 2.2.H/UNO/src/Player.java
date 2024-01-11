import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public abstract class Player {

    private String name;
    protected UNO uno;
    protected List<Card> hands = new ArrayList<>();
    protected List<Card> matchingCards = new ArrayList<>();

    protected void setName(String name){
        this.name = name;
    }

    public void setGame(UNO uno) {
        this.uno = uno;
    }

    public abstract void nameSelf(int order);

    public String getName() {
        return name;
    }

    public void addCard(Card card) {
        hands.add(card);
    }

    public List<Card> getHands() {
        return hands;
    }

    public abstract Card showCard(Card daskTopCard);

    protected void setMatchingCards(Card daskTopCard) {
        this.matchingCards = hands
                .stream().
                filter(card -> card.getColor() == daskTopCard.getColor() || card.getNumber() == daskTopCard.getNumber())
                .collect(Collectors.toList());
    }

    public boolean haventMatchingCards() {
        return matchingCards.isEmpty();
    }
}