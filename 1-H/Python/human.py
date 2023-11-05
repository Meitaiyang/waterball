from player import Player
from exchangeHands import ExchangeHands

class HumanPlayer(Player):

    def nameSelf(self, order):

        self.__name = input("Enter your name: ")
        if (self.__name == ""):
            raise Exception("Name is empty")
        else:
            self.setNames = self.__name

    def decideExchangeHands(self):

        print("Would you like to exchange hands? (y/n): ")
        self.__inputCommand = input("")

        if (self.__inputCommand == "y"):
            players = self._showdown.getPlayers

            print("Choose a player to exchange hands with: ")
            for index, player in enumerate(players):
                print("{}: {}".format(index, player.getNames))
            self.__inputPlayer = input("")

            self.setexchangeHands(ExchangeHands(self, players[int(self.__inputPlayer)]))
            self._exchangeHands.exchange()


    def showHandCards(self):

        print("Your cards: ")
        for index, card in enumerate(self.getHand.getCard):
            print("{}: {}".format(index, card))

        self.__inputCard = input("Choose a card to play: ")

        if (int(self.__inputCard) < 0 or int(self.__inputCard) > len(self.getHand.getCard)-1):
            print("Please enter a valid number")
            self.showHandCards()

        return self.getHand.showCards(int(self.__inputCard))
            

