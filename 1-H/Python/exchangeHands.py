class ExchangeHands:
    def __init__(self, exchanger, exchangee):
        self.__exchanger = exchanger
        self.__exchangee = exchangee
        self.__roundleft = 3

    def exchange(self):
        hand = self.__exchanger.getHand
        self.__exchanger.setHand = self.__exchangee.getHand
        self.__exchangee.setHand = hand

    def countDown(self):
       self.__roundleft -= 1
       if self.__roundleft == 0:
           self.exchange()