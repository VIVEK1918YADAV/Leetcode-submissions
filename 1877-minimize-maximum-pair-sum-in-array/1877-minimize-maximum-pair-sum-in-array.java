class Solution {
    public int minPairSum(int[] nums) {
      
        int n = nums.length;
        int[] arr = new int[n/2];
        int i=0, j=n-1;
        Arrays.sort(nums);
        int k = 0; 
        
        while(i < j){
            arr[k++] = nums[i] + nums[j];
            i++;
            j--;
        }
        Arrays.sort(arr);
        return arr[arr.length-1];
    }
}