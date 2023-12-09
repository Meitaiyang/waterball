import java.util.Collection;
import java.util.HashSet;

public class UNO {
    private final Collection<Player> players = new HashSet<>();
    private final Deck deck;

    public void init(){
        players.forEach(Player::nameSelf);
        deck.shuffle();
        players.forEach(this::getCardFromDeck);

    }

    public void getCardFromDeck(Player player){
        player.addCard(deck.drawCard());
    }
    public void joinPlayer(Player player){
        players.add(player);
        player.joinGame(this);
    }
}
