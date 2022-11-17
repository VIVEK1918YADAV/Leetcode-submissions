class Solution {
    
    public static void swap(int[] nums, int lo, int hi){
        int temp = nums[lo];
        nums[lo] = nums[hi];
        nums[hi] = temp;
    }
    
    public int[] sortArrayByParity(int[] nums) {
        int lo = 0;
        int hi = nums.length-1;
        while(lo < hi){
            if(nums[lo]%2 == 0) lo++;
            else if(nums[hi]%2 == 1) hi--;
            else 
                swap(nums, lo++, hi--);
        }
        return nums;
    }
}