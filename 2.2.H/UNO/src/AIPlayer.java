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
        List<Card> matchingCards = hands
                .stream().
                filter(card -> card.getColor() == daskTopCard.getColor() || card.getNumber() == daskTopCard.getNumber())
                .collect(Collectors.toList());

        if (matchingCards.isEmpty()) {
            uno.playerAddCard(this); // or throw an exception, depending on your use case
        }

        Random random = new Random();
        return matchingCards.get(random.nextInt(matchingCards.size()));

    }
}
