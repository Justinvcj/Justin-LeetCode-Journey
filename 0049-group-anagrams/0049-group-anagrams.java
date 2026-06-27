class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
    HashMap<String,List<String>>list=new HashMap<>();
    for(String word:strs){
    int [] freq=new int[26];
    for(char ch:word.toCharArray()){
        freq[ch-'a']++;
    } 
    StringBuilder sb=new StringBuilder();  
    for(int count:freq){
        sb.append(count).append("#");
    }
    list.putIfAbsent(sb.toString(),new ArrayList<>());
    list.get(sb.toString()).add(word);
    }
    return new ArrayList<>(list.values());
    }
}