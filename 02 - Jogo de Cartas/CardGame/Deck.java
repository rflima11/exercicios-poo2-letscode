package CardGame;

public class Deck {
    private ICard[] cards;

    public ICard[] getCards() {
        return cards;
    }

    public Deck(ICard[] cards) {
        this.cards = cards;
    }
}
