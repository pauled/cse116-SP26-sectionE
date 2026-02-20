package week5linkedlists;

public class Queue <T>{
    private LLN<T> head;
    private LLN<T> tail;

    public Queue(){
        this.head=null;
        this.tail=null;
    }
    public void enqueue(T value){
        if (this.head==null){
            this.head=new LLN<>(value,null);
            this.tail=this.head;
        } else {
            this.tail.setNext(new LLN(value,null));
            this.tail=this.tail.getNext();
        }
    }
    public T dequeue(){
        if (this.head==null){
            return null;
        } else {
            T toReturn=this.head.getValue();
            this.head=this.head.getNext();
            if (this.head==null){
                this.tail=null;
            }
            return toReturn;
        }
    }
    public String toString(){
        return this.head.toString();
    }

    public static void main(String[] args) {
        Queue<Integer> queue=new Queue<>();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        Integer temp=queue.dequeue();
        System.out.println(queue);
    }
}
