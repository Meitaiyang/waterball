import java.util.Collection;
import java.util.HashSet;

public class Hand {
    private Collection<Card> cards = new HashSet<>();
    private int cardAmount;
    public void addCard(Card card) {
        cards.add(card);
    }

    public int getCardAmount() {
        return cardAmount;
    }

    public void setCardAmount() {
        this.cardAmount = cards.size();
    }
}
