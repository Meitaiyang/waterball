import abc
from hand import Hand
from exchangeHands import ExchangeHands

class Player(metaclass=abc.ABCMeta):
    def __init__(self, name=None, showdown=None):
        self.__name = name
        self.__point = 0
        self._exchangeHands = None
        self.__hand = Hand()
        self._showdown = showdown

    @property
    def getNames(self):
        return self.__name

    @getNames.setter
    def setNames(self, name):
        self.__name = name

    @abc.abstractmethod
    def nameSelf(self):
        pass

    @property
    def getPoint(self):
        return self.__point

    @getPoint.setter
    def setPoint(self, point):
        self.__point = point

    @property
    def getHand(self):
        return self.__hand

    @getHand.setter
    def setHand(self, hand):
        self.__hand = hand

    def addCardToHand(self, card):
        self.__hand.addCard(card)

    @property
    def getShowdown(self):
        return self._showdown

    @getShowdown.setter
    def setShowdown(self, showdown):
        self._showdown = showdown

    def gainPoint(self):
        self.__point += 1

    def getExchangeHands(self):
        return self._exchangeHands

    def setexchangeHands(self, exchangeHands):
        self._exchangeHands = exchangeHands

    @abc.abstractmethod
    def showHandCards(self):
        pass

    def hasUsedExchangeHands(self):
        return isinstance(self._exchangeHands, ExchangeHands)

    @abc.abstractmethod
    def decideExchangeHands(self):
        pass
