class Solution {
    public int countElements(int[] nums) {
        Arrays.sort(nums);
        int ans = 0;
        int n = nums.length;
        
        for(int i=1; i<n-1; i++) {
            if(nums[i] > nums[0] && nums[i] < nums[n-1]) {
                ans ++;
            }
        }
        return ans;
    }
}