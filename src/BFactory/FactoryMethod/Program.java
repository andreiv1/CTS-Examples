package BFactory.FactoryMethod;

import BFactory.FactoryMethod.entities.Glock;
import BFactory.FactoryMethod.entities.Weapon;
import BFactory.FactoryMethod.factories.AxFactory;
import BFactory.FactoryMethod.factories.GlockFactory;
import BFactory.FactoryMethod.factories.SwordFactory;
import BFactory.FactoryMethod.factories.WeaponFactory;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) throws Exception {
        List<Weapon> weapons = new ArrayList<>();
        WeaponFactory weaponFactory = new AxFactory();
        Weapon sword = weaponFactory.createWeapon();
        weapons.add(sword);

        weaponFactory = new GlockFactory();
        Glock glock = (Glock) weaponFactory.createWeapon();
        weapons.add(glock);

        glock.addBullets(5);
        System.out.println("Glock bullets = " + glock.getBullets());

        weaponFactory = new AxFactory();
        Weapon ax = weaponFactory.createWeapon();
        weapons.add(ax);

        for(Weapon weapon : weapons){
            weapon.attackEnemy();
            System.out.println("");
        }

        while(glock.getBullets() > 0){
            glock.attackEnemy();
        }

        glock.attackEnemy();
    }
}
