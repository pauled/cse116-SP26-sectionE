package week13.brain;

public class Chillin extends MentalState{
    public Chillin(Student student){
        super(student);
    }
    public void study(){
        System.out.println("I am so good I study even without class");
    }
    public void getCloserToExam(){
        System.out.println("wait I'm done");
    }
    public void expressFeelings(){
        System.out.println("It's good to be done");
    }
    public void startNewSemester(){
        this.brain.setState(new Calm(this.brain));
    }
    public void passClass(){
        System.out.println("dude, I know I passed");
    }
    public void failClass(){
        System.out.println("you can't fail a class you passed");
    }
}
