class Solution {
    public boolean canJump(int[] nums) {
        
        int m = nums.length-1;
        for(int i=m; i>=0; i--){
            
            if(i + nums[i] >= m){
                m=i;
            }
        }
        return m==0;
    }
}