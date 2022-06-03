package CardGame;

public class Player {
    private int hp;
    private boolean isAlive;
    private int id;
    public ICard[] playerBoard;

    public int getHp() {
        return hp;
    }

    public void updateHp(int addedHp) {
        hp += addedHp;

        if (hp <= 0) {
            destroyPlayer();
        }
    }

    public boolean getIsAlive() {
        return isAlive;
    }

    private void destroyPlayer() {
        isAlive = false;
    }

    public int getId() {
        return id;
    }

    public Player(int id) {
        this.hp = 50;
        this.isAlive = true;
        this.id = id;
    }
}
