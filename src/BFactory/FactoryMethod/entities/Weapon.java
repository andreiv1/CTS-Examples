package BFactory.FactoryMethod.entities;

public abstract class Weapon {
    protected int damage;
    protected int speed;
    protected double range;

    public abstract void attackEnemy();

    @Override
    public String toString() {
        return "Weapon{" +
                "damage=" + damage +
                ", speed=" + speed +
                ", range=" + range +
                '}';
    }
}

