from deck import Deck
from desk import Desk
from player import Player


class UNO:
    def __init__(self):
        self.__players = list()
        self.__deck = Deck()
        self.__desk = Desk()

    def join_player(self, player):
        if not isinstance(player, Player):
            raise ValueError("Only players can join the game")

        if len(self.__players) > 4:
            raise ValueError("The game is full")

        self.__players.append(player)
        player.game = self

    def init(self):
        for player in self.__players:
            player.name_self()

