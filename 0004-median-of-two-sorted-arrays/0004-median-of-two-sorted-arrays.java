class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;

        int n = n1 + n2;

        int[] res = new int[n];

        for(int i = 0;i < n1;i++){
            res[i] = nums1[i];
        }
        for(int i = 0;i < n2;i++){
            res[n1 + i] = nums2[i];
        }

        Arrays.sort(res);
        

        double median = 0;

        int length = res.length;

        if(length % 2 == 0){
            int sumof = res[length / 2] + res[length / 2 - 1];

            median = ((double) sumof) /2;
        }
        else{
            median = (double) res[length/2];
        }
        return median; 
    }
}