package BFactory.FactoryMethod.factories;

import BFactory.FactoryMethod.entities.Glock;
import BFactory.FactoryMethod.entities.Weapon;

public class GlockFactory implements WeaponFactory{
    @Override
    public Weapon createWeapon() {
        return new Glock(30);
    }
}
