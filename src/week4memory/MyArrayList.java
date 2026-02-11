package week4memory;

public class MyArrayList {
    private int[] vals;
    private int current;

    public MyArrayList(){
        this.vals=new int[3];
        this.current=0;
    }

    public void append(int val){
        if (this.current>=this.vals.length){
            int[] temp=new int[this.vals.length*2];
            for (int x=0;x<this.vals.length; x++){
                temp[x]=this.vals[x];
            }
            this.vals=temp;
        }
        this.vals[current]=val;
        this.current++;
    }
    public int getValue(int loc){
        return this.vals[loc];
    }
    public void setVal(int loc,int val){
        this.vals[loc]=val;
    }
    public static void main(String[] args) {
        int[] vals=new int[3];

        //O(1)
        vals[0]=3;
        vals[1]=6;
        vals[2]=9;

        //O(n)
        for (int x=0;x<vals.length;x++){
            vals[x]*=2;
        }

        //O(n^2)
        for (int x=0;x<vals.length;x++){
            for (int y=0;y<vals.length;y++) {
                vals[x] *= y;
            }
        }

        //O(n^2)
        for (int x=0;x<vals.length;x++){
            for (int y=0;y<=x;y++) {
                vals[x] *= y;
            }
        }
    }
}
