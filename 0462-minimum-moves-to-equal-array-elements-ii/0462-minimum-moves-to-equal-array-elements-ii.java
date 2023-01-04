class Solution {
    public int minMoves2(int[] nums) {
//        Arrays.sort(nums);
        
//        int i=0, j=nums.length;
//        int mid = nums[(j)/2] ;
//        int res = 0;
        
//        while(i<j) {
//            res+= Math.abs(nums[i]-mid);
//            i++;
//        } 
//         return res;
        
        
        //Approach 2
        
        int n = nums.length;
        int count = 0;
        Arrays.sort(nums);
        
        int median = nums[n/2];
        
        for(int i=0; i<n; i++){
            
            count += Math.abs(nums[i]-median);
        }
        
        return count;
    }
}