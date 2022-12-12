class Solution {
    public boolean checkIfCanBreak(String s1, String s2) {
        char [] ch1 = s1.toCharArray();
        char [] ch2 = s2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);

        int i = 0;
        while(i < s1.length() && ch1[i] >= ch2[i]){
            i++;
        }
        if(i == s1.length()){
            return true;
        }
        i = 0;
        while(i < s1.length() && ch2[i] >= ch1[i]){
            i++;
        }
        return i == s1.length();  
    }
}