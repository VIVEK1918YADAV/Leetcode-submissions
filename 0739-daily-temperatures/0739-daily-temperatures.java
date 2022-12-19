class Solution {
    public int[] dailyTemperatures(int[] temp) {
      
       int[] arr = new int[temp.length];
       Stack<Integer> stk = new Stack<>();
       stk.push(temp.length-1); 
        
       for(int i=temp.length-2; i>=0; i--){
           
           while(stk.size()>0 && temp[i] >= temp[stk.peek()]){
               stk.pop();
               
           }
           if(stk.size()>0){
               arr[i] = stk.peek()-i;
           }
           else{
               arr[i]=0;
           }
           stk.push(i);
       } 
        return arr;
    }
}