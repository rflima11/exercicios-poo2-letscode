package CardGame;

public abstract class Board {
    protected Player[] players;
    protected Deck[] decks;

    public void insertDeck(Deck deck, int id) {
        decks[id] = deck;
    };

    public boolean didPlayerWin(Player player) {
        boolean areAllPlayersDead = true;

        for (Player anotherPlayer: players) {
            if (anotherPlayer.getId() != player.getId() && anotherPlayer.getIsAlive()) {
                areAllPlayersDead = false;
            }
        }

        return areAllPlayersDead;
    };

    public abstract boolean cardCanBePlayed(ICard card, Player player);
}
