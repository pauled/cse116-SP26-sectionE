package week6inheritance;

public class Weapon extends GameItem{
    private int damage;

    public Weapon(double x,double y,int damage){
        super(x,y);
        this.damage=damage;
    }
    public void move(double x,double y){
        super.move(2*x,2*y);
    }

    @Override
    public String toString() {
        String out=super.toString();
        out+="damage: "+this.damage;
        return out;
    }
}
