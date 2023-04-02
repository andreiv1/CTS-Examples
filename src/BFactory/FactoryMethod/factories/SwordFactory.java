package BFactory.FactoryMethod.factories;

import BFactory.FactoryMethod.entities.Sword;
import BFactory.FactoryMethod.entities.Weapon;

public class SwordFactory implements WeaponFactory{
    @Override
    public Weapon createWeapon() {
        return new Sword();
    }
}
