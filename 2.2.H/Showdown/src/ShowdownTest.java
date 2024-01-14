import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ShowdownTest {

    @org.junit.jupiter.api.Test
    void TestShowdownInit() {
        List<Player> players = new ArrayList<Player>();
        for (int i = 0; i < 5; i++) {
            players.add(new AIPlayer());
        }
        Showdown showdown = new Showdown(players);
        assertEquals(4, showdown.getPlayers().size());
        players.forEach(player -> {
            assertEquals(showdown, player.getGame());
        });
        assertEquals(showdown.getDeck().size(), 52 - 4 * 4);
    }


}