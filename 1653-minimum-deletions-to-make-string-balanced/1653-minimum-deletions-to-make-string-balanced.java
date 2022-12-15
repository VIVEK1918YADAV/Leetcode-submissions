class Solution {
    public int minimumDeletions(String s) {
       int count = 0;
       int curr = 0;
       
       char[] arr = s.toCharArray();
        
       for(char ch : arr){
           
           if(ch == 'b'){
               count++;
           }
           else{
               curr++;
           }
           
          curr = Math.min(count, curr);
       } 
        
        return curr;
    }
}