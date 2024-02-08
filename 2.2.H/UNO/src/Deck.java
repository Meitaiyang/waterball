import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

    private UNO uno;
    private List<Card> cards = new ArrayList<>();
    private int cardAmount;

    public static Deck standard40Cards() {
        Deck deck = new Deck();
        Card.Color[] colors = Card.Color.values();
        for (Card.Color color : colors) {
            for (int rank = 0; rank < 10; rank++) {
                deck.push(new Card(rank, color));
            }
        }
        return deck;
    }

    private void push(Card card) {
        cards.add(card);
    }

    public void setGame(UNO uno) {
        this.uno = uno;
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public Card drawCard() {
        return cards.remove(0);
    }

    public int getCardAmount() {
        cardAmount = cards.size();
        return cards.size();
    }

    public void addCard(List<Card> cardFromDeck) {
        for(Card card:cardFromDeck) {
            cards.add(card);
        }
        System.out.println("Get card from Dask");
        shuffle();
    }
}