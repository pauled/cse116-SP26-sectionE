package week3classes;

import java.util.ArrayList;

public class Party {
    private int battlesWon;
    private ArrayList<Character> members;

    public Party(){
        this.battlesWon=0;
        this.members=new ArrayList<>();
    }
    public void addMember(Character member){
        this.members.add(member);
    }
    public void winBattle(int xp){
        this.battlesWon++;
        for (int x=0;x<this.members.size(); x++){
            this.members.get(x).winBattle(xp);
        }
    }
    public String toString(){
        String out="battles won: "+this.battlesWon+"\n";
        out+="members: \n";
        for (Character member : this.members){
            out+="-"+member.toString()+"\n";
        }
        return out;
    }

    public static void main(String[] args) {
        Party p=new Party();
        Character c1=new Character();
        Character c2=new Character();
        c2.winBattle(15);
        p.addMember(c1);
        p.addMember(c2);
        p.winBattle(30);
        System.out.println(p);
    }
}
