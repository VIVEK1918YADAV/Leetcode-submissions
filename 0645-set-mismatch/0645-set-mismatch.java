class Solution {
    public int[] findErrorNums(int[] nums) {
       int[] freQ=new int[nums.length+1];
       int[] res=new int [2];
       for(int i=0;i<nums.length;i++){
       freQ[nums[i]]++;
    }

     for(int i=1;i<=nums.length;i++){
       if(freQ[i]==0){
          res[1] =i;
       }
        if(freQ[i]==2){
          res[0] =i;
       }
    }
    return res;
    }
}