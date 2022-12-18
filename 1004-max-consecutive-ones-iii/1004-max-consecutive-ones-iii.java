class Solution {
    public int longestOnes(int[] nums, int k) {
      
        int i=0, j=0;
        int n = nums.length;
        int zerosCount = 0;
        int ans = Integer.MIN_VALUE;
        
        while(j < n){
            
            if(nums[j] == 0){
                zerosCount++;
            }
            
            while(zerosCount > k){
                if(nums[i] == 0){
                    zerosCount--;
                }
                i++;
            }
            
            ans = Math.max(ans, j-i+1);
            j++;
        }
        return ans;
    }
}