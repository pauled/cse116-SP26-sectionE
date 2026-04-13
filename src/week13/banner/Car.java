package week13.banner;

public class Car {
    private boolean totaled;

    public Car(){
        this.totaled=false;
    }
    public void smash(){
        this.totaled=true;
    }
    public void drive(boolean overweight){
        if (this.totaled){
            System.out.printf("can't drive smashed car");
        } else if(overweight){
            System.out.println("The suspension was broken");
            this.totaled=true;
        } else{
            System.out.println("drive drive drivey drive drive");
        }
    }
}
