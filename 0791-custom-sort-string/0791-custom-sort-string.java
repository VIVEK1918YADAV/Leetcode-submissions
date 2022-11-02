class Solution {
    public String customSortString(String order, String s) {
         int[] freq=new int[26];
        StringBuilder str=new StringBuilder();
        for(char c:s.toCharArray()){
            freq[c-'a']++;
        }
        for(char c:order.toCharArray()){

            while(freq[c-'a']>0){
                str.append(c);
                freq[c-'a']--;
                
            }
        }
        for(char c:s.toCharArray()){
            while(freq[c-'a']>0){
                str.append(c);
                freq[c-'a']--;
                
            }
        }
        return str.toString();
    }
}