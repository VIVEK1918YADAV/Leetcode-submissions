class Solution {
    public int minMoves(int[] nums) {
//         int min = nums[0];
//         int res = 0;
        
//         for(int i=0; i<nums.length; i++) {
//             if(nums[i] < min)
//                 min = nums[i];
//         }
        
//         for(int i=0; i<nums.length; i++) {
//             res += nums[i] - min;
//         }
//         return res;
        
        
        //Approach 2
        
        int n = nums.length;
        int count = 0;
        Arrays.sort(nums);
        
        for(int i=0; i<n; i++){
            
            count += Math.abs(nums[0] - nums[i]);
        }
        
        return count;
    }
}