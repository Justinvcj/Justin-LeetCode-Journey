class Solution {
    public int rNum(char ch){
        if (ch == 'I') return 1;
        if (ch == 'V') return 5;
        if (ch == 'X') return 10;
        if (ch == 'L') return 50;
        if (ch == 'C') return 100;
        if (ch == 'D') return 500;
        if (ch == 'M') return 1000;
        return 0;
    }
    public int romanToInt(String s) {

    int sum=0;
    for(int i=0;i<s.length()-1;i++){
        int value=rNum(s.charAt(i));
        if(value<rNum(s.charAt(i+1))){
            sum-=value;
        }else{
            sum+=value;
        }
    } 
    sum+=rNum(s.charAt(s.length()-1));
    return sum;
    }
}