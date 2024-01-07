import java.util.List;

public class UNO {

    private Deck deck;
    private Dask dask = new Dask();
    private List<Player> players;

    public UNO(Deck deck) {
        setDeck();
    }

    public void setDeck() {
        this.deck = new Deck();
        deck.setGame(this);
    }

    private void joinPlayer(List<Player> players) {
        this.players = players;
        players.forEach(player -> player.setGame(this));
    }

    public void init() {
        players.forEach(player -> player.nameSelf());
        deck.shuffle();
        for(Player player : players) {
            for(int i = 0; i < 5; i++) {
                player.addCard(deck.drawCard());
            }
        }
        Dask.addCard(deck.drawCard());
    }

    public void takeTurn() {
       for(Player player : players) {
           if(player.getHands().size() == 0) {
               System.out.println(player.getName() + " wins!");
               return;
           }
           player.showCard();
       }
    }

}
