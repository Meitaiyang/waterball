import java.util.EmptyStackException;
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
        for (int p = 0 ; p<players.size() ; p++){
            players.get(p).nameSelf(p+1);
        }
        // players.forEach(player -> player.nameSelf());
        deck.shuffle();
        for(Player player : players) {
            for(int i = 0; i < 5; i++) {
                playerAddCard(player);
            }
        }
        Dask.addCard(deck.drawCard());
    }

    public void playerAddCard(Player player) throws EmptyStackException {
        if (deck.getCardAmount() == 0){
            throw new EmptyStackException();
        }
        player.addCard(deck.drawCard());
    }

    public void takeTurn() {
        for(Player player : players) {
            if(player.getHands().size() == 0) {
                System.out.println(player.getName() + " wins!");
                return;
            }
            if(deck.getCardAmount() == 0) {
                deck.addCard(dask.drawCardToDeck());

            }
            Card showedCard = player.showCard(dask.showTopCard());
            dask.addCard(showedCard);
        }
    }

}