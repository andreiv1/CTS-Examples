package BFactory.SimpleFactory.factories;

import BFactory.FactoryMethod.entities.Ax;
import BFactory.FactoryMethod.entities.Glock;
import BFactory.FactoryMethod.entities.Sword;
import BFactory.FactoryMethod.entities.Weapon;
import BFactory.SimpleFactory.enums.WeaponType;
import BFactory.SimpleFactory.exceptions.WeaponTypeInvalid;

public class SimpleWeaponFactory {
    public Weapon createWeapon(WeaponType type) throws WeaponTypeInvalid {
        switch(type){
            case AX:
                return new Ax();
            case GLOCK:
                return new Glock(15);
            case SWORD:
                return new Sword();
            default:
                throw new WeaponTypeInvalid();
        }
    }
}
