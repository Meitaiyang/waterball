import java.util.List;

public class System {
    private List<Individual> individuals;
    private MatchStragety matchStragety;
    
    public void setIndividuals(List<Individual> individuals) throws IllegalArgumentException {
        if (individuals == null || individuals.size() < 2) {
            throw new IllegalArgumentException("Individuals must be greater than 2");
        }
        this.individuals = individuals;
    }

    public List<Individual> getIndividuals() {
        return this.individuals;
    }

    public void match(Individual targetIndividual) throws Exception {
        if (targetIndividual == null) {
            throw new Exception("Target individual must not be null");
        }
        
        targetIndividual.setIndividual(matchStragety.match(individuals, targetIndividual).get(0));

    }
}
