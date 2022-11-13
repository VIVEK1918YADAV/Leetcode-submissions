class Solution {
    public int mostFrequent(int[] nums, int key) {
       int[] res = new int[1001];
       for(int i=0; i<nums.length-1; i++){
           if(nums[i] == key)
               res[nums[i+1]]++;
       } 
        
        int max = Integer.MIN_VALUE;
        int ans=0;
        for(int i=0;i<res.length;i++){
            if(res[i]>max){
                max=res[i];
                ans=i;
            }
        }
        return ans;
    }
}