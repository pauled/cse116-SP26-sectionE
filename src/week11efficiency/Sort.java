package week11efficiency;

public class Sort {
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
}
