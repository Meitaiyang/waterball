import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {


    private static Showdown showdown;
    private List<Card> cards = new ArrayList<>();

    public static Deck standard40Cards() {
        Deck deck = new Deck();
        Card.Rank[] ranks = Card.Rank.values();
        Card.Suit[] suits = Card.Suit.values();
        for (Card.Rank rank : ranks) {
            for (Card.Suit suit : suits) {
                deck.push(new Card(suit, rank));
            }
        }
        return deck;
    }

    private void push(Card card) {
        cards.add(card);
    }

    public void setGame(Showdown showdown) {
        this.showdown = showdown;
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public Card drawCard() {
        return cards.remove(0);
    }
}
