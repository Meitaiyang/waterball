import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Deck {

    private Showdown showdown;
    private List<Card> cards;
    public static Deck standard52Deck() {
        Deck deck = new Deck();
        Card.Color[] colors = Card.Color.values();
        for (Card.Color color : colors) {
            for (int rank = 0; rank < 10; rank++) {
                deck.push(new Card(rank, color));
            }
        }
        return deck;
    }

    public void setGame(Showdown showdown) {
        this.showdown = showdown;
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }
}
