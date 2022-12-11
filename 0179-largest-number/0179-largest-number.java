class Solution {
    public String largestNumber(int[] nums) {
       
        String s="";
        
        String arr[]=new String[nums.length];
        
        for(int i=0;i<nums.length;i++)
        {
            arr[i]=nums[i]+"";
        }
        Arrays.sort(arr,(a,b)->{
            String s1=a+b;
            String s2=b+a;  
            
        return s2.compareTo(s1);
            });
        
        if(arr[0].equals("0"))
            return "0";
        
        StringBuilder sb=new StringBuilder();
        for(String st:arr){
            sb.append(st);
        }
        return sb.toString();

        
    }
}