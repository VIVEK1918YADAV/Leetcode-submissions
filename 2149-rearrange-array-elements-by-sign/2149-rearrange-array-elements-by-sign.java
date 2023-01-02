class Solution {
    public int[] rearrangeArray(int[] nums) {
       
        int n = nums.length;
        int k=0;
        int m=1;
        int[] arr = new int[n];
        
        if(k < n-1 && m < n){
            
            for(int i=0; i<n; i++){
                
              if(nums[i] > 0){
                  
                  arr[k] = nums[i];
                  k += 2;
              }
                
                else{
                    arr[m] = nums[i];
                    m += 2;
                }
            }
        }
        
        return arr;
            
    }
}