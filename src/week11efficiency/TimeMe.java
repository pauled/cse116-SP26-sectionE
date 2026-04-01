package week11efficiency;

public class TimeMe {
    private long start;
    private long end;

    public TimeMe(){
        this.start=0;
        this.end=0;
    }
    public void start(){
        this.start=System.currentTimeMillis();
    }
    public void lap(){
        this.end=System.currentTimeMillis();
    }
    public void printTime(){
        int dif=(int)(this.end-this.start);
        dif/=1000;
        int milli=(int)(end-start);
        milli%=1000;

        System.out.printf("%02d:%02d:%02d.%03d\n",dif/3600,(dif/60)%60,dif%60,milli);
    }
}
