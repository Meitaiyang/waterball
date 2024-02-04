from traitlets import List
import abc


class Player:
    def __init__(self):
        self.__hands = List()
        self.__name = str()
        self.__game = None

    @property
    def game(self):
        return self.__game

    @game.setter
    def game(self, game):
        if self.__game is not None:
            raise ValueError("Player is already in a game")
        self.__game = game

    @abc.abstractmethod
    def name_self(self):
        pass