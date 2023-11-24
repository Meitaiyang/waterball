import java.util.List;

import static java.util.Collections.reverse;

public class Reverse implements MatchStrategy {
    private final MatchStrategy matchStrategy;

    public Reverse(MatchStrategy matchingStrategy) {
        this.matchStrategy = matchingStrategy;
    }

    @Override
    public List<Individual> match(List<Individual> individuals, Individual targetIndividual) {
        List<Individual> result = matchStrategy.match(individuals, targetIndividual);
        reverse(result);
        return result;
    }
}
