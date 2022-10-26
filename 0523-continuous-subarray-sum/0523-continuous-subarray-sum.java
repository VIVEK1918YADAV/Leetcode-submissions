class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
    HashSet<Integer> hs= new HashSet<>();
    int tempSum=0;
    int prevSum=0;
    
    for(int i : nums)
    {
        tempSum += i;
        if(hs.contains(tempSum%k))
        {
            return true;
        }
        
        tempSum %= k;
        hs.add(prevSum);
        prevSum = tempSum;
    }
    
    return false; 
    }
}