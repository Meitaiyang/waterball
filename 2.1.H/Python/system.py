class System():
    def __init__(self, MatchStragety):
        self.individuals = list()
        self.matchStragety = MatchStragety()

    def setIndividuals(self, individuals):
        self.individuals = individuals
    
    def getIndividuals(self):
        return self.individuals

    def addIndividual(self, individual):
        self.individuals.append(individual)

    def match(self, individual):
        target = self.matchStragety.match(self.individuals, individual)
        return target

    
    
           