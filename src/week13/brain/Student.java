package week13.brain;

public class Student {
    private MentalState state;

    public Student(){
        this.state=new Calm(this);
    }
    public void setState(MentalState state){
        this.state=state;
    }
    public void study(){
        this.state.study();
    }
    public void getCloserToExam(){
        this.state.getCloserToExam();
    }
    public void expressFeelings(){
        this.state.expressFeelings();
    }
    public void passClass(){
        this.state.passClass();
    }
    public void startNewSemester(){
        this.state.startNewSemester();
    }
    public void failClass(){
        this.state.failClass();
    }
    public void getBurnedOut(){
        this.state.getBurnedOut();
    }
}
