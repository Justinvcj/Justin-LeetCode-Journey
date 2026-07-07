class Solution {
    public String minWindow(String s, String t) {

    int [] freq=new int[128];
    for(char ch:t.toCharArray()){
        freq[ch]++;
    } 
    int left=0;
    int right=0;
    int minLen=Integer.MAX_VALUE;
    int minLeft=0;
    int count=t.length();

    while(right<s.length()){

        if(freq[s.charAt(right)]>0){
            count--;
        }
        freq[s.charAt(right)]--;
        right++;
        while(count==0){
            if(right-left<minLen){
                minLen=right-left;
                minLeft=left;
            }
            freq[s.charAt(left)]++;

            if(freq[s.charAt(left)]>0){
                count++;
            }
            left++;
        }
        
    }
    return minLen==Integer.MAX_VALUE ? "":s.substring(minLeft,minLeft+minLen);
    }
}