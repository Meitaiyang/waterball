import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class Hand {

    private Desk desk;
    private List<Card> cards;
    private int cardAmount;

    public Hand() {
        setCards(new ArrayList<>());
        setDesk(new Desk());
    }

    private void setCards(List<Card> cards) {
        this.cards = cards;
    }
    public void addCard(Card card) {
        cards.add(card);
    }

    public void setDesk(Desk desk) {
        this.desk = desk;
    }

    public int getCardAmount() {
        return cardAmount;
    }

    public void setCardAmount() {
        this.cardAmount = cards.size();
    }

    public List<Card> validCard(){
        List<Card> validCards = new ArrayList<>();
        for (Card card : cards){
            if (card.getColor() == desk.getTopCard().getColor() || card.getNumber() == desk.getTopCard().getNumber()){
                validCards.add(card);
            }
        }
        return validCards;
    }

    public void showCard(Card card) throws IllegalArgumentException{

        cards.remove(card);
        desk.receiveCard(card);
    }
}
