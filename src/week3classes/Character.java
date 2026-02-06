package week3classes;

public class Character {
    private int xp;
    private int battlesWon;

    public Character(){
        this.battlesWon=0;
        this.xp=0;
    }
    public void winBattle(int xp){
        this.battlesWon++;
        this.xp+=xp;
    }


    public String toString() {
        String out="battles won: "+this.battlesWon;
        out+=" xp: "+this.xp;
        return out;
    }
    public boolean equals(Character other){
        return this.battlesWon==other.battlesWon &&
                this.xp==other.xp;
    }

    public static void main(String[] args) {
        Character c1=new Character();
        Character c2=new Character();
        System.out.println(c1.equals(c2));
    }
}
