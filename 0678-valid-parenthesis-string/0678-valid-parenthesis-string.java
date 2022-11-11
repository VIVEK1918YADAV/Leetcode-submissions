class Solution {
    public boolean checkValidString(String s) {
       int low=0, high=0;
       for(char ch : s.toCharArray()){
          low += ch == '(' ? 1 : -1;
          high += ch != ')' ? 1 : -1;
          
          if(high < 0)
              break;
           
           low = Math.max(low, 0);
       } 
        return low==0;
    }
}