package week5linkedlists;

public class Stack <R>{
    private LLN<R> head;

    public Stack(){
        this.head=null;
    }
    public void push(R value){
        this.head=new LLN<>(value,this.head);
    }
    public R pop(){
        if (this.head==null){
            return null;
        }
        R toReturn=this.head.getValue();
        this.head=this.head.getNext();
        return toReturn;
    }
    public String toString(){
        return this.head.toString();
    }

    public static void main(String[] args) {
        Stack<Integer> stack=new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        Integer temp=stack.pop();
        System.out.println(stack);
    }
}
