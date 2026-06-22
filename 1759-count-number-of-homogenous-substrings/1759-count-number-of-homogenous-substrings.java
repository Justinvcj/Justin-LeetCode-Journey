class Solution {
    public int countHomogenous(String s) {

    
    long count=0;
    long ans=0;
    long mod=1000000007;
    for(int i=0;i<s.length();i++){
        if(i==0 ||s.charAt(i)==s.charAt(i-1)){
            count++;
        }else{
            count=1;
        }
        ans=(ans+count)%mod;
    }
    
    return (int)ans;
    
    }
}