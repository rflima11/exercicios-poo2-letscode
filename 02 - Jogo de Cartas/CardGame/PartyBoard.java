package CardGame;

public class PartyBoard extends Board {
    @Override
    public boolean cardCanBePlayed(ICard card, Player player) {
        int totalCards = 0;

        for (Player playerInList: players) {
            totalCards += playerInList.playerBoard.length;
        }

        return totalCards < 34;
    }

    public PartyBoard(Deck[] decks) {
        players = new Player[5];
        this.decks = new Deck[5];

        for (int i = 0; i < players.length; i++) {
            players[i] = new Player(i);
        }

        if (decks.length == 5) {
            for(int i = 0; i < decks.length; i++) {
                if (decks[i].getCards().length == 80) {
                    this.decks[i] = decks[i];
                }
            }
        }
    }
}
