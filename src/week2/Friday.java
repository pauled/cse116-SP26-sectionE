package week2;

import java.util.ArrayList;
import java.util.HashMap;

public class Friday {
    public static String letter(double score){
        String out="";
        if (score>=90){
            out="A";
        } else if(score>=80 && score<90){//&& is and, || is or,! not
            out="B";
        } else if (score>=70){
            out="C";
        } else if(score>=60){
            out="D";
        } else {
            out="F";
        }
        return out;
    }

    public static void main(String[] args) {
        int x=0;
        while (x<5){
            System.out.println(x);
            x++;//same as x+=1
        }
        for (int y=0;y<5;y++){
            System.out.println(y);
        }
        x=0;
        for (;x<5;){
            System.out.println(x);
            x++;
        }
        ArrayList<Integer> arr1=new ArrayList<>();
        for (int y=0;y<4;y++){
            arr1.add(y*2);
        }
        ArrayList<Integer> arr2=arr1;
        System.out.println(arr1);
        for (int y=0;y<arr1.size();y++){
            System.out.println(arr1.get(y));
        }
        HashMap<String,Integer> bills=new HashMap<>();
        bills.put("Allen",17);
        bills.put("Cook",4);
        for (String name : bills.keySet()){
            System.out.println(name+": "+bills.get(name));
        }
        for (Integer num : bills.values()){
            System.out.println(num);
        }
    }
}
