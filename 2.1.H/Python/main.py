from system import System
from individual import Individual
from coordinate import Coordinate as Coord
from distanceBased import DistanceBase
from habitBased import HabitBase

if __name__ == '__main__':
    individuals = [

    Individual(1, 'Male', 25, 'Intro text 1', ['reading', 'swimming'], Coord(10.0, 20.0)),

    Individual(2, 'FEMALE', 30, 'Intro text 2', ['singing', 'dancing'], Coord(30.0, 40.0)),

    Individual(3, 'Male', 22, 'Intro text 3', ['gaming', 'cycling'], Coord(50.0, 60.0)),

    Individual(4, 'FEMALE', 45, 'Intro text 4', ['cooking', 'painting'], Coord(70.0, 80.0)),

    Individual(5, 'Male', 35, 'Intro text 5', ['running', 'yoga'], Coord(90.0, 100.0)),

    Individual(6, 'FEMALE', 28, 'Intro text 6', ['hiking', 'photography'], Coord(110.0, 120.0))

]
    system_distance = System(DistanceBase)
    system_distance.setIndividuals(individuals)

    print(system_distance.match(individuals[0])[0].getId())