//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            String N = sc.next ();

            if (new Sol().balancedNumber (N))
    		    System.out.println (1);
    		else
    		    System.out.println (0);
        }
        
    }
}
// } Driver Code Ends


//User function Template for Java

class Sol
{
    Boolean balancedNumber(String N)
    {
        int mid = N.length()/2;
        int lo = 0, hi = 0;
        for(int i=0; i<N.length(); i++){
            if(i < mid){
                lo += (N.charAt(i)-'0');
            }
            else if(i > mid){
                hi += (N.charAt(i)-'0');
            }
        }
        return lo==hi;
    }
}