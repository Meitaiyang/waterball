import java.util.List;

public class MatchSystem {
    private List<Individual> individuals;
    
    public void setIndividuals(List<Individual> individuals) throws IllegalArgumentException {
        if (individuals == null || individuals.size() < 2) {
            throw new IllegalArgumentException("Individuals must be greater than 2");
        }
        this.individuals = individuals;
    }

    public List<Individual> getIndividuals() {
        return this.individuals;
    }

    public void match(MatchStrategy matchStrategy, Individual targetIndividual) throws Exception {
        if (targetIndividual == null) {
            throw new Exception("Target individual must not be null");
        }
        
        targetIndividual.setIndividual(matchStrategy.match(individuals, targetIndividual).get(1));

    }
}
