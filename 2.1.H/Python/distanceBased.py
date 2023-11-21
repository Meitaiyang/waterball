import math
from matchStragety import MatchStragety

class DistanceBase(MatchStragety):
    def match(self, individuals, target):
        # sort individuals by distance
        individuals.sort(key=lambda individual: self.distance(individual.getCoordinate(), target.getCoordinate()))
        return individuals

    def distance(self, individual1, individual2):
        distance = math.sqrt((individual1.x - individual2.x) ** 2 + (individual1.y - individual2.y) ** 2)
        return distance
