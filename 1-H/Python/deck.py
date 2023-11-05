from card import Card, Suit, Rank

class Deck:
    def __init__(self):
        self.__cardPool = list()
        self.setDeck(self)

    @staticmethod
    def setDeck(self):
        for suit in Suit:
            for rank in Rank:
                self.put(Card(rank, suit))

    def put(self, card):
        self.__cardPool.append(card)

    def shuffle(self):
        import random
        random.shuffle(self.__cardPool)

    def draw(self):
        return self.__cardPool.pop()


    def __len__(self):
        return len(self.__cardPool)