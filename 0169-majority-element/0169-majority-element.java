class Solution {
    public int majorityElement(int[] nums) {
//         int n = nums.length;
//         int majority = nums[0];
//         int count = 1;
        
//         for(int i=1; i<n; i++) {
//             if(nums[i] == majority) 
//                 count ++;
//             else {
//                 count --;
//             }
            
//             if(count < 0) {
//                 count = 1;
//                 majority = nums[i];
//             }
//         }
//         return majority;
        
        int n = nums.length;
        int majorityCount = n/2;

        for (int num : nums) {
            int count = 0;
            for (int elem : nums) {
                if (elem == num) {
                    count += 1;
                }
            }

            if (count > majorityCount) {
                return num;
            }

        }

        return -1;    
    }
    
}