
public class Coordicate {

    private double x;
    private double y;

    public Coordicate(double x, double y) {
        setX(x);
        setY(y);
    }

    public void setX(double x) throws IllegalArgumentException {
        if (x < 0) {
            throw new IllegalArgumentException("X must be greater than 0");
        }
        this.x = x;
    }

    public double getX() {
        return this.x;
    }

    public void setY(double y) throws IllegalArgumentException {
        if (y < 0) {
            throw new IllegalArgumentException("Y must be greater than 0");
        }
        this.y = y;
    }

    public double getY() {
        return this.y;
    }

}
