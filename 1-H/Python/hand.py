class Hand:
    def __init__(self):
        self.__cards = list()

    def addCard(self, card):
        if (len(self.__cards) >= 13):
            raise Exception("Hand is full")
        self.__cards.append(card)

    @property
    def getCard(self):
        return self.__cards

    def showCards(self, index):
        return self.__cards.pop(index)