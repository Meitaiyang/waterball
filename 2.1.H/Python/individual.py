class Individual:
    def __init__(self, id, gender, age, introduct, habit, coord):
        self.id = id
        self.gender = gender
        self.age = age
        self.introduct = introduct
        self.habit = habit
        self.coordinate = coord

    def setIndividual(self, match_individual):
        self.individual = match_individual

    def getIndividual(self):
        return self.individual

    def setCoordinate(self, coordinate):
        self.coordinate = coordinate
    
    def getCoordinate(self):
        return self.coordinate

    def getHabbit(self):
        return self.habit
    
    def getId(self):
        return self.id
