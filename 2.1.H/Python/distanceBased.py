import math
from matchStragety import MatchStragety

class DistanceBase(MatchStragety):
    def match(self, individuals, target):
        minDistance = math.inf
        targetIndex = 0
        for index, individual in enumerate(individuals):
            distance = self.distance(individual, target)
            if distance < minDistance:
                minDistance = distance
                targetIndex = index
        return individuals[targetIndex]

    def distance(self, individual1, individual2):
        distance = 0
        for index, gene in enumerate(individual1):
            distance += (gene - individual2[index]) ** 2
        return math.sqrt(distance)