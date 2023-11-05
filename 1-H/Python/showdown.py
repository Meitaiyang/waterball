from deck import Deck
from AI import AI
from human import HumanPlayer

class Showdown():
    def __init__(self):
        self.__players = list()
        self.__deck = Deck()
    
    def start(self):
        self.initializePlayers()
        self.playerNameSelf()
        self.__deck.shuffle()
        self.addCards()

        for round in range(1,14):
            self.takeTurn()
            self.compareHands()

    def initializePlayers(self):
        self.__players.append(HumanPlayer())
        self.__players.append(AI())
        self.__players.append(AI())
        self.__players.append(AI())

    def playerNameSelf(self):
        for index, player in enumerate(self.__players):
            player.setShowdown = self
            player.nameSelf(index)

    def addCards(self):
        for player in self.__players:
            for card in range(13):
                player.addCardToHand(self.__deck.draw())

    def takeTurn(self):
        for player in self.__players:
            if not player.hasUsedExchangeHands():
                player.decideExchangeHands()
            else:
                player.getExchangeHands().countDown()     

    def compareHands(self):
        roundMaxPlayer = max(self.__players, key=lambda player: player.showHandCards())
        roundMaxPlayer.gainPoint()


    def end(self):
        max_point_player = max(self.__players, key=lambda player: player.getPoint)
        print("Winner is {}".format(max_point_player.getNames))

        print("Final score: ")
        for player in self.__players:
            print("{}: {}".format(player.getNames, player.getPoint))

    @property
    def getPlayers(self):
        return self.__players