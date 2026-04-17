package week13.brain;

public class Panic extends MentalState{
    public Panic(Student student){
        super(student);
    }
    public void study(){
        this.brain.setState(new Calm(this.brain));
    }
    public void getCloserToExam(){
        System.out.println("I'm freakin out man");
    }
    public void expressFeelings(){
        System.out.println("I am firmly at the disco");
    }
    public void getBurnedOut(){
        System.out.println("I will withdraw from classes");
        super.getBurnedOut();
    }
}
