package week4memory;

public class Example {
    private int a;
    private double b;
    private boolean c;

    public Example(int a,double b,boolean c){
        this.a=a;
        this.b=b;
        this.c=c;
    }

    public static void main(String[] args) {
        int d=1;
        double e=2.0;
        boolean f=false;

        Example g=new Example(d,e,f);
    }
}
