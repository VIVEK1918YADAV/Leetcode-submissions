class Solution {
    public int[] singleNumber(int[] nums) {
        int n = nums.length;
        if(n==2) return nums;
                
        int ans[] = new int[2];
        int k = 0;
        
        Arrays.sort(nums);
        
        for(int i=0; i<n-1; i++){
            if(nums[i] == nums[i+1]){
                i+=1;
            }
            else{
              ans[k] = nums[i];
              k++;  
            }
        }
        if(k==1){
            ans[k] = nums[n-1];
        }
        return ans;
    }
}