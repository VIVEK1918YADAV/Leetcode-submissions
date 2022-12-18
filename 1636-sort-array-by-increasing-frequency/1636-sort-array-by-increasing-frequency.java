class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer,Integer> hs = new HashMap<>();
        
        //convert int[] array to Integer[] array for using sort function.
        Integer[] arr = new Integer[nums.length];
        
        for(int i=0; i<nums.length; i++){
            
            arr[i] = nums[i];
        }
        
        //count frequency of every element
        for(int i=0; i<nums.length; i++){
            
           hs.put(nums[i], hs.getOrDefault(nums[i], 0)+1) ;
        }
        
        //sort based on frequency
        Arrays.sort(arr, (a,b) -> hs.get(a) == hs.get(b) ? b-a : hs.get(a) - hs.get(b));
        
        //convert back Integer[] to int[]
        for(int i=0; i<nums.length; i++){
            
            nums[i] = arr[i];
        }
        
        return nums;
    }
}