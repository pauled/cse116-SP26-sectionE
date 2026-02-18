package week5linkedlists;

public class LLN <G>{
    private G value;
    private LLN next;

    public LLN(G val,LLN next){
        this.value=val;
        this.next=next;
    }
    public String toString(){
        String out=this.value+" ";
        if (this.next!=null){
            out+=this.next.toString();
        }
        return out;
    }
    public String toString2(){
        String out="";
        LLN current=this;
        while (current!=null){
            out+=current.value+" ";
            current=current.next;
        }
        return out;
    }
    public int size(){
        //return the size of hte linked list
        if (this.next==null){
            return 1;
        }
        return 1+this.next.size();
    }
    public void append(G value){
        //add the value to the tail of the linked list
        if (this.next==null){
            this.next=new LLN(value,null);
        } else {
            this.next.append(value);
        }

    }
    public void insert(G value, int loc){
        //puts the value into location loc in hte list moving everything
        //else
    }

    public static void main(String[] args) {
        LLN<Integer> head=new LLN(1,null);
        LLN<Integer> tail=head;
        head=new LLN(2,head);
        head=new LLN(3,head);
        String temp=head.toString();
        System.out.println(head);
    }
}
