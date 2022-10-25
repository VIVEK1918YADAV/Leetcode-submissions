class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        
//         String str1 = "";
//         for(int i=0; i<word1.length; i++) {
//             str1 += word1[i];
//         }
        
//         String str2 = "";
//         for(int i=0; i<word2.length; i++){
//             str2 += word2[i];
//         }
        
//         if(str1.equals(str2)) {
//             return true;
//         }
//         return false;
        
        
        String st1 = "";
        String st2= "";
        
        for(int i=0; i<word1.length; i++){
            st1 += word1[i];
        }
        
        for(int i=0; i<word2.length; i++){
            st2 += word2[i];
        }
        return st1.equals(st2);
    }
}