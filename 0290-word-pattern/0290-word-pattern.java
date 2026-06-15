class Solution {
    public boolean wordPattern(String pattern, String s) {
    
    String [] words=s.split(" ");
    if(pattern.length() != words.length){
    return false;
}
    HashMap<Character,String>charToWord=new HashMap<>();
    HashMap<String,Character>WordTochar=new HashMap<>();
    for(int i=0;i<words.length;i++)
    {
        char ch=pattern.charAt(i);
        String word=words[i];

        if(charToWord.containsKey(ch))
        {
            if(!charToWord.get(ch).equals(word)){
                return false;
            }
        }
        else{
                charToWord.put(ch,word);
            }

        if(WordTochar.containsKey(word)){
            if(WordTochar.get(word)!=ch){
                return false;
            }
        }
        else{
                WordTochar.put(word,ch);
            }
    }
    return true;
    }
}