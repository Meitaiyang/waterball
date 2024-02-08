from deck import Deck
from player import Player
from traitlets import Instance


class UNO:
    def __init__(self):
        self.__players = list()
        self.__deck = Deck()
        self.__desk = list()
        self.__winner = Instance(Player)

    def join_player(self, player):
        if not isinstance(player, Player):
            raise ValueError("Only players can join the game")

        if len(self.__players) > 4:
            raise ValueError("The game is full")

        self.__players.append(player)
        player.game = self

    def start(self):

        for player in self.__players:
            player.name_self()

        self.__deck.shuffle()

        for player in self.__players:
            for _ in range(5):
                drawed_card = self.__deck.draw_card()
                player.add_card(drawed_card)

        self.__desk.append(self.__deck.draw_card())

    def take_turn(self):
        for player in self.__players:
            if player.has_no_hand():
                self.__winner = player
                return

            top_card = self.__desk[-1]
            player.show_card(top_card)

            if self.__deck.is_empty():
                self.refill_to_deck()

    def refill_to_deck(self):
        top_card = self.__desk.pop()
        self.__deck.refill(self.__desk)
        self.__desk = [top_card]

