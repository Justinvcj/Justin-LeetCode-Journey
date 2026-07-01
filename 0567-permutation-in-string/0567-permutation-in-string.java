class Solution {
    public boolean checkInclusion(String s1, String s2) {
    int [] freq =new int [26];
    for(char c:s1.toCharArray()){
        freq[c-'a']++;
    }
    int left=0;
    for(int right=0;right<s2.length();right++)
    {
        int rightchar=s2.charAt(right)-'a';
        freq[rightchar]--;

        while(freq[rightchar]<0){
            int leftchar=s2.charAt(left)-'a';
            freq[leftchar]++;
            left++;
        }
        if(right-left+1==s1.length()){
            return true;
        }
    }
    return false;
    }
}