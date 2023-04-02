package BFactory.FactoryMethod.entities;

public class Sword extends Weapon {

    public Sword() {
        damage = 10;
        speed = 5;
        range = 1.5;
    }

    @Override
    public void attackEnemy() {
        System.out.println("Attacking enemy with a sword.");
        System.out.println(this.toString());
    }
}
