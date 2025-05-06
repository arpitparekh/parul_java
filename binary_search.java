import java.util.Arrays;

public class NewClass1 {

  public static void main (String[] args) {
    
    // sorted array
    
    int[] arr = {1,3,6,8,65,43,67,9,6,43,2,5,5,3,2};
    
    for(int i=0;i<arr.length;i++){
      for(int j=i+1;j<arr.length;j++){
        if(arr[i]>arr[j]){
          int temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
        }
      }
    }
    
    System.out.println(Arrays.toString(arr));
    
    int e = 999;
    
    int start = 0;
    int end = arr.length-1;
    int flag = 0;
    
    
    while(start<=end){
      
      int mid = (start+end)/2;
      
      if(arr[mid]==e){
        flag = 1;
        break;
      }
      if(arr[mid]<e){
        start = mid+1;
      }
      if(arr[mid]>e){
        end = mid-1;
      }
    }
    
    if(flag==1){
      System.out.println(e+" Found");
    }else{
      System.out.println(e+" Not found");
    }
    
    
  }

}