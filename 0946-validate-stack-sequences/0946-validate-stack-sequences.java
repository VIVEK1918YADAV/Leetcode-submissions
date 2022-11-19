class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stk = new Stack<>();
        int i=0;
        for(int num:pushed){
            stk.push(num);
            while(stk.size()>0 && stk.peek()==popped[i]){
                stk.pop();
                i++;
            }
        }
        return i==popped.length;
    }
}