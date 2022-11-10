class Solution {
    public String addStrings(String num1, String num2) {
      int n1 = num1.length()-1;
      int n2 = num2.length()-1;
       
      StringBuilder sb = new StringBuilder();
        int temp = 0;
        
        while(n1>=0 || n2>=0 || temp!=0){
            int i = n1>=0 ? num1.charAt(n1)-'0' : 0;
            int j = n2>=0 ? num2.charAt(n2)-'0' : 0;
            n1--;
            n2--;
            
            int sum = i+j+temp;
            int val = sum%10;
            sb.append(val);
            temp = sum/10;
        }
        
        return sb.reverse().toString();
       
    }
}