from system import System
from individual import Individual
from coordinate import Coordinate as Coord
from distanceBased import DistanceBase
from habitBased import HabitBase
from reverse import Reverse

if __name__ == '__main__':
    individuals = [

        Individual(1, 'Male', 25, 'Intro text 1', ['reading', 'swimming'], Coord(3.2612, 14.4903)),
        Individual(2, 'FEMALE', 30, 'Intro text 2', ['singing', 'dancing'], Coord(14.5812, 85.7681)),
        Individual(3, 'Male', 22, 'Intro text 3', ['gaming', 'cycling'], Coord(63.6370, 36.2232)),
        Individual(4, 'FEMALE', 45, 'Intro text 4', ['cooking', 'running'], Coord(98.3328, 5.4128)),
        Individual(5, 'Male', 35, 'Intro text 5', ['running', 'swimming'], Coord(40.1405, 0.0930)),
        Individual(6, 'FEMALE', 28, 'Intro text 6', ['hiking', 'dancing'], Coord(13.2999, 66.4690)), 
    ]
    system_distance = System(DistanceBase)
    system_distance.setIndividuals(individuals)

    system_habit = System(HabitBase)
    system_habit.setIndividuals(individuals)

    system_distance_reverse = System(Reverse(DistanceBase))

    target = individuals[0]

    print("The match individual of target", target.getId(), "is", system_distance.match(target).getIndividual().getId())
    print("The match individual of target", target.getId(), "is", system_habit.match(target).getIndividual().getId())