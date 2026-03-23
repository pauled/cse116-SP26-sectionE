package week10trees;

public class BTN<A> {
    public A value;
    public BTN<A> left;
    public BTN<A> right;

    public BTN(A value,BTN<A> left,BTN<A> right){
        this.value=value;
        this.left=left;
        this.right=right;
    }

    public static void main(String[] args) {
        BTN<Integer> root=new BTN<>(5,null,null);
        root.left=new BTN<>(2,null,null);
        root.right=new BTN<>(8,null,null);
        root.left.left=new BTN<>(-3,null,null);
        root.left.right=new BTN<>(4,null,null);
        root.right.left=new BTN<>(7,null,null);
        root.right.right=new BTN<>(14,null,null);
        String temp=root.preOrderTraversal(root);
        System.out.println("PreOrder: "+temp);
        temp=root.postOrderTraversal(root);
        System.out.println("PostOrder: "+temp);
        temp=root.inOrderTraversal(root);
        System.out.println("InOrder: "+temp);
    }
    public String preOrderTraversal(BTN node){
        String out="";
        out+=node.value.toString()+" ";
        if (node.left!=null){
            out+=preOrderTraversal(node.left);
        }
        if (node.right!=null){
            out+=preOrderTraversal(node.right);
        }
        return out;
    }
    public String postOrderTraversal(BTN node){
        String out="";
        if (node.left!=null){
            out+=postOrderTraversal(node.left);
        }
        if (node.right!=null){
            out+=postOrderTraversal(node.right);
        }
        out+=node.value.toString()+" ";
        return out;
    }
    public String inOrderTraversal(BTN node){
        String out="";
        if (node.left!=null){
            out+=inOrderTraversal(node.left);
        }
        out+=node.value.toString()+" ";
        if (node.right!=null){
            out+=inOrderTraversal(node.right);
        }
        return out;
    }
}
