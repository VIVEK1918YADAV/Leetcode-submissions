//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
        	int n = sc.nextInt();
        	int[] array = new int[n];
        	for (int i=0; i<n ; i++ ) {
        		array[i] = sc.nextInt();
        	}
            Solution ob = new Solution();
            long[] ans = new long[n];
            ans = ob.productExceptSelf(array, n); 

           	for (int i = 0; i < n; i++) { 
				System.out.print(ans[i]+" ");
			} 
            System.out.println();
            t--;
        }
    } 
} 
  


// } Driver Code Ends


//User function Template for Java


class Solution 
{ 
	public static long[] productExceptSelf(int nums[], int n) 
	{ 
	    int i, j, k;
	    long[] arr = new long[n];
	    long prod = 1;
	    
	    for(i=0; i<n; i++){
	        
	        for(j=i+1; j<n; j++){
	            
	            prod = prod*(long)nums[j];
	        }
	        
	        for(k=0; k<i; k++){
	            
	            prod = prod*(long)nums[k];
	    }
	     arr[i] = prod;
	     prod = 1;
	     
	    }
	     return arr;
	} 
} 
