class Solution {
    public int maxPower(String s) {
    if(s.length()==0){
        return 0;
    }  
    int count=1;
    int ans=1;

    for(int i=0;i<s.length()-1;i++){
        if(s.charAt(i)==s.charAt(i+1)){
            count++;
        }else{
            count=1;
        }
        ans=Math.max(ans,count);
    } 
    return ans;
    }
}