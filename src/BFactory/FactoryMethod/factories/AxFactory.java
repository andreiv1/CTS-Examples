package BFactory.FactoryMethod.factories;

import BFactory.FactoryMethod.entities.Ax;
import BFactory.FactoryMethod.entities.Weapon;

public class AxFactory implements WeaponFactory{
    @Override
    public Weapon createWeapon() {
        return new Ax();
    }
}
