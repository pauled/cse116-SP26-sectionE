package week13.brain;

public abstract class MentalState {
    protected Student brain;

    public MentalState(Student brain){
        this.brain=brain;
    }
    public abstract void study();
    public abstract void getCloserToExam();
    public abstract void expressFeelings();
    public void startNewSemester(){
        System.out.println("you can't start a new semester beffore finishing the last one");
    }
    public void passClass(){
        this.brain.setState(new Chillin(this.brain));
    }
    public void failClass(){
        this.brain.setState(new Depression(this.brain));
    }
}
