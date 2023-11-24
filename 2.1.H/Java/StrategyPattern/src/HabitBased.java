import java.util.List;

public class HabitBased implements MatchStrategy{
    @Override
    public List<Individual> match(List<Individual> individuals, Individual targetIndividual) {
        //drop target itself in individuals first
        individuals.remove(targetIndividual);

        // Sort individuals by the number of habits that match with targetIndividual. The habit is List<string>
        individuals.sort((individual1, individual2) -> {
            int count1 = 0;
            int count2 = 0;
            for (String habit : individual1.getHabits()) {
                if (targetIndividual.getHabits().contains(habit)) {
                    count1++;
                }
            }
            for (String habit : individual2.getHabits()) {
                if (targetIndividual.getHabits().contains(habit)) {
                    count2++;
                }
            }
            return count2 - count1;
        });

        individuals.add(0, targetIndividual);
        return individuals;
    }
    
}
