class Solution {
    public int longestValidParentheses(String s) {
       Stack<Integer> stk = new Stack<>();
       int maximum = 0;
       stk.push(-1); 
       for(int i=0; i<s.length(); i++){
           char ch = s.charAt(i);
           if(ch == '('){
               stk.push(i);
           }
           else{
               stk.pop();
               if(stk.size() == 0){
                   stk.push(i);
               }
               
               else{
                   int length = i-stk.peek();
                   maximum = Math.max(length, maximum);
               }
           }
           
       } 
        return maximum;
    }
}