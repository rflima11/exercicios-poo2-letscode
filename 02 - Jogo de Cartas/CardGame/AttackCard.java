package CardGame;

public class AttackCard implements IAttackCard{
    protected String name;
    protected String type;
    protected int cost;
    protected int power;
    protected int resistance;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public int getCost() {
        return cost;
    }

    @Override
    public int getPower() {
        return power;
    }

    @Override
    public int getResistance() {
        return resistance;
    }

    public AttackCard(String name, String type, int cost, int power, int resistance) {
        this.name = name;
        this.type = type;
        this.cost = cost;
        this.power = power;
        this.resistance = resistance;
    }
}
