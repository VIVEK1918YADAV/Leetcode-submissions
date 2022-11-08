class Solution {
    public String reverseVowels(String s) {
        if(s.length() == 1) return s;
        
        Stack<Character> stk = new Stack<>();
        StringBuilder sb = new StringBuilder(s); // Make the given String s mutable
        
        for(int i=0; i<s.length(); i++){
            if(isVowel(s.charAt(i))){
                stk.push(s.charAt(i));
            }
        }
        
        for(int i=0; i<s.length(); i++){
          if(isVowel(s.charAt(i))){
            sb.setCharAt(i, stk.pop().charValue());  
          }  
        }
        return sb.toString();
    }
    public boolean isVowel(char ch){
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
            return true;
        }
        return false;
    }
}