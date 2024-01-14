import java.util.List;

public class Showdown {

    private List<Player> players;
    private Deck deck;

    public Showdown(List<Player> players) {
        joinPlayer(players);
        setDeck();
    }

    public void joinPlayer(List<Player> players) throws IllegalStateException {

        if (players.size() != 4) {
            throw new IllegalStateException("Numbers of player must be between 2 and 4");
        }

        this.players = players;
        players.forEach(player -> {
            player.setGame(this);
        });
    }

    public void setDeck() {
        this.deck = Deck.standard52Deck();
        deck.setGame(this);
    }

    public void init() {
        for (int i=0 ; i<4 ; i++) {
            players.get(i).nameSelf(i+1);
        }

        deck.shuffle();

        for(Player player : players) {
            for(int i = 0; i < 5; i++) {
                playerAddCard(player);
            }
        }

    }
}
