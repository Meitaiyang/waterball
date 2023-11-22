from matchStrategy import MatchStrategy

class HabitBase(MatchStrategy):
    
    # find the individual with cover most habit
    # The habbit is the list of string
    def match(self, individuals, target):

        for individual in individuals:
            if individual.getId() == target.getId():
                individuals.remove(individual)
                break

        individuals.sort(key=lambda individual: self.cover(individual.getHabbit(), target.getHabbit()), reverse=True)
        return individuals

    def cover(self, individual1, individual2):
        cover = 0
        for index, gene in enumerate(individual1):
            if gene in individual2:
                cover += 1
        return cover