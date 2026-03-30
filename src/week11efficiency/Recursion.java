package week11efficiency;

public class Recursion {
    public static int addRec(int[] vals,int loc){
        if (loc<=0){
            return vals[0];
        } else if (loc>=vals.length){
            return addRec(vals,vals.length-1);
        } else {
            int temp=addRec(vals,loc-1);
            return vals[loc]+temp;
        }
    }
    public static int addTail(int[] vals,int loc){
        return addTailHelper(vals,loc,0);
    }
    public static int addTailHelper(int[] vals,int loc,int total){
        if (loc<=0){
            return vals[0]+total;
        } else  if(loc >=vals.length){
            return addTailHelper(vals,vals.length-1,0);
        } else {
            return addTailHelper(vals,loc-1,total+vals[loc]);
        }
    }
    public static void main(String[] args) {
        int[] nums=new int[3];
        nums[0]=3;
        nums[1]=6;
        nums[2]=9;
        int total1=addRec(nums,2);
        System.out.println(total1);
        int total2=addTail(nums,2);
        System.out.println(total2);
    }
}
