package week7polymorphism;

import week6inheritance.Player;

public class PlayerOrder extends Comparator<Player>{
    public boolean compare(Player a,Player b){
        if (a.getHP()>b.getHP()){
            return false;
        } else if (a.getHP()<b.getHP()){
            return true;
        } else {
            //same HP
            if (a.getxLoc()<b.getxLoc()){
                return true;
            } else {
                return false;
            }
        }
    }
}