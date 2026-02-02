package week3classes;

public class Player {
    private int maxHP;
    private int HP;
    private int damageDealt;

    public Player(int maxHP){
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
