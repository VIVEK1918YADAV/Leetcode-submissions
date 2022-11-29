class Solution {
    public double trimMean(int[] arr) {
        int n = arr.length;
        int five = n*5/100;

        Arrays.sort(arr);

        double sum = 0;

        for(int i = five; i < n-five; i++){ 
            sum += arr[i];
        }
        
        sum/=(n - five-five);

        return sum;
  
    }
}