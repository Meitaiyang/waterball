public abstract class Player {

    private String name;
    private int point;

    protected ExchangeHands exchangeHands;

    public abstract void nameSelf(); 

    public String getName() {
        return name;
    }

    public void setPoint() {
        this.point = 0;
    }

    public void gainPoint() {
        point++;
    }

    public int getPoint() {
        return point;
    }

    public void ExchangeHands(Hand hand, Player exchangee){
        if (exchangeHands == null){ //代表還沒換過牌
            exchangeHands = new ExchangeHands(this, exchangee);
        }
    }

    public abstract Card showHandCard();

    public boolean hasUsedExchangeHands() {
        if(exchangeHands != null){
            return true;
        }
        return false;
    }

    public abstract void decideExchangeHands();

}
