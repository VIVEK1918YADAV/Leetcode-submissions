class Solution {
    public String greatestLetter(String s) {
      int[] start = new int[26];
      int[] end = new int[26];
      String str = "";
        
      for(int i=0; i<s.length(); i++){
          if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'){
              end[s.charAt(i) - 'A'] = 1;
          }
          
          else{
              start[s.charAt(i) - 'a'] = 1;
          }
      }
        
        for(int i=25; i>=0; i--){
            
            if(end[i] > 0 && start[i] > 0){
            str += (char)(i+'A');
                break;
         }
            
        }     
        return str;
    }
}