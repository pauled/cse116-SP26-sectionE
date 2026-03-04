package week6inheritance;

import java.util.ArrayList;

//modify Player so it inherits from GameItem
public class Player extends Location{
    private int maxHP;
    private int HP;
    private int damageDealt;
    private ArrayList<Usable> inventory=new ArrayList<>();

    public Player(int maxHP,double x,double y){
        super(x,y);
        this.maxHP=maxHP;
        this.HP=maxHP;
        this.damageDealt=4;
    }
    public Player(int maxHP){
        super(0,0);
        this.maxHP=maxHP;
        this.HP=maxHP;
        this.damageDealt=4;
    }
    public void pickup(Usable item){
        this.inventory.add(item);
    }
    public void useItem(int itemLoc,Player other){
        if (itemLoc<this.inventory.size()){
            this.inventory.get(itemLoc).use(other);
        }
    }
    public String listHealthPotions(){
        String out="";
        for (int x =0;x<this.inventory.size();x++){
            if (this.inventory.get(x) instanceof HealthPotion){
                out+=x+": "+this.inventory.get(x)+"\n";
            }
        }
        return out;
    }
    public void setDamageDealt(int damage){
        this.damageDealt=damage;
    }
    public int getDamageDealt(){
        return this.damageDealt;
    }
    public void takeDamage(int damage){
        this.HP-=damage;
    }
    public void attack(Player other){
        other.takeDamage(this.damageDealt);
    }
    public String toString(){
        String out="location: "+super.toString();
        out+=" hp: ("+this.HP+"/"+this.maxHP+") damage: ";
        out+=this.damageDealt;
        return out;
    }

    public static void main(String[] args) {
        Player p1=new Player(20);
        Player p2=new Player(10);
        p1.setDamageDealt(9);
        int temp=p1.getDamageDealt();
        System.out.println(temp);
        p1.attack(p2);
        Player p3=p1;
        System.out.println(p1);
        System.out.println(p2);
        p1.pickup(new Weapon(1,2,3));
        p1.pickup(new HealthPotion(4,5,6));
        p1.pickup(new HealthPotion(7,8,9));
        p1.pickup(new Weapon(10,11,12));
        p1.pickup(new HealthPotion(13,14,15));
        System.out.println(p1.listHealthPotions());
        p1.useItem(0,p2);
    }
}
