class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // for(int i=m, j=0; i<m+n; i++,j++) {
        //     nums1[i] = nums2[j];
        // }
        // Arrays.sort(nums1);
        
        
        
        int cnt = 0;
        while (m < nums1.length) {
            nums1[m++] = nums2[cnt++];
        }
        Arrays.sort(nums1);
    }
}