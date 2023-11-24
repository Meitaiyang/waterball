import java.util.List;

public class DistanceBased implements MatchStrategy{
    @Override
    public List<Individual> match(List<Individual> individuals, Individual targetIndividual) {
        //drop target itself in individuals first
        individuals.remove(targetIndividual);

        // Sort individuals by the distance between targetIndividual and each individual
        individuals.sort((individual1, individual2) -> {
            double distance1 = Math.sqrt(Math.pow(individual1.getCoordinate().getX() - targetIndividual.getCoordinate().getX(), 2) + Math.pow(individual1.getCoordinate().getY() - targetIndividual.getCoordinate().getY(), 2));
            double distance2 = Math.sqrt(Math.pow(individual2.getCoordinate().getX() - targetIndividual.getCoordinate().getX(), 2) + Math.pow(individual2.getCoordinate().getY() - targetIndividual.getCoordinate().getY(), 2));
            return (int) (distance1 - distance2);
        });

        individuals.add(0, targetIndividual);
        return individuals;
    }
}
