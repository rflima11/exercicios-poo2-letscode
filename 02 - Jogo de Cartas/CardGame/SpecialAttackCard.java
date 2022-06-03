package CardGame;

public class SpecialAttackCard extends AttackCard{
    private String effect;

    public SpecialAttackCard(String name, String type, int cost, int power, int resistance, String effect) {
        super(name, type, cost, power, resistance);
        this.effect = effect;
    }

    public String getEffect() {
        return effect;
    }
}
