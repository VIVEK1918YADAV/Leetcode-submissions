class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer,Integer> hash=new HashMap<>();
        for(int i=0; i<n; i++)
        {
            if(hash.containsKey(nums[i]))
            {
                if(i-hash.get(nums[i])<=k)
                    return true;
            }
            
            
                hash.put(nums[i],i);
        }
        
        return false;
    }
}