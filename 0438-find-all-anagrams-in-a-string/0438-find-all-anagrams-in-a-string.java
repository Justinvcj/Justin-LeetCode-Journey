class Solution {
    public List<Integer> findAnagrams(String s, String p) {
    List<Integer> result = new ArrayList<>();
    int [] freq=new int[26];
    for(char ch:p.toCharArray()){
        freq[ch-'a']++;
    } 
    int left=0;
    for(int right=0;right<s.length();right++)
    {
        int rightchar=s.charAt(right)-'a';
        freq[rightchar]--;

        while(freq[rightchar]<0)
        {
            int leftchar=s.charAt(left)-'a';
            freq[leftchar]++;
            left++;
        }
        if(right-left+1==p.length())
        {
            result.add(left);
        }
            
    }
    return result;   
    }
}