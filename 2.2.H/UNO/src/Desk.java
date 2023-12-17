import java.util.Collection;
import java.util.List;

public class Desk {
    private List<Card> cards;

    public void receiveCard(Card card) {
        cards.add(card);
    }

    public Card getTopCard() {
        return cards.get(cards.size() - 1);
    }

    public List<Card> getCards() {
        return cards;
    }
}
