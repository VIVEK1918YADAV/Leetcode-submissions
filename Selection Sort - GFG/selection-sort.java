//{ Driver Code Starts
import java.util.*;

class GFG
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			int n = sc.nextInt();
			int arr[] = new int[n]; 
			for(int i=0;i<n;i++)
			{
				arr[i] = sc.nextInt();
			}
		
			Solution obj = new Solution();
			obj.selectionSort(arr, n);
			
			for(int i=0;i<n;i++)
		    	System.out.print(arr[i]+" ");
		    System.out.println();
			t--;
		}
		
	}
}

// } Driver Code Ends


class Solution
{
//      void swap(int[] arr,int i,int j)
// 	{
// 	    int temp=arr[i];
// 	    arr[i]=arr[j];
// 	    arr[j]=temp;
// 	}
	
	void selectionSort(int arr[], int n)
	{
	   // for(int i=0; i<n; i++){
	   //     int minIdx = i;
	        
	   //     for(int j=i+1; j<n; j++){
	   //         if(arr[j] < arr[minIdx]){
	   //             minIdx = j;
	   //         }
	   //     }
    //         //swap
    //         // int temp=arr[i];
    //         // arr[i]=arr[minIdx];
    //         // arr[minIdx]=temp;
    //         swap(arr,i,minIdx);
	   // }
	   Arrays.sort(arr);
	    
	    
	}
	
	 
	
	
}