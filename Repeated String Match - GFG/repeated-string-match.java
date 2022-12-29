//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t > 0){
            String A = sc.nextLine();
            String B = sc.nextLine();
            Solution ob = new Solution();
            System.out.println(ob.repeatedStringMatch(A,B));
            t--;
        }
    } 
} 
        


// } Driver Code Ends


//User function Template for Java

class Solution 
{ 
	static int repeatedStringMatch(String A, String B) 
	{ 
	    if(A.contains(B)) return 1;
	    
	    int n = A.length();
	    int m = B.length();
	    String sb = "";
	    int count = 0;
	    
	    while(!sb.contains(B) && n+m >= sb.length()){
	        sb = sb + A;
	        count++;
	    }
	    
	    if(!sb.contains(B))
	    return -1;
	    
	    return count;
	} 
} 
