import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {

        MatchSystem matchSystem = new MatchSystem();
        List<Individual> individuals = new ArrayList<>(Arrays.asList(
            new Individual(1, "Male", 25, "Intro text 1", Arrays.asList("reading", "swimming"), new Coordinate(3.2612, 14.4903)),
            new Individual(2, "FEMALE", 30, "Intro text 2", Arrays.asList("singing", "dancing"), new Coordinate(4.5812, 10.7681)),
            new Individual(3, "Male", 22, "Intro text 3", Arrays.asList("gaming", "cycling"), new Coordinate(63.6370, 36.2232)),
            new Individual(4, "FEMALE", 45, "Intro text 4", Arrays.asList("cooking", "running"), new Coordinate(98.3328, 5.4128)),
            new Individual(5, "Male", 35, "Intro text 5", Arrays.asList("running", "swimming"), new Coordinate(40.1405, 0.0930)),
            new Individual(6, "FEMALE", 28, "Intro text 6", Arrays.asList("hiking", "dancing"), new Coordinate(13.2999, 66.4690))
        ));
        Individual targetIndividual = individuals.get(0);

        matchSystem.setIndividuals(individuals);

        matchSystem.match(new HabitBased(), targetIndividual);
        System.out.print("HabitBased: ");
        System.out.println(targetIndividual.getIndividual().getId());

        matchSystem.match(new DistanceBased(), targetIndividual);
        System.out.print("DistanceBased: ");
        System.out.println(targetIndividual.getIndividual().getId());
    }
}
