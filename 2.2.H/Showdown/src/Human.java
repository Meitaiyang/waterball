import java.util.Scanner;

public class Human extends Player{

    private final static Scanner in = new Scanner(System.in);

    @Override
    public void nameSelf(int order) throws IllegalArgumentException{
        System.out.printf("Input your name (P%d): ", order);
        String name = in.next();
        if (name.isEmpty()) {
            throw new IllegalArgumentException("Empty Name.");
        } else {
            setName(name);
        }
    }

    @Override
    public Card showCard() {
        return cards.remove(0);
    }

}
