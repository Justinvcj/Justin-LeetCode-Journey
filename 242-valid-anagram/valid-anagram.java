class Solution {
    public boolean isAnagram(String s, String t) {
    if(s.length()!=t.length()){
        return false;
    }
    char [] arr=s.toCharArray();
    char [] ary=t.toCharArray();

    Arrays.sort(arr);
    Arrays.sort(ary);
    int count=0;
    for(int i=0;i<arr.length;i++){
        if(arr[i]==ary[i]){
            count++;
        }
    }
    return count==s.length();    
    }
}