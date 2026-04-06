package week11efficiency;

import java.util.ArrayList;
import java.util.Random;

public class Sort {
    public static int[] bubbleSortDumb(int[] out){
        for (int x=0;x<out.length;x++){
            for (int y=0;y< out.length-x-1;y++){
                if(out[y]>out[y+1]){
                    int temp=out[y];
                    out[y]=out[y+1];
                    out[y+1]=temp;
                }
            }
        }
        return out;
    }
    public static int[] bubbleSort(int[] out){
        boolean swap=true;
        int less=0;
        while (swap){
            swap=false;
            for (int y=0;y< out.length-1-less;y++){
                if(out[y]>out[y+1]){
                    swap=true;
                    int temp=out[y];
                    out[y]=out[y+1];
                    out[y+1]=temp;
                }
            }
            less++;
        }
        return out;
    }
    public static ArrayList<Integer> combineAL(ArrayList<Integer> half1, ArrayList<Integer> half2){
        int loc1=0;
        int loc2=0;
        ArrayList<Integer> out=new ArrayList<>();
        while (loc1<half1.size() && loc2<half2.size()){
            if (half1.get(loc1)<half2.get(loc2)){
                out.add(half1.get(loc1));
                loc1++;
            } else {
                out.add(half2.get(loc2));
                loc2++;
            }
        }
        while (loc1<half1.size()){
            out.add(half1.get(loc1));
            loc1++;
        }
        while (loc2<half2.size()){
            out.add(half2.get(loc2));
            loc2++;
        }
        return out;
    }
    public static ArrayList<Integer> mergeSortAL(ArrayList<Integer> data){
        if (data.size()==1){
            return data;
        } else {
            ArrayList<Integer> half1=new ArrayList<>();
            ArrayList<Integer> half2=new ArrayList<>();
            for (int x=0;x<data.size()/2;x++){
                half1.add(data.get(x));
            }
            for (int x=data.size()/2;x<data.size();x++){
                half2.add(data.get(x));
            }
            ArrayList<Integer> sorted1=mergeSortAL(half1);
            ArrayList<Integer> sorted2=mergeSortAL(half2);
            ArrayList<Integer> out=combineAL(sorted1,sorted2);
            return out;
        }
    }
    public static int[] combine(int[] half1,int[] half2){
        int loc1=0;
        int loc2=0;
        int locOut=0;
        int[] out=new int[half1.length+half2.length];
        while (loc1<half1.length && loc2<half2.length){
            if (half1[loc1]<half2[loc2]){
                out[locOut]=half1[loc1];
                loc1++;
                locOut++;
            } else {
                out[locOut]=half2[loc2];
                loc2++;
                locOut++;
            }
        }
        while (loc1<half1.length){
            out[locOut]=half1[loc1];
            loc1++;
            locOut++;
        }
        while (loc2<half2.length){
            out[locOut]=half2[loc2];
            loc2++;
            locOut++;
        }
        return out;
    }
    public static int[] mergeSort(int[] data){
        if (data.length==1){
            return data;
        } else {
            int[] half1;
            int[] half2;
            if(data.length%2==0){
                half1=new int[data.length/2];
                half2=new int[data.length/2];
            } else {
                half1=new int[data.length/2];
                half2=new int[data.length/2+1];
            }
            for (int x=0;x<data.length/2;x++){
                half1[x]=data[x];
            }
            for (int x=data.length/2,y=0;x<data.length;x++,y++){
                half2[y]=data[x];
            }
            int[] sorted1=mergeSort(half1);
            int[] sorted2=mergeSort(half2);
            int[] out=combine(sorted1,sorted2);
            return out;
        }
    }
    public static int[] randomStart(int[] data,int num){
        Random randomGenerator=new Random();
        for (int x=0;x<num && x<data.length;x++){
            data[x]=randomGenerator.nextInt();
        }
        return data;
    }
    public static int[] randomEnd(int[] data,int num){
        Random randomGenerator=new Random();
        for (int x=data.length-num;x<data.length;x++){
            data[x]=randomGenerator.nextInt();
        }
        return data;
    }

    public static void main(String[] args) {
        Random randomGenerator=new Random();
        for (int z=10;z<1000000000;z*=2){
            System.out.println("\n----------------");
            int size=z;
            int[] randData1=new int[size];
            int[] randData2=new int[size];
            int[] randData3=new int[size];
            ArrayList<Integer> randData0=new ArrayList<>();
            for (int x=0;x<size;x++){
                randData1[x]=randomGenerator.nextInt();
                randData2[x]=randomGenerator.nextInt();
                randData3[x]=randomGenerator.nextInt();
                randData0.add(randomGenerator.nextInt());
            }

            TimeMe timer=new TimeMe();
            timer.start();
            int[] sorted=mergeSort(randData1);
            timer.lap();
            System.out.println("Merge sort with "+size+" entries");
            timer.printTime();

            timer.start();
            ArrayList<Integer> sorted0=mergeSortAL(randData0);
            timer.lap();
            System.out.println("Merge sort AL with "+size+" entries");
            timer.printTime();
/*
            timer=new TimeMe();
            timer.start();
            int[] sorted2=bubbleSortDumb(randData2);
            timer.lap();
            System.out.println("Bubblee sort dumb with "+size+" entries");
            timer.printTime();

            timer=new TimeMe();
            timer.start();
            int[] sorted3=bubbleSort(randData3);
            timer.lap();
            System.out.println("Bubblee sort with "+size+" entries");
            timer.printTime();

            timer=new TimeMe();
            sorted=randomStart(sorted,10);
            timer.start();
            sorted=mergeSort(sorted);
            timer.lap();
            System.out.println("Merge sort new entires with "+size+" entries");
            timer.printTime();

            timer=new TimeMe();
            sorted2=randomStart(sorted2,10);
            timer.start();
            sorted2=bubbleSortDumb(sorted2);
            timer.lap();
            System.out.println("Bubblee sort dumb new entries with "+size+" entries");
            timer.printTime();

            timer=new TimeMe();
            sorted3=randomStart(sorted3,10);
            timer.start();
            sorted3=bubbleSort(sorted3);
            timer.lap();
            System.out.println("Bubblee sort new entries with "+size+" entries");
            timer.printTime();

            timer=new TimeMe();
            sorted3=randomEnd(sorted3,10);
            timer.start();
            sorted3=bubbleSort(sorted3);
            timer.lap();
            System.out.println("Bubblee sort new entries end with "+size+" entries");
            timer.printTime();
            
 */
        }
    }
}
