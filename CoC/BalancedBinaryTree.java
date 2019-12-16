package interview;
/**
class Node {
    Node left;
    Node right;
    int value;
}
**/
public class BalancedBinaryTree extends Node{

   public int sum(Node node){
   if(node == null){
       return  0;
   }else{
       return sum(node.left)+node.value+sum(node.right);
   }
   }
}

    public static void main(String[] args) {

}
