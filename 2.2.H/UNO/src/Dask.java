import java.util.ArrayList;
import java.util.List;

public class Dask {

    private static List<Card> cards = new ArrayList<>();
    
    
    
    public static void addCard(Card card) {
        cards.add(card);
    }

    public List<Card> drawCardToDeck() {
        List<Card> cardToDeck = new ArrayList<>();
        for (int i = 0; i < cards.size() - 1; i++) {
            cardToDeck.add(cards.remove(i));
        }
        return cardToDeck;
    }

    public Card showTopCard() {
        return cards.get(cards.size()-1);
    }
}