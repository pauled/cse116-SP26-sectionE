package week6inheritance;

//modify Player so it inherits from GameItem
public class Player extends Location{
    private int maxHP;
    private int HP;
    private int damageDealt;

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
    }
}
