class Solution {
    public int maximum69Number (int num) {
       String s =  String.valueOf(num);
       char[] arr = s.toCharArray();
       
        for(int i=0; i<s.length(); i++){
            if(arr[i] == '6'){
                arr[i]= '9';
                break;
            }
        }
        return Integer.parseInt(String.valueOf(arr));
    }
}