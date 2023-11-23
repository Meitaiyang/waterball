import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {

        System system = new System();
    
        List<Individual> individuals = Arrays.asList(
            new Individual(1, "Male", 25, "Intro text 1", Arrays.asList("reading", "swimming"), new Coordicate(3.2612, 14.4903)),
            new Individual(2, "FEMALE", 30, "Intro text 2", Arrays.asList("singing", "dancing"), new Coordicate(14.5812, 85.7681)),
            new Individual(3, "Male", 22, "Intro text 3", Arrays.asList("gaming", "cycling"), new Coordicate(63.6370, 36.2232)),
            new Individual(4, "FEMALE", 45, "Intro text 4", Arrays.asList("cooking", "running"), new Coordicate(98.3328, 5.4128)),
            new Individual(5, "Male", 35, "Intro text 5", Arrays.asList("running", "swimming"), new Coordicate(40.1405, 0.0930)),
            new Individual(6, "FEMALE", 28, "Intro text 6", Arrays.asList("hiking", "dancing"), new Coordicate(13.2999, 66.4690))
        );
    }
}
