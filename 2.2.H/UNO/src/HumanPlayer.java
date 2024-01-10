import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

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
        showTopCard(daskTopCard);

        List<Card> matchingCards = hands
                .stream().
                filter(card -> card.getColor() == daskTopCard.getColor() || card.getNumber() == daskTopCard.getNumber())
                .collect(Collectors.toList());

        if (matchingCards.isEmpty()) {
            System.out.println("You don't have vailed card, draw on card from deck to your hand.");
            uno.playerAddCard(this); // or throw an exception, depending on your use case
            return null;
        }

        int choice = handChoice();
        Card chooseCard = hands.get(choice);
        if (chooseCard.getNumber() != daskTopCard.getNumber() && !chooseCard.getColor().equals(daskTopCard.getColor())) {
            System.out.println("Your select card is veiled, please select vailed card again.");
            return showCard(daskTopCard);
        }
        return hands.remove(choice);
    }

    private void showTopCard(Card daskTopCard){
        System.out.printf("The top card on dask is (%s) \n", daskTopCard.toString());
    }

    private int handChoice() {
        System.out.println("The hands you have:");
        for(int i=0 ; i<hands.size() ; i++) {
            Card handCard = hands.get(i);
            System.out.printf("(%d): (%s) \n", i, handCard.toString());
        }
        System.out.print("Please select the card you want to show from your hands.");
        int choice = in.nextInt();
        return choice;
    }
}
