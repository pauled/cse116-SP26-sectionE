package week13.brain;

public class Depression extends MentalState{
    public Depression(Student student){
        super(student);
    }
    public void expressFeelings(){
        System.out.println("I don't know what to do other than to call student mental health");
    }
    public void startNewSemester(){
        this.brain.setState(new Panic(this.brain));
    }
    public void study(){
        System.out.println("it's too late to study");
    }
    public void getCloserToExam(){
        System.out.println("the course is over, that's a panic dream");
    }
}
