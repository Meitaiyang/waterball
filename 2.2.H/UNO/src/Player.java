import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public abstract class Player {

    private String name;
    private UNO uno;
    private List<Card> hands = new ArrayList<>();
    public void setGame(UNO uno) {
        this.uno = uno;
    }

    public abstract void nameSelf();

    public String getName() {
        return name;
    }

    public void addCard(Card card) {
        hands.add(card);
    }

    public List<Card> getHands() {
        return hands;
    }

    public abstract Card showCard();
}
