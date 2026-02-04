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

    @Override
    public String toString() {
        String out="battles won: "+this.battlesWon;
        out+=" xp: "+this.xp;
        return out;
    }
}
