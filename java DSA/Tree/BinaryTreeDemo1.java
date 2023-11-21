import java.util.Scanner;

public class BinaryTreeDemo1 {
    public static void main(String[] args) {
        
    }
}

class BinaryTree{
    class Node{
        int value;
        Node left;
        Node right;

        public Node(){

        }
        public Node(int value){
            this.value = value;
        }
    }

    Node root;

    public void populate(Scanner sc){
        System.out.println("Enter value: ");
        int value = sc.nextInt();
        root = new Node(value);
        populate(sc, root);
    }
    public void populate(Scanner sc, Node node){
        System.out.println("Do you want to enter left of"+ node.value+ " : ");
        boolean left = sc.nextBoolean();
        if(left){
            System.out.println("Enter value: ");
            int value = sc.nextInt();
            node.left = new Node(value);
            populate(sc, node.left);
        }

         System.out.println("Do you want to enter right of"+ node.value+ " : ");
        boolean right = sc.nextBoolean();
        if(right){
            System.out.println("Enter value: ");
            int value = sc.nextInt();
            node.right = new Node(value);
            populate(sc, node.right);
        }
    }

    public void display(){
        display(root , "");
    }

    public void display(Node node, String indent){
        if(node==null){
            return;
        }

        System.out.println(indent+node.value);
        display(node.left, indent+"\t");
        display(node.right, indent+"\t");
    }

    
}
