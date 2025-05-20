public class LinkedListExample {

  public static void main (String[] args) {
      
     MyLinkedList ls = new MyLinkedList();
     
    ls.add(12);
    ls.add(13);
    ls.add(14);
    ls.add(18);
     
     ls.print();
     
    // ls.removeFirstElement();
    // ls.print();
    // System.out.println(ls.findLength());
    // ls.removeIndexedElement(2);
    System.out.println("-------------");
    ls.reverseOfLinkedList();
    ls.print();
  }
}
class MyLinkedList{
  
  Node head;
  
  ////////////////////////////////////////////////////////////
  void add(int xyz){    // adding an element in a linkedlist
    
    if(head==null){
      head = new Node(xyz);
      return;
    }
    Node temp = head;  // head copy
    while(temp.next!=null){
      temp = temp.next;
    }
    temp.next = new Node(xyz);
  }
  ////////////////////////////////////////////////////////////
  void print(){
    if(head==null){
      System.out.println("No element found");
      return;
    }
    Node temp = head;  // head copy
    System.out.println(head.data);
    while(temp.next!=null){
      temp = temp.next;
      System.out.println(temp.data);
    }
  }
  ////////////////////////////////////////////////////////////
  void removeLastElement(){
    if(head==null){
      System.out.println("No element to remove");
      return;
    }
    if(head.next==null){ // one element
      head = null;
      return;
    }
    
    Node temp = head;  // head copy
    
    while(temp.next.next!=null){
      temp = temp.next;
    }
    temp.next = null;
  }
  ///////////////////////////////////////////////////////////
  void removeFirstElement(){
    if(head==null){
      System.out.println("No element to remove");
      return;
    }
    if(head.next==null){ // one element
      head = null;
      return;
    }
    head = head.next;
  }
  ///////////////////////////////////////////////////////////
  int findLength(){
    int counter = 1;
    Node temp = head;  // head copy
    while(temp.next!=null){
      temp = temp.next;
      counter++;
    }
    return counter;
  }
  ///////////////////////////////////////////////////////////
  void removeIndexedElement(int index){
     if(head==null || index>=findLength()){
      System.out.println("No element to remove");
      return;
    }
    Node temp = head;  // head copy
    // index = 2
    for(int i=1;i<index;i++){
      temp = temp.next;
    }
    temp.next = temp.next.next;
  }
  ////////////////////////////////////////////////////////
  void reverseOfLinkedList(){
    if(head==null || head.next==null){
      System.out.println("No element to revese");
      return;
    }
    Node prev = null;
    Node current = head;
    Node follow;
    while(current!=null){
      follow = current.next;
      current.next = prev;
      prev = current;
      current = follow;
    }
    head = prev;
    
  }
}

class Node{
  int data;
  Node next;    // next node object 
  
  Node(int data){
    this.data = data;
    next = null;
  }
}