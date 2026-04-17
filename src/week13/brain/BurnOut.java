package week13.brain;

public class BurnOut extends MentalState{
    public BurnOut(Student student){
        super(student);
    }
    public void expressFeelings(){
        System.out.println("I need a break");
    }
    public void startNewSemester(){
        this.brain.setState(new Calm(this.brain));
    }
    public void study(){
        System.out.println("I'm away, no studying");
    }
    public void getCloserToExam(){
        System.out.println("I'm away, no exams");
    }
    public void passClass(){
        System.out.println("no classes now");
    }
    public void failClass(){
        System.out.println("no classes now");
    }
}
