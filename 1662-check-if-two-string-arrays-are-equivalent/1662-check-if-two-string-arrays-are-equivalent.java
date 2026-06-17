class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
    StringBuilder sb=new StringBuilder();    
    StringBuilder cb=new StringBuilder();   

    for(int i=0;i<word1.length;i++){
        sb.append(word1[i]);
    } 
    for(int i=0;i<word2.length;i++){
        cb.append(word2[i]);
    } 
    String str=sb.toString();
    String sty=cb.toString();

    return str.equals(sty);
    }
}