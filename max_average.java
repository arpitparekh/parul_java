public class NewClass2 {

  public static void main (String[] args) {
    
    // sum of all the elements in an array
    
    int arr[]= {34,65,67,54,432,54,67,8};
    
    int sum = 0;
    
    for(int i=0;i<arr.length;i++){
      // arr[i]
      sum = sum + arr[i];
      
    }
    
    System.out.println(sum);
    System.out.println(sum/arr.length);
  }

}