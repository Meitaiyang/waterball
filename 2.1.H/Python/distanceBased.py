import math
from matchStrategy import MatchStrategy

class DistanceBase(MatchStrategy):
    def match(self, individuals, target):

        # drop target itself in individuals first

        for individual in individuals:
            if individual.getId() == target.getId():
                individuals.remove(individual)
                break

        # sort individuals by distance
        individuals.sort(key=lambda individual: self.distance(individual.getCoordinate(), target.getCoordinate()))
        return individuals

    def distance(self, individual1, individual2):
        distance = math.sqrt((individual1.x - individual2.x) ** 2 + (individual1.y - individual2.y) ** 2)
        return distance
