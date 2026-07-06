class Solution {
    public int characterReplacement(String s, int k) {
    int [] freq=new int[26];
    int maxlen=0;
    int maxfreq=0;

    int left=0;
    for(int right=0;right<s.length();right++){
        int rightchar=s.charAt(right)-'A';
        freq[rightchar]++;
        maxfreq=Math.max(maxfreq,freq[rightchar]);
        if((right-left+1)-maxfreq>k){
            int leftchar=s.charAt(left)-'A';
            freq[leftchar]--;
            left++;

        }
        maxlen=Math.max(maxlen,right-left+1);
    }  
    return maxlen;
    }
}