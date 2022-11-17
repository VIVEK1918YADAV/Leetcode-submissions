class Solution {
    
    public static void reverse(int[] nums, int i, int j){
       int lo = i;
       int hi = j;
       while(lo < hi){
           int temp = nums[lo];
           nums[lo] = nums[hi];
           nums[hi] = temp;
           lo++;
           hi--;
       } 
    }
    
    public void rotate(int[] nums, int k) {
        k = k%nums.length;
        if(k < 0) k+=nums.length;
        
        reverse(nums, 0 , nums.length-k-1);
        reverse(nums, nums.length-k , nums.length-1);
        reverse(nums, 0 , nums.length-1);


    }
}