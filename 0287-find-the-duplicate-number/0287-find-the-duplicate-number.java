class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        for(int i=0; i<n; i++){
            int idx = nums[i]% n;
            nums[idx] += n;
        }
        
        for(int i=0; i<n; i++){
            if((nums[i]/n) > 1)
                return i;
        }
        return 0;
    }
}