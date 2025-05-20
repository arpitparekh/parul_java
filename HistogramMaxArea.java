import java.util.Stack;
public class HistogramMaxArea {

  public static void main (String[] args) {
    
    int[] heights = {1,2,6,3};  
    Stack<Integer> st = new Stack<Integer>();
    int maxArea = 0;
    int n = heights.length;
    
    for(int i=0;i<=n;i++){
      int currentHeight = i==n ? 0 : heights[i];  // 2
      
      
      while(!st.isEmpty() && currentHeight < heights[st.peek()]){
        int height = heights[st.pop()];
        int width = st.isEmpty()? i : (i-st.peek()-1);
        maxArea = Math.max(maxArea,height* width);
      }
      st.push(i);
    }
    System.out.println(maxArea);
    
  }

}