class Solution {
    public int arraySign(int[] nums) {
       int count = 0;
        
       for(int i=0; i<nums.length; i++){
           if(nums[i]==0){
               return 0;
           }
           
           else if(nums[i] < 0){
               count++;
           }
       }
        return signFun(count);
    }
    
    public int signFun(int n){
        if(n%2 == 0){
            return 1;
        }
        
        else if(n%2 != 0){
            return -1;
        }
        return 0;
    }
    
}