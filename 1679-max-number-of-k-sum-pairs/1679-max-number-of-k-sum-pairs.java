class Solution {
    public int maxOperations(int[] nums, int k) {
      
        int count = 0;
        Arrays.sort(nums);
        int lo=0, hi=nums.length-1;
        
        while(lo < hi){
            
            if(nums[lo] + nums[hi] == k){
                lo++;
                hi--;
                count++;
            }
            
            else if(nums[lo]+nums[hi] < k){
                lo++;
            }
            
            else{
                hi--;
            }
        }
        
        return count;
    }
}