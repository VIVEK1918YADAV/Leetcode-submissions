class Solution {
    public int minDeletionSize(String[] strs) {
       
        int count = 0;
        for(int i=0; i<strs[0].length(); i++){
            char ch = strs[0].charAt(i);
            
            for(String st : strs){
                if(st.charAt(i) < ch){
                    count++;
                    break;
                }
                
                ch = st.charAt(i);
            }
        }
        return count;
    }
}