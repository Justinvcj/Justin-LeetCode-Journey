class Solution {
    String[] mobile = {
        "",     
        "",     
        "abc",  
        "def",  
        "ghi",  
        "jkl",  
        "mno",  
        "pqrs", 
        "tuv",
        "wxyz"
    };
    public List<String> letterCombinations(String digits) {
    
    List<String> ans=new ArrayList<>();
    if(digits.length()==0){
        return ans;
    }

    solve(0,digits,"",ans);

    return ans;
    }

    public void solve(int index,String digits,String current,List<String> ans){

        if(index==digits.length()){
            ans.add(current);
            return;
        }

        int digit=digits.charAt(index)-'0';

        String letters=mobile[digit];

        for(int i=0;i<letters.length();i++){
            char ch=letters.charAt(i);

            solve(index+1,digits,current+ch,ans);
        }
    }
}