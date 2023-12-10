import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class UNO {
    private List<Player> players;
    private Deck deck;
    private Player winner;

    public void setWinner(Player winner){
        this.winner = winner;
    }

    public Player getWinner(){
        return winner;
    }

    public void init(){
        players.forEach(Player::nameSelf);
        deck.shuffle();
        beginDrawCard();
    }

    public void takeTurn(){
        while (noWinner()){
            for (Player player : players){
                if (checkWinner(player)){
                    return;
                }
                player.showCard();
            }
        }
    }

    public boolean noWinner(){
        return winner == null;
    }

    public boolean checkWinner(Player player){
        if (player.getHand().getCardAmount() == 0){
            setWinner(player);
            return true;
        }
        return false;
    }

    public void beginDrawCard(){
        for (int amout = 0 ; amout<5 ; amout++){
            players.forEach(this::getCardFromDeck);
        }
    }

    public void getCardFromDeck(Player player){
        player.addCard(deck.drawCard());
    }

    public void joinPlayer(Player player){
        players.add(player);
        player.joinGame(this);
    }
}
