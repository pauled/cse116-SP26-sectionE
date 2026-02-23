package week6inheritance;

import week3classes.Player;

public class GameItem {
    protected double xLoc;
    protected double yLoc;

    public GameItem(double x,double y){
        this.xLoc=x;
        this.yLoc=y;
    }
    public void move(double dx,double dy){
        this.xLoc+=dx;
        this.yLoc+=dy;
    }
    @Override
    public String toString() {
        String out="("+this.xLoc+","+this.yLoc+") ";
        return out;
    }
    public void use(Player player){}
}
