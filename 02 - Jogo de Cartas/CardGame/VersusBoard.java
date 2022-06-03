package CardGame;

public class VersusBoard extends Board{
    @Override
    public boolean cardCanBePlayed(ICard card, Player player) {
        ICard[] playerBoard = player.playerBoard;
        int attackCards = 0;
        int specialAttackCards = 0;

        for (ICard cardInBoard: playerBoard) {
            if (cardInBoard instanceof SpecialAttackCard) {
                specialAttackCards++;
            } else {
                attackCards++;
            }
        }

        if (card instanceof SpecialAttackCard && specialAttackCards < 2) {
            return true;
        } else if (!(card instanceof SpecialAttackCard) && attackCards < 5) {
            return  true;
        }

        return false;
    }

    public VersusBoard(Deck deckPlayerOne, Deck deckPlayerTwo) {
        players = new Player[2];
        decks = new Deck[2];

        for (int i = 0; i < players.length; i++) {
            players[i] = new Player(i);
        }

        if (deckPlayerOne.getCards().length == 50) {
            insertDeck(deckPlayerOne, 0);
        }
        if (deckPlayerTwo.getCards().length == 50) {
            insertDeck(deckPlayerTwo, 1);
        }
    }
}
