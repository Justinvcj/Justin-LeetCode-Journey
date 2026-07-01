class Solution {
    public int lengthOfLongestSubstring(String s) {
    HashMap<Character,Integer>map=new HashMap<>();
    int left=0;
    int maxLen=0;
    for(int right=0;right<s.length();right++){
        char rightchar=s.charAt(right);

        if(map.containsKey(rightchar)){
            left=Math.max(left,map.get(rightchar)+1);
        }
        map.put(rightchar,right);
        maxLen=Math.max(maxLen,right-left+1);
    }  
    return maxLen;  
    }
}