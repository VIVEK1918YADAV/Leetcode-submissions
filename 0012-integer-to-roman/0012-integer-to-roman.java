class Solution {
    public String intToRoman(int num) {
       int[] intGer = {1000 , 900 , 500 , 400 , 100 , 90 , 50 , 40 , 10 , 9 , 5 , 4 , 1};
        String[] code = {"M" , "CM" , "D" ,"CD" , "C" , "XC" , "L" , "XL" , "X" , "IX" , "V" , "IV"  , "I"};
        
        StringBuilder ans = new StringBuilder();
        for(int i=0 ;i<intGer.length ;i++){
            while(num>=intGer[i]){
                ans.append(code[i]);
                num-=intGer[i];
            }
        }
        
        return ans.toString();  
    }
}