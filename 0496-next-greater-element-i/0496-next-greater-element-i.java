class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
       
        int[] ngr = nextGreaterRight(nums2);
        
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        //numms->key  ngr->value
        for(int i=0; i<nums2.length; i++){
            hm.put(nums2[i], ngr[i]);
        }
        
        int[] ans = new int[nums1.length];
        
        for(int i=0; i<nums1.length; i++){
            ans[i] = hm.get(nums1[i]);
        }
        return ans;
    }
    
    public static int[] nextGreaterRight(int[] nums2){
        
        Stack<Integer> st = new Stack<>();
        
        int[] ans = new int[nums2.length];
        
        for(int i=nums2.length-1; i>=0; i--){
            
            while(st.size() > 0 && st.peek()<nums2[i]) st.pop();
            ans[i] = st.size()>0 ? st.peek(): -1;
            st.push(nums2[i]);
        }
        return ans;
    }
}