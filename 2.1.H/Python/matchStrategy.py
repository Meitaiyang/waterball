import abc

class MatchStrategy(metaclass=abc.ABCMeta):
    @abc.abstractmethod
    def match(self, individuals, target):
        pass