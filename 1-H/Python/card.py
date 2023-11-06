from enum import Enum, auto

class Suit(Enum):
    CLUB = auto()
    DIAMOND = auto()
    HEART = auto()
    SPADE = auto()

    def __str__(self):
        return self.name

class Rank(Enum):
    R2 = auto()
    R3 = auto()
    R4 = auto()
    R5 = auto()
    R6 = auto()
    R7 = auto()
    R8 = auto()
    R9 = auto()
    R10 = auto()
    J = auto()
    Q = auto()
    K = auto()
    A = auto()

    def __str__(self):
        return self.name

class Card:
    def __init__(self, rank, suit):
        self.suit = suit
        self.rank = rank

    def __str__(self):
        return "{} of {}".format(self.rank, self.suit)

    def __lt__(self, other):
        if self.rank == other.rank:
            return self.suit.value < other.suit.value
        return self.rank.value > other.rank.value

    @property
    def getSuits(self):
        return self.suit
    
    @property
    def getRanks(self):
        return self.rank