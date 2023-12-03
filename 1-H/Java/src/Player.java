public abstract class Player {


    private String name;
    private int points;

    public abstract void nameSelf();

    public String getName() {
        return name;
    }

    public void setPoints() {
        this.points = 0;
    }

    public int getPoints() {
        return points;
    }

    public void ExchangeHands() {

    }

    public abstract Hand showHandCards();

}
