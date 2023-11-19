import abc

class MatchStragety(metaclass=abc.ABCMeta):
    @abc.abstractmethod
    def match(self, individuals, target):
        pass