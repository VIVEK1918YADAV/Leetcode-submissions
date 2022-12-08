class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder str = new StringBuilder();
        
        for(int i=0; i<word.length(); i++) {
            if(word.charAt(i) == ch) {
                str.append(word.substring(0, i+1));
                str.reverse();
                str.append(word.substring(i+1));
                return str.toString();
            }
        }
        return word;
    }
}