package week4memory;

public class Recursion {
    public static int add(int a,int b){
        if (b==0){
            return a;
        } else if(b>0){
            return add(a+1,b-1);
        } else {
            return add(a-1,b+1);
        }
    }
    public static int fib(int digit){
        if (digit==0){
            return 0;
        }
        if (digit==1){
            return 1;
        }
        return fib(digit-1)+fib(digit-2);
    }
    public static int sum(int[] vals){
        return sumHelper(vals,0,0);
    }
    public static int sumHelper(int[] vals,int loc, int total){
        if (loc>=vals.length){
            return total;
        }
        return sumHelper(vals,loc+1,total+vals[loc]);
    }

    public static void main(String[] args) {
        int temp=add(4,3);
        System.out.println(temp);
        int[] vals=new int[5];
        for (int x=0;x<vals.length;x++){
            vals[x]=x*3;
        }
        temp=sum(vals);
        System.out.println(temp);

        int out=0;
        for (int x=0;x<vals.length;x++){
            for (int y=0;y<10000;y++){
                out+=vals[x];
            }
        }
    }
}
