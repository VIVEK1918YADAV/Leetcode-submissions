class Solution {
    public int numIdenticalPairs(int[] nums) {
//         int count =0;
//         if(nums.length == 1) {
//             return 0;
//         }
        
//         for(int i=0; i<nums.length-1; i++) {
//             for(int j=i+1; j<nums.length; j++) {
//                 if(nums[i]==nums[j]) {
//                     count++;
//                 }
//             }
//         }
//         return count;
        
        
        //2nd method using Hashmap
        
        HashMap<Integer,Integer> hm = new HashMap<>();
        int ans = 0;
        int n = nums.length;
        
        for(int i=0; i<n; i++){
            
            if(hm.containsKey(nums[i])){
                
                hm.put(nums[i], hm.get(nums[i])+1);
                ans = ans+hm.get(nums[i]);
            }
            
            else{
                hm.put(nums[i], 0);
            }
        }
       return ans; 
    }
}