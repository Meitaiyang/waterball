class System():
    def __init__(self, MatchStragety):
        self.individuals = list()
        self.matchStragety = MatchStragety()

    def setIndividuals(self, individuals):
        self.individuals = individuals
    
    def getIndividuals(self):
        return self.individuals

    def match(self, individual):
        result = self.matchStragety.match(self.individuals, individual)[0]
        individual.setIndividual(result)
        return individual

    
    
           