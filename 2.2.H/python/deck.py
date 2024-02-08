import random


class Deck:
    def __init__(self):
        self.__cards = list()

    def shuffle(self):
        random.shuffle(self.__cards)

    def draw_card(self):
        return self.__cards.pop()

    def is_empty(self):
        return len(self.__cards) == 0

    def refill(self, cards):
        self.__cards = cards
