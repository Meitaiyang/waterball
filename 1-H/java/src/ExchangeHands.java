
public class ExchangeHands {

    private static boolean hasused = false;
    private final Player exchanger;
    private final Player exchangee;
    private final int roundleft = 3;

    public ExchangeHands(Player exchanger, Player exchangee) {
        this.exchanger = exchanger;
        this.exchangee = exchangee;
    }

    public boolean hasUsed()  {
        return hasused;
    }

    public int getRoundleft() {
        return roundleft;
    }
}
