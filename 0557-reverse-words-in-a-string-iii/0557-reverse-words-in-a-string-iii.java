class Solution {
    public String reverseWords(String s) {
    StringBuilder sb=new StringBuilder();
    String [] arr=s.trim().split("\\s+");
    for(int i=0;i<arr.length;i++){

        if(i!=0){
            sb.append(" ");
        }
        sb.append(reverse(arr[i]));

        
    }
    return sb.toString();   
    }
    public static String reverse(String s)
    {
        char [] ch=s.toCharArray();
        int left=0;
        int right=ch.length-1;
        while(left<right){
            char temp=ch[left];
            ch[left]=ch[right];
            ch[right]=temp;
            left++;
            right--;
        }
        return new String(ch);
    }
}