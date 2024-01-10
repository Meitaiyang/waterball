import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Player> players = new ArrayList<>();
        players.add(new HumanPlayer());
        for (int p=0 ; p<3 ; p++)
            players.add(new AIPlayer());
        UNO uno = new UNO();
        uno.joinPlayer(players);
        uno.init();
        uno.takeTurn();

    }
}