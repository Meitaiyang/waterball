import java.util.Scanner;

public class Human extends Player{
    Scanner nameScanner = new Scanner(System.in);
    Scanner cardScanner = new Scanner(System.in);
    @Override
    public void nameSelf(int order) {
        System.out.println("Please enter your name:");
        this.name = nameScanner.nextLine();
    }

    @Override
    public void showCard() throws IllegalArgumentException {

        int cardIndex = 1;

        System.out.println("Please enter the card you want to play:");
        System.out.println("Your valid cards are:");
        for (Card card : hand.validCard()){
            System.out.println(cardIndex + ": " +card.toString());
            cardIndex++;
        }

        cardIndex = cardScanner.nextInt();
        hand.showCard(hand.validCard().get(cardIndex-1));

    }
}
