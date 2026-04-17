package week13.brain;

public class Calm extends MentalState{
    public Calm(Student student){
        super(student);
    }
    public void study(){
        System.out.println("keepin calm");
    }
    public void getCloserToExam(){
        this.brain.setState(new Panic(this.brain));
    }
    public void expressFeelings(){
        System.out.println("I am a leaf on the wind!");
    }
}
