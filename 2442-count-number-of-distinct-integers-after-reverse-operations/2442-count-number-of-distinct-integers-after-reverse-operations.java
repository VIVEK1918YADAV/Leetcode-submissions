class Solution {
    public int countDistinctIntegers(int[] nums) {
        Set<Integer> hs = new HashSet<>();
        
        for(int i=0; i<nums.length; i++){
            
          hs.add(nums[i]);
          hs.add(reverse(nums[i]));  
        }
        return hs.size();
    }
    
    
    public int reverse(int n){
        int res = 0;
        while(n > 0){
            
            int last = n%10;
            res = res*10 + last;
            n=n/10;
        }
        return res;
    }
}