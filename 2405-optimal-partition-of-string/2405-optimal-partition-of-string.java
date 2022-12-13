class Solution {
    public int partitionString(String s) {
       
        int count = 0;
        HashSet<Character> hs = new HashSet<>();
        
        for(int i=0; i<s.length(); i++){
            
            char ch = s.charAt(i);
            
            if(hs.contains(ch)){
                
                count++;
                hs.clear();
            }
            hs.add(ch);
        }
        return count+1;
    }
}