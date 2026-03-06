package week7polymorphism;

import week6inheritance.Player;

import java.util.ArrayList;
import java.util.Arrays;

public class BubbleSort <T>{
    private Comparator<T> comparator;

    public BubbleSort(Comparator<T> comparator){
        this.comparator=comparator;
    }
    public ArrayList<T> sort(ArrayList<T> input){
        ArrayList<T> output=new ArrayList<>();
        for (int x=0;x<input.size();x++){
            output.add(input.get(x));
        }
        //sort now
        for (int x=0;x<output.size();x++){
            for (int y=0;y<output.size()-1;y++){
                if (this.comparator.compare(output.get(y+1),output.get(y))){
                    T temp=output.get(y+1);
                    output.set(y+1,output.get(y));
                    output.set(y,temp);
                }
            }
        }
        return output;
    }

    public static void main(String[] args) {
        BubbleSort sorter=new BubbleSort(new IntDecreasing());
        ArrayList<Integer> list=new ArrayList<>(
                Arrays.asList(8,6,7,5,3,0,9)
        );
        ArrayList<Integer> output=sorter.sort(list);
        System.out.println(output);

        sorter=new BubbleSort(new IntIncreasing());
        output=sorter.sort(list);
        System.out.println(output);

        sorter=new BubbleSort(new PlayerOrder());
        ArrayList<Player> players=new ArrayList<>();
        players.add(new Player(8,1,2));
        players.add(new Player(10,3,4));
        players.add(new Player(5,5,6));
        players.add(new Player(8,7,8));
        ArrayList<Player> out=sorter.sort(players);
        System.out.println(out);
    }
}
