package week6inheritance;

public abstract class GameItem extends Location{
    public GameItem(double x,double y){
        super(x,y);
    }

    public abstract void use(Player player);
}
