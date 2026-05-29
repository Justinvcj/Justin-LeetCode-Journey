class Solution {
    public int lengthOfLastWord(String s) {
    String str=s.trim();
    String [] arr=str.split(" ");
    int x=arr.length-1;
    String lst=arr[x];
    return lst.length();
    }
}