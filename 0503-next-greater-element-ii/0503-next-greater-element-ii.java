class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[] res = new int[nums.length];
        int n = nums.length;
        Stack<Integer> stk = new Stack<>();
        Arrays.fill(res, -1);
        
        for(int i=0; i<n*2; i++){
            while(!stk.isEmpty() && nums[stk.peek()] < nums[i%n])
             res[stk.pop()]  = nums[i%n];
            
            if(i<n)
                stk.push(i);
        }
        return res;
    }
}