package week13.banner;

public class ProfHulk implements State{
    private BruceBanner banner;

    public ProfHulk(BruceBanner banner){
        this.banner=banner;
    }
    public void makeAngry(){
        System.out.println("yes, I'm angry");
    }
    public void calmDown(){
        System.out.println("I'm calm");
    }
    public void useCar(Car car){
        car.drive(true);
    }
    public void fight(){
        System.out.println("Smash with precision");
    }
}
