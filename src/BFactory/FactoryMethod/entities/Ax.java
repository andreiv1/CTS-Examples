package BFactory.FactoryMethod.entities;

public class Ax extends Weapon{
    public Ax() {
        damage = 15;
        speed = 8;
        range = 1.57;
    }

    @Override
    public void attackEnemy() {
        System.out.println("Attacking enemy with an ax.");
        System.out.println(this.toString());
    }
}
