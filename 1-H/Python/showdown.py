import abc

from player import Player
from deck import Deck


class Showdown(metaclass=abc.ABCMeta):
    def __init__(self, _ExchangeHands=None):
        self.name = ""
        self.point = 0
        self._players = list()
        self._deck = Deck()
        self._ExchangeHands = ExchangeHands()

    @abc.abstractmethod
    def choice():
        pass

    def nameSelf(self, name):
        return self.name

    def ExchangeHands(self, player):
        if isinstance(Exc):
        player.exchangeHands(self._deck)