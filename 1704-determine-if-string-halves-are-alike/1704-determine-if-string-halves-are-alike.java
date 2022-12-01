class Solution {
    public boolean halvesAreAlike(String s) {
      Set<Character> vowels = Set.of ('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
      int midIndex=s.length()/2, vowelCount=0;
      
      for(int i=0; i<midIndex; i++){
         char ch1 =  s.charAt(i);
         char ch2 = s.charAt(midIndex+i);
          
         if(vowels.contains(ch1)) vowelCount++; 
         if(vowels.contains(ch2)) vowelCount--;  
      }  
        
       return vowelCount == 0; 
    }
}