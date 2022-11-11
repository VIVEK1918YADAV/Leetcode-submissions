//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();

            Solution ob = new Solution();
            System.out.println(ob.findMaxLen(S));
        }
    }
}


// } Driver Code Ends


//User function Template for Java
class Solution {
    static int findMaxLen(String s) {
       Stack<Integer> stk = new Stack<>();
       int maximum = 0;
       stk.push(-1); 
       for(int i=0; i<s.length(); i++){
           char ch = s.charAt(i);
           if(ch == '('){
               stk.push(i);
           }
           else{
               stk.pop();
               if(stk.size() == 0){
                   stk.push(i);
               }
               
               else{
                   int length = i-stk.peek();
                   maximum = Math.max(length, maximum);
               }
           }
           
       } 
        return maximum;
    }
};