public class NewClass1 {

 public static void main (String[] args) {
   
  System.out.println(checkLowerHealth("pc"));
   
 }
 
 static String swap(String data,int i,int j){
   
   char[] arr = data.toCharArray();
   
   char temp = arr[i];
   arr[i] = arr[j];
   arr[j] = temp;
   
   return new String(arr);
   
 }
 
static int checkLowerHealth(String data){
  
  int health = checkHealth(data);
  
  for(int i=0;i<data.length();i++){
    
    for(int j=i+1;j<data.length();j++){
      
      String swapped = swap(data,i,j);
      
      int newHealth =  checkHealth(swapped);
      
      health = Math.min(health,newHealth); 
    }
    
  }
  return health;
  
} 
 
static int checkHealth(String data){
  
  
   int healthiness = 0;
   
   for(int i=0;i<data.length();i++){
     char ch = data.charAt(i);
     if(ch=='p'){
       for(int j=0;j<i;j++){
        if(data.charAt(j)=='c'){
          healthiness++;
        } 
       }
     }else{
       for(int j=i+1;j<data.length();j++){
         if(data.charAt(j)=='p'){
           healthiness++;
         }
       }
     }
   }
   return healthiness;
}
 
}