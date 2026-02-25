package week6inheritance;

public class Location {
    protected double xLoc;
    protected double yLoc;

    public Location(double x,double y){
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
}
