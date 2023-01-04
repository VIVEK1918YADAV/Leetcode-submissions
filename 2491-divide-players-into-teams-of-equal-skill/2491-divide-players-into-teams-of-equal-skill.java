class Solution {
    public long dividePlayers(int[] skill) {
        
        int lo=0, hi=skill.length-1;
        Arrays.sort(skill);
        
        long sum = skill[lo] + skill[hi];
        long res = 0;
        
        while(lo <= hi){
            
            if(skill[lo] + skill[hi] == sum){
                
                res += (skill[lo] * skill[hi]);
                lo++;
                hi--;
            }
            
            else {
                return -1;
            }
        }
        return res;
    }
}