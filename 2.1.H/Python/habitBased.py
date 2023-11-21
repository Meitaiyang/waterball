from matchStragety import MatchStragety

class HabitBase(MatchStragety):
    
    # find the individual with cover most habit
    # The habbit is the list of string
    def match(self, individuals, target):
        individuals.sort(key=lambda individual: self.cover(individual.getHabbit(), target.getHabbit()))
        return individuals

    def cover(self, individual1, individual2):
        cover = 0
        for index, gene in enumerate(individual1):
            if gene in individual2:
                cover += 1
        return cover