public class TreeExample {

 public static void main (String[] args) {
   
   // tree  // also a binary tree
   Node root = new Node(12);
   root.left = new Node(11);
   root.right = new Node(12);
   root.left.left = new Node(5);
   root.left.right = new Node(6);
   
  root.inOrder(root);
  // root.preOrder(root);
  // root.postOrder(root);
   System.out.println("No of Nodes are : "+ root.countNodes(root));
   System.out.println("Height of the tree is : "+ root.height(root));
  // root.printLeafNodes(root);
   
  // root.inOrder(root.mirrorTree(root));
   System.out.println("Max element is : "+root.findMax(root));
   System.out.println("Max element is : "+root.findMin(root));
   
   // tree traversals
   
   // 3 ways for traversing
   // indorder (left,root,right)
   // pre order (root,left,right)
   // post order (left,rigth,root)
 }
}

class Node{
  int data;
  Node left;
  Node right;
  int max=-1;
  int min = Integer.MAX_VALUE;
  
  Node(int data){
    this.data = data;
    this.left = null;
    this.right = null;
  }
  //////////////////////////////////////////////////////
  
  void inOrder(Node root){  // print // traversing
    if(root==null){
      return;
    }
    // left // root // right
    inOrder(root.left);
    System.out.println(root.data);
    inOrder(root.right);
  }
  
  void preOrder(Node root){
    if(root==null){
      return;
    }
    System.out.println(root.data);
    preOrder(root.left);
    preOrder(root.right);
  }
  void postOrder(Node root){
    if(root==null){
      return;
    }
    postOrder(root.left);
    postOrder(root.right);
    System.out.println(root.data);
  }
  
  //////////////////////////////////////////////////
  
  int countNodes(Node root){
    if(root==null){
      return 0;
    }
    return 1 + countNodes(root.left) + countNodes(root.right);
  }
  
  /////// find the height of a tree /////////////////
  
  int height (Node root){
     if(root==null){
      return -1;
    }
    return 1 + Math.max(height(root.left),height(root.right));
  }
  
  //////// find all the left nodes ////////////////////
  
  void printLeafNodes(Node root){
    if(root==null){
      return;
    }
    if(root.left==null && root.right==null){
      System.out.println(root.data);
    }
    printLeafNodes(root.left);
    printLeafNodes(root.right);
  }
  
  //////// mirror the tree ///////////////////////////
  
  Node mirrorTree(Node root){
    if(root==null){
      return null;
    }
    Node left = mirrorTree(root.left);
    Node right = mirrorTree(root.right);
    
    root.left = right;
    root.right = left;
    
    return root;
  }
  
  ////////// find  max or min in a tree //////////////
  
  int findMax(Node root){
    if(root==null){
      return -1;
    }
    if(max<root.data){
      max = root.data;
    }
    findMax(root.left);
    findMax(root.right);
    return max;
  }
  
  //////  find the mininum element from tree ///////////////////
  
   int findMin(Node root){
    if(root==null){
      return -1;
    }
    if(min>root.data){
      min = root.data;
    }
    findMin(root.left);
    findMin(root.right);
    return min;
  }
}






