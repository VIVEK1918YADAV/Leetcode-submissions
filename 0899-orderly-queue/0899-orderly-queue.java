class Solution {
    public String orderlyQueue(String s, int k) {
       char[] arr = s.toCharArray();//convart String to array
       if(k>1){
           Arrays.sort(arr);
           return String.valueOf(arr);
       } 
        
        String str = s;
        for(int i=0; i<s.length(); i++){
            rotateArray(arr);
            int diff = str.compareTo(String.valueOf(arr));
            if(diff > 0)
                str = String.valueOf(arr);
        }
        return str;
    }
    
    public void rotateArray(char[] arr){
        char temp = arr[0];
        for(int i=0; i<arr.length-1; i++){
            arr[i] = arr[i+1];
            
        }
        arr[arr.length-1] = temp;
    }
}