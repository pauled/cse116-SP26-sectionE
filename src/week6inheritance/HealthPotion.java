package week6inheritance;


public class HealthPotion extends GameItem{
    private int increase;

    public HealthPotion(double x,double y,int increase){
        super(x,y);
        this.increase=increase;
        //this.xLoc+=4;
    }
    public void use(Player player){
        //this.xLoc+=6;
        player.takeDamage(-this.increase);
    }
    @Override
    public String toString() {
        String out=super.toString();
        out+="increase: "+this.increase;
        return out;
    }

    public static void main(String[] args) {
        HealthPotion hp1=new HealthPotion(0,1,10);
        Weapon w1=new Weapon(3,4,5);
        System.out.println(hp1);
        System.out.println(w1);
        hp1.move(30,30);
        w1.move(40,40);
        System.out.println(hp1);
        System.out.println(w1);
    }
}
