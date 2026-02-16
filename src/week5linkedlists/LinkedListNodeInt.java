package week5linkedlists;

public class LinkedListNodeInt {
    private int value;
    private LinkedListNodeInt next;

    public LinkedListNodeInt(int val,LinkedListNodeInt next){
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
        LinkedListNodeInt current=this;
        while (current!=null){
            out+=current.value+" ";
            current=current.next;
        }
        return out;
    }

    public static void main(String[] args) {
        LinkedListNodeInt head=new LinkedListNodeInt(1,null);
        LinkedListNodeInt tail=head;
        head=new LinkedListNodeInt(2,head);
        head=new LinkedListNodeInt(3,head);
        String temp=head.toString();
        System.out.println(head);
    }
}
