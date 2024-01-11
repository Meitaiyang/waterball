import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

import static java.lang.String.format;

public class AIPlayer extends Player{

    @Override
    public void nameSelf(int order){
        setName(format("AI-%d", order));
    }

    @Override
    public Card showCard(Card daskTopCard){

        if (matchingCards.isEmpty()) {
            System.out.println("The top card is "+daskTopCard.toString()+", and "+getName()+" hasn't card to show, draw one card to hand");
            uno.playerAddCard(this);
            return null;
        }

        Random random = new Random();
        int selectCardIndex = random.nextInt(matchingCards.size());
        System.out.println("The top card is "+daskTopCard.toString()+", and "+getName() + " show the card "+matchingCards.get(selectCardIndex));

        Card cardToShow = null;
        for (Card hand:hands){
            if (hand.toString().equals(matchingCards.get(selectCardIndex).toString())) {
                cardToShow = hand;
                break;
            }
        }

        if(!hands.remove(cardToShow)){
            throw new IllegalArgumentException();
        }
        return cardToShow;

    }
}
