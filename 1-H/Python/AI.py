from player import Player
import random
from exchangeHands import ExchangeHands

class AI(Player):
    def nameSelf(self, order):
        self.setNames = "AI" + str(order)

    def decideExchangeHands(self):
        players = self.getShowdown.getPlayers

        if random.randint(0, 1) == 1:
            self.setexchangeHands(ExchangeHands(self, random.choice(players)))
            self._exchangeHands.exchange()

    def showHandCards(self):
        return self.getHand.showCards(random.randint(0, len(self.getHand.getCard) - 1))
