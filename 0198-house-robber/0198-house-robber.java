class Solution {
    public int rob(int[] nums) {
       int prev = 0;
       int last = 0;
        int temp = 0;
        
        for(int num : nums){
           temp=last;
           last=Math.max(prev+num,last);
           prev=temp;  
        }
        
        return last;
    }
}