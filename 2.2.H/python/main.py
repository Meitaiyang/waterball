from uno import UNO
from player import Player

game = UNO()

player1 = Player()
game.join_player(player1)
game.init()