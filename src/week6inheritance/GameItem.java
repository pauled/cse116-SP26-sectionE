package week6inheritance;

public abstract class GameItem extends Location{
    protected double xLoc;
    protected double yLoc;

    public GameItem(double x,double y){
        super(x,y);
    }

    public abstract void use(Player player);
}
