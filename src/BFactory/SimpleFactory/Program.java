package BFactory.SimpleFactory;

import BFactory.FactoryMethod.entities.Weapon;
import BFactory.SimpleFactory.enums.WeaponType;
import BFactory.SimpleFactory.factories.SimpleWeaponFactory;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) throws Exception {
        SimpleWeaponFactory weaponFactory = new SimpleWeaponFactory();
        List<Weapon> weapons = new ArrayList<>();
        weapons.add(weaponFactory.createWeapon(WeaponType.AX));
        weapons.add(weaponFactory.createWeapon(WeaponType.GLOCK));
        weapons.add(weaponFactory.createWeapon(WeaponType.SWORD));

        for(var w : weapons){
            w.attackEnemy();
        }
    }
}
