class Solution {
    public boolean isPalindrome(String s) {
    String str=s.toLowerCase();
    if(str.isEmpty()){
        return true;
    }
    String result="";
    for(int i=0;i<s.length();i++){
        if(Character.isDigit(s.charAt(i)) || Character.isLetter(s.charAt(i)))
        {
            result+=str.charAt(i);
        }
    } 
    int i=0;
    int j=result.length()-1;
    while(i<j){
        if(result.charAt(i)!= result.charAt(j)){
            return false;
        }
        i++;
        j--;
    }
    return true;   
    }
}