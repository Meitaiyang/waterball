import java.util.Scanner;

import static java.lang.String.format;

public class HumanPlayer extends Player{

    private final static Scanner in = new Scanner(System.in);

    @Override
    public void nameSelf(int order){
        System.out.printf("Input your name (P%d): ", order);
        String name = in.next();
        if (name.isEmpty()) {
            nameSelf(order);
        } else {
            setName(name);
        }
    }

    @Override
    public Card showCard(Card daskTopCard){
        System.out.println("The card ");
        for(Card hand:getHands()) {

        }
    }
}
