import java.util.ArrayList;
import java.util.List;

public class Deck {
    private List<Card> cards = new ArrayList<>();

    private int cardAmount;
    private Desk desk;

    public Deck() {
        setCards();
        setCardAmount();
    }

    public void setCards() {
        for (int num = 0; num <= 9; num++) {
            for (Card.Color color : Card.Color.values()) {
                cards.add(new Card(num, color));
            }
        }
    }

    public List<Card> getCards() {
        return cards;
    }

    public void shuffle() {
        cards.sort((a, b) -> (int) (Math.random() * 3) - 1);
    }

    public Card drawCard() {
        return cards.remove(0);
    }

    public int getCardAmount() {
        return cardAmount;
    }

    public void setCardAmount() {
        this.cardAmount = cards.size();
    }

    public void checkCardAmount() {
        if (cardAmount == 0) {
            cards.addAll(desk.getCards());
            desk.getCards().clear();
        }
    }
}

