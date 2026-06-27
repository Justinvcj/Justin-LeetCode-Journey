class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
    int [] freq=new int[26];

    for(char ch:magazine.toCharArray()){
        freq[ch-'a']++;
    }
    for(int i=0;i<ransomNote.length();i++){
        int idx=ransomNote.charAt(i)-'a';

        if(freq[idx]==0){
            return false;
        }
        freq[idx]--;
    }  
    return true;  
    }
}