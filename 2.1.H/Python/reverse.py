from matchStrategy import MatchStrategy

class Reverse(MatchStrategy):
    def __init__(self, strategy):
        self.strategy = strategy

    def match(self, individuals, target):
        return individuals[::-1]