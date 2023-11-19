from matchStragety import MatchStragety

class HabitBase(MatchStragety):
    # find the individual with cover most habit
    def match(self, individuals, target):
        target_habit = target.getHabbit()
        for individual in individuals:
            