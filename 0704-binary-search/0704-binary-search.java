class Solution {
    public int search(int[] nums, int target) {
      return binarySearch(nums, target, 0, nums.length-1);  
    }
    
    public int binarySearch(int[] nums, int target, int lo, int hi){
        if(lo > hi) return -1;
        
        int mid = lo +(hi-lo)/2;
        
        if(nums[mid] == target){
            return mid;
        }
        
        else if(nums[mid] < target){
            return binarySearch(nums, target, mid+1, hi);
        }
        
        else{
          return binarySearch(nums, target, lo, mid-1); 
        }
    }
}