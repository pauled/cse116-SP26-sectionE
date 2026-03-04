package week7polymorphism;

import week6inheritance.HealthPotion;
import week6inheritance.Location;
import week6inheritance.Usable;
import week6inheritance.Weapon;

import java.util.ArrayList;

public class PolyExample {
    public static void main(String[] args) {
        ArrayList<Usable> inventory=new ArrayList<>();
        Usable l=new HealthPotion(1,2,10);
        inventory.add(l);
        l=new Weapon(3,4,5);
        inventory.add(l);
        Location l2=(Location)l;
        //l.move(2,3);
        l2.move(2,3);
    }
}
