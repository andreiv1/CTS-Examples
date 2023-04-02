package BFactory.FactoryMethod.entities;

import BFactory.FactoryMethod.exceptions.WeaponWithoutAmmo;

public class Glock extends Weapon {
    private int bullets;
    public Glock(int bullets) {
        damage = 100;
        speed = 40;
        range = 5;
        this.bullets = bullets;
    }

    public int getBullets() {
        return bullets;
    }

    public void addBullets(int bullets){
        this.bullets += bullets;
    }
    public void removeBullet() throws WeaponWithoutAmmo {
        if(bullets > 0) {
            bullets--;
        } else {
            throw new WeaponWithoutAmmo();
        }
    }

    @Override
    public void attackEnemy() {
        try {
            removeBullet();
            System.out.println("Attacking enemy with a Glock.");
        } catch (WeaponWithoutAmmo e) {
            System.out.println("Can't attack enemy - you run out of ammo.");
        }

        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Glock{" +
                "bullets=" + bullets +
                ", damage=" + damage +
                ", speed=" + speed +
                ", range=" + range +
                '}';
    }
}
