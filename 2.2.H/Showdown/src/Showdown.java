import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Showdown {

    private List<Player> players = new ArrayList<>();
    private Deck deck;

    public Showdown() {
        this.deck = Deck.standard40Cards();
        deck.setGame(this);
    }


    public void joinPlayer(List<Player> players) throws IllegalArgumentException{

        if (players.size() != 4)
            throw new IllegalArgumentException("The number of players should be 4.");
        this.players = players;
        players.forEach(player -> player.setGame(this));

    }

    public void init() {

        //player name self
        for (int p=0 ; p<players.size() ; p++) {
            players.get(p).nameSelf(p+1);
        }

        //shuffle deck
        deck.shuffle();

        //draw 13 cards for each player
        players.forEach(player -> {
            for (int i=0 ; i<13 ; i++) {
                Card card = deck.drawCard();
                player.addCard(card);
            }
        });

    }

    public void takeTurns() {
        for (int turn=1 ; turn<=13 ; turn++) {
            List<Card> turnCards = new ArrayList<>();
            for (Player player : players) {
                Card card = player.showCard();
                System.out.print("Player " + player + " shows card:");
                System.out.println(card);
                turnCards.add(card);
            }
            //find the index of max card of comparing the Rank of Card
            int maxIndex = 0;
            for (int i=1 ; i<turnCards.size() ; i++) {
                if (turnCards.get(i).compareTo(turnCards.get(maxIndex)) > 0) {
                    maxIndex = i;
                }
            }
            Player maxPlayer = players.get(maxIndex);
            maxPlayer.addPoint();

        }
    }

    public void showResult() {
        Optional<Player> maxPlayer = players.stream().max(Comparator.comparing(Player::getPoint));
        System.out.println("The winner is " + maxPlayer.get() + " with " + maxPlayer.get().getPoint() + " points.");
    }
}
