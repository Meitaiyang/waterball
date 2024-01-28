import java.util.ArrayList;
import java.util.List;

public abstract class Player {

    protected String name;

    protected Showdown showdown;
    protected List<Card> cards = new ArrayList<>();
    private int point = 0;

    protected void setName(String name) {
        this.name = name;
    }

    public abstract void nameSelf(int i);

    public void setGame(Showdown showdown) {
    }

    public void addCard(Card card) {
    }

    public abstract Card showCard();

    public void addPoint() {
        point++;
    }

    public int getPoint() {
        return point;
    }
}
