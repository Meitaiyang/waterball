import java.util.List;

public class HabitBased implements MatchStragety{
    @Override
    public List<Individual> match(List<Individual> individuals, Individual targetIndividual) {
        //drop target itself in individuals first
        individuals.remove(targetIndividual);

        // Sort individuals by the number of habits that match with targetIndividual
        // The habbit is List<string>
        individuals.sort((individual1, target) -> {
            int count = 0;
            for (String habbit : individual1.getHabits()) {
                if (targetIndividual.getHabits().contains(habbit)) {
                    count++;
                }
            }
            return count;
        });

        return individuals;
    }
    
}
