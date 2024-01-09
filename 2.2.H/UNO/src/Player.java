import java.util.ArrayList;
import java.util.List;

public abstract class Player {

    private String name;
    protected UNO uno;
    protected List<Card> hands = new ArrayList<>();

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
}