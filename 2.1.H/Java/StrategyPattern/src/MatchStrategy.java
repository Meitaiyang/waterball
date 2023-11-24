import java.util.List;

public interface MatchStrategy {
    public List<Individual> match(List<Individual> individuals, Individual targetIndividual);

}