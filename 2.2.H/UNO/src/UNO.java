import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class UNO {
    private final List<Player> players = new ArrayList<>();
    private final Deck deck = new Deck();
    private Player winner;

    public void setWinner(Player winner){
        this.winner = winner;
    }

    public Player getWinner(){
        return winner;
    }

    public void init(){
        for(Player player : players){
            player.nameSelf(players.indexOf(player) + 1);
        }
        deck.shuffle();
        beginDrawCard();
    }

    public void takeTurn() throws Exception {
        while (noWinner()){
            for (Player player : players){
                deck.checkCardAmount();
                if (checkWinner(player)){
                    return;
                }
                deck.checkCardAmount();
                player.showCard();
            }
        }
    }

    public void end(){
        System.out.println("Winner is " + winner.getName());
    }

    private boolean noWinner(){
        return winner == null;
    }

    private boolean checkWinner(Player player){
        if (player.getHand().getCardAmount() == 0){
            setWinner(player);
            return true;
        }
        return false;
    }

    private void beginDrawCard(){
        for (int amout = 0 ; amout<5 ; amout++){
            players.forEach(this::getCardFromDeck);
        }
        for (Player player : players){
            player.getHand().setCardAmount();
        }
    }

    private void getCardFromDeck(Player player){
        player.addCard(deck.drawCard());
    }

    public void joinPlayer(Player player){
        players.add(player);
        player.joinGame(this);
    }
}
