import java.util.List;

public class Showdown {

    private final List<Player> players;
    private final Deck deck;

    public Showdown(List<Player> players, Deck deck) {
        this.players = players;
        this.deck = deck;
        
    }

    public void start() {
        playerNameSelf();
        deck.shuffle();
        for (int round = 0; round <= 13; round++) {
            takeTurn(players);
            compare(players);
        }

    }

    public void playerNameSelf(){
        for (Player player : players) {
            player.nameSelf();
        }
    }

    public Player compare(List<Player> players) {
        Player winner = players.get(0);
        for (Player player : players) {
            if (player.showHandCard().getCardPoint() > winner.showHandCard().getCardPoint()) {
                winner = player;
            }
        }
        return winner;
    }

    public void takeTurn(List<Player> players) {
        for (Player player : players) {
            if(!player.hasUsedExchangeHands()){
                player.decideExchangeHands();
            }
        }
    }

}
