class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
       
        int i=0, j=0;
        int n = nums1.length;
        int m = nums2.length;
        
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        
        ArrayList<Integer> al = new ArrayList<>();
        
        while(i<n && j<m){
            
            if(nums1[i] < nums2[j]){
                i++;
            }
            
            else if(nums1[i] > nums2[j]){
                j++;
            }
            
            else{
                al.add(nums1[i]);
                i++;
                j++;
            }
        }
        
        int[] nums = new int[al.size()];
        int l=0;
        for(int k=0; k<al.size(); k++){
            
            nums[l++] = al.get(k);
        }
        return nums;
    }
}