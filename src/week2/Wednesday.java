package week2;

public class Wednesday {
    public static double multiplyBy2(double valIn){
        double temp=2*valIn;
        return temp;
    }
    public static double FtoC(double F){
        double c=F-32;
        c*=5;
        c/=9;
        return c;
    }
    public static void main(String[] args) {
        System.out.println("I printed!");
        int a=5;
        double b=1.3;
        String c="a string";
        boolean d=false;
        b=6.7;
        a=6/4;
        System.out.println("a is: "+a);
        b=multiplyBy2(33.5);
    }
}
